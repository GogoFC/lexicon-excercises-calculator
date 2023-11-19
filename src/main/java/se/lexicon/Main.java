package se.lexicon;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String exit = "";
        Scanner numbers = new Scanner(System.in);

        while (!exit.equals("bye")) {


            System.out.println("\n" + "Enter two numbers calculate, followed by Enter key!" + "\n");
            System.out.print("Enter first  number >_ ");


            while (!numbers.hasNextDouble()) {
                System.out.println("Not a number, re-enter:");
                numbers.next(); // ask about this. numbers.nextDouble
            }
            double number1 = numbers.nextDouble();

            System.out.print("Enter second number >_ ");
            while (!numbers.hasNextDouble()) {
                System.out.println("Not a number, re-enter:");
                numbers.next();
            }
            double number2 = numbers.nextDouble();




            System.out.println("\n" + "Choose an option and hit the Enter key");
            System.out.println("\n" + "Type 1 to ADD");
            System.out.println("Type 2 to SUBTRACT");
            System.out.println("Type 3 to MULTIPLY");
            System.out.println("Type 4 to DIVIDE");
            System.out.print(">_ ");
            //int option = 0;
            /* Implement this
            while (option <= 1 && option >= 4) {
                System.out.println("Not a valid choice, choose from 1 to 4");
                numbers.next();
                option = numbers.nextInt();
            }
            */

            while (!numbers.hasNextDouble()) {
                System.out.println("Not a number, re-enter");
                numbers.next();
            }

            int choice = numbers.nextInt();


            if (choice == 1) {
                double sumOfNumbers = addition(number1, number2);
                System.out.println( "\n" + "The sum of numbers " + number1 + " and " + number2 + " = " + sumOfNumbers);
            } else if (choice == 2) {
                double subtractedNumbers = subtraction(number1, number2);
                System.out.println("\n" + number1 + " minus " + number2 + " is " + subtractedNumbers);
            } else if (choice == 3) {
                double multipliedNumbers = multiply(number1, number2);
                System.out.println("\n" + number1 + " times " + number2 + " is " + multipliedNumbers);
            } else if (choice == 4) {
                double dividedNumbers = division(number1, number2);
                System.out.println("\n" + number1 + " divided by " + number2 + " = " + dividedNumbers);
            } else {
                System.out.println("\n" + "Not a valid choice. Choose 1 through 4");

            }



            System.out.println("\n" + "Would you like to Exit the program?");
            System.out.println("\n" + "Type 'bye' to exit");
            System.out.println("\n" + "To continue type anything");
            System.out.print(">_ ");

            /* unnecessary loop inside loop
            while (!numbers.equals("bye")) {
                System.out.println("Not a number, re-enter");
                numbers.next();
            }
            */

            exit = numbers.next().toLowerCase();

        }

    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
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