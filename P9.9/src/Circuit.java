public abstract class Circuit {

    protected double vI; //tensione

    /**
     * Costruttore completo
     * @param vI
     */
    public Circuit(double vI){
        this.vI=vI;
    }

    /**
     * getvI
     * @return la tensione
     */
    public double getvI() {
        return vI;
    }

    /**
     * setvI
     * @param vI la tensione
     */
    public void setvI(double vI) {
        this.vI = vI;
    }

    /**
     * getResistance
     * @return la resistenza del circuito
     */
    public abstract double getResistance();

    /**
     * toString
     * @return lo stato dell'oggetto
     */
    public String toString() {
        return getClass()+"{" +
                "vI=" + vI +
                '}';
    }
}
