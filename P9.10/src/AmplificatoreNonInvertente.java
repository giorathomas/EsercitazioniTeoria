/**
 * AmplificatoreNonInvertente
 * @author Thomas Giora
 */
public class AmplificatoreNonInvertente extends Amplificatore {

    private double r1;//resistenza 1
    private double r2;//resistenza 2

    /**
     * Costruttore parametrico
     * @param v1 tensione in ingresso
     * @param r1 resistenza 1
     * @param r2 resistenza 2
     */
    public AmplificatoreNonInvertente(double v1, double r1, double r2) {
        super(v1);
        this.r1 = r1;
        this.r2 = r2;
    }//AmplificatoreNonInvertente

    /**
     * metodo per ottenere il coefficiente
     * @return il coefficiente
     */
    @Override
    public double getGain() {
        super.coeff=1+r2/r1;
        super.v0=v1*super.coeff;
        return 1+r2/r1;
    }//getGain

    /**
     * getDescription
     * @return lo stato dell'oggetto
     */
    @Override
    public String getDescription() {
        return toString();
    }//getDescription

    /**
     * toString
     * @return lo stato dell'oggetto
     */
    @Override
    public String toString() {
        return super.toString() +
                "r1=" + r1 +
                ", r2=" + r2 +
                '}';
    }//toString

}//AmplificatoreNonInvertente
