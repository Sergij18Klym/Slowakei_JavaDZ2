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

public final class StudentSingleton {

    private static StudentSingleton INSTANCE;
    private String info = "Initial info class";

    private StudentSingleton() {
    }

    public static StudentSingleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new StudentSingleton();
        }

        return INSTANCE;
    }

    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
}