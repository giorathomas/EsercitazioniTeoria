public class CarFuel extends Car {

    private String fuel;

    /**
     * Costruttore parametrico
     * @param resa km/litro
     * @param fuel tipo di carburante
     */
    public CarFuel(double resa, String fuel) {
        super(resa);
        this.fuel=fuel;
    }//CarFuel

    /**
     * getFuel
     * @return tipo di carburante
     */
    public String getFuel() {
        return fuel;
    }//getFuel

    /**
     * setFuel
     * @param fuel tipo di carburante
     */
    public void setFuel(String fuel) {
        this.fuel = fuel;
    }//setFuel

    @Override
    public String toString() {
        return super.toString() +
                "fuel='" + fuel + '\'' +
                '}';
    }
}//CarFuel
