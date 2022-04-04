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
        ArrayList<Integer> list = new ArrayList();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        int tmp = list.get(k-1);
        int tmp2 = list.get(list.size()-k);
        list.set(k-1,tmp2);
        list.set(list.size()-k,tmp);
        ListNode res = new ListNode();
        ListNode tempres=res;
        for(int i : list){
            tempres.next = new ListNode(i);
            tempres=tempres.next;
        }
        return res.next;
    }
}