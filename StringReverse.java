


public class StringReverse {

    public static void main(String[] args) {

        String input = "Hello World";
        String reversed = new StringBuilder(input).reverse().toString();
        
        System.out.println("Reversed string: " + reversed);

        System.out.println(revStr("Hello"));
    }

       public static String revStr(String str) {
        return new StringBuilder(str).reverse().toString();
    }

       
    
}
