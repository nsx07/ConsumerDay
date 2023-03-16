import enums.Compability;

public class Headset extends Product {
    
    String brand;
    String model;
    Compability compatibility;
    int volume = 30; 
    boolean microphone;

    public Headset(float price, int quantity, String color, boolean isNew, String brand, String model, Compability compatibility) {
        super(price, quantity, color, isNew);
        this.name = "Headset";
        this.brand = brand;
        this.model = model;
        this.compatibility = compatibility;

    }

    public void changeVolume(int increment){
        if(this.volume + increment >= 0 && this.volume + increment <= 100){
            this.volume = this.volume + increment;
            System.out.println("Volume changed for: " + volume);
            if(this.volume > 70){
                volumeAlert();
            }
        }
        else if(this.volume + increment >= 100)
            System.out.println("The max volume is 100!");    
        else
            System.out.println("The min volume is 0!");
    }

    public void volumeAlert(){
        System.out.println("Careful! Volume above recommended");

    }

    public void mute (boolean microphone){
        if(microphone)
            this.microphone = !this.microphone;
        else
            this.volume = 0;
    }

    @Override
    void Functionality() {
        // TODO Auto-generated method stub
        
    }
}