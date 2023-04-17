

import java.util.Scanner;

public class ConsoleExercises {
    //first question
    public static void main (String[] args){
        double pi = 3.14159;
        System.out.format(" The value of pi is %.2f%n", pi);
//        System.out.printf("The value of %s is approximately 3.14. %n" , userNum);
//        The value of pi is approximately 3.14.



//second question
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");

        int userNum = scanner.nextInt();
        System.out.printf("Your favorite number is: %s %n" , userNum);



        System.out.println("Enter a sentence: ");


        String firstWord  = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();
        System.out.printf("The new sentence goes like this: %s %n %s %n %s" , firstWord, secondWord,thirdWord);
//        System.out.printf("The new sentence goes like this: %s %n" , secondWord);
//        System.out.printf("The new sentence goes like this: %s %n" , thirdWord);

        System.out.println("Enter a sentence:");
        String newSentence = scanner.nextLine();
        System.out.printf("%s",newSentence);

        System.out.println("What is the length of the rectangle? ");
        String Length = scanner.nextLine();
        int numLength = Integer.parseInt(Length);
        System.out.println("What is the width of the rectangle? ");
        String Width = scanner.nextLine();
        int numWidth = Integer.parseInt(Width);

        int area = numLength * numWidth;
        int peremiter = (2* numLength) + (2*numWidth);

        System.out.printf("area %s %n perimeter %s %n",area,peremiter);

        System.out.printf("The area of a rectangle is equal to the %s times the %s, and the perimeter of a rectangle is equal to 2 times the %s plus 2 times the %s.",Length, Width ,numLength, numWidth);













    }
}
