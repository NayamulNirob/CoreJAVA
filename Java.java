
class Java {

    public static void main(String[] args) {
        // int a=5;

        // if(a>5){
        //     System.err.println("b");
        // }
        // else{
        //     System.out.println(a);
        // }
        // try {
        //    throw new NullPointerException();
        // } catch (RuntimeException e) {
        //     System.out.println("Exception caught");
        // }

        
        int[] arr = {2, 4, 6, 8}; // array elements
        int result = 0;

        for (int n : arr) {
            if (n < 5) {
                break;          // If n is 2 or 4, break will trigger

                        }result++;
            System.out.println(result);
        }
    }
}
