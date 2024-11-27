package AccesoDatos;

import java.io.BufferedReader; //Se utiliza para leer texto de una entrada (como un archivo)
import java.io.File; //Proporciona una clase para trabajar con archivos y directorios
//permitiendo realizar acciones como crear, borrar o verificar la existencia de un archivo.
import java.io.FileReader;//Es una clase que permite leer el contenido de un archivo de texto carácter por carácter.
import java.io.IOException;
import javax.mail.*;//Proporciona clases y métodos para enviar y recibir correos electrónicos utilizando el protocolo SMTP.
import javax.mail.internet.*;//Incluye clases específicas para trabajar con correos electrónicos de Internet
import java.util.Properties; //Se utiliza para almacenar y gestionar un conjunto de valores clave, como configuraciones de aplicaciones.
import java.util.ArrayList;
import javax.activation.DataHandler;//Proporciona una forma de manejar los datos de diferentes tipos en mensajes MIME, como adjuntar archivos a correos electrónicos.
import javax.activation.FileDataSource;//Permite manejar archivos como fuentes de datos para adjuntarlos en un correo electrónico o procesarlos en aplicaciones que usan MIME.

public class EnviarCorreo {

    private Properties propertiesSMTP = null;
    private Session seccionSMTP = null;
    private ArrayList<BodyPart> adjuntos = new ArrayList<>();

    private ArrayList<File> archivos = new ArrayList<>();
    private String datos;

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public ArrayList<File> getArchivos() {
        return archivos;
    }

    public void setArchivos(ArrayList<File> archivos) {
        this.archivos = archivos;
    }

    /**
     *
     * Esta funcion sirve para agregar las propiedades del servidor desde el
     * .txt de config donde esta escrita la configuracion del servidor de
     * correos como el host, verifique el enable, el autenticador y el port
     *
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
     *
     * Esta funcion sirve para que el host pueda iniciar seccion desde el
     * servidor de correos En este caso se esta utilizando mailtrap, donde se
     * esta proporcionando La contraseña, host, port
     *
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
     * crearArchivos esta utilizando de parametro la clase Usuario para la
     * insertar datos y con el bucle foreach sirve para el conteo de los
     * archivos que el usuario este ingresando al correo permitiendo que no solo
     * pueda adjuntar un archivo PDF si no multiples
     *
     */
    public void crearArchivos() throws MessagingException {
        try {
            for (File archivos : getArchivos()) {
                BodyPart adjunto = new MimeBodyPart();
                adjunto.setDataHandler(new DataHandler(new FileDataSource(archivos.getAbsolutePath())));
                adjunto.setFileName(archivos.getName());
                adjuntos.add(adjunto);
            }
        } finally{
            
        }
    }

    /**
     *
     * Método para enviar un correo electrónico con un archivo adjunto Donde
     * esta cargando los metonos cargarConfiguracionSMTP y crearSeccion Para
     * cuando se llame la funcion EnviarCorreos se puedan ejecutar primero para
     * optimizar el programa y se pueda ejecutar el programa de mejor forma
     *
     * En EnviarCorreos se esta pasando el parametro de Usuario para que pueda
     * llamar los datos del usuario para cuando se requiera
     *
     * En EnviarCorreos se instancia Message como objCorreo para darle un
     * mensaje al usuario aparte del PDF.
     *
     * Donde se crean multi lineas para el mensaje, un cuerpo para el texto y un
     * mensaje de confirmacion de que se envio el correo de manera correcto o no
     * se pudo enviar
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
            if (getArchivos() != null) {
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
