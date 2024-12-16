/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

import Entidades.Deducciones;

/**
 *
 * @author Empresaurio50
 */
public class LogicaDeducciones {
    
    public void rebajaSalario(Deducciones objDeducciones) {

        if (objDeducciones.getTotalPagar() > 4783000.0) {
            objDeducciones.setImpuestoRenta(objDeducciones.getTotalPagar() * 0.25);

        }
        if ((objDeducciones.getImpuestoRenta() > 2392000.0) && (objDeducciones.getImpuestoRenta() <= 4783000.0)) {
            objDeducciones.setImpuestoRenta(objDeducciones.getTotalPagar() * 0.20);

        }
        if ((objDeducciones.getTotalPagar() > 1363000.0) && (objDeducciones.getTotalPagar() <= 2392000.0)) {
            objDeducciones.setImpuestoRenta(objDeducciones.getTotalPagar() * 0.15);

        }
        if ((objDeducciones.getTotalPagar() > 929000.0) && (objDeducciones.getTotalPagar() <= 1363000.0)) {
            objDeducciones.setImpuestoRenta(objDeducciones.getTotalPagar() * 0.10);
        }
        if ((objDeducciones.getTotalPagar() <= 929000.0)) {
            objDeducciones.setImpuestoRenta(0);

        }

        objDeducciones.setCcss(objDeducciones.getTotalPagar() * 0.10);

        objDeducciones.setAsociacionSocial(objDeducciones.getTotalPagar() * 0.05);

        objDeducciones.setSalarioNeto((objDeducciones.getTotalPagar() - objDeducciones.getImpuestoRenta()) - objDeducciones.getCcss() - objDeducciones.getAsociacionSocial());
    }
    
}
