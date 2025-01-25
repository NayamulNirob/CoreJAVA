class B implements Runnable{


 @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {

            System.out.println("Hello");

            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }


}