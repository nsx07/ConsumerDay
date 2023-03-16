import static java.lang.Thread.sleep;

public class Processor extends Product {

    float clock;
    float cacheL1;
    float cacheL2;
    float cacheL3;
    int tdp;

    public Processor(float price, int quantity, String color, boolean isNew) {
        super(price, quantity, color, isNew);
        this.name = "Processor";
        this.clock = 3.9f;
        this.cacheL1 = 33f;
        this.cacheL2 = 160f;
        this.cacheL3 = 333f;
        this.tdp = 65;
    }

    @Override
    void Functionality()  {
        try {
            System.out.println("Processor is on");
            sleep(333);
            System.out.println("Warning up the engine.");
            sleep(333);
            System.out.println("Lets count!");
        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }

    }


    void Show() {
        super.Show();

        System.out.println("clock: " + this.clock);
        System.out.println("cacheL1: " + this.cacheL1);
        System.out.println("cacheL2: " + this.cacheL2);
        System.out.println("cacheL3: " + this.cacheL3);
        System.out.println("tdp: " + this.tdp);

    }


}
