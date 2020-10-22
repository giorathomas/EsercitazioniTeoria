public class Tester {
    
    public static void main(String[] args) {
        testCar();
        testCarFuel();
        testDis();
    }

    public static void testCar(){
        Car car=new Car(15);
        car.addGas(10);
        System.out.println(car);
        System.out.println(car.getGas());
    }

    public static void testCarFuel(){
        CarFuel car=new CarFuel(15, "diesel");
        car.addGas(10);
        System.out.println(car);
        car.drive(100);
        System.out.println(car.getGas());
    }

    public static void testDis(){
        DistributoreFuel f=new DistributoreFuel(1.5, 1.1);
        f.rifornisci(100, "diesel");
        CarFuel car=new CarFuel(15, "diesel");
        car.addGas(10);
        f.vendi(30, car);
        System.out.println(car);
        System.out.println(f);
    }

}
