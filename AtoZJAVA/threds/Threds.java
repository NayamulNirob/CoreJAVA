
class Threds {

    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {
        // A a = new A();
        // B b = new B();

        Runnable a = () -> {
            for (int i = 1; i <= 5; i++) {

                System.out.println("Hi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        };

        Runnable b = () -> {
            for (int i = 1; i <= 5; i++) {

                System.out.println("Hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();

    }

}
