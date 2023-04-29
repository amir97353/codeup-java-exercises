

public class Shirt extends Product {
//Extends product means that shirt class now has access to the fields and methods of product

    private Size size;
    public enum Size {SMALL, MEDIUM, LARGE}



    public Size getSize() {

        return this.size;
    }

    public void setSize(Size size) {

        this.size = size;
    }

    public static void main(String[] args) {

    }


}
