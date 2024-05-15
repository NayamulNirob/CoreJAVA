
package icrud;


public interface Icrud<T> {
    
    Void save (T t);
    Void delete (T t);
}
