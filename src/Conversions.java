public class Conversions {

    public static void main(String[] args) {
        //---------------------------Conversion proper name Casting it converts Data types--------------------

        int num = 10;
        long bigNum = num;
        // This is called implicit casting. Going from smaller data type to a higher data type

        long bigNum1 = 100;
        int num2 = (int) bigNum1; // explicit casting needed
        //This is explicit casting going from a larger data type to a smaller one but you must specify the data type in front of the variable

        double pi = 3.14159;
        int almostPi = (int) pi;
        System.out.println(almostPi);
        //Here is another example of explicit casting

        int counter = 0;
        System.out.println(counter);
        System.out.println(counter);

        int ants = 2000;
        int purchasedBlocksOfCheese = 1;

        System.out.println("There are " + ants + " ants, and " + purchasedBlocksOfCheese + " block of cheese.");
        System.out.println("Each ant carried " + ((double)purchasedBlocksOfCheese / ants) + " from the total cheese amount");
                                                       //The above converts it to a decimal
        double salary = 5423.94;
        int roundedSalary = (int)salary;
        System.out.println("Mortgage Broker: What is your monthly salary in dollars?");
        System.out.println("My monthly salary is: " + roundedSalary);
        //Salary has been rounded and stored in the roundSalary varibale


    }
}
