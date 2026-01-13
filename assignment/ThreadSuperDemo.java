package assignment;
class MyThread extends Thread {
    MyThread() {
        super("My Child Thread"); // Call base class constructor
        System.out.println("Child thread created: " + this);
        start(); // Start the thread inside constructor
    }

    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Child Thread executing...");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Child thread exiting.");
    }
}

public class ThreadSuperDemo {
    public static void main(String[] args) {
        new MyThread(); // Constructor starts the thread

        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Main Thread executing...");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Main interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}