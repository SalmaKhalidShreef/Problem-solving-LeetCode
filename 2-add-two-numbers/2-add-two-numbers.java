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
        int tmp =0;
        ListNode result = new ListNode(-100);
        ListNode restmp=result;
        while(l1!= null && l2!= null){
            int l3 = l1.val+l2.val+tmp;
            tmp=0;
            if(l3<10){
                restmp.next=new ListNode(l3);
            }
            else
            {
                restmp.next=new ListNode(l3%10);
                tmp=l3/10;
            }
            restmp=restmp.next;
            l1=l1.next;
            l2=l2.next;
        }
        if(l1!=null){
            while(tmp>0 && l1!=null){
                int l3=l1.val+tmp;
                tmp=0;
                if(l3<10){
                    restmp.next=new ListNode(l3);
                }
                else{
                   restmp.next=new ListNode(l3%10);
                    tmp=l3/10; 
                }
                l1=l1.next;
                restmp=restmp.next;
            }
            restmp.next=l1;
        }
        if(l2!=null){
            while(tmp>0 && l2!=null){
                int l3=l2.val+tmp;
                tmp=0;
                if(l3<10){
                    restmp.next=new ListNode(l3);
                }
                else{
                   restmp.next=new ListNode(l3%10);
                    tmp=l3/10; 
                }                l2=l2.next;
                restmp=restmp.next;
            }
            restmp.next=l2;
        }
        if(tmp>0){
            restmp.next=new ListNode(tmp);
        }
        return result.next;
        
    }
}