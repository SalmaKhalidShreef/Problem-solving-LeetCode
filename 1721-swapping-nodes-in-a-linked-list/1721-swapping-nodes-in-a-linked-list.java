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
        int size =0;
        ListNode tmp = head;
        ListNode res =  new ListNode();
        ListNode restmp = res;
        while(tmp!=null){
            size++;
            tmp=tmp.next;
        }
        int i =1;
        ListNode swapNode1 = res;
        ListNode swapNode2=res;
        tmp = head;
        while(tmp!=null){
            restmp.next=new ListNode(tmp.val);
            restmp=restmp.next;
            if(i==k)
                swapNode1=restmp;
            if(i==(size-k+1))
               swapNode2=restmp;

            i++;
            tmp=tmp.next;
        }
        int tmpval=swapNode1.val;
        swapNode1.val=swapNode2.val;
        swapNode2.val=tmpval;
        return res.next;
    }
}