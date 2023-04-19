import java.util.Scanner
public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean confirm;

        String input;
        do {
            System.out.println("What would you like to ask bob");
            input = sc.nextLine();

            if (input.contains("?")) {
                System.out.println("sure");
            } else if (input.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (input.equals("")) {
                System.out.println("Fine be that way!");
            } else {
                System.out.println("whatever");
            }
            System.out.println("Would you like to continue chatting. [y/n]");
            confirm = sc.next().equalsIgnoreCase("y");
        }while (confirm);
        System.out.println("Good talk!");
    }
}
