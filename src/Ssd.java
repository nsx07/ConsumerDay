

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

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
        System.out.println("Free space: " + this.freeSpace + " GB");
    }

    public void storageData(float fileSize, String unit) {
        if (unit == "MB") {
            if (canStore(fileSize / 1024))
                this.freeSpace -= fileSize / 1000;
        } else if (unit == "GB") {
            if (canStore(fileSize))
                this.freeSpace -= fileSize;
        } else if (unit == "TB") {
            if (canStore(fileSize * 1024))
                this.freeSpace -= fileSize * 1000;
        } else {
            System.out.println("Invalid unit.");
        }

        System.out.println("Free space: " + this.freeSpace + " GB");
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
