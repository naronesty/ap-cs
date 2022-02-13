/******************************************************************************
 *  Writer:       Noakai Aronesty, Ryan Wang
 *  Compilation:  javac Point3d.java
 *  Execution:    java Point3d
 ******************************************************************************/
public class Point3d {
    private double x, y, z;

    @Override
    public String toString(){
        return "(" + x + ", " + y +  ", " + z + ")";
    }

    @Override
    public boolean equals(Object rhs) {
        if (rhs instanceof Point3d){
            Point3d p3d = (Point3d) rhs;
            return x == p3d.x && y == p3d.y && z == p3d.z;
        }
        return false;
    }

    // Constructor
    public Point3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Default Constructor
    public Point3d(){
        this(0.0, 0.0, 0.0);
    }
    public Point3d(Point3d obj) {
        this(obj.x, obj.y, obj.z);
    }

    // Accessors
    public double getX() {return x;}
    public double getY() {return y;}
    public double getZ() {return z;}
    public Point3d getLocation() {
        return new Point3d(x, y, z);
    }

    // Mutators
    public void move(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void setLocation(double x, double y, double z) {
        move(x, y, z);
    }
    public void setLocation(Point3d p) {
        move(p.getX(), p.getY(), p.getZ());
    }
    public void translate(double dx, double dy, double dz) {
        this.x += dx;
        this.y += dy;
        this.z += dz;
    }

    // Static
    public static double distanceTo(Point3d p1, Point3d p2) {
        double dx = p1.getX() - p2.getX();
        double dy = p1.getY() - p2.getY();
        double dz = p1.getZ() - p2.getZ();
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
}
