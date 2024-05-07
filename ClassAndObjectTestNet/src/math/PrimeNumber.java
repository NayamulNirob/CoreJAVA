
package math;

public class PrimeNumber {
  
    int number=0;

    public PrimeNumber() {
    }
    public PrimeNumber(int newNumber) {
        number=newNumber;
    }
    public String checkPrimenumber(){
        int count=0;
        for(int i=1;i<=number;i++){
            if(number%i==0){
                count++;
            }
        
        }
        if(count==2){
        return "its a prime number";
        }
        else{
        return "its not a prime number";
        }
    }
  
//    public boolean checkPrimenumber(){
//        int count=0;
//        for(int i=1;i<=number;i++){
//            if(number%i==0){
//                count++;
//            }
//        
//        }
//        if(count==2){
//        return true;
//        }
//        else{
//        return false;
//        }
//    }
}
