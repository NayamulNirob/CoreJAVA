
package vehiclemanagement03;

public class VehicleManagement03 {

 
    public static void main(String[] args) {
     
        Vehicle car=new Car("La-5689", "X-corlla", 2010);
        car.start();
        car.stop();
        System.out.println(car);
        
        Vehicle motorcycle = new Motorcycle("Ha-525623", "Yahamaha", 2023);
        motorcycle.start();
        motorcycle.stop();
        System.out.println(motorcycle);+
        
    }
    
}
