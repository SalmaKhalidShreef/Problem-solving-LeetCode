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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode curr=head;
        ListNode front = head;
        ListNode end = null;
        int c=1;
        while(curr!=null){
            if(end!= null)
                end=end.next;
            if(c==k){
                end=head;
                front=curr;
            }
            curr=curr.next;
            c++;
        }
        int tmp =front.val;
        front.val=end.val;
        end.val=tmp;
        return head;
}
}