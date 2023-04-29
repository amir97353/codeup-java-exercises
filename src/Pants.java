

public class Pants extends Product {
//Extends product means that Pants class now has access to the fields and methods of product
    private int waist;
    private int length;


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



}
