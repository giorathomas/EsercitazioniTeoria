import java.util.ArrayList;

public class Parallel extends Circuit{

    private ArrayList<Circuit> circuiti=new ArrayList<>();//arraylist di circuiti

    /**
     * Costruttore parametrico
     * @param vI tensione
     */
    public Parallel(double vI) {
        super(vI);
    }

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
     * getResistance
     * @return la resistenza del circuito
     */
    @Override
    public double getResistance() {
        double somma=circuiti.get(0).getResistance();
        for(int i=1; i<circuiti.size(); i++){
            somma+=(somma*circuiti.get(i).getResistance())/(somma+circuiti.get(i).getResistance());
        }

        return somma-circuiti.get(0).getResistance();
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
