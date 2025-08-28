public class StringSplit {
    public static void main(String[] args) {
        
        String str= "Java Is Fun";

        String [] word= str.split(" ");

        for(String word1: word){

           System.out.println(word1);
        }
    }
}
