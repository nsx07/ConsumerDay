import static java.lang.Thread.sleep;

import enums.DataUnit;

public class Main {

    public static void Logger(int miliSeconds) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < miliSeconds; j++) {
                System.out.print("*");
            }
            try {
                sleep(miliSeconds);
            } catch (Exception excep) {
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {

        Processor cpu = new Processor(1050, 1, "gray", true);
        Logger(50);
        cpu.Functionality();

        Ssd ssd = new Ssd("SSD ADATA 5TB 2,5 SATA 3 ASU650SS120GTR", 5000, 200, 520, 320, 200, 1, "Black", true);
        ssd.Functionality();
        ssd.storageData(2, DataUnit.tb);
        ssd.checkLifespan();
        System.out.println("Write speed: " + ssd.getWriteSpeed() + " MB/s");
        System.out.println("Read speed: " + ssd.getReadSpeed() + " MB/s");

        Ram ram = new Ram("RAM ADATA 8GB 2400MHz DDR4 AD4U2400W8G11", 2400, 100, 1, "Black", true);
        ram.Functionality();

    }
}