/*
* Classname : Triangle
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

public class Triangle implements iGeometry, iPackaging {

    private int id;

    private float sideA;
    private float sideB;
    private float sideC;

    public Triangle () {
    }

    public float getSideA() {
        return sideA;
    }
    public void setSideA(float sideA) {
        this.sideA = sideA;
    }
    public float getSideB() {
        return sideB;
    }
    public void setSideB(float sideB) {
        this.sideB = sideB;
    }
    public float getSideC() {
        return sideC;
    }
    public void setSideC(float sideC) {
        this.sideC = sideC;
    }

    public Triangle(int id, float sideA, float sideB, float sideC) {
        this.id = id;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        if (sideA + sideB < sideC || sideA + sideC < sideB || sideB + sideC < sideA)
            System.out.println("\nInvalid triangle");
    }

    public Triangle(float sideA) {
        this.sideA = sideA;
        this.sideB = sideA;
        this.sideC = sideA;
    }

    public Triangle(float sideA, float sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideA;
    }

    public Triangle(float sideA, float sideB, double alpha) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = (float) Math.sqrt(sideA * sideA + sideB * sideB - 2 * sideA * sideB * Math.cos(alpha));
    }

    public Triangle(float sideA, float sideB, double alpha, double beta) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = (float) ((sideA * Math.cos(beta)) + ((sideB * Math.cos(alpha))));
    }

        @Override
        public double getArea() {
            double semiPer = this.getLinearLength() / 2;
            return Math.sqrt(semiPer * (semiPer - this.getSideA())
                    * (semiPer - this.getSideB()) * (semiPer - this.getSideC()));
        }

        @Override
        public double getLinearLength() {
            return this.getSideA() + this.getSideB() + this.getSideC();
        }

    public static double getLinearLength(float sideA, float sideB, float sideC) {
        return sideA + sideB + sideC;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                " sideA=" + sideA +
                ", sideB=" + getSideB() +
                ", sideC=" + sideC +
                ", area=" + this.getArea() +
                ", perimeter=" + this.getLinearLength() +
                ", id=" + this.getId() +
                " }";
    }

    @Override
    public String toJSON() {
        String json = "Triangle = '{" +
                "\"" + "SideA" + "\"" + ": " + this.getSideA() + ", " +
                "\"" + "SideB" + "\"" + ": " + this.getSideB() + ", " +
                "\"" + "SideC" + "\"" + ": " + this.getSideC() + ", " +
                "\"" + "Area" + "\"" + ": " + this.getArea() + ", " +
                "\"" + "Perimeter" + "\"" + ": " + this.getLinearLength() + ", " +
                "}'";
        return json;
    }

    @Override
    public String toXML() {
        String xml = "<Triangle>"
                + "<SideA>" + this.getSideA() + "</SideA>"
                + "<SideB>" + this.getSideB() + "</SideB>"
                + "<SideC>" + this.getSideC() + "</SideC>"
                + "<Perimeter>" + this.getLinearLength() + "</Perimeter>"
                + "<Area>" + this.getArea() + "</Area>"
                + "</Triangle>";
        return xml;
    }

    @Override
    public void toConsole() {
        System.out.println("\nRectangle : " + "\n" +
                "\tsideA = " + this.getSideA() + "\n" +
                "\tsideB = " + this.getSideB() + "\n" +
                "\tsideC = " + this.getSideC() + "\n" +
                "\tperimeter = " + this.getLinearLength() + "\n" +
                "\tarea = " + this.getArea() + "\n"
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Triangle triangle = (Triangle) obj;
        return getId() == triangle.getId();
    }

    @Override
    public int hashCode() {
        return id;
    }

    public int hasherCode() {
        return Objects.hash(sideA, sideB, sideC);
    }
}
