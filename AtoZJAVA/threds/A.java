
class A implements Runnable{

    @Override
    @SuppressWarnings("CallToPrintStackTrace")
    public void run() {
        for (int i = 1; i <= 5; i++) {

            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

}
