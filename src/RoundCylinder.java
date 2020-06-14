/*
* Classname : Cylinder
*
*  05 June 2020
*
* Copyright : Klymenko Sergij ONPU
*
  Module 2 task 2. Inheritance

1. Create a child  from the class Rectangle.
2. Create another class as a super class for your one.  Or create a daughterly class for your one.
 */

public class RoundCylinder extends Round {

    double height;
    String material;

    public RoundCylinder(int id, double radius, double height, String material) {
        super(id, radius);
        this.height = height;
        this.material = material;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public double getVolume() {
        return height * super.getArea();
    }

//Method2. get Surface Area
    public double getSurfaceArea() {
        return 2 * Math.PI * this.getRadius() * (this.getRadius() + this.getHeight());
    }

    @Override
    public String toString() {
        return "Zylindr{" +
                "bottom radius=" + this.getRadius() +
                ", bottom area=" + this.getArea() +
                ", volume=" + this.getVolume() +
                ", material=" + this.getMaterial() +
                '}';
    }
    @Override
    public String toJSON() {
        String json = "Zylindr = '{" +
                "\"" + "bottom Radius" + "\"" + ": " + this.getRadius() + ", " +
                "\"" + "bottom Area" + "\"" + ": " + this.getArea() + ", " +
                "\"" + "Volume" + "\"" + ": " + this.getVolume() + ", " +
                "\"" + "Material" + "\"" + ": " + this.getMaterial() +
                "}'";
        return json;
    }
    @Override
    public String toXML() {
        String xml = "<Zylindr>"
                + "<Radius>" + super.getRadius() + "</Radius>"
                + "<Area>" + super.getArea() + "</Area>"
                + "<Volume>" + this.getVolume() + "</Volume>"
                + "<Material>" + this.getMaterial() + "</Material>"
                + "</Zylindr>";
        return xml;
    }
    @Override
    public void toConsole() {
        System.out.println("\nZylindr : " + "\n" +
                "\tradius = " + super.getRadius() + "\n" +
                "\tarea = " + super.getArea() + "\n" +
                "\tvolume = " + this.getVolume() + "\n" +
                "\tmaterial = " + this.getMaterial() + "\n"
        );
    }

}
