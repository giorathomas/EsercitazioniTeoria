/**
 * Amplificatore
 * @author Thomas Giora
 */

public abstract class Amplificatore {

    protected double v1; //tensione in ingresso
    protected double coeff; //coefficiente
    protected double v0; //tensione in uscita

    /**
     * Costruttore parametrico
     * @param v1 tensione in ingresso
     */
    public Amplificatore(double v1) {
        this.v1 = v1;
    }//Amplificatore

    /**
     * getV1
     * @return tensione in ingresso
     */
    public double getV1() {
        return v1;
    }//getV1

    /**
     * setV1
     * @param v1 tensione in ingresso
     */
    public void setV1(double v1) {
        this.v1 = v1;
    }//setV1

    /**
     * getCoeff
     * @return coefficiente
     */
    public double getCoeff() {
        return coeff;
    }//getCoeff

    /**
     * setCoeff
     * @param coeff coefficiente
     */
    public void setCoeff(double coeff) {
        this.coeff = coeff;
    }//setCoeff

    /**
     * getV0
     * @return tensione in uscita
     */
    public double getV0() {
        return v0;
    }//getV0

    /**
     * metodo per ottenere il coefficiente
     * @return il coefficiente
     */
    public abstract double getGain();

    /**
     * getDescription
     * @return lo stato dell'oggetto
     */
    public abstract String getDescription();

    /**
     * toString
     * @return lo stato dell'oggetto
     */
    public String toString() {
        return getClass()+"{" +
                " v1=" + v1 +
                " v0=" + v0 +
                ", COEFF=" + coeff +
                '}';
    }//toString

}//Amplificatore
