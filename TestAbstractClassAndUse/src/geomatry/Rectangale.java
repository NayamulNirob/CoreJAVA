
package geomatry;

import java.util.Date;


public class Rectangale extends GeomatryObject{
private int height;
private int weight;

    public Rectangale() {
    }

    public Rectangale(int height, int weight, boolen filled, Date dateCrteated) {
        super(filled, dateCrteated);
        this.height = height;
        this.weight = weight;
    }

    public Rectangale(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public Rectangale(int height, int weight, boolen filled, String color) {
        super(filled, color);
        this.height = height;
        this.weight = weight;
    }


    @Override
    public double getArea() {
       return height*weight;
    }

    @Override
    public double getPerimeter() {
       return 2*(height+weight);
    }
    
}
