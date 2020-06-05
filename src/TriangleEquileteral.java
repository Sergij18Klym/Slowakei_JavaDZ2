public class TriangleEquileteral extends Triangle {

    private float sideA;

    public TriangleEquileteral(int id, float sideA) {
        super(id, sideA, sideA, sideA);
        this.sideA = sideA;
    }

    public float getSideA() {
        return sideA;
    }
    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

}
