package assignment;
class Outer {
    void display() {
        System.out.println("Outer class display()");
    }

    class Inner {
        void display() {
            System.out.println("Inner class display()");
        }
    }
}

public class NestedClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.display();

        // Instantiate Inner class using Outer instance
        Outer.Inner inner = outer.new Inner();
        inner.display();
    }
}