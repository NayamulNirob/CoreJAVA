public class Demo2 {
    public static void main(String[] args) {
        // B b = new B();

        B b1 = new B(5);
    }
}

class A extends Object{

    public A(){
        super();
        System.out.println("In A");
    }

    public A(int a){
        super();
        System.err.println("int A int");
    }

}

class B extends A{

    public B(){
        super();
        System.err.println("In B");
    }

    public B(int b){
    //    super(5); 
    this();
        System.err.println("int B int");
    }
}
