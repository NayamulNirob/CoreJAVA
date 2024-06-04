
package VehicaleMenagement;

public class VechicelMenagement {

    public static void main(String[] args) {
       
        Vechicle vechicle = new Vechicle();
        Track truk =new Track(2100, 80, 22000, "blue");

        System.out.println(truk.getSalePrice());
        
        
    }
    
}
