
class Main{
    public static void main(String[] args) {
    
    OuterClass obj = new OuterClass();

    obj.display();

    OuterClass.InnerClass obj1 = obj.new InnerClass();

    obj1.show();

    }
}


class OuterClass{

    int age;

    public void display(){
        System.out.println("Hello");
    }


    class InnerClass{
        
        public void show(){
            System.out.println("Hi");
        }
    }
}





