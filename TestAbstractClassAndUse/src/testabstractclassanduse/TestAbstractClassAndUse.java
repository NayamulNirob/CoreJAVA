
package testabstractclassanduse;

import geomatry.Carcle;
import geomatry.GeomatryObject;
import geomatry.Rectangale;
import java.util.Arrays;

public class TestAbstractClassAndUse {

   
    public static void main(String[] args) {
      
        GeomatryObject circle = new Carcle(5);
        
        GeomatryObject ractangale = new Rectangale(2, 2);
        
        circle.setColor("Black");
        ractangale.setColor("blue");
        dispalyGeomatricObject(circle);
        dispalyGeomatricObject(ractangale);
    }
    public static void dispalyGeomatricObject(GeomatryObject object ){
    
        System.out.println("The area is:"+object.getArea());
        System.out.println("The area is:"+object.getPerimeter());
        System.out.println("The area is:"+object.getDateCrteated());
        System.out.println("The area is:"+object.getColor());
        System.out.println("The area is:"+object.getFilled());
    }
}
