
package productmenagement;

public class Product {
    private String name;
    double regularPrice;
   

    public Product() {
    }

    public Product(String name, double regularPrice) {
        this.name = name;
        this.regularPrice = regularPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", regularPrice=" + regularPrice + '}';
    }
    
    
    public void product(String name,double regularPrice){
    
    
    }
    
   public double getSalesPrice(){
   
   
   
        return regularPrice;
   
   }
}
