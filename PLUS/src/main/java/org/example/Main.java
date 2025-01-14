package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        String input = sc.nextLine();

        try {
            String rez = calc(input);
            System.out.println("Output: \n" + rez);
        } catch (Exception e) {
            System.out.println("throws Exception //" + e.getMessage());
        }
    }

    public static String calc(String input) throws Exception {
        String[] x = input.split(" ");
        if (x.length == 1) {
            throw new Exception("т.к. строка не является математической операцией");
        }
        if (x.length > 3) {
            throw new Exception("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }

        int num1 = Integer.parseInt(x[0]);
        int num2 = Integer.parseInt(x[2]);
        if (num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10) {
            throw new Exception("Калькулятор должен принимать  числа от 1 до 10 включительно");
        }

        String operation = x[1];
        int resultat = 0;
        if (operation.equals("+")) {
            resultat = num1 + num2;
        }
        if (operation.equals("-")) {
            resultat = num1 - num2;
        }
        if (operation.equals("*")) {
            resultat = num1 * num2;
        }
        if (operation.equals("/")) {
            resultat = num1 / num2;
        }
        return String.valueOf(resultat);
    }
}


