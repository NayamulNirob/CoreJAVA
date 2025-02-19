public class Demo6 {
    public static void main(String[] args) {
        int result= factorial(0);
        
        System.err.println(result);
    }

    

    private static int factorial(int i) {

        if(i!=1&& i!=0){
            
           return  i*factorial(i-1);
        }
        return 1;
    }
}
