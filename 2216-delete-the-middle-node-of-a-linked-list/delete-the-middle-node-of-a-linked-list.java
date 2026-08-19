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
        ListNode slow=head;
        ListNode fast=head;
        int k=0;
        ListNode temp=head;
        if(temp==null || temp.next==null)
        {
            return null;
        }
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            if(k>0)
            {
            slow=slow.next;
            }
            k++;
        }
        slow.next=slow.next.next;
        return head;
    }
}