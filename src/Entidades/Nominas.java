package Entidades;

/**
 *
 * @author Empresaurio50
 */
public class Nominas extends Empleados{
    
    private double ccss, impuestoRenta, salarioNeto, aportesPatronales, cuotaSindical, totalDeducciones;

    public double getCcss() {
        return ccss;
    }

    public void setCcss(double ccss) {
        this.ccss = ccss;
    }

    public double getImpuestoRenta() {
        return impuestoRenta;
    }

    public void setImpuestoRenta(double impuestoRenta) {
        this.impuestoRenta = impuestoRenta;
    }

    public double getSalarioNeto() {
        return salarioNeto;
    }

    public void setSalarioNeto(double salarioNeto) {
        this.salarioNeto = salarioNeto;
    }

    public double getAportesPatronales() {
        return aportesPatronales;
    }

    public void setAportesPatronales(double aportesPatronales) {
        this.aportesPatronales = aportesPatronales;
    }
    
    
}
