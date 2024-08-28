package productmenagement;

public class ElectonicProduct extends Product {

    private int warrantityPeriod;
    public double discount;

    public ElectonicProduct() {
    }

    public ElectonicProduct(int warrantityPeriod) {
        this.warrantityPeriod = warrantityPeriod;
    }

    public ElectonicProduct(int warrantityPeriod, String name, double regularPrice) {
        super(name, regularPrice);
        this.warrantityPeriod = warrantityPeriod;
    }

    public int getWarrantityPeriod() {
        return warrantityPeriod;
    }

    public void setWarrantityPeriod(int warrantityPeriod) {
        this.warrantityPeriod = warrantityPeriod;
    }

    @Override
    public double getSalesPrice() {

        if (warrantityPeriod > 1) {
       return super.regularPrice -super.regularPrice*0.15;
        }
        return getRegularPrice();
    }

}
