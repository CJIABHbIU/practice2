package ru.ssau.tk.way.practice2.exceptions;

public class IncompatibleDimensionsException extends Throwable {
    public IncompatibleDimensionsException() {
        this("Матрицы несовместимы!");
    }

    public IncompatibleDimensionsException(String message) {
        super(message);
    }
}
