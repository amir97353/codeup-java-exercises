

public class Shirt extends Product {
//Extends product means that shirt class now has access to the fields and methods of product

    private Size size;
    public enum Size {SMALL, MEDIUM, LARGE}

    //Below is the constructor. it has all the fields of the parent class included as well as the ones in thi class
    public Shirt(Size size, double price, String color, String brand) {
        //the super keyword is calling the constructor from the parent class with the fields price,color, and brand
        super(price,color,brand);
        this.size = size;
    }

    public Size getSize() {

        return this.size;
    }

    public void setSize(Size size) {

        this.size = size;
    }

    //Below your overiding the folds method that is in the parent class product. This allows diffrent outcomes for the fold method bepending on wether it is a shirt object or a pants object
    @Override
    public void fold(Product product) {
        //you can also call the super class in the overide section in order to call te fold method of the parent class
        //Super.fold()
        System.out.println("This time it's all about the shirts");
    }
    //The child element must overide the abstract method in the parent class Product and give it actual purpose or function. In the product class the body is empty
    @Override
    public void wear() {
        System.out.println("I hope this shit is working");
    }


    public static void main(String[] args) {

    }


}
