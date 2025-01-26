
import java.util.Iterator;
import java.util.Stack;

class StackTest{
    public static void main(String[] args){

        Stack<String> animel= new Stack<>();

        animel.push("Dog");
        animel.push("Cat");
        animel.push("Lion");
        animel.push("Tiger");
        animel.push("Elephant");


        Iterator <String> it = animel.iterator();

        while (it.hasNext()) {
           System.out.println(it.next());
            
        }

        System.out.println(animel);

        // animel.pop();
        // System.out.println(animel);
        // animel.peek();
        // System.out.println(animel);





        
      
        
    }

  
}