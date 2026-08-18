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
    public ListNode sortList(ListNode head) {
        int c=0;
        ListNode temp=head;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        int arr[]=new int[c];
        ListNode temp2=head;
        int i=0;
         while(temp2!=null)
         {
            arr[i]=temp2.val;
            i++;
            temp2=temp2.next;
         }
         Arrays.sort(arr);
         ListNode temp3=head;
         int k=0;
         while(temp3!=null)
         {
            temp3.val=arr[k];
            k++;
            temp3=temp3.next;
         }
         return head;
        
    }
}