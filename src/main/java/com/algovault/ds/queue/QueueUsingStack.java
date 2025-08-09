package com.algovault.ds.queue;

import java.util.Stack;

/************************************************************
 * 🔰 CLASS: QueueUsingStack
 * ----------------------------------------------------------
 * 📌 Description : Queue implementation using two stacks
 * 🛠️  Purpose     : DSA learning & practical
 * 🧠 Complexity   : Enqueue - O(1), Dequeue/Peek - O(n)
 *
 * 🧑‍💻 Crafted With Logic & Love by Masum | 06-Aug-2025
 ************************************************************/

public class QueueUsingStack {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();


    // Adds an element to the queue
    public void enqueue(int data) {
        stack1.push(data);
    }

    // Removes the front element
    public int dequeue() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    // Returns the front element without removing
    public int peek() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();
    }

    // Prints all elements in queue order
    public void traversal() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = stack2.size() - 1; i >= 0; i--) {
            System.out.print(stack2.get(i) + " ");
        }

        for (int i = 0; i < stack1.size(); i++) {
            System.out.print(stack1.get(i) + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        // 🔸 CODED BY MASUM ✨ | NEVER STOP LEARNING 🚀

        QueueUsingStack q = new QueueUsingStack();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.traversal();
        System.out.println("Dequeued: " + q.dequeue());
        q.traversal();
        System.out.println("Front: " + q.peek());
        q.enqueue(40);
        q.traversal();
    }
}

/************************************************************
 * 🔚 End of QueueUsingStack.java
 * 📣 Built for mastering DSA concepts step by step
 * ✍️ Author: Masum | Keep coding, keep learning
 ************************************************************/

