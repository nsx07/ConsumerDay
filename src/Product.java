public abstract class Product {
    float price;
    int quantity;
    String color;
    String name;
    boolean isNew;

    public Product() {}
    public Product(float price, int quantity, String color, boolean isNew) {
        this.price = price;
        this.quantity = quantity;
        this.color = color;
        this.isNew = isNew;
    }

    abstract void Functionality();

}
