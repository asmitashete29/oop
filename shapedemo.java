import java.util.Scanner;
// Base class
class Shape {

    // Method to calculate area
    double calculateArea() {
        return 0;
    }

    // Method to display result
    void display() {
        System.out.println("Area of Shape: " + calculateArea());,
    }
}

// Derived class Circle
class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // Method overriding
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    void display() {
        System.out.println("Area of Circle: " + calculateArea());
    }
}

// Derived class Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method overriding
    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    void display() {
        System.out.println("Area of Rectangle: " + calculateArea());
    }
}

// Derived class Triangle
class Triangle extends Shape {
    private double base;
    private double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Method overriding
    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    void display() {
        System.out.println("Area of Triangle: " + calculateArea());
    }
}

// Main class
public class ShapeDemo {
    public static void main(String[] args) {

        // Base class reference referring to derived class objects
        Shape shape1 = new Circle(5);
        Shape shape2 = new Rectangle(10, 5);
        Shape shape3 = new Triangle(6, 4);

        shape1.display();
        shape2.display();
        shape3.display();
    }
}
