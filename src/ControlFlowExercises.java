
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i++);
//        }
//        int A = 0;
//        do {
//            System.out.println(A += 2);
//        } while (A < 100);
//
//        int B = 100;
//        do {
//            System.out.println(B -= 5);
//        } while (B > -10);


// Refactored first two assignments in to for loops
//        for (int i = 5; i <= 15; i++) {
//
//            System.out.println(i);
//        }
//
//        for (int i = 0; i < 100; i += 2) {
//            System.out.println(i);
//        }
//
//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

//        for(long i = 2;i <=1_000_000;i*=i){
//            System.out.println(i);
//        }


////        long C = 2;
////        do {
////            System.out.println(C *= C);
////        } while (C < 1_000_000);
//


        //FizzBuzz section
//        for (int i = 0; i < 100; i++) {
//            if (i % 3 == 0) {
//                System.out.println("Fizz");
//                continue;
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//                continue;
//            } else if ((i % 3 == 0) && (i % 5 == 0)) {
//                System.out.println("buzzfizz");
//            } else {
//                System.out.println(i);
//            }

            Scanner scanner = new Scanner(System.in);
            boolean confirm;
do {


            System.out.print("Please enter an integer: ");
            int input = scanner.nextInt();
            System.out.println("Number\tSquare\t cubed");

            for (int i = 1; i <= input; i++) {
                int square = i * i;
                int cubed = i * i * i;
////            System.out.printf(square + "\n");
//            System.out.printf(cubed + "\n");

                System.out.println(i + "\t" + square + "\t" + cubed);

            }
            System.out.print("continue [y/n]");
    confirm = scanner.next().equalsIgnoreCase("y");
}while(confirm);
//
//        int B = 1;
//        do {
//            System.out.println("line 67: " + B);
//            B*=2;
//        } while (B < input);
//
//        int A = 1;
//        do {
//         int cubed = A*A*A;
//                 System.out.println(cubed);
//        } while (A < input);


do {


        System.out.print("Enter a grade from 0 to 100");
        int userGrade = scanner.nextInt();
        if(userGrade >= 88){
            System.out.print("A");
        }else if (userGrade >= 80){
            System.out.print("B");
        } else if (userGrade >=67) {
            System.out.print("C");
        } else if (userGrade >= 60) {
            System.out.print("D");
        }else{
            System.out.print("F");
        }
    System.out.print("continue [y/n]");
    confirm = scanner.next().equalsIgnoreCase("y");
}while (confirm);
    }
    }



