public class TriangleFactory {

    public static Triangle create(int id, float sideA, float sideB, float sideC) {
        if (sideA + sideB < sideC || sideA + sideC < sideB || sideB + sideC < sideA) {
            return null;
        } else {
            return new Triangle(id, sideA, sideB, sideC);
        }
    }

}
