
package testgenerichome;

import java.util.ArrayList;

public class  GenericStack <E>{ 

    ArrayList<E> list = new ArrayList<>();
    
    public int getSize(){
    return list.size();
    }
    public void addData(E e){
    
    list.add(e);
    }
}
