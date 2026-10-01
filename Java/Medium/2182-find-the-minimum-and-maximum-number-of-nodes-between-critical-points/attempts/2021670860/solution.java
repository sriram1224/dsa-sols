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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode temp = head.next;
        
        ListNode prev = head;
        
        int index = 2;
        int cp = 0;
        int firstIndex = 0;
        int prevIndex = 0;
        int minDist = Integer.MAX_VALUE;
        int maxDist = Integer.MAX_VALUE;
        if(head == null || head.next == null||head.next.next == null){
            return new int[]{-1,-1};
        }
        while(temp != null && temp.next != null ){
            if(temp.val > temp.next.val && temp.val > prev.val){
              
              cp++;
              
              if(cp == 1){
                  firstIndex = index;
                  prevIndex = index;
              }
              else {
                  minDist = Math.min(minDist,index - prevIndex);
                  prevIndex = index;
              }
              
              
              
            }
            else if(temp.val<prev.val && temp.val < temp.next.val){
              
                cp++;
                if(cp == 1){
                  firstIndex = index;
                  prevIndex = index;
                }
              else {
                   minDist = Math.min(minDist,index - prevIndex);
                  prevIndex = index;
              }
             
            }
            
            prev = temp;
            temp = temp.next;
            index++;
        }
        maxDist = prevIndex - firstIndex;
        
        if(cp < 2) return new int[] {-1,-1};
        return new int[]{minDist,maxDist};
    }
}