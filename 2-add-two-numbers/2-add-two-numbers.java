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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry =0;
        ListNode result = new ListNode(-100);
        ListNode restmp=result;
        while(l1!= null || l2!= null){
            int val1= (l1!=null)?l1.val:0;
            int val2=(l2!=null)?l2.val:0;
            int l3 = val1+val2+carry;
            carry=l3/10;
            restmp.next = new ListNode(l3%10);            
            if(l1!=null)
                l1=l1.next;
            if(l2!=null)
                l2=l2.next;    
            restmp=restmp.next;
        }
        if(carry>0)
            restmp.next=new ListNode(carry);
        return result.next;
        
    }
}