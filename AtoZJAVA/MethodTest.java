
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

        System.err.println("Jagged Array");

        int jaggedArray[][] = new int[3][];
        jaggedArray[0] = new int[3];
        jaggedArray[1] = new int[4];
        jaggedArray[2] = new int[7];

        for (int[] jaggedArray1 : jaggedArray) {
            for (int j = 0; j < jaggedArray1.length; j++) {
                jaggedArray1[j] = (int) (Math.random() * 10);
            }
        }

        for (int array[] : jaggedArray) {
            for (int sout : array) {
                System.err.print(sout + " ");
            }

            System.err.println();
        }


        System.err.println("Three Dimensional Array");

        int threeDArray[][][] = new int[3][4][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    threeDArray[i][j][k] = (int) (Math.random() * 10);
                    System.err.print(threeDArray[i][j][k]+" ");
                }
                System.err.println();
            }
            System.err.println();
        }

    }

}
