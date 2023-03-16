
import java.util.Random;

public class Ram extends Product {
    private int frequency;

    public Ram(String name, int frequency, float price,
            int quantity, String color, boolean isNew) {
        super(price, quantity, color, isNew);
        this.name = name;
        this.frequency = frequency;
    }

    @Override
    public void Functionality() {
        System.out.println("Ram working.");
        int countData = randomizeData();
        System.out.println("Processing data...");
        for (int i = 0; i <= countData; i++) {
            System.out.println("Processing data... with frequency: " + randomizeFrequency(this.frequency) + " MHz");
        }
    }

    private int randomizeData() {
        Random r = new Random();
        return r.nextInt(10) + 1;
    }

    private int randomizeFrequency(int maxFrequency) {
        Random r = new Random();
        return r.nextInt(maxFrequency) + 1;
    }
}
