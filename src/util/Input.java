package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String input = scanner.nextLine();
        if (input.equals("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        int input;
        do {
            System.out.println("pick a new number");
            input = scanner.nextInt();

        } while (input < min || input > max);
        return input;
    }

    public int getInt(){
        int input;
        do {
            System.out.println("pick an integer");
            input = scanner.nextInt();

        } while (input == (int)input);
        return input;

    }
}
