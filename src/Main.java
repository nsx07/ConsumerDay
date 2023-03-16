import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) {

        Processor cpu = new Processor(1050, 1,"gray", true);

        cpu.Show();
        cpu.Functionality();

    }
}