//implmentation of stack using array list 
import java.util.Scanner;
import java.util.Arrays;

public class Prgm {
    public static int top = -1;
    public static int size = 10;
    public static int[] stack = new int[size];

    public static void push(int key) {
        if (top == stack.length - 1) {
            System.out.println("Stack is full");
        } else {
            top++;
            stack[top] = key;
        }
    }

    public static int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int value = stack[top];
            top--;
            return value;
        }
    }

    public static int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return top;
        } else {
            int value = stack[top];
            return value;
        }
    }

    public static boolean isEmpty() {
        if (top < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isFull() {
        if (top >= stack.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public static int size() {
        return top + 1;
    }
    public static void printStack(){
        for(int i=0;i<=top;i++){
            System.out.print(stack[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Your Choice: ");
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the element to be pushed : ");
                    int key = s.nextInt();
                    push(key);
                    printStack();
                    System.out.println();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Element deleted : "+pop());
                    printStack();
                    System.out.println();
                    System.out.println();
                    break;
                case 3:
                    int n=peek();
                    System.out.println("Element at top : "+n);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Stack is empty : "+isEmpty());
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Stack is full : "+isFull());
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Stack of size is : "+size());
                    System.out.println();
                    break;
                default:
                    System.out.println("--Enter correct choice--");
                    System.out.println();
            }
        }
    }
}