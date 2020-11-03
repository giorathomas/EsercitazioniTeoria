import java.util.ArrayList;

public class Serial extends Circuit{

    private ArrayList<Circuit> circuiti=new ArrayList<>(); //arraylist di circuiti

    /**
     * getCircuiti
     * @return arraylist di circuiti
     */
    public ArrayList<Circuit> getCircuiti() {
        return circuiti;
    }

    /**
     * setCircuiti
     * @param circuiti arraylist di circuiti
     */
    public void setCircuiti(ArrayList<Circuit> circuiti) {
        this.circuiti = circuiti;
    }

    /**
     * Costruttore parametrico
     * @param vI tensione
     */
    public Serial(double vI) {
        super(vI);
    }

    /**
     * getResistance
     * @return la resistenza del circuito
     */
    @Override
    public double getResistance() {
        double somma=0;
        for(Circuit c:circuiti){
            somma+=c.getResistance();
        }

        return somma;
    }

    /**
     * toString
     * @return lo stato dell'oggetto
     */
    @Override
    public String toString() {
        return super.toString() +
                "circuiti=" + circuiti +
                '}';
    }
}
