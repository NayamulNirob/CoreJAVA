
package testobjectandmathods;


public class TestPrimeNumber {

    public TestPrimeNumber() {
    }
    
    
    
public int primeNumber(){
    int num=1;
        for(int i=num; i<100;i++){
            int count=0;
            for(int j=1;j<i;j++){
            
            if(i%j==0){
            count+=1;
            }
            
            }
        if(count==2){
            System.out.println(num);
        
        }
        else{
            System.out.println(num);
        }
        
        }
        return num;

    

}
    
}
