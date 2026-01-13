package assignment;
import java.util.Scanner;

class Stack {
    int[] stk = new int[10];
    int top = -1;

    void push(int item) {
        if (top == 9) {
            System.out.println("Stack Overflow");
        } else {
            stk[++top] = item;
            System.out.println("Pushed: " + item);
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Popped: " + stk[top--]);
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack content: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stk[i] + " ");
            }
            System.out.println();
        }
    }
}

public class StackDemo {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.display();
        s.pop();
        s.display();
    }
}