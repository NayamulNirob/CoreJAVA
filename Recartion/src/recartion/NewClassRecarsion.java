
package recartion;


public class NewClassRecarsion {
    public static void main(String[] args) {
        express(3);
    }
    public static int express(int n ){
        System.out.println("Hi");
    if(n<=1){
       return 0;
    }
    
    return express(n-1);
      
    }
}   
