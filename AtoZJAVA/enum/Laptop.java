
enum Laptop {

    Macbook(1000), Dell(500), HP(800), Asus, Lenevo(450);

    private int price;

    private Laptop(){
        price=400;
    }

    private Laptop(int price) {
        this.price = price;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
