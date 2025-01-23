
public class Demo {

    public static void main(String[] agrs) {
        // Computer c = new Computer();
        // c.display();

        // c= new Laptop();
        // c.display();
        // Laptop l = new Laptop();
        // l.name = "Lenovo Yoga";
        // l.price = 1000;
        //  Laptop la = new Laptop();
        // la.name = "Dell";
        // la.price = 1000;
        // boolean b = l.equals(la);
        // System.out.println(b);
        // double g =56.2;
        // int k= (int)g;
        // System.err.println(k);
        // Car objCar= new WagonR();
        // objCar.drive();
        // objCar.playMusic();
        // objCar.seat();

        
        Computer com = new Computer() {

            @Override
            public void display() {
                System.out.println("CPU display");
            }


        };

       com.display();

    }
}
