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
    ListNode newLatNode(ListNode temp,int i)
    {
        int cnt=1;
        while(temp!=null)
        {
            if(cnt==i)
            {
                return temp;
            }
            temp=temp.next;
            cnt++;
        }
         return temp;
    }
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        int c=1;
        int r=k;
        if(head==null || k==0 || head.next==null)
        {
            return head;
        }
        while(temp.next!=null)
        {
            c++;
            temp=temp.next;
        }
       if(k==c)
       {
        return head;
       }
       else{
         r=r%c;
       }
       temp.next=head;
       ListNode tail = newLatNode(head,c-r);
       head=tail.next;
       tail.next=null;
       return head;
    }
}