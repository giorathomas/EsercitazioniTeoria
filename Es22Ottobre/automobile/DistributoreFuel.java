public class DistributoreFuel extends DistributoreBenzina {

    private double costoDiesel;
    private double qDiesel;


    public DistributoreFuel(double costoBenzina, double costoDiesel) {
        super(costoBenzina);
        this.costoDiesel=costoDiesel;
        qDiesel=0;
    }


    public void rifornisci(double litri, String fuel) {
        if(fuel.equals("benzina")) super.setqBenzina(super.getqBenzina()+litri);
        else if(fuel.equals("diesel")) setqDiesel(getqDiesel()+litri);
    }

    @Override
    public void vendi(double euro, CarFuel a) {
        if(a.getFuel().equals("benzina")) {
            setqBenzina(getqBenzina()-euro/getCostoBenzina());
            a.addGas(euro*getCostoBenzina());
        } else if(a.getFuel().equals("diesel")){
            setqDiesel(getqDiesel()-euro*costoDiesel);
            a.addGas(euro/costoDiesel);
        }
    }

    public double getCostoDiesel() {
        return costoDiesel;
    }

    public void setCostoDiesel(double costoDiesel) {
        this.costoDiesel = costoDiesel;
    }

    public double getqDiesel() {
        return qDiesel;
    }

    public void setqDiesel(double qDiesel) {
        this.qDiesel = qDiesel;
    }

    @Override
    public String toString() {
        return super.toString() +
                "costoDiesel=" + costoDiesel +
                ", qDiesel=" + qDiesel +
                '}';
    }
}
