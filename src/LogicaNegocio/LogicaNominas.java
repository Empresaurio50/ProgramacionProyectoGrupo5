package LogicaNegocio;

import AccesoDatos.CrearPatronoPDF;
import AccesoDatos.EnviarCorreo;
import Entidades.Nominas;
import com.itextpdf.text.DocumentException;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.mail.MessagingException;
import javax.mail.SendFailedException;
import javax.mail.internet.AddressException;
import Servicios.ServicioPatrono;
import AccesoDatos.AccesoDatosEmpleados;

/**
 *
 * @author Empresaurio50
 */
public class LogicaNominas implements ServicioPatrono {

    private String datosEnviar;
    private CrearPatronoPDF objCrearPatronoPDF = new CrearPatronoPDF();
    private AccesoDatosEmpleados objAccesoDatosEmpleados = new AccesoDatosEmpleados();

    public void rebajaPatrono(Nominas objNominas) {

        objNominas.setCcssPatrono(objNominas.getTotalPagar() * 0.15);
        objNominas.setAportesInstitucionales(objNominas.getTotalPagar() * 0.07);
        objNominas.setAportesLPT(objNominas.getTotalPagar() * 0.05);

        objNominas.setPagoPatronoTotal(objNominas.getCcssPatrono() + objNominas.getAportesInstitucionales() + objNominas.getAportesLPT());

    }

    public void datosCorreoPatrono(Nominas objNominas) {

        rebajaPatrono(objNominas);

        objNominas.setCorreo(objAccesoDatosEmpleados.getAdministrador());

        datosEnviar = objNominas.getCorreo() + "," //0 contiene el correo del empleado
                + objNominas.getTotalPagar() + ","// 1 contiene el total Pagar
                + objNominas.getCcssPatrono() + "," // 2 contiene el Css Patrono
                + objNominas.getAportesInstitucionales() + "," // 3 Aportes Institucionales
                + objNominas.getAportesLPT(); // 4 contiene los aportesLPT
    }

    public void enviarCorreos(Nominas objNominas) throws AddressException, SendFailedException, MessagingException, IOException {

        EnviarCorreo objEnviarCorreo = new EnviarCorreo();
        objEnviarCorreo.setNombrePDF(objCrearPatronoPDF.getNombreArchivo());
        datosCorreoPatrono(objNominas);
        objEnviarCorreo.setDatos(datosEnviar);
        objEnviarCorreo.EnviarCorreos();
    }

    public void crearPDF(Nominas objNominas) throws DocumentException, FileNotFoundException {

        objCrearPatronoPDF = new CrearPatronoPDF();
        objCrearPatronoPDF.setNombreArchivo("Reporte Nomina.pdf");
        datosCorreoPatrono(objNominas);
        objCrearPatronoPDF.setRegistro(datosEnviar);
        objCrearPatronoPDF.createPDF();
    }

}
