public class Main {
    public static void main(String[] args) {
        Car nissan = new Car();
        //Here we're making a new object of the car class
        nissan.make = "Nissan";
        nissan.price = 500.57;
        nissan.year = 2020;
        nissan.Color = "Red";
        // This is a new object of the car class. the car class was made with the parameters above in the Car class file. and the parameters of make, price etc. are in the Car class. In this file we're assigning clues

        Car dodge = new Car();
        dodge.make= "Dodge";
        dodge.price= 10000.8;
        dodge.year = 2015;
        dodge.Color = "Green";

        System.out.println("This " + nissan.make + " is worth $" + nissan.price +
                ". It was built in " + nissan.year + ". It is " + nissan.Color + ".\n");
        System.out.println("This " + dodge.make + " is worth $" + dodge.price +
                ". It was built in " + dodge.year + ". It is " + dodge.Color + ".\n");
// Can be referenced now that values have been assigned.
        //To recap we make two new objects of the Car class
    }




//    public static void main(String[] args) {
//        System.out.println("This " + nissan.make + " is worth $" + nissan.price +
//                ". It was built in " + nissan.year + ". It is " + nissan.color + ".\n");
//        System.out.println("This " + dodge.make + " is worth $" + dodge.price +
//                ". It was built in " + dodge.year + ". It is " + dodge.color + ".\n");
//    }
}
