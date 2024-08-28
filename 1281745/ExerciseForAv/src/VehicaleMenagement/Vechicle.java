
package VehicaleMenagement;

public class Vechicle {
    
    private int speed;
    private double regularPrice;
    String color;

    public Vechicle() {
    }

    public Vechicle(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vechicle{" + "speed=" + speed + ", regularPrice=" + regularPrice + ", color=" + color + '}';
    }
    
    public double getSalePrice(){
    
    
        return regularPrice;
    }
}

