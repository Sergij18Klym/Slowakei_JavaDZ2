/*
* Classname : AbstractFactory
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

public class AbstractFactory {

    public static iGeometry create(int id, double a, double b, Figure type){
/*
        if(type.equals(Figure.TRIANGLE)) return new Triangle((float) a, (float) b);
        if(type.equals(Figure.RECTANGLE)) return new Rectangle(id,a,b);
        if(type.equals(Figure.CONE)) return new Cone(id,a,b);

        return null;
*/

        switch(type){

            case TRIANGLE: { return new Triangle(id, (float) a, (float) b); }
            case RECTANGLE: { return new Rectangle(id,a,b); }
            default: return null;

        }

    }

}
