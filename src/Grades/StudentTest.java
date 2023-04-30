package Grades;

public class StudentTest {
    public static void main(String[] args) {
        // create some students
        Student John = new Student("Alice");
        Student Steve = new Student("Bob");


        John.addGrade(90);
        John.addGrade(85);
        Steve.addGrade(80);
        Steve.addGrade(75);
        Steve.addGrade(85);


        System.out.println(John.getName() + "'s average grade: " + John.getAverageGrade());
        System.out.println(Steve.getName() + "'s average grade: " + Steve.getAverageGrade());
    }
}
