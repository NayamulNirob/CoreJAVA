import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
      String str1 = "listen";
        String str2 = "silent";
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        System.out.println(arr1);
        Arrays.sort(arr2);
        System.out.println(arr2);
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}
