public class AmplificatoreTester {

    public static void main(String[] args) {
        testInv();
        System.out.println("-----------------------");
        testNonInv();
        System.out.println("-----------------------");
        testDiv();
    }

    public static void testInv(){
        AmplificatoreInvertente a=new AmplificatoreInvertente(5,300,400);
        System.out.println(a.getGain());
        System.out.println(a.getDescription());
    }

    public static void testNonInv(){
        AmplificatoreNonInvertente a=new AmplificatoreNonInvertente(5,300,400);
        System.out.println(a.getGain());
        System.out.println(a.getDescription());
    }

    public static void testDiv(){
        AmplificatoreDivisioneTensione a=new AmplificatoreDivisioneTensione(5,300,400);
        System.out.println(a.getGain());
        System.out.println(a.getDescription());
    }
}
