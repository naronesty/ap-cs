/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac PointClient.java
 *  Execution:    java PointClient
 *
 *  Description
 *
 *  % java PointClient in
 *  out
 *
 *  % java PointClient in
 *  out
 ******************************************************************************/

public class PointClient {

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
    }

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(3, 4);

        System.out.println(p1); //p1.toString()
        System.out.println(p2);

        System.out.println(p2.getY());
        System.out.println(p2.getLocation());

        Point p3 = p2.getLocation();
        System.out.println(p2 == p3);
        p1.move(5, 6);
        System.out.println(p1);

        p1.setLocation(p2);
        System.out.println(p1);

        p1.translate(2, 2);
        System.out.println(p1);
        System.out.println(p2);

        System.out.println(Point.distance(p1, p2));

        Point p4 = p2;
        System.out.println(p4.equals(p2));
    }
}
