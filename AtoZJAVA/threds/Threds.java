
class Threds {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        b.start();

    }

}
