import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LinearDataStructuresDemo {

    // Array demo
    public static void arrayDemo() {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    // Linked List demo
    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    public static void linkedListDemo() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        
        System.out.println("Linked List:");
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("\n");
    }

    // Stack demo
    public static void stackDemo() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println("\n");
    }

    // Queue demo
    public static void queueDemo() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println("Queue:");
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        arrayDemo();
        linkedListDemo();
        stackDemo();
        queueDemo();
    }
}
