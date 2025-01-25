
class A implements Runnable{

    @Override
    @SuppressWarnings("CallToPrintStackTrace")
    public void run() {
        for (int i = 1; i <= 10; i++) {

            System.out.println("Hi");
            try {
                Thread.sleep(5);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

}
