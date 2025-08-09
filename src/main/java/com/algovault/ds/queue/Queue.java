package com.algovault.ds.queue;

/************************************************************
 * 🔰 CLASS: Queue
 * ----------------------------------------------------------
 * 📌 Description : Circular Queue using an Array
 * 🛠️  Purpose     : DSA learning & efficient queue operations
 * 🧠 Complexity   : Enqueue - O(1), Dequeue - O(1), Peek - O(1)
 *
 * 🧑‍💻 Crafted With Logic & Love by Masum | 07-Aug-2025
 ************************************************************/

public class Queue {

    private int[] queueArray;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    public Queue(int capacity) {
        this.capacity = capacity;
        queueArray = new int[capacity];
        front = 0;
        rear = -1;
        count = 0;
    }

    // Adds an element to the rear of the queue
    public void enqueue(int data) {
        if (count == capacity) {
            System.out.println("Queue Overflow - cannot enqueue.");
            return;
        }
        rear = (rear + 1) % capacity;
        queueArray[rear] = data;
        count++;
    }

    // Removes and returns the front element
    public int dequeue() {
        if (count == 0) {
            System.out.println("Queue Underflow - cannot dequeue.");
            return -1;
        }
        int removed = queueArray[front];
        front = (front + 1) % capacity;
        count--;
        return removed;
    }

    // Returns the front element without removing
    public int peek() {
        if (count == 0) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return queueArray[front];
    }

    // Returns the number of elements in the queue
    public int size() {
        return count;
    }

    // Resets the queue to empty state
    public void clear() {
        front = 0;
        rear = -1;
        count = 0;
        System.out.println("Queue cleared.");
    }

    // Prints all elements in the queue
    public void traverse() {
        if (count == 0) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < count; i++) {
            int index = (front + i) % capacity;
            System.out.print(queueArray[index] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 🔸 CODED BY MASUM ✨ | NEVER STOP LEARNING 🚀

        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.traverse();
        queue.dequeue();
        queue.traverse();
    }
}

/************************************************************
 * 🔚 End of Queue.java
 * 📣 Built for mastering DSA concepts step by step
 * ✍️ Author: Masum | NEVER STOP LEARNING
 ************************************************************/
