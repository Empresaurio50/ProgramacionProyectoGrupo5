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

    /**
     * El nombre del archivo.
     */
    private String nombreArchivo;

    /**
     * Un registro de datos asociado al archivo.
     */
    private String registro;

    /**
     * Una lista de archivos asociados al objeto.
     */
    private ArrayList<File> archivos = new ArrayList<>();

    /**
     * Obtiene la lista de archivos asociados al objeto.
     *
     * @return La lista de archivos.
     */
    public ArrayList<File> getArchivos() {
        return archivos;
    }

    /**
     * Establece la lista de archivos asociados al objeto.
     *
     * @param archivos La nueva lista de archivos.
     */
    public void setArchivos(ArrayList<File> archivos) {
        this.archivos = archivos;
    }

    /**
     * Obtiene el nombre del archivo.
     *
     * @return El nombre del archivo.
     */
    public String getNombreArchivo() {
        return nombreArchivo;
    }

     /**
     * Establece el nombre del archivo.
     *
     * @param nombreArchivo 1    
     */
    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    /**
     * Obtiene el registro de datos asociado al archivo.
     *
     * @return El registro de datos.
     */
    public String getRegistro() {
        return registro;
    }

    /**
     * Establece el registro de datos asociado al archivo.
     *
     * @param registro El nuevo registro de datos.
     */
    public void setRegistro(String registro) {
        this.registro = registro;
    }


    /**
    * Crea un archivo PDF con los datos del usuario.
    *
    * Este método toma los datos del usuario almacenados en el atributo `registro` y los utiliza para generar un documento PDF.
    * El nombre del archivo PDF se obtiene del atributo `nombreArchivo`.
    *
    * @throws DocumentException Si ocurre un error al crear el documento PDF.
    * @throws FileNotFoundException Si no se encuentra el archivo de salida.
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
