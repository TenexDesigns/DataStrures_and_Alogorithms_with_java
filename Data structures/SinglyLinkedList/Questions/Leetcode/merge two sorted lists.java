To merge two sorted lists, you can follow the following steps:

1. Check if either of the lists is empty. If one of them is empty, return the other list as the merged list.
2. Create a new dummy node as the head of the merged list. This dummy node will help simplify the merging process.
3. Initialize two pointers, `curr` and `prev`, both pointing to the dummy node.
4. Iterate through the lists using the `curr` pointer:
   - Compare the values of the current nodes in both lists.
   - If the value in the first list is smaller or equal, set the next pointer of the `prev` node to the current node in the first list, and move the `curr` pointer of the first list to the next node.
   - If the value in the second list is smaller, set the next pointer of the `prev` node to the current node in the second list, and move the `curr` pointer of the second list to the next node.
   - Move the `prev` pointer to the next node in the merged list.
5. After the loop ends, there may be remaining nodes in either list. Append the remaining nodes to the merged list by setting the next pointer of the `prev` node to the remaining nodes.
6. Return the next node of the dummy node, which is the head of the merged list.

Here's the Python implementation:

```python
class Solution:
    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        if not l1:
            return l2
        if not l2:
            return l1
        
        dummy = ListNode(-1)
        curr = dummy
        
        while l1 and l2:
            if l1.val <= l2.val:
                curr.next = l1
                l1 = l1.next
            else:
                curr.next = l2
                l2 = l2.next
            curr = curr.next
        
        if l1:
            curr.next = l1
        else:
            curr.next = l2
        
        return dummy.next
```

The time complexity of this solution is O(n + m), where n and m are the lengths of the two input lists. We iterate through both lists once to merge them. The space complexity is O(1), as we only use a constant amount of extra space.

Sources:
- [Source 7](https://programs.programmingoneonone.com/2021/08/leetcode-merge-two-sorted-lists-problem-solution.html)
- [Source 9](https://blog.devgenius.io/leetcode-21-merge-two-sorted-lists-f290ef5d21e9)
- [Source 11](https://redquark.org/leetcode/0021-merge-two-sorted-lists/)
