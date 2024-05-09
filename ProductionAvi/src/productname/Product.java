
package productname;

public class Product {
    
    public String name;
    public double regularPrice;

    public Product() {
    }
    
    public Product(String name, double regularPrice) {
        this.name = name;
        this.regularPrice = regularPrice;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", regularPrice=" + regularPrice + '}';
    }
    
    
    
    public void Product( String name,double regularPrice){
    
    
    }
    public double getSalePrice(){
    
        return regularPrice;
    }
    
}
