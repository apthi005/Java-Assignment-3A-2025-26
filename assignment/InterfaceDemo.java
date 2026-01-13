package assignment;
interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rectangle implements Resizable {
    int width, height;

    Rectangle(int w, int h) { width = w; height = h; }

    public void resizeWidth(int w) {
        width = w;
        System.out.println("New Width: " + width);
    }

    public void resizeHeight(int h) {
        height = h;
        System.out.println("New Height: " + height);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 20);
        r.resizeWidth(15);
        r.resizeHeight(25);
    }
}