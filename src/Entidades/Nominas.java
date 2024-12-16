package Entidades;

/**
 *
 * @author Empresaurio50
 */
public class Nominas extends Correos {

    private double ccssPatrono, aportesInstitucionales, aportesLPT, totalPagar, pagoPatronoTotal;

    /**
     * Obtiene el valor de la CCSS (Caja Costarricense de Seguro Social) para el
     * patrono.
     *
     * @return El valor de la CCSS para el patrono.
     */
    public double getCcssPatrono() {
        return ccssPatrono;
    }

    /**
     * Establece el valor de la CCSS (Caja Costarricense de Seguro Social) para
     * el patrono.
     *
     * @param ccssPatrono El nuevo valor de la CCSS para el patrono.
     */
    public void setCcssPatrono(double ccssPatrono) {
        this.ccssPatrono = ccssPatrono;
    }

    /**
     * Obtiene el total de pagos del patrono.
     *
     * @return El total de pagos del patrono.
     */
    public double getPagoPatronoTotal() {
        return pagoPatronoTotal;
    }

    /**
     * Establece el total de pagos del patrono.
     *
     * @param pagoPatronoTotal El nuevo total de pagos del patrono.
     */
    public void setPagoPatronoTotal(double pagoPatronoTotal) {
        this.pagoPatronoTotal = pagoPatronoTotal;
    }

    /**
     * Obtiene el valor de los aportes institucionales.
     *
     * @return El valor de los aportes institucionales.
     */
    public double getAportesInstitucionales() {
        return aportesInstitucionales;
    }

    /**
     * Establece el valor de los aportes institucionales.
     *
     * @param aportesInstitucionales El nuevo valor de los aportes
     * institucionales.
     */
    public void setAportesInstitucionales(double aportesInstitucionales) {
        this.aportesInstitucionales = aportesInstitucionales;
    }

    /**
     * Obtiene el valor de los aportes LPT (Ley de Protección al Trabajador).
     *
     * @return El valor de los aportes LPT.
     */
    public double getAportesLPT() {
        return aportesLPT;
    }

    /**
     * Establece el valor de los aportes LPT (Ley de Protección al Trabajador).
     *
     * @param aportesLPT El nuevo valor de los aportes LPT.
     */
    public void setAportesLPT(double aportesLPT) {
        this.aportesLPT = aportesLPT;
    }

    /**
     * Obtiene el valor total a pagar.
     *
     * @return El valor total a pagar.
     */
    public double getTotalPagar() {
        return totalPagar;
    }

    /**
     * Establece el valor total a pagar.
     *
     * @param totalPagar El nuevo valor total a pagar.
     */
    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

}
