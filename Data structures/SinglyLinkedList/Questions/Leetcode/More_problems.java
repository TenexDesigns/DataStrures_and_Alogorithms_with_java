Here are the solutions for the "Reverse Linked List" problem on LeetCode, along with explanations:

**Iterative Solution:**

The iterative solution for reversing a linked list involves using three pointers: `prev`, `current`, and `next`. We start with `prev` and `current` both pointing to `null`, and `next` pointing to the next node of the current node.

1. Initialize `prev` as `null` and `current` as the `head` of the linked list.
2. While `current` is not `null`, do the following:
   - Save the next node in a variable called `next`.
   - Set the `next` pointer of the `current` node to `prev`, reversing the link.
   - Move `prev` to the `current` node.
   - Move `current` to the `next` node.
3. Finally, return `prev`, which will be the new head of the reversed linked list.

Here's the code for the iterative solution in C#:

```csharp
public ListNode ReverseListIterative(ListNode head)
{
    ListNode prev = null;
    while (head != null)
    {
        var next = head.next;
        head.next = prev;
        prev = head;
        head = next;
    }
    return prev;
}
```

**Recursive Solution:**

The recursive solution for reversing a linked list involves a recursive function that takes two parameters: the current node and the previous node.

1. If the current node is `null`, return the previous node. This will be the new head of the reversed linked list.
2. Save the next node in a variable called `next`.
3. Set the `next` pointer of the current node to the previous node, reversing the link.
4. Call the recursive function with the `next` node as the current node and the current node as the previous node.
5. Finally, return the result of the recursive function call.

Here's the code for the recursive solution in C#:

```csharp
public ListNode ReverseListRecursion(ListNode head, ListNode prev)
{
    if (head == null)
    {
        return prev;
    }
    var next = head.next;
    head.next = prev;
    return ReverseListRecursion(next, head);
}
```

You can test these solutions using the provided `Test()` method, which creates a linked list with values 1, 2, and 3, and then prints the reversed list.

Please note that these solutions have a time complexity of O(n) and a space complexity of O(1) for the iterative solution, and O(n) for the recursive solution, where n is the number of nodes in the linked list.

Sources:
- [Source 5](https://blog.nuculabs.dev/posts/2020/2020-11-17-leetcode-reverse-linked-list-solution/)
- [Source 9](https://walkccc.me/LeetCode/problems/0206/)To reverse a linked list, you can use either an iterative or recursive approach. Here's an explanation of both approaches:

**Iterative Solution:**
The iterative solution doesn't allocate any extra space and modifies the list in place. It uses three pointers: `prev`, `head`, and `next`. The `prev` pointer keeps track of the previous node, `head` points to the current node, and `next` points to the next node in the original list.

1. Initialize `prev` to `null` and `head` to the `head` of the original list.
2. Iterate over the list using a while loop:
   - Save the next node in the `next` pointer.
   - Set the `next` pointer of the current node to `prev`, reversing the link.
   - Move `prev` to the current node and `head` to the next node.
3. Return `prev`, which is now the new head of the reversed list.

Here's the C# implementation of the iterative solution:

```csharp
public class Solution {
    public ListNode ReverseList(ListNode head) {
        ListNode prev = null;
        ListNode next = null;
        
        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        
        return prev;
    }
}
```

**Recursive Solution:**
The recursive solution reverses the list by making the current node point to the previous node during each recursive call. The stopping condition is when the current node is `null`. In that case, we return the previous node, which becomes the new head of the reversed list.

1. Define a recursive function that takes the current node and the previous node as parameters.
2. Check if the current node is `null`. If it is, return the previous node.
3. Save the next node in a variable.
4. Set the `next` pointer of the current node to the previous node.
5. Make a recursive call, passing the next node as the current node and the current node as the previous node.
6. Return the result of the recursive call.

Here's the C# implementation of the recursive solution:

```csharp
public class Solution {
    public ListNode ReverseList(ListNode head) {
        return ReverseListRecursive(head, null);
    }
    
    private ListNode ReverseListRecursive(ListNode head, ListNode prev) {
        if (head == null) {
            return prev;
        }
        
        ListNode next = head.next;
        head.next = prev;
        
        return ReverseListRecursive(next, head);
    }
}
```

Both solutions have a time complexity of O(n), where n is the length of the linked list, as we need to traverse the entire list. The iterative solution has a space complexity of O(1), while the recursive solution has a space complexity of O(n) due to the recursive call stack.

Sources:
- [Source 2](https://dev.to/nuculabs_dev/leetcode-reverse-linked-list-solution-and-explanation-l77)
- [Source 5](https://blog.nuculabs.dev/posts/2020/2020-11-17-leetcode-reverse-linked-list-solution/)
- [Source 6](https://programs.programmingoneonone.com/2021/08/leetcode-reverse-linked-list-problem-solution.html)
- [Source 8](https://blog.eyucoder.com/reverse-linked-list-leetcode-problem)
