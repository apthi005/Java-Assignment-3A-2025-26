package assignment;
class MyRunnable implements Runnable {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500); // Suspend for 500ms
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start(); // Start the thread
        System.out.println("Main Thread Started...");
    }
}