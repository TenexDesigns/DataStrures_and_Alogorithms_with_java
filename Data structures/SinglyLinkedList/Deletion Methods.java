deleteFromBeginning() is a method that deletes a node from the beginning of the list.
deleteFromEnd() is a method that deletes a node from the end of the list.
deleteSpecificNode(int key) is a method that deletes a specific node.




  Sure, I can add methods to delete a node from the beginning, from the end, and a specific node. Here's the updated `SinglyLinkedList` class:

```java
public class SinglyLinkedList {
    Node head;

    // Method to delete a node from the beginning of the list
    public void deleteFromBeginning() {
        if (head != null) {
            head = head.next;
        }
    }

    // Method to delete a node from the end of the list
    public void deleteFromEnd() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    // Method to delete a specific node
    public void deleteSpecificNode(int key) {
        Node current = head, prev = null;
        if (current != null && current.data == key) {
            head = current.next;
            return;
        }
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }
        if (current != null) {
            prev.next = current.next;
        }
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

- `deleteFromBeginning()` is a method that deletes a node from the beginning of the list.
- `deleteFromEnd()` is a method that deletes a node from the end of the list.
- `deleteSpecificNode(int key)` is a method that deletes a specific node.

Here's how you can use these new methods:

```java
public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.printList();  // Output: 1 2 3
        list.deleteFromBeginning();
        list.printList();  // Output: 2 3
        list.deleteFromEnd();
        list.printList();  // Output: 2
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.printList();  // Output: 2 3 4
        list.deleteSpecificNode(3);
        list.printList();  // Output: 2 4
    }
}
```

In this usage example, it creates a list, inserts some data at the end, prints the list, deletes a node from the beginning, prints the list, deletes a node from the end, prints the list, inserts some data at the end, prints the list, deletes a specific node, and prints the list again.





  










  
