package Entidades;
/**
 *
 * @author Empresaurio50
 */
public class Nominas extends Empleados {
    
    private double ccss, aportesInstitucionales, aportesLPT, totalPagar, pagoPatronoTotal;

    public double getPagoPatronoTotal() {
        return pagoPatronoTotal;
    }

    public void setPagoPatronoTotal(double pagoPatronoTotal) {
        this.pagoPatronoTotal = pagoPatronoTotal;
    }

    public double getCcss() {
        return ccss;
    }

    public void setCcss(double ccss) {
        this.ccss = ccss;
    }

    public double getAportesInstitucionales() {
        return aportesInstitucionales;
    }

    public void setAportesInstitucionales(double aportesInstitucionales) {
        this.aportesInstitucionales = aportesInstitucionales;
    }

    public double getAportesLPT() {
        return aportesLPT;
    }

    public void setAportesLPT(double aportesLPT) {
        this.aportesLPT = aportesLPT;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }
    
    

    



}
