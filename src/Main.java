/*
* Classname : Main
*
*  05 June 2020
*
* Copyright : Klymenko Sergij ONPU
*
  Module 2 task 1. Java class creation

Create a class from the attached document according to the order in your group. The class must contain
1. Constructor.
2. Getters/Setters.
3. 5 methods.
4. Override toString() method
5. Override hash() and equals() methods.

*
  Module 2 task 2. Inheritance

1. Create a child  from the class Rectangle.
2. Create another class as a super class for your one.  Or create a daughterly class for your one.

*
  Module 2 task 3. Polymorphism

Create and implement  two interfaces for your class.

*
  Module 2 task 4. Programming patterns. Factory, Builder.

Develop for your class

1. Factory.
2. Abstract factory.
3. Create a class Student  - 25 fields.
4. Create a builder for the class Student

* */

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

// Round
        Round krug = new Round(1,4);
        Round krug2 = new Round(2,4);

        System.out.println("Round Id hash: " + krug2.hashCode());
        krug.toConsole();
        System.out.println(krug.toJSON());
        System.out.println("\n" + krug.toXML());
        System.out.println("\nRound Equality : " + krug.equals(krug2));

// Cylinder V^3 extends Round
        Round_Zylindr zyl = new Round_Zylindr(1,4,10,"steel");

        System.out.println("\n");
        zyl.toConsole();

// Cone V^3 extends Round
        Round_Cone con = new Round_Cone(1,4,10,"steel", 2);

        System.out.println("\n");
        con.toConsole();

// Rhombus extends Rectangle
        Rhombus rhombus = new Rhombus(1,4, Math.PI / 6);
        Rhombus rumba = new Rhombus(2,(7 + 5) /5 , Math.PI /6);

        System.out.println("\nRhombus parameters: " + rumba);
        System.out.println("Rhombus hash: " + rumba.hashCode());
        System.out.println("Rhombus equality: " + rhombus.equals(rumba));

// Quadrat extends Rhombus
        Quadrat sq = new Quadrat(1,6,100500);
        Quadrat sq1 = new Quadrat(2,6,0);

        sq.toConsole();
        System.out.println("Square equality: " + sq.equals(sq1));

// Wall extends Rectangle
        Rect_Wall myWall = new Rect_Wall(4,
                7,
                8,
                "Blue",
                "Marble",
                false,
                1,
                5,
                false,
                2
        );
        System.out.println("\n" + myWall);

// Triangle standard - 3 sides
        Triangle triangle = new Triangle(1,3,4,5);

        triangle.setSideB(6);
        System.out.println("\nFYI, triangle1 SideB - sideB changed: " + triangle.getSideB());
        double Perimeter = triangle.getLinearLength();

        System.out.println("Triangle parameters: " + triangle.toString());
        System.out.println("Triangle id hash: " + triangle.hashCode());
        System.out.println("Triangle id hash: " + triangle.hasherCode());
        System.out.println(triangle.toJSON());
        System.out.println(triangle.toXML());

// Triangle Equileteral
        Triangle triangleequal = new Triangle(5);
        System.out.println("\nTriangleequal parameters: " + triangleequal.toString());

        System.out.println("Triangle equality: " + triangleequal.equals(triangle));

// Triangle Isosceles
        Triangle triangleiso = new Triangle(5,8);

        triangleiso.toConsole();

// Triangle cos(alpha)
        Triangle trianglealpha = new Triangle(4, 5, 0.6);
        System.out.println("\nTrianglealpha parameters: " + trianglealpha.toString());

// Triangle cos(alpha) , cos(beta)
        Triangle trianglealphabeta = new Triangle(4, 5, 0.6,0.3);
        System.out.println("\n" + trianglealphabeta.toXML());

// Triangle Equileteral2 -- via public class TriangleEquileteral extending Triangle
        TriangleEquileteral eTriangle = new TriangleEquileteral(0, 5);
        System.out.println("\nEqual perimeter: " + eTriangle.getLinearLength());
        System.out.println("Triangle equal parameters: " + eTriangle);
        System.out.println("Triangle equal equality: " + eTriangle.equals(triangle));

//Triangle Factory
        Triangle tria2 = TriangleFactory.create(1,1,1,10);

//Abstract Rectangle Factory
        Rectangle rectfact = AbstractFactoryRectangle.create(4,4,7,100500);
        Rectangle rombfact = AbstractFactoryRectangle.create(4,4,4,Math.PI /6);
        Rectangle quadfact = AbstractFactoryRectangle.create(4,4,4,3 * Math.PI /6);

        System.out.println("\n");
        rectfact.toConsole();
        rombfact.toConsole();
        quadfact.toConsole();
        System.out.println("Quadrat == Rhombus ? : " + rombfact.equals(quadfact));

//Abstract Factory
        iGeometry absTriangle = AbstractFactory.create(4,5,6, Figure.TRIANGLE);

        System.out.println("\nabstract triangle via factory" + absTriangle.toString());


//Student Builder
        Student John = new Student.Builder()
                .setFirstname("John")
                .setLastname("Lennon")
                .setPatronymic("Fatherovich")
                .setGender(StudentGender.MALE)
                .setBirthday(LocalDate.of(1940,10,9))
                .setNationality("English")
                .setOrigin("UK")
                .setBirthadress("Liverpool, Strawberry Fields")
                .setCurrentadress("New-York, cemetery")
                .setPostindex("5656754")
                .setEmail("johnlennon40@beatles.bom")
                .setMobilphone(309567865)
                .setSkype("john.lennon")
                .setTelegram("@johnlennon")
                .setInstagram("@plastic_moondog_ono")
                .setUniversity(StudentUniver.ONPU)
                .setFaculty(StudentFaculty.IPTDM)
                .setSpec(StudentSpeciality.DESIGN)
                .setLevel(StudentLevel.MASTER)
                .setCourse(StudentCourse.SECOND)
                .setEducationtype(StudentEducationType.FULL_TIME)
                .setEnterdate(LocalDate.of(1960,10,9))
                .setEmployed(true)
                .setStipendium(1200)
                .setEngaged(true)
                .setKomsomolets(false)
                .build();
        System.out.println(John);

//Student Paul is similar to John except the name
        Student Paul = new Student.Builder()
                .setSimilarTo(John)
                .setFirstname("Paul")
                .setLastname("McCartney")
                .build();
        System.out.println(Paul);

//Singleton Student
        StudentSingleton first = StudentSingleton.getInstance();
        first.setInfo("Hello world");
        System.out.println(first.getInfo());

    }
}
