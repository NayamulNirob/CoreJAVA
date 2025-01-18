class Reverse1{
    public static void main(String[]args){
        System.err.println(revStr("123456789"));

        System.err.println(revStr("Hello World"));
    }

    public static String revStr(String str){

        return new StringBuilder(str).reverse().toString();
    }
}