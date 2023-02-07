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
    public ListNode reverseList(ListNode head) {
        Stack<Integer> stack = new Stack();
        while(head!=null)
        {
            stack.push(head.val);
            head = head.next;
        }
        
        ListNode res = new ListNode();
        ListNode tmp = res;
        while(!stack.isEmpty())
        {
            tmp.next = new ListNode(stack.pop());
            tmp = tmp.next;
        }
        
        return res.next;
    }
}