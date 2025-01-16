class Human{
    private int age;

    private String name;

    public Human() {

        name="Nirob";

        age = 30;

        // System.out.println("Constrator");
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    

}

public class Demo1 {
    public static void main(String[] args) {
        Human h =new Human(30,"Islam");

    // h.setName("Neyamul"); 
    // h.setAge(30);

    System.err.println(h.getName()+" : "+h.getAge());
    }
    
}
