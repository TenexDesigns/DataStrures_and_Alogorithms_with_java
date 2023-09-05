To check if a singly linked list is empty in Java, you can use the following approaches:

1. Using the `isEmpty()` method: This method is available in the `LinkedList` class and returns `true` if the linked list is empty, and `false` otherwise. Here's an example:

```java
import java.util.LinkedList;

public class CheckIfLinkedListIsEmptyExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        System.out.println(linkedList.isEmpty()); // Output: true

        linkedList.add("Apple");

        System.out.println(linkedList.isEmpty()); // Output: false
    }
}
```

2. Using the `size()` method: Another approach is to use the `size()` method of the `LinkedList` class. If the size of the linked list is 0, then it is empty. Here's an example:

```java
import java.util.LinkedList;

public class CheckIfLinkedListIsEmptyExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        System.out.println(linkedList.size() == 0); // Output: true

        linkedList.add("Apple");

        System.out.println(linkedList.size() == 0); // Output: false
    }
}
```

Both approaches will give you the same result. You can choose the one that suits your coding style and requirements.

To remove duplicates from a singly linked list in Java, you can use the following approach:

1. Use a `HashSet` to keep track of the unique elements encountered while traversing the linked list.
2. Start from the head of the linked list and traverse the list.
3. For each node, check if its data is already present in the `HashSet`.
4. If the data is not present, add it to the `HashSet` and move to the next node.
5. If the data is already present, remove the current node from the list by adjusting the next pointer of the previous node.
6. Continue the traversal until the end of the list is reached.

Here's an example implementation:

```java
import java.util.HashSet;

public class SinglyLinkedList {
    // ...

    public void removeDuplicates() {
        if (head == null || head.next == null) {
            return;
        }

        HashSet<Integer> set = new HashSet<>();
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
}
```

You can use the `removeDuplicates` method in your `SinglyLinkedList` class to remove duplicates from the linked list. Here's an example usage:

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

These implementations should help you check if a singly linked list is empty and remove duplicates from it.
