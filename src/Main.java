public class Main {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan",500.57,2020);

        nissan.setYear(2026);
        System.out.println();
        // Withe using the constructor we achieve assigning values in one line as opposed to what's going on below

        //Here we're making a new object of the car class
//        nissan.make = "Nissan";
//        nissan.price = 500.57;
//        nissan.year = 2020;

        // This is a new object of the car class. the car class was made with the parameters above in the Car class file. and the parameters of make, price etc. are in the Car class. In this file we're assigning values

        Car dodge = new Car("Dodge",10000.8, 2015);
        //Here you are using the constructor that in the Car class file to assign values to the Car class. You do this but having the same number of variables as you have in the constructor. There's 3 varibles in the constructor. When we create a new Car object we put three values
//        dodge.make= "Dodge";
//        dodge.price= 10000.8;
//        dodge.year = 2015;


        System.out.println("This " + nissan.getMake() + " is worth $" + nissan.getMake() +
                //Here you are using the getters to get the value of make
                ". It was built in " + nissan.year + ". It is " + nissan.make + ".\n");
        System.out.println("This " + dodge.make + " is worth $" + dodge.price +
                ". It was built in " + dodge.year + ". It is " + dodge.make + ".\n");
// Can be referenced now that values have been assigned.
        //To recap we make two new objects of the Car class
    }






}
