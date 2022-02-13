/******************************************************************************
 *  Writer:       Noakai Aronesty, Ryan Wang
 *  Compilation:  javac Point3dLab.java
 *  Execution:    java Point3dLab
 ******************************************************************************/
public class Point3dLab {
    public static double computeArea(Point3d p1, Point3d p2, Point3d p3) {
        if (p1.equals(p2) || p2.equals(3) || p2.equals(p3)) {
            throw new RuntimeException("Two or more of the points are equal");
        }
        double a = Point3d.distanceTo(p1, p2);
        double b = Point3d.distanceTo(p2, p3);
        double c = Point3d.distanceTo(p1, p3);
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        System.out.print("enter a 3d point: ");
        double x1 = StdIn.readDouble();
        double y1 = StdIn.readDouble();
        double z1 = StdIn.readDouble();
        Point3d p1 = new Point3d(x1, y1, z1);
        System.out.print("enter a 3d point: ");
        double x2 = StdIn.readDouble();
        double y2 = StdIn.readDouble();
        double z2 = StdIn.readDouble();
        Point3d p2 = new Point3d(x2, y2, z2);
        System.out.print("enter a 3d point: ");
        double x3 = StdIn.readDouble();
        double y3 = StdIn.readDouble();
        double z3 = StdIn.readDouble();
        Point3d p3 = new Point3d(x3, y3, z3);

        System.out.println(computeArea(p1, p2, p3));
    }
}
