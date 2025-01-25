
class Threds {


    public static void main(String[] args) throws InterruptedException {
        // A a = new A();
        // B b = new B();

        Counter c = new Counter();

        Runnable a = () -> {
            for (int i = 1; i <= 10000; i++) {

                // System.out.println("Hi");
                // try {
                //     Thread.sleep(10);
                // } catch (InterruptedException ex) {
                //     ex.printStackTrace();
                // }
                c.increment();
            }
        };

        Runnable b = () -> {
            for (int i = 1; i <= 10000; i++) {

                // System.out.println("Hello");
                // try {
                //     Thread.sleep(10);
                // } catch (InterruptedException ex) {
                //     ex.printStackTrace();
                // }

                c.increment();
            }
        };

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);

    }

}
