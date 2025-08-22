public class StringReverse {

    public static void main(String[] args) {

        String input = "Hello World";
        String reversed = new StringBuilder(input).reverse().toString();
        
        System.out.println("Reversed string: " + reversed);

        System.out.println(revStr("Hello"));

        // String reversed using for loop
        String str = "Java";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        System.out.println("Reversed: " + reverse);


        //String reversed using for loop & charArray
        String stri = "OpenAI";
        char[] ch = stri.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
    }

       public static String revStr(String str) {
        return new StringBuilder(str).reverse().toString();
    }

       
    
}
