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
    public ListNode reverseKGroup(ListNode head, int k) {
        int c=0;
        ListNode temp=head;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        if(c<k)
        {
            return head;
        }
        ListNode temp2=head;
        Stack<Integer> st=new Stack<>();
        int i=1; 
        ListNode temp3=head;
        while(temp2!=null && c>=k)
        {
           i=1;
           temp3=temp2;
           ListNode start=temp2;
           while(i<=k)
           {
            st.push(temp3.val);
            i++;
            temp3=temp3.next;
           }
           i=1;
           while(i<=k)
           {
            temp2.val=st.pop();
            i++;
            temp2=temp2.next;
           }
           c-=k;
        }
        return head;
    }
}