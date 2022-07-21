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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode start=head;
        for(int i =1;i<left;i++)
            start=start.next;
        ListNode tmp =start;
        ArrayList<Integer> nums=new ArrayList();
        int counter=left;
        while(counter++<=right){
            nums.add(tmp.val);
            tmp=tmp.next;
        }
        
        int j =nums.size()-1; 
        while(left++<=right){
            start.val=nums.get(j--);
            start=start.next;
        }
        return head;
    }
}