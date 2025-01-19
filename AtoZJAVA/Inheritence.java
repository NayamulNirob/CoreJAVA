
import test.VeryAdvCal;


public class Inheritence {

    public static void main(String[] args) {

        // Calculetor cal= new Calculetor();
        // AdvanceCalculetor cal = new AdvanceCalculetor();

        VeryAdvCal cal= new VeryAdvCal();
        

        int r1 = cal.sum(9, 1);
        int r2 = cal.sub(9, 5);
        int r3 = cal.multi(10, 2);
        int r4 = cal.divid(25, 5);
        int r5=cal.power(2, 3);

        System.err.println("SUM : " + r1 + "  SUB : " + r2 +" Multi : "+r3+" Divid : "+r4+" Power : "+r5);
    }
}
