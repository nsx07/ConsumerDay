import enums.MouseType;
public  class Mouse extends Product{
    String brand;
    String model;
    int dpi;
    MouseType mouseType;

    public Mouse(float price, int quantity, String color, boolean isNew, String brand, String model, MouseType mouseType) {
        super(price, quantity, color, isNew);
        this.name = "Mouse";
        this.brand = brand;
        this.model = model;
        this.mouseType = mouseType;

    }

    public void changeDPI(int dpi){
        if(dpi > 0 && dpi < 12000){
            this.dpi = dpi;
            System.out.println("DPI changed for: " + this.dpi);
        }
        else
            System.out.println("DPI value is not valid.");

    }
    
    @Override
    void Functionality() {
        super.Functionality();
    }
} 
