package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {

        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("Input a string");
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Enter a yes or no");
        String input = scanner.nextLine();
        if (input.equals("yes")) {
            return true;
        } else {
            return false;
        }
    }

//    public int getInt(int min, int max) {
//        int input;
//        do {
//            System.out.println("pick a new number");
//            input = scanner.nextInt();
//
//        } while (input < min || input > max);
//        return input;
//    }

    public int getInt(int min, int max){
        int input;
        do {
            System.out.println("pick an integer");
            input = scanner.nextInt();

        } while (input == (int)input);
        return input;

    }

    public int getInt(){
        System.out.println("Enter a number");
        int userInput = scanner.nextInt();
        return userInput;
    }

//    public double getDouble (double min, double  max){
//        System.out.println("Enter a number");
//        double
//    }
}
