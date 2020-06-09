/*
* Classname : Rhombus
*
*  05 June 2020
*
* Copyright : Klymenko Sergij ONPU
*
*  Module 2 task 1
*
* Create a class from the attached document according to the order in your group .  The class must contain
1. Constructor.
2. Getters/Setters.
3. 5 methods.
4. Override toString() method
5. Override hash() and equals() methods.
*
* */

import java.util.Objects;

public class Rhombus extends Rectangle{

    private double side;
    private double angle;

    public Rhombus(int id, double length, double angle) {
        super(id, length, length);
        this.side = length;
        this.angle = angle;
    }

    public Rhombus() { }

    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public double getAngle() {
        return angle;
    }
    public void setAngle(double angle) {
        this.angle = angle;
    }

//Method 3,4 get long and short diagonal
    public double getLongDiagonal(){
        return this.getSide() * Math.sqrt( 2 + 2 * Math.cos(this.getAngle()));
    }
    public double getShortDiagonal(){
        return this.getSide() * Math.sqrt( 2 - 2 * Math.cos(this.getAngle()));
    }

//Method5. Inside Circle Radius
    public double getInsideCircleR() {
        return this.getArea() / 2 * this.getSide();
    }

    @Override
    public double getArea() {
        return 0.5 * this.getLongDiagonal() * this.getShortDiagonal();
    }
    @Override
    public double getLinearLength() {
        return 4 * this.getSide();
    }

//Method6
    public boolean isQuadrat(){
        return (this.getAngle() == 0.5 * Math.PI) ? true : false ;
    }

    @Override
    public String toString() {
        return "Rhombus{" +
                " side=" + side +
                ", angle=" + angle +
                ", area=" + this.getArea() +
                ", perimeter=" + this.getLinearLength() +
                ", short diagonal=" + this.getShortDiagonal() +
                ", long diagonal=" + this.getLongDiagonal() +
                ", inside circle radius=" + this.getInsideCircleR() +
                ", isQuadrat=" + this.isQuadrat() +
                " }";
    }
    @Override
    public String toJSON() {
        String json = "Rhombus = '{" +
                "\"" + "Side" + "\"" + ": " + this.getSide() + ", " +
                "\"" + "Angle" + "\"" + ": " + this.getAngle() + ", " +
                "\"" + "LongDiagonal" + "\"" + ": " + this.getLongDiagonal() + ", " +
                "\"" + "ShortDiagonal" + "\"" + ": " + this.getShortDiagonal() + ", " +
                "\"" + "Area" + "\"" + ": " + this.getArea() + ", " +
                "\"" + "Perimeter" + "\"" + ": " + this.getLinearLength() +
                "}'";
        return json;
    }
    @Override
    public String toXML() {
        String xml = "<Rhombus>"
                + "<Side>" + this.getSide() + "</Side>"
                + "<Angle>" + this.getAngle() + "</Angle>"
                + "<Perimeter>" + this.getLinearLength() + "</Perimeter>"
                + "<Area>" + this.getArea() + "</Area>"
                + "</Rhombus>";
        return xml;
    }
    @Override
    public void toConsole() {
        System.out.println("\nRhombus : " + "\n" +
                "\tside = " + this.getSide() + "\n" +
                "\tangle = " + this.getAngle() + "\n" +
                "\tperimeter = " + this.getLinearLength() + "\n" +
                "\tarea = " + this.getArea() + "\n" +
                "\tisQuadrat = " + this.isQuadrat() + "\n"
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Rhombus rhombus = (Rhombus) obj;
        return getSide() == rhombus.getSide() &&
                getAngle() == rhombus.getAngle();
    }
    @Override
    public int hashCode() {
        return Objects.hash(side, angle);
    }
}
