package ru.ssau.tk.way.practice2.types;

import static ru.ssau.tk.way.practice2.types.Points.*;

public class PointsTest {
    public static void main(String[] args) {
        Point first = new Point(1, 1, 1);
        Point second = new Point(1, 1, 1);
        System.out.println(sum(first, second).x);
        System.out.println(subtract(first, second).y);
        System.out.println(multiply(first, second).z);
        System.out.println(divide(first, second).x);
    }
}
