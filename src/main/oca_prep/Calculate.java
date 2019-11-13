package oca_prep;

import java.util.Random;

public class Calculate {

    private String message;

    public static String performOperations (String[] args) {
        Random random = new Random();
        int firstNum = random.nextInt(60) + 1;
        int secondNum = random.nextInt(60) + 1;
        int operators = random.nextInt(3);

        switch (operators) {
            case 0:
                System.out.println(firstNum + " + " + secondNum + " = " + adding(firstNum, secondNum));
                break;
            case 1:
                System.out.println(firstNum + " - " + secondNum + " = " + subtracting(firstNum, secondNum));
                break;
            case 2:
                System.out.println(firstNum + " * " + secondNum + " = " + multiplying(firstNum, secondNum));
                break;
            case 3:
                System.out.println(firstNum + " / " + secondNum + " = " + deviding(firstNum, secondNum));
                break;
        }
        return "";
    }
    public static int adding(int a, int b) {
        while (b != 0) {
            int sum = a & b;
            a = a ^ b;
            b = sum << 1;
        }
        return a;
    }
    public static int subtracting(int a, int b) {
        return a - b;
    }

    public static int multiplying(int a, int b) {
        return a*b;
    }
    public static int deviding(int a, int b) {
        return a / b;
    }

    public static String getMessage() {
        return new Calculate().message;
    }
}
