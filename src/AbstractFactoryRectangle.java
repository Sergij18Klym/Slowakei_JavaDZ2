/*
 * Classname: AbstractFactoryRectangle
 *
 * @Version     1.10  12 June 2020
 * @Author      Klymenko Sergij, ONPU
 *
 *  Module 2 task 4. Programming patterns. Factory, Builder.
 *
 * Develop for your class:
 *
 *  1. Factory.
 *  2. Abstract factory.
 *  3. Create a class Student  - 25 fields.
 *  4. Create a builder for the class Student
 *
 * */

public class AbstractFactoryRectangle {

    /**
     * Class constructor with parameters
     * Creates a class instance depending on requested figure
     * @param id int, sets the id for the figure
     * @param length double, length of a figure to set
     * @param width double, width of a figure to set
     * @param angle double, angle between length and width of a figure to set
     **/

    public static Rectangle create(int id, double length, double width, double angle) {

        /**
         * in case (length == width) you get a Square or Rhombus actually, not Rectangle
         * @return new Rectangle object
         */
        if (length != width) {
            return new Rectangle(id, length, width);
        }

        /**
         * in case (all angles == 90°) you get a Square, otherwise - a Rhombus
         * @return new Quadrat object
         */
        else if (length == width && angle == 3 * Math.PI /6) {
            return new Quadrat(id, length, angle);
        }

        /**
         * @return new Rhombus object
         */
        else if (length == width) {
            return new Rhombus(id, length, angle);
        }

        else return null;
    }

}
