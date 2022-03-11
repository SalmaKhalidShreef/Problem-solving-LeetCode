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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0)
            return head;
        int len =1;
        ListNode tmp=head;
        while(tmp.next!=null){
            len++;
            tmp=tmp.next;
        }
       // System.out.println(i);
        tmp.next = head;
         k %= len;
    for(int i = 0; i < len - k; i++) {
        tmp = tmp.next;
    }
    head = tmp.next;
    tmp.next = null;
    return head;
    }
}