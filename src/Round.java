/*
* Classname : Round
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

public class Round implements iGeometry, iPackaging{

    private int id;
    private double radius;

    public Round(int id, double radius) {
        this.id = id;
        this.radius = radius;
    }

    public Round() {}

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double getLinearLength() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Round{" +
                "id=" + id +
                ", radius=" + radius +
                ", area=" + this.getArea() +
                ", length=" + this.getLinearLength() +
                '}';
    }
    @Override
    public String toJSON() {
        String json = "Round = '{" +
                "\"" + "Id" + "\"" + ": " + this.getId() + ", " +
                "\"" + "Radius" + "\"" + ": " + this.getRadius() + ", " +
                "\"" + "Area" + "\"" + ": " + this.getArea() + ", " +
                "\"" + "Length" + "\"" + ": " + this.getLinearLength() +
                "}'";
        return json;
    }
    @Override
    public String toXML() {
        String xml = "<Round>"
                + "<ID>" + this.getId() + "</ID>"
                + "<Radius>" + this.getRadius() + "</Radius>"
                + "<Area>" + this.getArea() + "</Area>"
                + "<Length>" + this.getLinearLength() + "</Length>"
                + "</Round>";
        return xml;
    }
    @Override
    public void toConsole() {
        System.out.println("\nRound : " + "\n" +
                "\tid = " + this.getId() + "\n" +
                "\tradius = " + this.getRadius() + "\n" +
                "\tlength = " + this.getLinearLength() + "\n" +
                "\tarea = " + this.getArea() + "\n"
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Round)) return false;
        Round round = (Round) o;
        return Double.compare(round.getRadius(), getRadius()) == 0;
    }
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
