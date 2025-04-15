
public class SecondHighest {

    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, 8, 25, 25,65,85,89};


        Integer highest = null;
        Integer secondHighest = null;

        for (int num : numbers) {
            if (highest == null || num > highest) {
                secondHighest = highest;
                highest = num;
            }
            else if ((secondHighest == null || num > secondHighest) && num != highest) {
                secondHighest = num;
            }

           
        }
        System.out.println(highest);
        System.out.println(secondHighest);
    }
}
