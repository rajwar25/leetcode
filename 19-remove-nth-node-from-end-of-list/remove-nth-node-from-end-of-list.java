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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int c=0;
        while(temp!=null)
        {
            c++;
          temp=temp.next;
        }
        int start=(c-n)-1;
        ListNode temp2=head;
        int k=0;
        ListNode before=head;
        if (start==-1) {
            return head.next;
        }
        while(k<start)
        {
         before=before.next;
         k++;
        }
        before.next=before.next.next;
        return head;
    }
}