
class A extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {

            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

}
