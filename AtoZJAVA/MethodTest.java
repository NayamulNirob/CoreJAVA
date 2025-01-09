
class MethodTest {

    public static void main(String[] args) {

        // Demo demo = new Demo();
        //     int a = 5;
        //     int b = 6;
        //     int result =demo.add(a, b);
        //     System.out.println("Result is: "+result);
        //  String pen= demo.getMeAPen(12);
        //   System.out.println(pen);
        // int myArray[] = {1,2,3,4,5,6,7,8,9,10};
        // for (int i = 0; i < 10; i++) {
        //     System.out.println("Element at index "+i+" is: "+myArray[i]);
        // }
        // int numbers[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int numbers[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                numbers[i][j] = (int) (Math.random() * 10);
            }

        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        System.err.println("For Each loop");

        for (int n[] : numbers) {
            for (int m : n) {
                System.err.print(m + " ");
            }
            System.err.println();
        }

    }

}
