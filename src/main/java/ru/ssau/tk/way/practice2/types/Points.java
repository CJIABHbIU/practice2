package ru.ssau.tk.way.practice2.types;

public class Points {

    private Points() {
    }

    public static Point sum(Point first, Point second) {
        return new Point(first.x + second.x, first.y + second.y, first.z + second.z);
    }

    public static Point subtract(Point first, Point second) {
        return new Point(first.x - second.x, first.y - second.y, first.z - second.z);
    }

    public static Point multiply(Point first, Point second) {
        return new Point(first.x * second.x, first.y * second.y, first.z * second.z);
    }

    public static Point divide(Point first, Point second) {
        return new Point(first.x / second.x, first.y / second.y, first.z / second.z);
    }

    public static Point enlarge(double x, Point first) {
        return new Point(first.x * x, first.y * x, first.z * x);
    }

    public static double length(Point point) {
        return point.length();
    }

    public static Point opposite(Point point) {
        return new Point(-point.x, -point.y, -point.z);
    }

    public static Point inverse(Point point) {
        return new Point(1 / point.x, 1 / point.y, 1 / point.z);
    }

    public static double scalarProduct(Point firstPoint, Point secondPoint){
        return firstPoint.x* secondPoint.x+ firstPoint.y* secondPoint.y+ firstPoint.z* secondPoint.z;
    }

    public static Point vectorProduct(Point firstPoint, Point secondPoint){
        return new Point(firstPoint.y*secondPoint.z- firstPoint.z*secondPoint.y, firstPoint.z*secondPoint.x- firstPoint.x*secondPoint.z, firstPoint.x*secondPoint.y-secondPoint.x* firstPoint.y );
    }
}
