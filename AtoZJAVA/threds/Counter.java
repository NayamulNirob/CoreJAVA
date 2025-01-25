class Counter{

    int count;

    public synchronized void increment(){
        count++;
        // System.out.println("Hi");
    }

}