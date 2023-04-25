import java.awt.*;

public class Car {
    String make;
    double price;
    int year;


    public Car(String make, double price, int year ){
// This is a constructor for the car class.
        this.make=make;
        this.price= price;
        this.year=year;
        //This weill update the values of the object that is being made with the values that are passed in
    }

//Below are getters. They are methods used to get values. this can be useful if the original class values are private like the class of Car you can use the getters to get the values of the class or new object of the class that's being created.

    //The getters return a copy of  each value
        public String getMake(){
            return make;
        }

        public double getPrice(){
            return price;
        }

        public int getYear(){
            return year;
        }

        //Setters are for updating the objects while getters grab info of the objects.
// Below are the setters

    public void setMake(String make) {
        this.make = make;
    }

    public void setYear(int year){
        this.year =year;
    }

    public void setPrice(double price){
        this.price=price;
    }





}
