To get the length of a singly linked list, you can use the following approaches:

1. Iterative Approach: In this approach, you traverse the linked list while keeping a count of the number of nodes visited. Here's an example implementation:

```java
public int lengthOfLinkedList() {
    Node current = head;
    int count = 0;
    while (current != null) {
        count++;
        current = current.next;
    }
    return count;
}
```

2. Recursive Approach: In this approach, you use recursion to traverse the linked list and increment the count. Here's an example implementation:

```java
public int lengthOfLinkedListRec(Node head) {
    if (head == null) {
        return 0;
    } else {
        return 1 + lengthOfLinkedListRec(head.next);
    }
}
```

You can use these methods in your `SinglyLinkedList` class to get the length of the linked list. Here's an example usage:

```java
SinglyLinkedList list = new SinglyLinkedList();
list.insertFirst(5);
list.insertFirst(6);
list.insertFirst(7);
list.insertFirst(1);
list.insertLast(2);
list.printLinkedList();  // Output: 2 -> 1 -> 7 -> 6 -> 5

int length = list.lengthOfLinkedList();
System.out.println("Length of Linked List using iteration: " + length);  // Output: Length of Linked List using iteration: 5

int lengthRec = list.lengthOfLinkedListRec(list.getHead());
System.out.println("Length of Linked List using recursion: " + lengthRec);  // Output: Length of Linked List using recursion: 5
```

To check if a singly linked list is empty, you can modify the `isEmpty` method in the `SinglyLinkedList` class to return `true` if the `head` is `null`, indicating an empty list. Here's an updated implementation:

```java
public boolean isEmpty() {
    return (head == null);
}
```

You can use this `isEmpty` method in your `SinglyLinkedList` class to check if the linked list is empty. Here's an example usage:

```java
SinglyLinkedList list = new SinglyLinkedList();
System.out.println("Is the list empty? " + list.isEmpty());  // Output: Is the list empty? true

list.insertFirst(1);
System.out.println("Is the list empty? " + list.isEmpty());  // Output: Is the list empty? false
```

To remove duplicates from a singly linked list, you can use the following approach:

1. Use a set to keep track of the unique elements encountered while traversing the linked list.
2. Start from the head of the linked list and traverse the list.
3. For each node, check if its data is already present in the set.
4. If the data is not present, add it to the set and move to the next node.
5. If the data is already present, remove the current node from the list by adjusting the next pointer of the previous node.
6. Continue the traversal until the end of the list is reached.

Here's an example implementation of the `removeDuplicates` method in the `SinglyLinkedList` class:

```java
public void removeDuplicates() {
    if (head == null || head.next == null) {
        return;
    }

    Set<Integer> set = new HashSet<>();
    Node current = head;
    Node previous = null;
    while (current != null) {
        if (set.contains(current.data)) {
            previous.next = current.next;
        } else {
            set.add(current.data);
            previous = current;
        }
        current = current.next;
    }
}
```

You can use this `removeDuplicates` method in your `SinglyLinkedList` class to remove duplicates from the linked list. Here's an example usage:

```java
SinglyLinkedList list = new SinglyLinkedList();
list.insertFirst(1);
list.insertFirst(2);
list.insertFirst(2);
list.insertFirst(3);
list.insertFirst(4);
list.insertFirst(4);
list.printLinkedList();  // Output: 4 -> 4 -> 3 -> 2 -> 2 -> 1

list.removeDuplicates();
list.printLinkedList();  // Output: 4 -> 3 -> 2 -> 1
```

These implementations should help you get the length of a linked list, check if it is empty, and remove duplicates from it.


