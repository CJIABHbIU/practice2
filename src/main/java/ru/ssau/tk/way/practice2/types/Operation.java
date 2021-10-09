package ru.ssau.tk.way.practice2.types;

public abstract class Operation {
    public abstract double apply(double number);
    public double tripleApply(double number){
        return apply(apply(apply(number)));
    }
}
