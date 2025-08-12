
package static_inheritance;

public class Static_Inheritance {

    public static void main(String[] args) {
       Parent p= new Child();
       p.show();
       
       Child c = (Child) p;
       c.show();
       
    }
    
}
