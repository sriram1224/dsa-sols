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
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode half = reverseList(mid);
        ListNode rereverse = half;

        while(head!=null && half!=null){
            if(head.val!=half.val){
                break;
            }
            head = head.next;
            half = half.next;
        }
        
       reverseList(rereverse);

       return half==null || head==null;

        
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