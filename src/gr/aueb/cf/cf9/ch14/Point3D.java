package gr.aueb.cf.cf9.ch14;

public class Point3D extends Point2D{
    private double z;

    public Point3D() {
//        super();
//        z = 0.0;

    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    protected void movePls10() {
        super.movePls10();
        z += 1;
    }

    @Override
    public void movePlusOne() {
        super.movePlusOne();
        z += 10;
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }
}
