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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st=new Stack<>();
        ListNode temp=head;
        while(temp!=null)
        {
            st.push(temp.val);
            temp=temp.next;

        }
        ListNode temp2=head;
        while(temp2!=null)
        {
            if(temp2.val!=st.peek())
            {
                    return false;
            }
            st.pop();
            temp2=temp2.next;
        }
       return true;
    }
}