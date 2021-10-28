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
        if(head == null) {
            return true;
        }
         ListNode slow=head;
         ListNode fast=head;
         while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        
        ListNode q = head;
        ListNode reversed = reverse(slow);
        while(reversed != null) {
            
            if(reversed.val != q.val) {
                return false;
            }
            reversed = reversed.next;
            q=q.next;
        }
        return true;
    }
    
    private ListNode reverse(ListNode head) {
        
        ListNode prev = head;
        ListNode prevprev = null;
        ListNode current = head.next;
        
        ListNode next;
        
        while(current != null) {
            
            next = current.next;
            prev.next = prevprev;
            prevprev = prev;
            
            current.next = prevprev;
            prev = current;
            current = next;
            
        }
        return prev;
    }
}