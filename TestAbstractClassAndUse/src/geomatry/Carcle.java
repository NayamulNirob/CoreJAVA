
package geomatry;


public  class Carcle extends GeomatryObject{
    
   private int radious ;

    public Carcle() {
    }

    public Carcle(int radious) {
        this.radious = radious;
    }

    public Carcle(int radious, boolen filled, String color) {
        super(filled, color);
        this.radious = radious;
    }

    @Override
    public double getArea() {
        return Math.PI*radious*radious;
    }

    @Override
    public double getPerimeter() {
        return Math.PI*2*radious;
    }
    
}
