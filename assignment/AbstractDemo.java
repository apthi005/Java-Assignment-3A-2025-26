package assignment;
abstract class AbstractShape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class CircleShape extends AbstractShape {
    double r;
    CircleShape(double r) { this.r = r; }
    
    double calculateArea() { return Math.PI * r * r; }
    double calculatePerimeter() { return 2 * Math.PI * r; }
}

class TriangleShape extends AbstractShape {
    double a, b, c, h, base;
    TriangleShape(double base, double h, double a, double b, double c) {
        this.base = base; this.h = h; this.a = a; this.b = b; this.c = c;
    }
    
    double calculateArea() { return 0.5 * base * h; }
    double calculatePerimeter() { return a + b + c; }
}

public class AbstractDemo {
    public static void main(String[] args) {
        CircleShape c = new CircleShape(5);
        System.out.println("Circle Area: " + c.calculateArea());
        
        TriangleShape t = new TriangleShape(10, 5, 3, 4, 5);
        System.out.println("Triangle Area: " + t.calculateArea());
    }
}