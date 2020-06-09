/*
* Classname : Quadrat
*
*  05 June 2020
*
* Copyright : Klymenko Sergij ONPU
*
  Module 2 task 2. Inheritance

1. Create a child  from the class Rectangle.
2. Create another class as a super class for your one.  Or create a daughterly class for your one.
 */

import java.util.Objects;

public class Quadrat extends Rhombus {

    public Quadrat(int id, double side, double angle) {
        super(id, side, 3 * Math.PI /6);
    }

    public Quadrat() {  }

    public double getAngle() {
        return 3 * Math.PI /6;
    }

    @Override
    public double getArea() {
        return this.getSide() * this.getSide();
    }

   public double getDiagonal() {
        return this.getSide() * Math.sqrt(2);
   }

    public double getInsideCircleR() {
        return this.getLinearLength() / 2;
    }
    public double getOutsideCircleR() {
        return this.getDiagonal() / 2;
    }

    @Override
    public String toString() {
        return "Quadrat{" +
                " side=" + this.getSide() +
                ", area=" + this.getArea() +
                ", perimeter=" + this.getLinearLength() +
                ", diagonal=" + this.getDiagonal() +
                ", inside circle radius=" + this.getInsideCircleR() +
                ", outside circle radius=" + this.getOutsideCircleR() +
                ", isQuadrat=" + this.isQuadrat() +
                " }";
    }
    @Override
    public String toJSON() {
        String json = "Quadrat = '{" +
                "\"" + "Side" + "\"" + ": " + this.getSide() + ", " +
                "\"" + "Area" + "\"" + ": " + this.getArea() + ", " +
                "\"" + "Perimeter" + "\"" + ": " + this.getLinearLength() +
                "}'";
        return json;
    }
    @Override
    public String toXML() {
        String xml = "<Quadrat>"
                + "<Side>" + this.getSide() + "</Side>"
                + "<Perimeter>" + this.getLinearLength() + "</Perimeter>"
                + "<Area>" + this.getArea() + "</Area>"
                + "</Quadrat>";
        return xml;
    }
    @Override
    public void toConsole() {
        System.out.println("\nQuadrat : " + "\n" +
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
        Quadrat square = (Quadrat) obj;
        return Double.compare(square.getSide(), getSide()) == 0;
    }
    @Override
    public int hashCode() {
        return Objects.hash(getSide());
    }

}
