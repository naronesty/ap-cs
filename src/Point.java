/******************************************************************************
 *  Writer:       Noakai Aronesty
 *  Compilation:  javac Point.java
 *  Execution:    java Point
 *
 *  Description
 *
 *  % java Point in
 *  out
 *
 *  % java Point in
 *  out
 ******************************************************************************/

public class Point {
    private int x, y;
    @Override
    public String toString(){
        return "(" + x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object rhs) {
        if (rhs instanceof Point){
            Point p = (Point) rhs;
            return x == p.x && y == p.y;
        }
        return false;
    }

    // Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Default Constructor
    public Point(){
        this(0, 0);
    }
    public Point(Point obj) {
        this(obj.x, obj.y);
    }

    // Accessors
    public int getX() {return x;}
    public int getY() {return y;}
    public Point getLocation() {
        return new Point(x, y);
    }

    // Mutators
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void setLocation(int x, int y) {
        move(x, y);
    }
    public void setLocation(Point p) {
        move(p.getX(), p.getY());
    }
    public void translate(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    // Static
    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
    }
}
