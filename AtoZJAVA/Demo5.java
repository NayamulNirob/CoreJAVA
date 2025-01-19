
import tools.AdvCalc;

public class Demo5 {
    
    public static void main(String[] args) {
        
      AdvCalc cal = new AdvCalc();

        int r1 = cal.sum(9, 1);
        int r2 = cal.sub(9, 5);
        int r3 = cal.multi(10, 2);
        int r4 = cal.divid(25, 5);

        System.err.println("SUM : " + r1 + "  SUB : " + r2 +" Multi : "+r3+" Divid : "+r4);
    }
}