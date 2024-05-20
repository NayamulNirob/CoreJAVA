
package vehiclemanagement03;

class Car extends Vehicle{

    public Car(String registrationNumber, String brand, int year) {
        super(registrationNumber, brand, year);
    }
    

    @Override
    public void start() {
        System.out.println("car started");
    }

    @Override
    public void stop() {
       System.out.println("car stoppoed");
    }
    
}
