/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

import Entidades.Nominas;

/**
 *
 * @author Empresaurio50
 */
public class LogicaNominas {
    
    
    public void rebajaSalario(Nominas objNominas) {

        objNominas.setCcss(objNominas.getSalarioBruto() * 0.10);

        if (objNominas.getSalarioBruto() > 4783000.0) {
            objNominas.setImpuestoRenta(objNominas.getSalarioBruto() * 0.25);

        }
        if ((objNominas.getImpuestoRenta() > 2392000.0) && (objNominas.getImpuestoRenta() <= 4783000.0)) {
            objNominas.setImpuestoRenta(objNominas.getSalarioBruto() * 0.20);

        }
        if ((objNominas.getSalarioBruto() > 1363000.0) && (objNominas.getSalarioBruto() <= 2392000.0)) {
            objNominas.setImpuestoRenta(objNominas.getSalarioBruto() * 0.15);

        }
        if ((objNominas.getSalarioBruto() > 929000.0) && (objNominas.getSalarioBruto() <= 1363000.0)) {
            objNominas.setImpuestoRenta(objNominas.getSalarioBruto() * 0.10);
        }
        if ((objNominas.getSalarioBruto() <= 929000.0)) {
            objNominas.setImpuestoRenta(0);

        }
        objNominas.setSalarioNeto((objNominas.getSalarioBruto() - objNominas.getImpuestoRenta()) - objNominas.getCcss());
    }
    
    
    
}
