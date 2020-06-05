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

* */

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

        System.out.println("\n" + zyl.toJSON());

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
        Triangle triangleiso = new Triangle(5);

        triangleiso.toConsole();

// Triangle cos(alpha)
        Triangle trianglealpha = new Triangle(4, 5, 0.6);
        System.out.println("\nTrianglealpha parameters: " + trianglealpha.toString());

// Triangle cos(alpha) , cos(beta)
        Triangle trianglealphabeta = new Triangle(4, 5, 0.6,0.3);
        System.out.println("\n" + trianglealphabeta.toXML());


        Triangle tria2 = TriangleFactory.create(1,1,1,10);

// Triangle Equileteral2
        TriangleEquileteral eTriangle = new TriangleEquileteral(0, 5);
        System.out.println("\nEqual perimeter: " + eTriangle.getLinearLength());
        System.out.println("Triangle equal parameters: " + eTriangle);
        System.out.println("Triangle equal equality: " + eTriangle.equals(triangle));

    }
}
