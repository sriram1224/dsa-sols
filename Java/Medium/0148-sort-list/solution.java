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
    public ListNode sortList(ListNode head) {
        if(head == null||head.next== null){
            return head;
        }
    
        ListNode mid = middleNode(head);

        ListNode right = mid.next;
        mid.next = null;
        ListNode left = head;
        ListNode sortedLeft = sortList(left);
        ListNode sortedRight = sortList(right);

        return mergeTwoLists(sortedLeft,sortedRight);

    }

        ListNode middleNode(ListNode head) {
        ListNode fast = head.next;
        ListNode slow = head;
   
        while(fast != null && fast.next != null){
            
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;

    }

     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode Dnode = new ListNode();
        ListNode node = Dnode;
      
        while(list1 != null && list2 != null){
            
            if(list1.val <list2.val){
                 node.next = list1;
               list1 = list1.next;
                node = node.next;
               
            }
            else{
               node.next = list2;
               list2 = list2.next;
            node = node.next;
            }
        }
        node.next = (list1!= null)? list1: list2;

        return Dnode.next;
    }
    
}