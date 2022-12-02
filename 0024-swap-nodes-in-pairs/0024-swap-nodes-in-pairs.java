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
    public ListNode swapPairs(ListNode head) {
        if(head == null){
            return null;}
            ListNode previous =new ListNode(0);
            previous.next = head;
            ListNode newHead = previous;
            while(previous.next!=null && previous.next.next!=null){
                ListNode n1 = previous.next;
                ListNode n2 = n1.next;
                ListNode nextNode = n2.next;
                previous.next = n2;
                n2.next = n1;
                n1.next = nextNode;
                
                previous = n1;
            }
            return newHead.next;
        
        
    }
}