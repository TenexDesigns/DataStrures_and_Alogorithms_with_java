A singly linked list is a type of data structure that consists of nodes. Each node has two components: data and a reference (link) to the next node in the sequence. Here is a simple implementation of a singly linked list in Java:

```java
public class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    Node head;

    // Method to add a new node at the end of the list
    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    // Method to print the list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.printList();  // Output: 1 2 3
    }
}
```

In this code:

- `Node` is a class that represents a node in the linked list. It has two fields: `data` (to store the data) and `next` (to store the reference to the next node).
- `SinglyLinkedList` is a class that represents a singly linked list. It has a `head` field that points to the first node in the list.
- `append(int data)` is a method that adds a new node at the end of the list.
- `printList()` is a method that prints the data in all nodes of the list from head to tail.

The `Main` class demonstrates how to use the `SinglyLinkedList` class. It creates a list, appends some data, and then prints the list.
