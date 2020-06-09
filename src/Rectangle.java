/*
* Classname : Rectangle
*
*  04 June 2020
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

public class Rectangle implements iGeometry, iPackaging{

    private int id;
    private double length;
    private double width;

    public Rectangle(int id, double length, double width) {
        this.id = id;
        this.length = length;
        this.width = width;
    }

    public Rectangle() { }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.getLength() * this.getWidth();
    }
    @Override
    public double getLinearLength() {
        return 2 * (this.getWidth() + this.getLength());
    }

// Method3. Diagonal
    public double getDiagonal() {
        return Math.sqrt(Math.pow(this.getLength(),2) + Math.pow(this.getWidth(),2));
    }

//Method4. Outside Circle Radius
    public double getOutsideCircleR() {
        return this.getDiagonal() / 2;
    }

//Method5. boolean isSquare
    public boolean isQuadrat(){
        return (this.getLength() == this.getWidth()) ? true : false;
    }

    @Override
    public String toString() {
        return "Rectangle{ " +
                "id = " + id +
                ", length = " + length +
                ", width = " + width +
                ", area = " + this.getArea() +
                ", perimeter = " + this.getLinearLength() +
                ", diagonal = " + this.getDiagonal() +
                ", outside circle radius=" + this.getOutsideCircleR() +
                ", isQuadrat = " + this.isQuadrat() +
                '}';
    }
    @Override
    public String toJSON() {
        String json = "Rhombus = '{" +
                "\"" + "Length" + "\"" + ": " + this.getLength() + ", " +
                "\"" + "Width" + "\"" + ": " + this.getWidth() + ", " +
                "\"" + "Area" + "\"" + ": " + this.getArea() + ", " +
                "\"" + "Perimeter" + "\"" + ": " + this.getLinearLength() +
                "}'";
        return json;
    }
    @Override
    public String toXML() {
        String xml = "<Rectangle>"
                + "<Length>" + this.getLength() + "</Side>"
                + "<Angle>" + this.getWidth() + "</Angle>"
                + "<Perimeter>" + this.getLinearLength() + "</Perimeter>"
                + "<Area>" + this.getArea() + "</Area>"
                +  "</Rectangle>";
        return xml;
    }
    @Override
    public void toConsole() {
        System.out.println("\nRectangle : " + "\n" +
                "\tlength = " + this.getLength() + "\n" +
                "\twidth = " + this.getWidth() + "\n" +
                "\tperimeter = " + this.getLinearLength() + "\n" +
                "\tarea = " + this.getArea() + "\n" +
                "\tisQuadrat = " + this.isQuadrat() + "\n"
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Rectangle rectangle = (Rectangle) obj;
        return getWidth() == rectangle.getWidth() &&
               getLength() == rectangle.getLength();
    }

    @Override
    public int hashCode() {
        return id;
    }
}