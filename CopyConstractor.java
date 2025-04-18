public class CopyConstractor {
    
    int id;
    String name;

    CopyConstractor(int id, String name) {
        this.id = id;
        this.name = name;
    }
    // Copy constructor
    CopyConstractor(CopyConstractor c) {
        this.id = c.id;
        this.name = c.name;
    }
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
    public static void main(String[] args) {
        CopyConstractor c1 = new CopyConstractor(1, "John");
        CopyConstractor c2 = new CopyConstractor(c1); // Using copy constructor
        c1.display();
        c2.display();
    }
}
