import static java.lang.Thread.sleep;

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

    void Functionality() {
        try {
            System.out.println();
            sleep(333);
            System.out.println(this.name + " is on");
            sleep(333);
        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    };
    void Show() {
        System.out.print("\n\n");

        System.out.println("name: " + this.name.toUpperCase());
        System.out.println("price: " + this.price);
        System.out.println("quantity: " + this.quantity);
        System.out.println("color: " + this.color);
        System.out.println("isNew: " + this.isNew);
        System.out.print("\n");
    };

}
