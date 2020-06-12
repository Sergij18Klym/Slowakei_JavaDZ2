/*
* Classname : Student
*
*  10 June 2020
*
* Copyright : Klymenko Sergij ONPU
*
  Module 2 task 4. Programming patterns. Factory, Builder.

Develop for your class

1. Factory.
2. Abstract factory.
3. Create a class Student  - 25 fields.
4. Create a builder for the class Student

* */

public class StudentEmployee extends Student {

    @Override
    public double getStipendium() {

        double stipendium = 0;

        if (super.getEducationtype().equals("Bachelor")) stipendium = 1600;
        if (super.getEducationtype().equals("Master")) stipendium = 2000;
        if (super.getSpec().equals("Design")) stipendium += 400;
        if (super.isEmployed() == true) stipendium += 1000;
        if (super.isKomsomolets() == false) stipendium = 0;

        return stipendium;

    }

}
