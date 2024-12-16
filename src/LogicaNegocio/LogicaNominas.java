package LogicaNegocio;

import Entidades.Nominas;

/**
 *
 * @author Empresaurio50
 */
public class LogicaNominas {

    public void rebajaPatrono(Nominas objNominas) {

        objNominas.setCcss(objNominas.getTotalPagar() * 0.15);
        objNominas.setAportesInstitucionales(objNominas.getTotalPagar() * 0.07);
        objNominas.setAportesLPT(objNominas.getTotalPagar() * 0.05);

        
        objNominas.setPagoPatronoTotal(objNominas.getCcss() + objNominas.getAportesInstitucionales() + objNominas.getAportesLPT());
        
    }

}
