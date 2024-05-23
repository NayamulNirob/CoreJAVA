
package geometry021;


public class Circle {
    
   double radious=1; 

    public Circle() {
    }
    public Circle(double radious) {
        this.radious= radious;
    }
    
    public double getArea(){
    
    
       return Math.PI*radious*radious;
    
    
    } 
    
    public double getPerimetar(){
    
    
       return Math.PI*2*radious;
    
    
    }
}
