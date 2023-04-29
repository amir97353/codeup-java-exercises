public abstract class Product {

    private double price;
    private String color;
    private String brand;

    //Product is the parent class for shirt and pants. It contains the mutual fields and methods.

//Below is the constructor for the parent class. These fields need to be included in the constructors of the children class.
    public Product(double price,String color,String brand) {
        this.price = price;
        this.color = color;
        this.brand = brand;
    }

    public double getPrice() {

        return this.price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public String getColor() {

        return this.color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public String getBrand() {

        return this.brand;
    }

    public void setBrand(String brand) {

        this.brand = brand;
    }

    public void fold(Product product) {
        System.out.println("the brand is" + this.getBrand() + "\n" + "The color is this" + this.getColor() + "\n" + "the price is " + this.getPrice());
    }

    // Below is the abstract method ,and it has to be in an abstract class as seen above. The child element must overide the abstract class and give it actual purpose or function
    public abstract void wear();
}
