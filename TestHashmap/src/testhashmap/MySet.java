
package testhashmap;

public interface MySet<E> extends Iterable<E>{
    
    public void clear();
    public boolean contains(E e);
    public boolean add(E e);
    public boolean remove(E e);
    public boolean isEampty(E e);
    public int size();
    
}
