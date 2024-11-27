package AccesoDatos;

import com.itextpdf.text.Document; // Importa la clase Document de iText, que se usa para crear y manipular documentos PDF en Java.
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;//Permite trabajar con objetos de tipo Paragraph para añadir texto en los documentos PDF.
import com.itextpdf.text.pdf.PdfWriter; //permite escribir contenido en un archivo PDF y manejar la creación del archivo.
import java.io.File; //Importa la clase File, que se usa para manejar operaciones relacionadas con archivos, como crear o verificar su existencia.
import java.io.FileNotFoundException;
import java.io.FileOutputStream;// Esta clase se usa para escribir datos a un archivo, en este caso, para guardar el PDF generado.
import java.util.ArrayList;

public class CrearPDF {

    private String nombreArchivo, registro;

    private ArrayList<File> archivos = new ArrayList<>();

    public ArrayList<File> getArchivos() {
        return archivos;
    }

    public void setArchivos(ArrayList<File> archivos) {
        this.archivos = archivos;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    /**
     * El metodo createPDF esta tomando los atributos de la clase Usuario para
     * extraer los datos que el usuario esta ingresando y tambien los que se les
     * estan asignando.
     *
     * Cuando instanciamos Docuement estamos accediendo a acciones que tiene esa
     * clase panto para la lectura, asignacion de nombre, ingresando los datos
     * del usuario y para la creacion del documento del PDF.
     *
     * @throws com.itextpdf.text.DocumentException
     * @throws java.io.FileNotFoundException
     */
    public void createPDF() throws DocumentException, FileNotFoundException {
        Document documento = new Document();
        String[] datos = this.registro.split(",");
        try {
            PdfWriter.getInstance(documento, new FileOutputStream(nombreArchivo));
            documento.open();
            documento.add(new Paragraph("Hola " + datos[0] + " " + datos[1] + ", " + "\n"
                    + datos[2] + "\n"
                    + " Se le contacto por su correo: " + datos[3] ));

        } finally {
            documento.close();

        }

    }

}
