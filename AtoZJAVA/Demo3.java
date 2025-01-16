public class Demo3 {
    public static void main(String[] args) {
        
        new A();  // anonymous object
        new A().show(); 
    }
}

class A{

    public  A(){
        System.err.println("Object Created");
    }

    public void show(){
        System.err.println("in A show");
    }


}