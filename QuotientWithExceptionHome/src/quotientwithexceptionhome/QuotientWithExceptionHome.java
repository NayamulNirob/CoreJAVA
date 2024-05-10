
package quotientwithexceptionhome;

public class QuotientWithExceptionHome extends ExceptionHandlingHome2{

   
    public int quotient(int number1,int number2){
        
            if(number1==0||number2==0){
                
                try {
                  return  number1/number2;
                } 
                catch (Exception e) {
                    e.getStackTrace();
                }
            }
    
        return number1/number2;
    
    
    }
    
}
