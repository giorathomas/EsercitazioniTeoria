public abstract class DistributoreBenzina {

    private double costoBenzina;
    private double qBenzina;

    public DistributoreBenzina(double costoBenzina) {
        this.costoBenzina = costoBenzina;
        qBenzina=0;
    }

    public abstract void rifornisci(double litri, String fuel);

    public abstract void vendi(double euro, CarFuel a);

    public double getCostoBenzina() {
        return costoBenzina;
    }

    public void setCostoBenzina(double costoBenzina) {
        this.costoBenzina = costoBenzina;
    }

    public double getqBenzina() {
        return qBenzina;
    }

    public void setqBenzina(double qBenzina) {
        this.qBenzina = qBenzina;
    }

    @Override
    public String toString() {
        return "DistributoreBenzina{" +
                "costoBenzina=" + costoBenzina +
                ", qBenzina=" + qBenzina +
                '}';
    }
}
