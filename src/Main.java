import enums.Compability;
import enums.MouseType;
import enums.DataUnit;

public class Main {

    public static void main(String[] args) {

        Processor cpu = new Processor(1050, 1,"gray", true);
        cpu.Show();
        cpu.Functionality();

        Headset headset = new Headset(333, 1, "RED", true, "Razor","Abyssus", Compability.xbox);
        headset.Show();
        headset.Functionality();
        headset.changeVolume(89);
        headset.changeVolume(20);
        headset.mute(true);

        Mouse mouse = new Mouse(150, 1 , "BLACK", false, "Redragon","Kraken", MouseType.wireless);
        mouse.Show();
        mouse.Functionality();
        mouse.changeDPI(600);


        Ssd ssd = new Ssd("SSD ADATA 5TB 2,5 SATA 3 ASU650SS120GTR", 5000, 200, 520, 320, 200, 1, "Black", true);
        ssd.Show();
        ssd.Functionality();

        ssd.storageData(2, DataUnit.tb);
        ssd.checkLifespan();

        Ram ram = new Ram("RAM ADATA 8GB 2400MHz DDR4 AD4U2400W8G11", 2400, 100, 1, "Black", true);
        ram.Show();
        ram.Functionality();

    }
}