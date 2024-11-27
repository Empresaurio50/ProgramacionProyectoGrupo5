package AccesoDatos;

import java.io.BufferedReader; //Se utiliza para leer texto de una entrada (como un archivo)
import java.io.File; //Proporciona una clase para trabajar con archivosPDF y directorios
//permitiendo realizar acciones como crear, borrar o verificar la existencia de un archivo.
import java.io.FileReader;//Es una clase que permite leer el contenido de un archivo de texto carácter por carácter.
import java.io.IOException;
import javax.mail.*;//Proporciona clases y métodos para enviar y recibir correos electrónicos utilizando el protocolo SMTP.
import javax.mail.internet.*;//Incluye clases específicas para trabajar con correos electrónicos de Internet
import java.util.Properties; //Se utiliza para almacenar y gestionar un conjunto de valores clave, como configuraciones de aplicaciones.
import java.util.ArrayList;
import javax.activation.DataHandler;//Proporciona una forma de manejar los datos de diferentes tipos en mensajes MIME, como adjuntar archivosPDF a correos electrónicos.
import javax.activation.FileDataSource;//Permite manejar archivosPDF como fuentes de datos para adjuntarlos en un correo electrónico o procesarlos en aplicaciones que usan MIME.

public class EnviarCorreo {
    
    private CrearPDF objCrearPDF = new CrearPDF();
    
    

    private Properties propertiesSMTP = null;
    private Session seccionSMTP = null;
    private ArrayList<BodyPart> adjuntos = new ArrayList<>();

    private ArrayList<File> archivosPDF = new ArrayList<>();
    
     private String datos;

    public ArrayList<File> getArchivosPDF() {
        return archivosPDF;
    }

    public void setArchivosPDF(ArrayList<File> archivos) {
        this.archivosPDF = archivos;
    }


    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }
    

    
    public void aaa(){
        
        
        
        
        
    }
    
    
    
    
    /**
    * Carga la configuración del servidor SMTP desde un archivo de texto.
    *
    * Lee el archivo "config.txt" y almacena las propiedades del servidor SMTP en un objeto Properties.
    *
    * @throws IOException Si ocurre un error al leer el archivo.
    */
    private void cargarConfiguracionSMTP() throws IOException {

        propertiesSMTP = new Properties();
        String ArchivoDeConfiguracion = "config.txt";
        String linea = null;
        String[] atributos = null;

        try (BufferedReader objBufferredReader = new BufferedReader(new FileReader(ArchivoDeConfiguracion))) {

            while ((linea = objBufferredReader.readLine()) != null) {

                atributos = linea.split(",");
                propertiesSMTP.put(atributos[0], atributos[1]);//en la posicion 0 esta el nombre y en la 1 el apellido

            }

        }

    }

    /**
    * Crea una sesión SMTP para enviar correos electrónicos.
    *
    * Utiliza las propiedades cargadas previamente para crear una sesión SMTP y autenticarse en el servidor.
    */
    public void crearSeccion() {
        seccionSMTP = Session.getInstance(propertiesSMTP, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("20d5c5df71f13e", "af098c159e94ea");
            }
        });

    }

    /**
    * Crea partes MIME para adjuntar archivos al correo electrónico.
    *
    * Itera sobre los archivos proporcionados y crea partes MIME para cada uno, agregándolas a una lista.
    *
    * @throws MessagingException Si ocurre un error al crear las partes MIME.
     */
    public void crearArchivos() throws MessagingException {
        try {

            
            for (File archivos : archivosPDF) {
                BodyPart adjunto = new MimeBodyPart();
                adjunto.setDataHandler(new DataHandler(new FileDataSource(archivos.getAbsolutePath())));
                adjunto.setFileName(archivos.getName());
                adjuntos.add(adjunto);
            }
        } finally{
            
        }
    }

    /**
    * Envía un correo electrónico con archivos adjuntos.
    *
    * Carga la configuración SMTP, crea una sesión, crea el mensaje con los datos del usuario y los adjuntos, y envía el correo.
    *
    * @throws AddressException Si ocurre un error con las direcciones de correo.
    * @throws SendFailedException Si falla el envío del correo.
    * @throws MessagingException Si ocurre una excepción relacionada con el correo.
    * @throws IOException Si ocurre un error al leer o escribir archivosPDF.
    */
    public void EnviarCorreos() throws AddressException, SendFailedException, MessagingException, IOException {

        cargarConfiguracionSMTP();

        crearSeccion();

        String[] datosU = this.datos.split(",");
        
        try {
            // Crear objeto
            Message objCorreo = new MimeMessage(seccionSMTP);
            objCorreo.setFrom(new InternetAddress("20d5c5df71f13e"));// user del servidor TrapMail
            objCorreo.setRecipients(Message.RecipientType.TO, InternetAddress.parse(datosU[3]));//datosU 3 es el correo
            objCorreo.setSubject(datosU[4]);//datosU 4 es el asunto

            // Crear mensaje
            BodyPart objBodyPart = new MimeBodyPart();
            objBodyPart.setText(datosU[5]);

            // Crear multipart 
            Multipart objMultipart = new MimeMultipart();

            // Configurar el contenido del mensaje con el multipart
            objMultipart.addBodyPart(objBodyPart);
            if (getArchivosPDF() != null) {
                crearArchivos();
                for (BodyPart adjunto : adjuntos) {
                    objMultipart.addBodyPart(adjunto);
                }
            }

            objCorreo.setContent(objMultipart);

            // Enviar el correo
            Transport.send(objCorreo);

            System.out.println("Correo enviado exitosamente a " + datosU[3]);

        

        }finally{
            
        }

    }

    

    

}
