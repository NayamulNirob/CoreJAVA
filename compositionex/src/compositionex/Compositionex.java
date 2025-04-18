
package compositionex;

public class Compositionex {

    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
        System.out.println(car);
    }
    //Engine is fully owned by Car.

    //If Car is destroyed, so is Engine.

}
