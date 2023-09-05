Sure, here are some examples of basic operations you can perform on a singly linked list in Java. 

## 1. Print the Linked List

Printing the linked list is a basic traversal operation where we start from the head of the list and keep printing the data of each node till we reach the end of the list.

Here's a simple method to print the linked list:

```java
public void printList() {
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
}
```

In this code, we start from the head of the linked list and keep moving to the next node until we find a node that points to null (which is the end of the list) [Source 1](https://www.geeksforgeeks.org/linked-list-set-1-introduction/).

## 2. Reverse the Linked List

Reversing the linked list involves changing the `next` pointer of each node to point to the previous node in the list. 

Here's a simple method to reverse the linked list:

```java
public void reverse() {
    Node prev = null;
    Node current = head;
    Node next = null;
    while (current != null) {
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }
    head = prev;
}
```

In this code, we initialize three pointers: `prev`, `current`, and `next`. We start from the head of the linked list and for each node, we first store the next node, then we change the `next` pointer of the current node to point to the `prev` node. Finally, we move the `prev` and `current` pointers one step forward. When the `current` node becomes null, we stop and change the head to point to the `prev` node because that's the new head of the reversed linked list [Source 2](https://www.geeksforgeeks.org/reverse-a-linked-list/).

Please note that these methods assume that you have a `Node` class defined as follows:

```java
class Node {
    int data;
    Node next;
    
    Node(int d) {
        data = d;
        next = null;
    }
}
```

And that your linked list class has a `head` attribute:

```java
class LinkedList {
    Node head;
}
```
