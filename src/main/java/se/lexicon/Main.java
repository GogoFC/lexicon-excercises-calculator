package se.lexicon;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("Enter two numbers calculate, followed by Enter key!");
        double number1 = numbers.nextDouble();
        double number2 = numbers.nextDouble();

        System.out.println("Choose from 1-4 and hit the Enter key");
        System.out.println(" ");
        System.out.println("Type 1 to ADD the numbers");
        System.out.println("Type 2 to SUBTRACT the numbers");
        System.out.println("Type 3 to MULTIPLY the numbers");
        System.out.println("Type 4 to DIVIDE the numbers");

        int choice = numbers.nextInt();

        double sumOfNumbers = addition(number1,number2);
        double multipliedNumbers = multiply(number1, number2);
        double subtractedNumbers = subtraction(number1, number2);
        double dividedNumbers = division(number1, number2);


        //double division = number2 / number1;
        //double subtraction = number1 - number2;
        //double multiplication = number1 * number2;


        if (choice==1) {
            System.out.println("The sum of numbers " + number1 + " and " + number2 + " = " + sumOfNumbers);
        } else if (choice == 2) {
            System.out.println(number1 + " minus " + number2 + " is " + subtractedNumbers);
        } else if (choice == 3) {
            System.out.println(number1 + " times " + number2 + " is " + multipliedNumbers);
        } else if (choice == 4){
            System.out.println(number1 + " divided by " + number2 + " = " +dividedNumbers);
        } else{
            System.out.println("You need to choose 1 through 4");
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