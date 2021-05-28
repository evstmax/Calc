package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Введите выражение, состоящее из двух целых чисел от 1(I)) до 10(X) и знака операции(+ - * /)  (напр. 3+5)(напр. III+V): ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] blocks = Data.Parse(text);

        if (blocks.length != 3) throw new Exception("Неверный формат ввода");

        if (Data.isDigit(blocks)) {
            System.out.println(Calculator.calculate(Integer.parseInt(blocks[0]), Integer.parseInt(blocks[2]), blocks[1].toCharArray()[0]));
        } else if (Data.isRoman(blocks)) {
            double arabnumber = Calculator.calculate(Data.romanToInt(blocks[0]), Data.romanToInt(blocks[2]), blocks[1].toCharArray()[0]);
            System.out.println(RomanNumber.toRoman((int)arabnumber));
        } else {
            System.out.println("Неверный формат ввода");
        }

    }
}


