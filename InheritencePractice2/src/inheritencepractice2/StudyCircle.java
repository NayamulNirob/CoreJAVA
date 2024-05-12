
package inheritencepractice2;

public class StudyCircle extends GeomatryObject2{
    
private int radious;

    public StudyCircle() {
    }

    public StudyCircle(int radious) {
        this.radious = radious;
    }

    @Override
    public double getPraimeter() {
        return 2*Math.PI*radious;
    }

    @Override
    public double getArea() {
        return Math.PI*radious*radious;
    }
    
}
