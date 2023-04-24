public class MathOperations {
        public static void main(String[] args) {

            int bagOfSweets1 = 5;
            int bagOfSweets2 = 10;

            long starsInMilkyWay = 250_000_000_000L; //250 billion
            long starsInAndromeda = 1_000_000_000_000L; // 1 trillion

            double testScore = 6.7;

            System.out.println("Fred and George collected" + (bagOfSweets1 + bagOfSweets2) + "sweets");
            //If you want to do operations in a string then you have to use parenthesis in this case we're adding two variables



//            System.out.println("There are <result> stars in the Milky Way and Andromeda galaxies.");
//
//            System.out.println("Fred has <result> more sweets than George");
//            System.out.println("The Andromeda Galaxy has <result> more stars than the Milky Way");
//
//            System.out.println("Snape made an error on his excel, accidentally multiplying Ron's score to: <result>/10");
//            System.out.println("Snape caught the error. Furious, he divided Ron's score to: <result>");
//
//            System.out.println("10 is an even number, since dividing 10 by 2 has a remainder of: <result>");
//            System.out.println("5 is an odd number, since dividing 5 by 2 has a remainder of: <result>");
            int myNumber = 12 + 12 * 2;
            System.out.println(myNumber);
            //java stores the anwser to the math inside the variable
            //---------------------------Conversion proper name Casting it converts Data types--------------------

            int num = 10;
            long bigNum = num;
            // This is called implicit casting. Going from smaller data type to a higher data type

            long bigNum1 = 100;
            int num2 = (int) bigNum1; // explicit casting needed
            //This is explicit casting going from a larger data type to a smaller one but you must specify the data type in front of the variable

            double pi = 3.14159;
            int almostPi = (int) pi;
            //Here is another example of explicit casting

            int counter = 0;
            System.out.println(counter);
            System.out.println(counter);


        }

}
