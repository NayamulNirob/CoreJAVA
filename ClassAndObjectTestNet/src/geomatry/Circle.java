package geomatry;

public class Circle {

    double redious = 1;

    public Circle() {
    }

    public Circle(double newRadious) {
        redious = newRadious;
    }

    public double getArea() {

        return Math.PI * Math.pow(redious, 2);
    }

    public double getPerimetar() {

        return 2 * redious * Math.PI;
    }

    public void setRedious(double newRadious) {

//        this.redious =radious;
        redious = newRadious;
    }
}
