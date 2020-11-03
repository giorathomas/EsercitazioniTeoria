import java.util.ArrayList;

public class Tester {

    public static void main(String[] args) {
        tSerial();
        tParallel();
    }

    public static void tSerial(){
        Serial s=new Serial(10);
        Resistor r1=new Resistor(10, 50);
        Resistor r2=new Resistor(10, 600);
        ArrayList<Circuit> c=new ArrayList<>();
        c.add(r1);
        c.add(r2);
        s.setCircuiti(c);
        System.out.println("Serial: "+s.getResistance());
    }

    public static void tParallel(){
        Parallel p=new Parallel(10);
        Resistor r1=new Resistor(10, 50);
        Resistor r2=new Resistor(10, 70);
        ArrayList<Circuit> c=new ArrayList<>();
        c.add(r1);
        c.add(r2);
        p.setCircuiti(c);
        System.out.println("Parallel: "+p.getResistance());

    }

}
