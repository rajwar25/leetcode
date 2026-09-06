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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode head1=head;
        Stack<Integer>st=new Stack<>();
        for(int i=1;i<left;i++)
        {
            head1=head1.next;
        }
        ListNode head2=head;
       for(int i=1;i<right;i++)
        {
            head2=head2.next;
        }
        ListNode temp=head1;
        while(temp!=head2.next)
        {
          st.push(temp.val);
          temp=temp.next;
        }
        ListNode temp2=head1;
        while(temp2!=head2.next)
        {
            temp2.val=st.pop();
            temp2=temp2.next;
        }
        return head;
    }
}