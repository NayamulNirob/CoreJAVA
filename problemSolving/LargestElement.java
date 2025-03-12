public class LargestElement {
    public static void main(String[] args) {
        int []arry={10,20,5,40,30};

        int max=arry[0];

        for (int num : arry) {
            if(num>max){
                max=num;
            }
        }

        System.err.println("Largest Eliment Is: "+max);
    }
}
