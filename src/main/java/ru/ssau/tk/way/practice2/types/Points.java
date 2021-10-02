package ru.ssau.tk.way.practice2.types;

public class Points {

    private Points() {
    }

    public static Point sum(Point first,Point second){
        return new Point(first.x+second.x, first.y+second.y,first.z+ second.z);
    }

    public static Point subtract(Point first,Point second) {
        return new Point(first.x - second.x, first.y - second.y, first.z - second.z);
    }

    public static Point multiply(Point first,Point second) {
        return new Point(first.x * second.x, first.y * second.y, first.z * second.z);
    }

    public static Point divide(Point first,Point second) {
        return new Point(first.x / second.x, first.y / second.y, first.z / second.z);
    }
}
