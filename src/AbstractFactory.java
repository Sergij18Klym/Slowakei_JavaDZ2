/*
 * Classname: AbstractFactory
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

public class AbstractFactory {

    /**
     * Class constructor with parameters
     * Creates a class instance depending on requested figure
     * @param id int, sets the id for the figure
     * @param varA double, varA of a figure to set
     * @param varB double, varB of a figure to set
     * @param type specifies which figure to be created
     **/

    public static iGeometry create(int id, double varA, double varB, Figure type){

        switch(type){
            case TRIANGLE: { return new Triangle(id, (float) varA, (float) varB); }
            case RECTANGLE: { return new Rectangle(id,varA,varB); }
            default: return null;
        }




        /*
        if(type.equals(Figure.TRIANGLE)) return new Triangle((float) a, (float) b);
        if(type.equals(Figure.RECTANGLE)) return new Rectangle(id,a,b);
        if(type.equals(Figure.CONE)) return new Cone(id,a,b);

        return null;
        */

    }

}
