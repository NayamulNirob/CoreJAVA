
import java.util.Objects;

class Laptop extends Computer {
    
    String name;
    int price;

     @Override
     public void display() {
        System.out.println("Laptop display");
    }

    // @Override
    // public String toString() {
    //     StringBuilder sb = new StringBuilder();
    //     sb.append("Laptop{");
    //     sb.append("name=").append(name);
    //     sb.append(", price=").append(price);
    //     sb.append('}');
    //     return sb.toString();
    // }

    public String toString() {
        return "name='" + name + '\'' +
                ", price=" + price;
    }

    public boolean equals(Laptop that) {
        if (this.name.equals(that.name) && this.price == that.price){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + this.price;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Laptop other = (Laptop) obj;
        if (this.price != other.price) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }

    
}