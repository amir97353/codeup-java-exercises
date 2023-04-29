

public class Pants extends Product {
//Extends product means that Pants class now has access to the fields and methods of product
    private int waist;
    private int length;

    //Below is the constructor. it has all the fields of the parent class included as well as the ones in thi class
    //Below is the constructor
    public Pants(int length ,int waist, double price,String color, String brand) {
        super(price,color,brand);
        //the super keyword is calling the constructor from the parent class with the fields price,color, and brand
        this.length = length;
        this.waist = waist;
    }

    public int getWaist() {

        return this.waist;
    }

    public void setWaist(int waist) {

        this.waist = waist;
    }

    public int getLength() {

        return this.length;
    }

    public void setLength(int length) {

        this.length = length;
    }

    //Below your overiding the folds method that is in the parent class product. This allows diffrent outcomes for the fold method bepending on wether it is a shirt object or a pants object
    @Override
    public void fold(Product product) {
        //you can also call the super class in the overide section in order to call te fold method of the parent class
        //Super.fold()
        System.out.println("Pants are whats hot in the streets");
    }

    //The child element must overide the abstract method in the parent class and give it actual purpose or function. In the product class the body is empty
    @Override
    public void wear() {
        System.out.println("The size your wearing is");
    }
}
