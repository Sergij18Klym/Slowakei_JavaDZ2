/*
* Classname : Cone
*
 * @Version     1.10  09 June 2020
 * @Author      Klymenko Sergij, ONPU
*
* Copyright : Klymenko Sergij ONPU
*
  Module 2 task 2. Inheritance

1. Create a child  from the class Rectangle.
2. Create another class as a super class for your one.  Or create a daughterly class for your one.
 */

public class RoundCone extends RoundCylinder {

    private double upperRadius;

    /**
     * Class constructor with parameters
     * @param id int, inherited from Cylinder and set to Cylinder object
     * @param radius double, base radius inherited from Cylinder and set to Cone object as bottom radius
     * @param height double, inherited from Cylinder and set to Cone object
     * @param material String, inherited from Cylinder and set to Cone object
     * @param upperRadius double, set the Cone upper radius
     */
    public RoundCone(int id, double radius, double height, String material, double upperRadius) {
        super(id, radius, height, material);
        this.upperRadius = upperRadius;
    }

    /**
     * Getter for Cone upperRadius field
     * @return Returns upper radius of Cone object
     */
    public double getUpperRadius() {
        return upperRadius;
    }
    /**
     * Setter for Cone upper_height field
     * @param upperRadius Sets upper_radius of Cone object
     */
    public void setUpperRadius(double upperRadius) {
        this.upperRadius = upperRadius;
    }

//Method1. getVolume
    public double getVolume() {
        return super.getArea() *  this.getHeight() / 3;
    }
//Method2. get Surface Area
    public double getSurfaceArea() {
        double LlengthHeight = Math.sqrt(Math.pow(this.getRadius(),2) + Math.pow(this.getHeight(),2));
        return Math.PI * this.getRadius() * (this.getRadius() + LlengthHeight);
    }

    @Override
    public String toString() {
        return "Cone{" +
                " id=" + this.getId() +
                ", bottom radius=" + this.getRadius() +
                ", upper radius=" + this.getUpperRadius() +
                ", bottom area=" + this.getArea() +
                ", volume=" + this.getVolume() +
                ", surface area=" + this.getSurfaceArea() +
                ", material=" + this.getMaterial() +
                '}';
    }
    @Override
    public String toJSON() {
        String json = "Cone = '{" +
                "\"" + "bottom Radius" + "\"" + ": " + this.getRadius() + ", " +
                "\"" + "bottom Area" + "\"" + ": " + this.getArea() + ", " +
                "\"" + "Volume" + "\"" + ": " + this.getVolume() + ", " +
                "\"" + "Material" + "\"" + ": " + this.getMaterial() +
                "}'";
        return json;
    }
    @Override
    public String toXML() {
        String xml = "<Cone>"
                + "<Radius>" + super.getRadius() + "</Radius>"
                + "<Area>" + super.getArea() + "</Area>"
                + "<Volume>" + this.getVolume() + "</Volume>"
                + "<Material>" + this.getMaterial() + "</Material>"
                + "</Cone>";
        return xml;
    }
    @Override
    public void toConsole() {
        System.out.println("\nCone : " + "ID=" + this.getId() + "\n" +
                "\tbottom radius = " + super.getRadius() + "\n" +
                "\tupper radius = " + this.getUpperRadius() + "\n" +
                "\tbottom area = " + super.getArea() + "\n" +
                "\tvolume = " + this.getVolume() + "\n" +
                "\tsurface area = " + this.getSurfaceArea() + "\n" +
                "\tmaterial = " + this.getMaterial() + "\n"
        );
    }
}
