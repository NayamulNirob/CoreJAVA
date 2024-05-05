
package testmathodsdosum;


public class TestMathodsDoSum {

   
    public static void main(String[] args) {
        
        System.out.println(doSum(10, 20));
        System.out.println(doSum(12.56, 28.96));
        System.out.println(doSum(56, 96));
        System.out.println(doSum(589632174, 69635274));
        
    }
    
    public static int doSum(double num1,double num2){
    
    
    int result = (int)(num1+num2);
    
    return result;
    }
    
}
