public class VowelCount {
    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Number of vowels: " + countVowels(str));
    }
}

