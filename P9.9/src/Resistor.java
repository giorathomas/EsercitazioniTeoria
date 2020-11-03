public class Resistor extends Circuit {

    private double ohm; //resistenza

    /**
     * Costruttore completo
     * @param vI tensione
     * @param ohm resistenza
     */
    public Resistor(double vI, double ohm) {
        super(vI);
        this.ohm=ohm;
    }

    /**
     * setOhm
     * @param ohm la resistenza
     */
    public void setOhm(double ohm) {
        this.ohm = ohm;
    }

    /**
     * getResistance
     * @return la resistenza del circuito
     */
    @Override
    public double getResistance() {
        return ohm;
    }

    /**
     * toString
     * @return lo stato dell'oggetto
     */
    @Override
    public String toString() {
        return super.toString() +
                "ohm=" + ohm +
                '}';
    }
}
