# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        count = 0
        current = head
        while current:
            count += 1
            current = current.next
        if count == 1 and n == 1:
            return None
        m = count+1 - n
        if m == 1:
            return head.next
        c = 0
        current1 = head
        prev = None
        while current1:
            c += 1
            if c == m:
                prev.next = prev.next.next
            prev = current1
            current1 = current1.next
        return head