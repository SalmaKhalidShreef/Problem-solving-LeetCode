/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet <ListNode> set = new HashSet();
        ListNode tmp = head;
        if(tmp ==null)
            return false;
        while(tmp.next!=null){
            if(set.contains(tmp))
                return true;
            set.add(tmp);
            tmp=tmp.next;
        }
        return false;
    }
}