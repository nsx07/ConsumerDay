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
    void Show() {
        System.out.println("name: " + this.name.toUpperCase());
        System.out.println("price: " + this.price);
        System.out.println("quantity: " + this.quantity);
        System.out.println("color: " + this.color);
        System.out.println("isNew: " + this.isNew);
    };

}
