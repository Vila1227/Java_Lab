
package com.mycompany.shapeexample;

public abstract class Shape{
    
    protected double area;

    // Abstract method to calculate the area
    public abstract void calculateArea();

    // Non-abstract method to display the area
    public void display() {
        System.out.println("Area: " + area);
    }
}


