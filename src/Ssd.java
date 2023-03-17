import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import enums.DataUnit;

public class Ssd extends Product {
    private float freeSpace;
    private LocalDateTime lifespan;
    private int writeSpeed;
    private int readSpeed;

    public Ssd(String name, float freeSpace, long lifespanHours, int writeSpeed, int readSpeed, float price,
            int quantity, String color, boolean isNew) {
        super(price, quantity, color, isNew);
        this.name = name;
        this.freeSpace = freeSpace;
        this.lifespan = LocalDateTime.now().plus(lifespanHours, ChronoUnit.HOURS);
        this.writeSpeed = writeSpeed;
        this.readSpeed = readSpeed;
    }

    @Override
    public void Functionality() {
        super.Functionality();

        System.out.println("Free space: " + this.freeSpace + " GB");
        System.out.println("Write speed: " + getWriteSpeed() + " MB/s");
        System.out.println("Read speed: " + getReadSpeed() + " MB/s");
    }

    public void storageData(float fileSize, DataUnit unit) {
        if (unit == DataUnit.mb) {
            if (canStore(fileSize / 1024))
                this.freeSpace -= fileSize / 1000;
        } else if (unit == DataUnit.gb) {
            if (canStore(fileSize))
                this.freeSpace -= fileSize;
        } else {
            if (canStore(fileSize * 1024))
                this.freeSpace -= fileSize * 1000;
        }

        System.out.println("Remain space: " + this.freeSpace + " GB");
    }

    private boolean canStore(float fileSizeConverted) {
        if (this.freeSpace >= fileSizeConverted) {
            return true;
        } else {
            System.out.println("Not enough space.");
            return false;
        }
    }

    public void checkLifespan() {
        LocalDateTime today = LocalDateTime.now();
        if (today.compareTo(this.lifespan) > 0) {
            System.out.println("SSD is dead.");
        } else {
            System.out.println(
                    "SSD is alive and remains " + ChronoUnit.DAYS.between(this.lifespan, today) * -1 + " days.");
        }
    }

    public int getWriteSpeed() {
        return this.writeSpeed;
    }

    public int getReadSpeed() {
        return this.readSpeed;
    }

}
