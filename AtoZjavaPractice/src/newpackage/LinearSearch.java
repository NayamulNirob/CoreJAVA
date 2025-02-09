
package newpackage;


public class LinearSearch {
    
//    public static void main(String[] args) {
//        
//        int numbs[]={5,6,7,8,9};
//        
//        int terget=9;
//        
//        int result= linear(numbs,terget);
//        
//        
//        if(result!= -1)
//            System.out.println("Element Found at Index:"+result);
//        else 
//            System.out.println("Element not in Index"+terget);
//        
//        
//    }
    
    public static int linear(int numbs[], int terget){
        
        for(int i=0; i<numbs.length;i++){
        
            if(numbs[i]==terget){
            return i;
            }
        }
        
        return -1;
    }
    
    
    
    
}
