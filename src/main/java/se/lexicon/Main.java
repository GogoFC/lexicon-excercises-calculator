package se.lexicon;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int exit = 0;

        while (exit != 8) {

            Scanner numbers = new Scanner(System.in);
            System.out.println("Enter two numbers calculate, followed by Enter key!");
            double number1 = numbers.nextDouble();
            double number2 = numbers.nextDouble();
            System.out.println(" ");
            System.out.println("Choose from 1-4 and hit the Enter key");
            System.out.println(" ");
            System.out.println("Type 1 to ADD");
            System.out.println("Type 2 to SUBTRACT");
            System.out.println("Type 3 to MULTIPLY");
            System.out.println("Type 4 to DIVIDE");
            int choice = numbers.nextInt();

            double sumOfNumbers = addition(number1, number2);
            double multipliedNumbers = multiply(number1, number2);
            double subtractedNumbers = subtraction(number1, number2);
            double dividedNumbers = division(number1, number2);


            if (choice == 1) {
                System.out.println("The sum of numbers " + number1 + " and " + number2 + " = " + sumOfNumbers);
            } else if (choice == 2) {
                System.out.println(number1 + " minus " + number2 + " is " + subtractedNumbers);
            } else if (choice == 3) {
                System.out.println(number1 + " times " + number2 + " is " + multipliedNumbers);
            } else if (choice == 4) {
                System.out.println(number1 + " divided by " + number2 + " = " + dividedNumbers);
            } else {
                System.out.println("You need to choose 1 through 4");
            }

            System.out.println(" ");
            System.out.println(" Would you like to Exit the program?");
            System.out.println(" Type 8 to exit or type another nubmer to continue");
            int exit2 = numbers.nextInt();
            exit = exit2;

        }

    }






    static double addition(double num1, double num2){
        double result = num1 + num2;
        return result;
    }

    static double multiply(double num1, double num2){
        double result = num1 * num2;
        return result;
    }

    static double subtraction(double num1, double num2){
        double result = num1 - num2;
        return result;
    }

    static double division(double num1, double num2){
        double result = num1 / num2;
        return result;
    }

}