package AccesoDatos;

import com.itextpdf.text.Document; // Importa la clase Document de iText, que se usa para crear y manipular documentos PDF en Java.
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;//Permite trabajar con objetos de tipo Paragraph para añadir texto en los documentos PDF.
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter; //permite escribir contenido en un archivo PDF y manejar la creación del archivo.
import java.io.FileNotFoundException;
import java.io.FileOutputStream;// Esta clase se usa para escribir datos a un archivo, en este caso, para guardar el PDF generado.

public class CrearEmpleadoPDF {

    /**
     * El nombre del archivo.
     */
    private String nombreArchivo, registro;

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
     * @param nombreArchivo  
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
     * Este método toma los datos del usuario almacenados en el atributo
     * `registro` y los utiliza para generar un documento PDF. El nombre del
     * archivo PDF se obtiene del atributo `nombreArchivo`.
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
            documento.add(new Paragraph("Asunto " + datos[3] + "\n " + "Estimado/a "+ datos[0] + "." + "\n"
                    + " Nos ponemos en contacto con usted a través del " + datos[1] + " para hacerle llegar su nómina personal en formato PDF." + "\n"
                    + "Quedamos atentos a cualquier consulta o aclaración que pueda necesitar."));

            documento.add(new Paragraph("\n"));

            PdfPTable tabla = new PdfPTable(6);

            tabla.addCell("Nombre");
            tabla.addCell("SalarioBruto");
            tabla.addCell("CCSS");
            tabla.addCell("Impuesto Renta");
            tabla.addCell("Asociacion Social");
            tabla.addCell("Salario Neto");

            tabla.addCell("₡ "+datos[0]);
            tabla.addCell("₡ "+datos[5]);
            tabla.addCell("₡ "+datos[6]);
            tabla.addCell("₡ "+datos[7]);
            tabla.addCell("₡ "+datos[8]);
            tabla.addCell("₡ "+datos[9]);

            documento.add(tabla);

        } finally {
            documento.close();
        }
    }
}
