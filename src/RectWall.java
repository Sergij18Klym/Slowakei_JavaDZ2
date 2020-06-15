/*
* Classname : Wall
*
*  05 June 2020
*
* Copyright : Klymenko Sergij ONPU
*
  Module 2 task 2. Inheritance

1. Create a child  from the class Rectangle.
2. Create another class as a super class for your one.  Or create a daughterly class for your one.
 */

public class RectWall extends Rectangle{

    String color;
    String material;
    boolean isPlaster;
    int pricePlasterPerMeter;
    int priceForColoringForMeter;
    boolean isBase;
    int windowsAmount;

    public RectWall(int id, double length, double width, String color, String material, boolean isPlaster, int pricePlasterPerMeter, int priceForColoringForMeter, boolean isBase, int windowsAmount) {
        super(id, length, width);
        this.color = color;
        this.material = material;
        this.isPlaster = isPlaster;
        this.pricePlasterPerMeter = pricePlasterPerMeter;
        this.priceForColoringForMeter = priceForColoringForMeter;
        this.isBase = isBase;
        this.windowsAmount = windowsAmount;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public boolean isPlaster() {
        return isPlaster;
    }
    public void setPlaster(boolean plaster) {
        isPlaster = plaster;
    }
    public int getPricePlasterPerMeter() {
        return pricePlasterPerMeter;
    }
    public void setPricePlasterPerMeter(int pricePlasterPerMeter) {
        this.pricePlasterPerMeter = pricePlasterPerMeter;
    }
    public int getPriceForColoringForMeter() {
        return priceForColoringForMeter;
    }
    public void setPriceForColoringForMeter(int priceForColoringForMeter) {
        this.priceForColoringForMeter = priceForColoringForMeter;
    }
    public boolean isBase() {
        return isBase;
    }
    public void setBase(boolean base) {
        isBase = base;
    }
    public int getWindowsAmount() {
        return windowsAmount;
    }
    public void setWindowsAmount(int windowsAmount) {
        this.windowsAmount = windowsAmount;
    }

    public int getPlasterPrice(){
        return (int) super.getArea() * this.getPricePlasterPerMeter();
    }

    @Override
    public String toString() {
        return "Wall{" +
                "length= " + super.getLength()+
                "width= " + super.getWidth()+
                "area= " + super.getArea()+
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", isPlaster=" + isPlaster +
                ", pricePlasterPermeter=" + pricePlasterPerMeter +
                ", priceForColoringForMeter=" + priceForColoringForMeter +
                ", isBase=" + isBase +
                ", windowsAmount=" + windowsAmount +
                ", PI=" + Math.PI +
                '}';
    }

}
