public class Demo{
    public static void main(String[]agrs){
        // Computer c = new Computer();
        // c.display();

        // c= new Laptop();
        // c.display();


        Laptop l = new Laptop();

        l.name = "Lenovo Yoga";
        l.price = 1000;


         Laptop la = new Laptop();

        la.name = "Dell";
        la.price = 1000;

        boolean b = l.equals(la);

        System.out.println(b);
        

    }
}