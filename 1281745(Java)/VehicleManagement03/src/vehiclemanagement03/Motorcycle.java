
package vehiclemanagement03;

 class Motorcycle extends Vehicle{

    public Motorcycle(String registrationNumber, String brand, int year) {
        super(registrationNumber, brand, year);
    }

    @Override
    public void start() {
        System.out.println("Motorcycle started");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stopped");
    }
    
}
