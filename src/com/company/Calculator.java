package com.company;

class Calculator {
    Calculator() {
    }

    public static double calculate(int number1, int number2, char operation) {
        return switch (operation) {
            case '+' -> number1 + number2;
            case '-' -> number1 - number2;
            case '*' -> number1 * number2;
            case '/' -> number1 / number2;
            default -> throw new IllegalArgumentException("Неверный знак операции");
        };
    }

}
