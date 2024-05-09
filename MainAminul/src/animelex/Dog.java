
package animelex;

public class Dog extends Animal{
    
    public  String breed;

    public Dog() {
    }

    public Dog(String breed) {
        this.breed = breed;
    }

    public Dog(String breed, String name, int age) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" + "breed=" + breed + '}';
    }

   
    @Override
    public void makeSound() {
        System.out.println("Woof");
        System.out.println(this.breed+""+name+"Age: "+age);
        super.makeSound(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
