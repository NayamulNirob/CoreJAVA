
package productname;

public class ElectronicProduct extends Product {
    public int warrantyPeriod;
    public double discount;
    public ElectronicProduct() {
    }

    public ElectronicProduct(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public ElectronicProduct(int warrantyPeriod, String name, double regularPrice) {
        super(name, regularPrice);
        this.warrantyPeriod = warrantyPeriod;
    }

   

    @Override
    public String toString() {
        return "ElectronicProduct{" + "warrantyPeriod=" + warrantyPeriod + '}';
    }

    @Override
    public double getSalePrice() {
        
        if(warrantyPeriod>1){
        return super.regularPrice -super.regularPrice*0.15;
        }
        return super.getSalePrice(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
