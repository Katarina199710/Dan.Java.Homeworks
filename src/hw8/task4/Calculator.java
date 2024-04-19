package hw8.task4;

import java.util.Objects;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        calculator.start();
        String action = scanner.nextLine();
        while (!Objects.equals(action, "Stop")) {
            if (action.contains("*") || action.contains("-") || action.contains("+") || action.contains("/")) {
                double number1 = Double.parseDouble(action.split("[+\\-/*]")[0]);
                double number2 = Double.parseDouble(action.split("[+\\-/*]")[1]);
                double result = action.contains("+") ? calculator.sum(number1, number2) :
                        action.contains("-") ? calculator.minus(number1, number2) :
                                action.contains("/") ? calculator.division(number1, number2) :
                                        action.contains("*") ? calculator.multiply(number1, number2) : 0;
                System.out.println(result);
                System.out.println("Enter your action:");
                action = scanner.nextLine();
            } else if (action.equals("Stop")) {
                System.out.println("Calculator closed");
                scanner.close();
            } else {
                System.out.println("Enter correct action");
                System.out.println("Enter your action:");
                action = scanner.nextLine();
            }
        }
    }

//Я знаю, что есть нюансы, но это уже как додумалась)

    public void start() {
        System.out.println("The calculator is running");
        System.out.println("Enter your action:");
    }

    public double sum(double number1, double number2) {
//        System.out.println(number1 + number2);
        return number1 + number2;
    }

    public double minus(double number1, double number2) {
        System.out.println(number1 - number2);
        return number1 - number2;
    }

    public double division(double number1, double number2) {
        double result = number1 / number2;
        if (number2 == 0) {
            return 0;
        } else {
            return result;
        }
    }

    public double multiply(double number1, double number2) {
        return number1 * number2;
    }
}
