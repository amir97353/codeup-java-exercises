package Grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();


        Student alice = new Student("Alice");
        alice.addGrade(90);
        alice.addGrade(85);
        alice.addGrade(95);
        students.put("alice123", alice);

        Student bob = new Student("Bob");
        bob.addGrade(80);
        bob.addGrade(75);
        bob.addGrade(85);
        students.put("bob456", bob);

        Student charlie = new Student("Charlie");
        charlie.addGrade(70);
        charlie.addGrade(85);
        charlie.addGrade(90);
        students.put("charlie789", charlie);

        Student david = new Student("David");
        david.addGrade(95);
        david.addGrade(90);
        david.addGrade(85);
        students.put("david000", david);


        System.out.println("Welcome!\nHere are the GitHub usernames of our students:");

        for (String username : students.keySet()) {
            System.out.println(username);
        }


        Scanner scanner = new Scanner(System.in);
        String choice = "yes";

        while (choice.equalsIgnoreCase("yes")) {
            System.out.print("\nEnter a username to see more information: ");
            String username = scanner.nextLine();

            if (students.containsKey(username)) {
                Student student = students.get(username);
                System.out.println("\nName: " + student.getName());
                System.out.println("Grades: " + student.getGrades());
                System.out.println("Average Grade: " + student.getAverageGrade());
            } else {
                System.out.println("\nSorry, no student found with the username '" + username + "'.");
            }


            System.out.print("\nWould you like to see another student? (yes/no) ");
            choice = scanner.nextLine();
        }

        System.out.println("\nGoodbye!");
    }
}