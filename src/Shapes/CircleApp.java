
package Shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input1 = new Input();
        System.out.println("Please enter the radius of the circle: ");
        shapes.Circle circle1 = new shapes.Circle(input1.getDouble());
        System.out.printf("Circle Area: %f; Circle Circumference: %f. %n", circle1.getArea(), circle1.getCircumference());
    }
}