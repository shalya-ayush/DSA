# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverse(self,head):
        prev = None
        curr = head

        while curr:
            nextNode = curr.next
            curr.next = prev
            prev = curr
            curr = nextNode

        return prev

    def removeLeadingZeros(self,head):

        while head and head.val == 0:
            head = head.next

        return head



    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        
        carry = 0
        res = None
        curr = None
        # l1 = self.removeLeadingZeros(l1)
        # l2 = self.removeLeadingZeros(l2)

        # l1 = self.reverse(l1)
        # l2 = self.reverse(l2)

        while l1 is not None or l2 is not None or carry !=0:
            lSum = carry
            if l1 is not None:
                lSum += l1.val
                l1 = l1.next

            if l2 is not None:
                lSum += l2.val
                l2 = l2.next

            newNode = ListNode(lSum % 10)

            carry = lSum // 10


            if res is None:
                res = newNode
                curr = newNode


            else:
                curr.next = newNode
                curr = curr.next

        return res




