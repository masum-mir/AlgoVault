 # 📦 Array Data Structure

An **Array** implementation in Java with a wide range of operations for **mastering Data Structures & Algorithms** step-by-step.  
This implementation includes **dynamic resizing**, multiple insertion and deletion methods, searching, sorting, reversing, and more.

> 🚀 Crafted with Logic & Love by **Masum** | Keep coding, keep learning ❤️

---

## 🛠 Features

- **Dynamic Resizing** (automatic expand & shrink)
- **Insertion**
  - At beginning
  - At end
  - At specific position
  - Multiple elements at specific position
- **Deletion**
  - From beginning
  - From end
  - From specific position
  - By element (first occurrence)
  - By element (all occurrences)
- **Searching**
  - Linear Search
  - Binary Search (Iterative & Recursive)
- **Sorting**
  - Built-in `Arrays.sort()`
  - Bubble Sort
  - Quick Sort
- **Other Utilities**
  - Traverse (print elements)
  - Reverse array
  - Find **max** and **min**
  - Copy array

---

## 🧮 Time Complexity

| Operation                 | Complexity |
|---------------------------|------------|
| Append (Add to end)       | **O(1)**   |
| Insert/Delete/Search      | **O(n)**   |
| Binary Search             | **O(log n)** |
| Bubble Sort               | **O(n²)**  |
| Quick Sort (Worst Case)   | **O(n²)**  |
| Quick Sort (Average Case) | **O(n log n)** |

------------------------------------------------

# 🔗 Singly Linked List 

A **Singly Linked List** implementation in Java covering **core linked list operations** like insertion, deletion, searching, reversing, cycle detection, and merging sorted lists.

> 🚀 Crafted with Logic & Love by **Masum** | Keep coding, keep learning ❤️

---

## 🛠 Features

- **Insertion**
  - At beginning
  - At end
  - At specific position
  - After a given node
- **Deletion**
  - From beginning
  - From end
  - At specific position
  - By value
- **Reversing**
  - Iterative reverse
  - Recursive reverse
- **Searching**
  - Search by value
  - Get element at a given position
  - Get nth node from end
- **Advanced**
  - Detect cycle (Floyd's Cycle Detection)
  - Remove cycle
  - Find middle node
  - Merge two sorted linked lists

---

## 🧮 Time Complexity

| Operation                     | Complexity |
|--------------------------------|------------|
| Insert at beginning/end        | **O(1)**   |
| Insert at specific position    | **O(n)**   |
| Delete from beginning          | **O(1)**   |
| Delete from end/position/value | **O(n)**   |
| Search                         | **O(n)**   |
| Reverse (iterative/recursive)  | **O(n)**   |
| Detect cycle                   | **O(n)**   |
| Merge sorted lists              | **O(n+m)** |

------------------------------------------------

# 📚 Doubly Linked List  

A clean and fully functional implementation of a **Doubly Linked List** in Java, featuring operations such as **insertion, deletion, search, size calculation, and bidirectional traversal**.  

> 🚀 Crafted with Logic & Love by **Masum** | Keep coding, keep learning ❤️

---

## 🛠 Features
- **Insertion**  
  - At the front (head)  
  - At the end (tail)  
  - At a specific position  

- **Deletion**  
  - From the front  
  - From the end  
  - By value (first occurrence)  

- **Traversal**  
  - Forward (iterative & recursive)  
  - Backward (iterative & recursive)  

- **Size Calculation**  
  - Iterative  
  - Recursive  

- **Search** for a specific value  

---

## 🧮 Time Complexity
| Operation               | Complexity |
|-------------------------|------------|
| Insert at front/end     | **O(1)**   |
| Insert at position      | **O(n)**   |
| Delete at front/end     | **O(1)**   |
| Delete by value         | **O(n)**   |
| Search                  | **O(n)**   |
| Traversal               | **O(n)**   |

------------------------------------------------
# 📦 Stack (Array-Based Implementation)
 
This project implements a **Stack** data structure using a fixed-size array in Java.  
It provides essential stack operations such as push, pop, peek, search, and traversal.  
The implementation ensures efficient performance with constant time complexity for core operations and straightforward management of stack capacity.

> 🚀 Crafted with Logic & Love by **Masum** | Keep coding, keep learning ❤️
---

## 🛠 Features
- **push(int data)** — Add an element to the top of the stack  
- **pop()** — Remove and return the top element  
- **peek()** — Return the top element without removing it  
- **search(int data)** — Find the 1-based position of an element from the top; returns -1 if not found  
- **traverse()** — Display all elements from bottom to top  
- **isEmpty()** — Check if the stack is empty  
- **isFull()** — Check if the stack is full  
- **size()** — Get the current number of elements in the stack  
- **clear()** — Remove all elements from the stack  

---

## 🧮 Time Complexity
| Operation | Time Complexity |
|-----------|-----------------|
| push      | O(1)            |
| pop       | O(1)            |
| peek      | O(1)            |
| search    | O(n)            |
| traverse  | O(n)            |

----------------------------------

# 📦 Stack with Linked List
 
This project implements a **Stack** data structure using a **singly linked list** in Java.  
It supports core stack operations like push, pop, peek, and traversal.  
The linked list approach enables dynamic stack size without a fixed capacity limit.

> 🚀 Crafted with Logic & Love by **Masum** | Keep coding, keep learning ❤️
---

## 🛠 Features
- **push(int data)** — Insert an element at the top of the stack  
- **pop()** — Remove and return the top element; returns `-1` if the stack is empty  
- **peek()** — View the top element without removing it; returns `-1` if empty  
- **traverse()** — Display all elements from top to bottom  
- **Dynamic Size** — No fixed capacity limit (unlike array-based stack)  

---

## 🧮 Time Complexity
| Operation | Time Complexity |
|-----------|-----------------|
| push      | O(1)            |
| pop       | O(1)            |
| peek      | O(1)            |
| traverse  | O(n)            |

-------------------------------------

# 📦 Stack Using Queues
 
This project demonstrates how to implement a **Stack** data structure using two **Queues** in Java.  
It simulates the Last-In-First-Out (LIFO) behavior of stacks with First-In-First-Out (FIFO) queue operations.

> 🚀 Crafted with Logic & Love by **Masum** | Keep coding, keep learning ❤️
---

## 🛠 Features
- **push(int data)** — Add element to the top of the stack (O(1))  
- **pop()** — Remove and return the top element of the stack (O(n))  
- **peek()** — View the top element without removing it (O(n))  
- **traverse()** — Display all stack elements from top to bottom  
- Uses two `Queue` instances internally to simulate stack behavior

---

## 🧮 Time Complexity
| Operation | Time Complexity |
|-----------|-----------------|
| push      | O(1)            |
| pop       | O(n)            |
| peek      | O(n)            |
| traverse  | O(n)            |

-----------------------------------

# 📦 Circular Queue Using Array 
 
This project implements a **Circular Queue** data structure using a fixed-size array in Java.  
The circular approach optimizes space utilization by reusing emptied slots efficiently.

> 🚀 Crafted with Logic & Love by **Masum** | Keep coding, keep learning ❤️
---

## 🛠 Features
- **enqueue(int data)** — Adds an element to the rear of the queue  
- **dequeue()** — Removes and returns the front element  
- **peek()** — Retrieves the front element without removing it  
- **size()** — Returns the current number of elements in the queue  
- **clear()** — Resets the queue to an empty state  
- **traverse()** — Prints all elements from front to rear in order  

---

## 🧮 Time Complexity
| Operation | Time Complexity |
|-----------|-----------------|
| enqueue   | O(1)            |
| dequeue   | O(1)            |
| peek      | O(1)            |
| traverse  | O(n)            |

---------------------------------

# 📦 Queue Using Linked List
 
This project implements a **Queue** data structure using a singly linked list in Java.  
It supports efficient enqueue and dequeue operations in constant time.

> 🚀 Crafted with Logic & Love by **Masum** | Keep coding, keep learning ❤️
---

## 🛠 Features
- **enqueue(int data)** — Add element at the rear of the queue  
- **dequeue()** — Remove element from the front of the queue  
- **peek()** — View the front element without removing it  
- **traverse()** — Print all queue elements from front to rear  

---

## 🧮 Time Complexity
| Operation | Time Complexity |
|-----------|-----------------|
| enqueue   | O(1)            |
| dequeue   | O(1)            |
| peek      | O(1)            |
| traverse  | O(n)            |

----------------------------------

# 📦 Queue Using Two Stacks 
 
This project demonstrates how to implement a **Queue** data structure using **two stacks** in Java.  
It simulates FIFO behavior using LIFO data structures.

> 🚀 Crafted with Logic & Love by **Masum** | Keep coding, keep learning ❤️
---

## 🛠 Features
- **enqueue(int data)** — Add element to the queue in O(1) time  
- **dequeue()** — Remove and return the front element in amortized O(n) time  
- **peek()** — Return the front element without removing it, O(n) worst case  
- **traversal()** — Print all elements in queue order  

---

## 🧮 Time Complexity
| Operation | Time Complexity       |
|-----------|----------------------|
| enqueue   | O(1)                 |
| dequeue   | Amortized O(1) to O(n)|
| peek      | Amortized O(1) to O(n)|
| traversal | O(n)                 |

------------------------------------------

# 📦 Binary Search Tree (BST) 

A simple and efficient implementation of a Binary Search Tree (BST) supporting common operations and traversals.

> 🚀 Crafted with Logic & Love by **Masum** | Keep coding, keep learning ❤️
---

## 🛠 Features

- Insert, search, and delete nodes  
- In-order, pre-order, post-order, and level-order traversals  
- Calculate tree height  
- Count total nodes and leaf nodes  
- Find minimum and maximum values  
- Check if the tree is:
  - A valid BST  
  - Balanced  
  - Complete  
  - Perfect  
  - Full  

## 🧮 Time Complexity

| Operation             | Average Case    | Worst Case       |
|-----------------------|-----------------|------------------|
| Insert/Search/Delete   | O(log n)        | O(n)             |
| Traversals            | O(n)            | O(n)             |
| Height Calculation    | O(n)            | O(n)             |
| Tree Property Checks  | O(n)            | O(n)             |

---------------------------------------------------------------------

# 📦 AVL Tree Implementation in Java

A robust AVL Tree (self-balancing Binary Search Tree) implementation in Java that supports efficient insertions, deletions, searches, and tree traversals while maintaining balance through rotations.

> 🚀 Crafted with Logic & Love by **Masum** | Keep coding, keep learning ❤️
---

## 🛠 Features

- Self-balancing binary search tree (AVL Tree)  
- Supports insertion, deletion, and search operations — all in O(log n) time  
- Performs rotations (LL, RR, LR, RL) to maintain balance  
- In-order traversal for sorted output  
- ASCII visualization of the tree structure  
- Handles edge cases gracefully (e.g., deleting nodes with zero, one, or two children)  

---

## 🧮 Time Complexity

| Operation | Time Complexity |
|-----------|-----------------|
| Insert    | O(log n)        |
| Delete    | O(log n)        |
| Search    | O(log n)        |
| Rotation  | O(1)            |
| Traversal | O(n)            |

-----------------------------------

# 📦 QuickSort  

A straightforward and efficient implementation of the QuickSort algorithm for sorting integer arrays.

> 🚀 Crafted with Logic & Love by **Masum** | Keep coding, keep learning ❤️
---

## 📌 Description

QuickSort is a divide-and-conquer sorting algorithm that partitions the array around a pivot element and recursively sorts the sub-arrays. It generally performs faster than simple sorts like bubble sort or insertion sort, especially on large datasets.

---

## 🧮 Time Complexity

| Case        | Time Complexity |
|-------------|-----------------|
| Best / Avg  | O(n log n)      |
| Worst       | O(n²)           |

---

# 📦 BubbleSort  

A simple implementation of the Bubble Sort algorithm to sort integer arrays in ascending order.

> 🚀 Crafted with Logic & Love by **Masum** | Keep coding, keep learning ❤️
---

## 📌 Description

Bubble Sort repeatedly swaps adjacent elements if they are in the wrong order. It continues passes through the list until no swaps are needed, making it a straightforward but less efficient sorting method for large datasets.

---

## 🧮 Time Complexity

| Case        | Time Complexity |
|-------------|-----------------|
| Best        | O(n)            |
| Average     | O(n²)           |
| Worst       | O(n²)           |

---

# 📦 BinarySearch  

A Java class implementing both iterative and recursive versions of the Binary Search algorithm on sorted arrays.

> 🚀 Crafted with Logic & Love by **Masum** | Keep coding, keep learning ❤️
---

## 📌 Description

Binary Search efficiently locates a target element in a sorted array by repeatedly dividing the search interval in half, drastically reducing the search time compared to linear search.

---

## 🧮 Time Complexity

| Case    | Time Complexity |
|---------|-----------------|
| Best    | O(1)            |
| Average | O(log n)        |
| Worst   | O(log n)        |

---
 
## ✨ Author
**Masum**  
Crafted with Logic & Love | *Keep coding, keep learning* 🚀



 



