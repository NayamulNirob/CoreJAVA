
package inheritencepractice2;

public class InheritencePractice2 {

    
    public static void main(String[] args) {

        StudyCircle cirle = new StudyCircle(5);
        Triangle trn = new Triangle(5, 10, 6, 5);
        System.out.println(cirle.getArea());
        System.out.println(cirle.getPraimeter());
        System.out.println(trn.getPraimeter());
        System.out.println(trn.getArea());
    }
    
}
