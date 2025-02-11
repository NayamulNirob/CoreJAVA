package atozjavapractice;

public class InserctionSort {

    public static void main(String[] args) {

        int numbs[] = {6, 5, 2, 8, 9, 4};
        int size = numbs.length;


        System.out.println("Before sorting---");
        for (int num : numbs) {
            System.out.print(" " + num);
        }

        for (int i = 0; i < size; i++) {

          int key= numbs[i];
          int j=i-1;
            
          while(j>=0 && numbs[j]>key){
          
             numbs[j+1]=numbs[j];
             j--;
             
          }
          numbs[j+1]=key;
          
        }

        System.out.println();

        System.out.println("\n After sorting---");
        for (int num : numbs) {
            System.out.print(" " + num);
        }

    }

}
