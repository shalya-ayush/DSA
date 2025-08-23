/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        int length = getLength(head);
        if(length <= 1){
            return head.next;
        }

        int mid_index = (length/2)-1;
        // ListNode curr_head = head;
        ListNode prev_node = head;
        while(mid_index > 0){
            prev_node = prev_node.next;
            mid_index--;
        }
        prev_node.next=prev_node.next.next;
        return head;


        
    }
    public int getLength(ListNode head){
        int count = 0;

        while (head != null){
            count++;
            head = head.next;
        }

        return count;
    }
}