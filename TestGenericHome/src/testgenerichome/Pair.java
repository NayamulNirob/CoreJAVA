
package testgenerichome;


public class Pair <T,U>{
    
    private T first;
    private U secend;

    public Pair() {
    }

    public Pair(T first, U secend) {
        this.first = first;
        this.secend = secend;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecend() {
        return secend;
    }

    public void setSecend(U secend) {
        this.secend = secend;
    }

    @Override
    public String toString() {
        return "Pair{" + "first=" + first + ", secend=" + secend + '}';
    }
}
