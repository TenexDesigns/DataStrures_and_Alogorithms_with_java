Linked lists are versatile data structures that support various methods for performing operations like insertion, deletion, traversal, and searching. Below are some common methods associated with singly linked lists in Java:

1. **Insertion Methods:**

   - **Insert at the Beginning:** Add a new node at the start of the linked list.
     ```java
     public void insertAtBeginning(T data);
     ```

   - **Insert at the End:** Append a new node at the end of the linked list.
     ```java
     public void insertAtEnd(T data);
     ```

   - **Insert at a Specific Position:** Insert a new node after a specific node in the linked list.
     ```java
     public void insertAfter(Node<T> prevNode, T data);
     ```

     ```



---------------------------------------------------------------------------------------------------------------
Sure, I can add methods to insert a node at the beginning, at the end, and at a specific position. Here's the updated `SinglyLinkedList` class:

```java
public class SinglyLinkedList {
    Node head;

    // Method to add a new node at the beginning of the list
    public void insertAtBeginning(int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    // Method to add a new node at the end of the list
    public void insertAtEnd(int data) {
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

    // Method to add a new node at a specific position
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("The previous node is null.");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
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
```

In this updated code:

- `insertAtBeginning(int data)` is a method that adds a new node at the beginning of the list.
- `insertAtEnd(int data)` is a method that adds a new node at the end of the list.
- `insertAtPosition(int data, int position)` is a method that adds a new node at a specific position.

Here's how you can use these new methods:

```java
public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtBeginning(0);
        list.printList();  // Output: 0 1 2 3
        list.insertAtPosition(1, 2);
        list.printList();  // Output: 0 1 1 2 3
    }
}
```

In this usage example, it creates a list, inserts some data at the end, inserts some data at the beginning, prints the list, inserts data at a specific position, and prints the list again.

