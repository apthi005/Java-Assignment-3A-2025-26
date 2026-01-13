package assignment;
class Shape {
    void draw() { System.out.println("Drawing a Shape"); }
    void erase() { System.out.println("Erasing a Shape"); }
}

class Circle extends Shape {
    void draw() { System.out.println("Drawing Circle"); }
    void erase() { System.out.println("Erasing Circle"); }
}

class Triangle extends Shape {
    void draw() { System.out.println("Drawing Triangle"); }
    void erase() { System.out.println("Erasing Triangle"); }
}

class Square extends Shape {
    void draw() { System.out.println("Drawing Square"); }
    void erase() { System.out.println("Erasing Square"); }
}

public class ShapePoly {
    public static void main(String[] args) {
        // Polymorphism: Parent reference holds child object
        Shape s;
        
        s = new Circle();
        s.draw();
        
        s = new Triangle();
        s.draw();
        
        s = new Square();
        s.draw();
    }
}