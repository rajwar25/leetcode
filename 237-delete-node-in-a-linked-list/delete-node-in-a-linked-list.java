/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
        //jo node hai lets say 5 hmne voh bheja, 5 waale node mei hmne uske next node value daaldi and then hmne us node ko uske aage point krwah diya, a kind of a cheat way!!
    }
}