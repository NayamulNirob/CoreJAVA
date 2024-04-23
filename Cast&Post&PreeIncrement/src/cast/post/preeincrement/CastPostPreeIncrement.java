
package cast.post.preeincrement;

public class CastPostPreeIncrement {

   
    public static void main(String[] args) {
       
        
        
        System.out.println("Hello");
        
        int i=5,j=10;
        double a=6.5,b=7.5;
        
        System.out.println(i++);
        System.out.println(i++);
        System.out.println(i++);
        System.out.println(("I :")+(++i));
        System.out.println(++i);
        System.out.println(++i+" I");
        
       
        
        System.out.println(j--);
        System.out.println(j--);
        System.out.println(j--);
        System.out.println("J :"+--j);
        System.out.println(--j);
        System.out.println(--j);
        
        double result =i*j;
        System.out.println(result);
        
        double result2 =a*b;
        System.out.println(result2);
        
        int malti=(int)(a*b);
        
        System.out.println(malti);
    }
    
}
