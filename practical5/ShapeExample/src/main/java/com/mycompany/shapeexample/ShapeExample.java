
package com.mycompany.shapeexample;

public class ShapeExample {

    public static void main(String[] args) {
       
        // Create a rectangle and calculate/display its area
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        rectangle.calculateArea();
        rectangle.display();

        // Create a circle and calculate/display its area
        Circle circle = new Circle(4.0);
        circle.calculateArea();
        circle.display();
    }
}

    

