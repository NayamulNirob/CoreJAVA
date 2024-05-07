
package oop;
public class Test {
    

    public static void main(String[] args) {
       
        Teacher teacher =new Teacher();
        Teacher teacher2 =new Teacher();
        Teacher teacher3 =new Teacher();
        
//        teacher.name = "Nokib Ahashan";
//        teacher.gender = "Male";
//        teacher.phone ="01784991229";
//        
//        System.out.println(teacher.name);
//        System.out.println(teacher.gender);
//        System.out.println(teacher.phone);
        
//        Teacher teacher1 =new Teacher();
//        
//        teacher1.name = "Rokib Ahashan";
//        teacher1.gender = "Male";
//        teacher1.phone ="0184991229";
//        
//        System.out.println("\n"+teacher1.name);
//        System.out.println(teacher1.gender);
//        System.out.println(teacher1.phone);
        
//        teacher1.diplayInformation();
        teacher.setInformation("Neayamul Islam", "Male", "013232765407");
        teacher2.setInformation("Nirob Islam", "Male", "013232765407");
        teacher3.setInformation("Islam", "Male", "013232765407");
    }
 
}
