import java.util.Objects;

/*
* Classname : Rectangle
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

public class Rectangle implements iGeometry, iPackaging{

    private int id;
    private double length;
    private double width;

    /**
     * Class constructor with parameters
     * @param id int, set the Rectangle id
     * @param length double, set the Rectangle length
     * @param width double, set the Rectangle width
     */
    public Rectangle(int id, double length, double width) {
        this.id = id;
        this.length = length;
        this.width = width;
    }

    // default empty constructor
    public Rectangle() { }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for field Rectangle length
     * @return length of object Rectangle
     */
    public double getLength() {
        return length;
    }
    /**
     * Setter for field Rectangle length
     * @oaram length sets Length of object Rectangle
     */
    public void setLength(double length) {
        this.length = length;
    }
    /**
     * Getter for field Rectangle width
     * @return width of object Rectangle
     */
    public double getWidth() {
        return width;
    }
    /**
     * Setter for field Rectangle width
     * @oaram width sets Width of object Rectangle
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Method1. Implemented from IGeometry. Calculating the Area of a figure
     * @return the calculated area of Rectangle
     */
    @Override
    public double getArea() {
        return this.getLength() * this.getWidth();
    }
    /**
     * Method2. Implemented from IGeometry. Calculating the Perimeter of a figure
     * @return the calculated perimeter of Rectangle
     */
    @Override
    public double getLinearLength() {
        return 2 * (this.getWidth() + this.getLength());
    }

    /**
     * Method3. Calculating the Diagonal of a figure
     * @return the calculated length of diagonal of Rectangle
     */
    public double getDiagonal() {
        return Math.sqrt(Math.pow(this.getLength(),2) + Math.pow(this.getWidth(),2));
    }

    /**
     * Method4. Calculating the Outside Circle Radius of a figure
     * @return the calculated Outside Circle Radius of Rectangle
     */
    public double getOutsideCircleR() {
        return this.getDiagonal() / 2;
    }

    /**
      * Method5. Checking whether the figure is a Square
      * @return true / false
      */
    public boolean isQuadrat(){
        return (this.getLength() == this.getWidth()) ? true : false;
    }

    /**
     * Method toString() for class Rectangle
     * @return Returns info about the figure
     */
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
    /**
     * Method toJSON() for class Rectangle
     * @return Returns JSON-info about the figure
     */
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
    /**
     * Method toXML() for class Rectangle
     * @return Returns xml-info about the figure
     */
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
    /**
     * Used to print the info about the figure to console
     */
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

    /*
     * Method to check whether object equals by value
     * @param obj Object as parameter
     * @return Return boolean value as a result of comparison
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Rectangle rectangle = (Rectangle) obj;
        return getWidth() == rectangle.getWidth() &&
               getLength() == rectangle.getLength();
    }

    /**
     * Method to get object hash
     * @return Returns Student object hash.
     */
    @Override
    public int hashCode() {
        return id;
    }
}