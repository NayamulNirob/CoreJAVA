
package inheritencepractice2;

public class Triangle extends GeomatryObject2{
    
    public double height;
    public double side1;
    public double side2;
    public double side3;

    public Triangle() {
    }

    public Triangle(double height, double side1, double side2, double side3) {
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getPraimeter() {
        return (side1+side2+side3);
    }

    @Override
    public double getArea() {
        return 0.5*height*side1;
    }
    
    
}
