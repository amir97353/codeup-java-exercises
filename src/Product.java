public class Product {

    private double price;
    private String color;
    private String brand;

    //Product is the parent class for shirt and pants. It contains the mutual fields and methods.

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
}
