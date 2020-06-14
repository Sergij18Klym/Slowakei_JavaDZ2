import java.util.Objects;

/*
* Classname : Quadrat
*
 * @Version     1.10  12 June 2020
 * @Author      Klymenko Sergij, ONPU
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

public class Quadrat extends Rhombus {

    /**
     * Class constructor with parameters
     * @param id int, inherited from Rhombus, set the Quadrat id
     * @param side double, inherited from Rhombus, set the Quadrat side length
     * @param angle double, inherited from Rhombus,
     *        set the Quadrat side length to const 3 * Math.PI /6 (90°)
     */
    public Quadrat(int id, double side, double angle) {
        super(id, side, 3 * Math.PI /6);
    }

    // default empty constructor
    public Quadrat() {  }

    // the getters and setters for Id and Side field are inherited from Rhombus object

    /**
     * Getter for field Quadrat angle
     * @return the const angle of 90° of object Quadrat
     */
    public double getAngle() {
        return 3 * Math.PI /6;
    }

    /**
     * Method1. Implemented from IGeometry. Calculating the Area of a figure
     * @return the calculated area of Quadrat
     */
    @Override
    public double getArea() {
        return this.getSide() * this.getSide();
    }

    /**
     * Methods, calculating the figure's Perimeter and whether the figure is a Square,
     * are inherited from Rhombus object
     */

    /**
     * Method3. Calculating the Diagonal of a figure
     * @return the calculated length of diagonal of Quadrat
     */
    public double getDiagonal() {
        return this.getSide() * Math.sqrt(2);
   }

    /**
     * Method4. Calculating the Inside Circle Radius of a figure
     * @return the calculated Inside Circle Radius of Quadrat
     */
    public double getInsideCircleR() {
        return this.getLinearLength() / 2;
    }
    /**
     * Method5. Calculating the Outside Circle Radius of a figure
     * @return the calculated Outside Circle Radius of Quadrat
     */
    public double getOutsideCircleR() {
        return this.getDiagonal() / 2;
    }

    /**
     * Method toString() for class Quadrat
     * @return Returns info about the figure
     */
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
    /**
     * Method toJSON() for class Rhombus
     * @return Returns JSON-info about the figure
     */
    @Override
    public String toJSON() {
        String json = "Quadrat = '{" +
                "\"" + "Side" + "\"" + ": " + this.getSide() + ", " +
                "\"" + "Area" + "\"" + ": " + this.getArea() + ", " +
                "\"" + "Perimeter" + "\"" + ": " + this.getLinearLength() +
                "}'";
        return json;
    }
    /**
     * Method toXML() for class Rhombus
     * @return Returns xml-info about the figure
     */
    @Override
    public String toXML() {
        String xml = "<Quadrat>"
                + "<Side>" + this.getSide() + "</Side>"
                + "<Perimeter>" + this.getLinearLength() + "</Perimeter>"
                + "<Area>" + this.getArea() + "</Area>"
                + "</Quadrat>";
        return xml;
    }
    /**
     * Used to print the info about the figure to console
     */
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

    /*
     * Method to check whether object equals by value
     * @param obj Object as parameter
     * @return Return boolean value as a result of comparison
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Quadrat square = (Quadrat) obj;
        return Double.compare(square.getSide(), getSide()) == 0;
    }
    /**
     * Method to get object hash
     * @return Returns Student object hash.
     */
    @Override
    public int hashCode() {
        return Objects.hash(getSide());
    }

}
