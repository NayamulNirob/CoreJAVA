class ReverseString{
    public static void main(String[]agrs){
        String  str = "Hello";

        System.err.println(reserveString(str));
    }

    public static String reserveString(String str){
        
        String reverse= new StringBuilder(str).reverse().toString();

        return reverse;
    }
}

