/*
* Classname : AbstractFactoryRectangle
*
* Version info 1.0
*
*  09 June 2020
*
* Copyright : Klymenko Sergij ONPU
*
  Module 2 task 4. Programming patterns. Factory, Builder.

Develop for your class:
2. Abstract factory.

* */

public class AbstractFactoryRectangle {

    public static Rectangle create(int id, double length, double width, double angle) {

// in case (length == width) you get a Square or Rhombus actually, not Rectangle
        if (length != width) {
            return new Rectangle(id, length, width);
        }
// in case (all angles == 90°) you get a Square, otherwise - a Rhombus
        else if (length == width && angle == 3 * Math.PI /6) {
            return new Quadrat(id, length, angle);
        }
        else if (length == width) {
            return new Rhombus(id, length, angle);
        }
        else return null;
    }

}
