import java.util.Scanner;
import java.util.Random;


public class MethodsExercises {
    public static void main(String[] args) {


        addition(15, 10);
        subtraction(10, 5);
        multiplication(5, 5);
        division(20, 5);
        factorial();
        dice();

    }

    public static void addition(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static void subtraction(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    public static void multiplication(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public static void division(int num1, int num2) {
        System.out.println(num1 / num2);
    }

    public static void modulus(int num1, int num2) {
        System.out.println(num1 % num2);
    }

    public static void user(int num1, int num2) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int user = scanner.nextInt();

        if (user > num1 && user < num2) {
            System.out.println(user);
        } else {
            System.out.println("Input another number");
        }
    }

    public static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10");
        int n = scanner.nextInt();

        long factorial = 1;
        for (int i = 1; i <= n; ++i) {

            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", n, factorial);
        System.out.print("continue [y/n]");


    }

    public static String dice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many sides does your dice have?");
        int sides = scanner.nextInt();
        int dice1 = (int) ((Math.random() * sides) + 1);
        int dice2 = (int) ((Math.random() * sides) + 1);

        return "dice #1 = " + dice1 + " dice #2 = " + dice2;
    }


}
