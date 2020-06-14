import java.util.Objects;

/*
* Classname : Rhombus
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

public class Rhombus extends Rectangle{

    private double side;
    private double angle;

    /**
     * Class constructor with parameters
     * @param id int, inherited from Rectangle, set the Rhombus id
     * @param length double, inherited from Rectangle, set the Rhombus side length
     * @param angle double, set the Rhombus angle
     */
    public Rhombus(int id, double length, double angle) {
        super(id, length, length);
        this.side = length;
        this.angle = angle;
    }

    // default empty constructor
    public Rhombus() { }

     // the getter and setter for Id field are inherited from Rectangle object

    /**
     * Getter for field Rhombus side length
     * @return side of object Rhombus
     */
    public double getSide() {
        return side;
    }
    /**
     * Setter for field Rhombus side length
     * @oaram side sets Side Length of object Rhombus
     */
    public void setSide(double side) {
        this.side = side;
    }
    /**
     * Getter for field Rhombus angle
     * @return angle of object Rhombus
     */
    public double getAngle() {
        return angle;
    }
    /**
     * Setter for field Rhombus angle
     * @oaram angle sets Angle of object Rhombus
     */
    public void setAngle(double angle) {
        this.angle = angle;
    }

    /**
     * Method3. Calculating the Long Diagonal of a figure
     * @return the calculated length of long diagonal of Rhombus
     */
    public double getLongDiagonal(){
        return this.getSide() * Math.sqrt( 2 + 2 * Math.cos(this.getAngle()));
    }
    /**
     * Method4. Calculating the Short Diagonal of a figure
     * @return the calculated length of short diagonal of Rhombus
     */
    public double getShortDiagonal(){
        return this.getSide() * Math.sqrt( 2 - 2 * Math.cos(this.getAngle()));
    }

    /**
     * Method5. Calculating the Outside Circle Radius of a figure
     * @return the calculated Outside Circle Radius of Rectangle
     */
    public double getInsideCircleR() {
        return this.getArea() / 2 * this.getSide();
    }

    /**
     * Method1. Implemented from IGeometry. Calculating the Area of a figure
     * @return the calculated area of Rhombus
     */
    @Override
    public double getArea() {
        return 0.5 * this.getLongDiagonal() * this.getShortDiagonal();
    }
    /**
     * Method2. Implemented from IGeometry. Calculating the Perimeter of a figure
     * @return the calculated perimeter of Rhombus
     */
    @Override
    public double getLinearLength() {
        return 4 * this.getSide();
    }

    /**
     * Method7. Checking whether the figure is a Square
     * @return true / false
     */
    public boolean isQuadrat(){
        return (this.getAngle() == 0.5 * Math.PI) ? true : false ;
    }

    /**
     * Method toString() for class Rhombus
     * @return Returns info about the figure
     */
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
    /**
     * Method toJSON() for class Rhombus
     * @return Returns JSON-info about the figure
     */
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
    /**
     * Method toXML() for class Rhombus
     * @return Returns xml-info about the figure
     */
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
    /**
     * Used to print the info about the figure to console
     */
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

    /*
     * Method to check whether object equals by value
     * @param obj Object as parameter
     * @return Return boolean value as a result of comparison
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Rhombus rhombus = (Rhombus) obj;
        return getSide() == rhombus.getSide() &&
                getAngle() == rhombus.getAngle();
    }
    /**
     * Method to get object hash
     * @return Returns Student object hash.
     */
    @Override
    public int hashCode() {
        return Objects.hash(side, angle);
    }
}
