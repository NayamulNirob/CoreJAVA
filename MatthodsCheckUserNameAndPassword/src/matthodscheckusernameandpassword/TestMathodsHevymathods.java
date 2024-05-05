

package matthodscheckusernameandpassword;



public class TestMathodsHevymathods {
    
    public static void main(String[] args) {
        
        doSum(10,10,10,10,10,10,10,10,10,10,10);
        
    }
    
    public static void doSum(int num1,int num2){
    
        System.out.println(num1+num2);
    }
    public static void doSum(int num1,int num2,int num3){
    
        System.out.println(num1+num2+num3);
    }
    public static void doSum(int... num){
        int sum=0;
        for(int a:num){
        sum+= a;
        }
        System.out.println(sum);
    }
}
