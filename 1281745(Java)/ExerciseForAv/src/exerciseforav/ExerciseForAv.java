
package exerciseforav;

public class ExerciseForAv {

    public static void main(String[] args) {
       
        Vechicle vechicle = new Vechicle();
        Track truk =new Track(2100, 80, 7500000, "blue");
//        truk.getRegularPrice();
//        truk.getSalePrice();
        System.out.println(truk.getSalePrice());
        
        
    }
    
}
