public class TriangleFactory {

    public static Triangle create(int id, float a, float b, float c) {
        if (a + b > c) {
            return new Triangle(id, a, b, c);
        } else {
            return null;
        }
    }

}
