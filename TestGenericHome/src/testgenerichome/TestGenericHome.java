package testgenerichome;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class TestGenericHome {

    public static void main(String[] args) {

//    
//        ArrayList <Double> array2 = new ArrayList<>();
//        ArrayList <Float> array3 = new ArrayList<>();
//        ArrayList <Character> array4 = new ArrayList<>();
//        ArrayList <Long> array5 = new ArrayList<>();
//        ArrayList <Byte> array6 = new ArrayList<>();
//        ArrayList <Boolean> array7 = new ArrayList<>();
//        ArrayList <BigInteger> array8 = new ArrayList<>();
//        ArrayList <Short> array9 = new ArrayList<>();
//        ArrayList <Enum> array10 = new ArrayList<>();
        ArrayList<String> Family = new ArrayList<>();

        Family.add("Neyamul");
        Family.add("Najmul");
        Family.add("Nasimul");
        Family.add("Narul Islam");
        Family.add("Nurnahar Begum");
        Family.add("Aktharunnahar");
        Family.add("Nayra Islam");
        System.out.println(Family);

        ArrayList<Integer> array1 = new ArrayList<>();
        
        array1.add(50);
        array1.add(60);
        array1.add(70);
        array1.add(80);
        array1.add(90);
        array1.add(100);
        System.out.println(array1);
        
        ArrayList<Techer> tech = new ArrayList<>();
        tech.add(new Techer("Emran Hossion","emranhossion@gamil.com" , "Mentor/Teacher"));
        tech.add(new Techer("Moshidul Islam,","mosaidulislam@gamil.com" , "Constractor"));
        System.out.println(tech);

        GenericStack <Techer> sList = new GenericStack<>();
        
        sList.addData(new Techer("Emran Hossion","emranhossion@gamil.com" , "Mentor/Teacher"));
        sList.addData(new Techer("Emran Hossion","emranhossion@gamil.com" , "Mentor/Teacher"));
        sList.getSize();
        System.out.println(sList.getSize());
    }

}
