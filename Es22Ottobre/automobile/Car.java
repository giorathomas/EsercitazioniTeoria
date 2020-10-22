public class Car {

    private double resa; //km al litro
    private double quaCarburante; //carburante presente

    /**
     * Costruttore parametrico
     * @param resa km/litro
     */
    public Car(double resa) {
        this.resa = resa;
        quaCarburante=0;
    }//Car

    /**
     * Metodo per simulare un percorso e ridurre la benzina
     * @param distanza distanza del percorso da percorrere
     */
    public void drive(double distanza){
        double quaUsato=distanza/resa;
        if(getQuaCarburante()-quaUsato>=0) setQuaCarburante(getQuaCarburante()-quaUsato);
        else System.out.println("Carburante non sufficiente!!");
    }//drive

    /**
     * getResa
     * @return resa dell'auto in km/l
     */
    public double getResa() {
        return resa;
    }//getResa

    /**
     * setResa
     * @param resa resa dell'auto in km/l
     */
    public void setResa(double resa) {
        this.resa = resa;
    }//setResa

    /**
     * getQuaCarburante
     * @return Quantità di carburante presente nel serbatoio
     */
    public double getQuaCarburante() {
        return quaCarburante;
    }//getQuaCarburante

    /**
     * setQuaCarburante
     * @param quaCarburante Quantità di carburante presente nel serbatoio
     */
    public void setQuaCarburante(double quaCarburante) {
        this.quaCarburante = quaCarburante;
    }//setQuaCarburante

    /**
     * toString
     * @return lo stato dell'oggetto
     */
    public String toString() {
        return "Car{" +
                "resa=" + resa +
                ", quaCarburante=" + quaCarburante +
                '}';
    }//toString

    /**
     * getGas
     * @return quantità di carburante presente
     */
    public double getGas(){
        return getQuaCarburante();
    }//getGas

    /**
     * addGas
     * @param litri litri da rifornire
     */
    public void addGas(double litri){
        setQuaCarburante(getGas()+litri);
    }//addGas

}//Car
