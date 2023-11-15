package se.lexicon;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("Enter two numbers to be calculated!");
        double number1 = numbers.nextDouble();
        double number2 = numbers.nextDouble();



        double sum = addition(number1,number2);
        double multipliedNumbers = multiply(number1, number2);

        double division = number2 / number1;
        double subtraction = number1 - number2;
        //double multiplication = number1 * number2;

        System.out.println("The sum of numbers " + number1 + " and " + number2 + " = " +sum);
        System.out.println(number1 + " times " + number2 + " is " +multipliedNumbers);
        System.out.println(number1 + " divided by " + number2 + " = " +division);
        System.out.println(number1 + " minus " + number2 + " is " +subtraction);
    }
    static double addition(double num1, double num2){
        double result = num1 + num2;
        return result;
    }

    static double multiply(double num1, double num2){
        double result = num1 * num2;
        return result;
    }

}