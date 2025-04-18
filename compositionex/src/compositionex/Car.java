
package compositionex;


public class Car {
    private Engine engine = new Engine(); // Composition

    void drive() {
        engine.start();
        System.out.println("Car is driving");
    }
}
