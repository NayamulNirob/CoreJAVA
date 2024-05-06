
package mathfactorialprime;


public class PrimeNumberInFactorial {

    public PrimeNumberInFactorial() {
    }

   public int primeNumber(String factorial){
    int num;
       num = 0;
        for(int i=num; i<100;i++){
            int count=0;
            for(int j=1;j<i;j++){
            
            if(i%j==0){
            count+=1;
            }
            
            }
        if(count==2){
            return num;
        
        }
        else{
            return num;
        }
        
        }
       return num;
        

    

}
    
    
    
}
