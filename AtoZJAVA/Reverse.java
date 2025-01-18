class Reverse{

    public static void main(String[] args){


        System.out.println(revStr("Hello"));

        System.out.println(revStr("123456789"));

    }

    // public static String revStr(String str){

    //     StringBuilder res = new StringBuilder();

    //     for (int i = str.length()-1; i >=0; i--) {
    //         res.append(str.charAt(i));
    //     }

    //     return res.toString();
    // }


       public static String revStr(String str) {
        return new StringBuilder(str).reverse().toString();
    }


}
