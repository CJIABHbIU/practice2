package ru.ssau.tk.way.practice2.exceptions;

public class FirstClassForClone {
    public int x;

    public FirstClassForClone(int x) {
        this.x = x;
    }

    @Override
    public FirstClassForClone clone() throws CloneNotSupportedException {
        return (FirstClassForClone) super.clone();
    }
}
