
package recartionexpriment;


public class RecartionNew {
    public static void main(String[] args) {
        System.out.println(findFimonaccy(55));
    }
    public static long findFimonaccy(int index){
    
    if(index==0){
    
    return 0;
    }
    else if(index==1){
    
    return 1;
    }
    else{
    
    return findFimonaccy(index-1)+findFimonaccy(index-2);
    }
    }
    
}
