
package VehicaleMenagement;

public class Track extends Vechicle{
    
    int weight;

    public Track() {
    }

    public Track(int weight) {
        this.weight = weight;
    }

    public Track(int weight, int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Track{" + "weight=" + weight + '}';
    }

    @Override
    public double getSalePrice() {
        
        if(this.weight>2000){
        
        return super.getRegularPrice()-super.getRegularPrice()*0.10;
        }
        
        return super.getSalePrice(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/Over0riddenMethodBody
       
    }
    
    
}
