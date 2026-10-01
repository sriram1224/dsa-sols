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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }
        ListNode mid = middleNode(head);
       
        ListNode second = mid.next;
        mid.next = null;
        second = reverseList(second);
        ListNode current = head;

        
        while(second!=null){
            ListNode t1 = current.next;
            ListNode t2 = second.next;

            current.next = second;
            current = t1;
            second.next = t1;
            second = t2;
           

        }
        if(current!=null) current = null;

        
    }

    public ListNode reverseList(ListNode head) {
        ListNode temp = head;

        ListNode prev = null;
        if(head==null || head.next==null){
            return head;
        }
        ListNode current = head;

        while(temp.next!=null){
            current = temp.next;
            temp.next = prev;
            prev = temp;
            temp = current;
        }
        current.next = prev;
        head = current;

        return head;
    }

     public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
   
        while(slow!= null){
            if(fast == null || fast.next == null){
                return slow;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
       
        return slow;

    }
}