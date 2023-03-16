import static java.lang.Thread.sleep;

public class Main {

    public static void Logger(int miliSeconds) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < miliSeconds; j++) {
                System.out.print("*");
            }
            try {
                sleep(miliSeconds);
            }
            catch (Exception excep) {}
            System.out.println();

        }
    }
    public static void main(String[] args) {

        Processor cpu = new Processor(1050, 1,"gray", true);
        Logger(50);
        cpu.Functionality();

    }
}