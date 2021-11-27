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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
        for(int i=0; i<lists.length; i++) {
            addQueue(lists[i], pq);
        }
        ListNode node = null;
        if(pq.size() == 0) return node;
        
        node = new ListNode(pq.remove());
        return makeList(node, pq);
        
    }
    
    private void addQueue(ListNode node, PriorityQueue<Integer> pq) {
        if(node == null) return;
        
        pq.offer(node.val);
        addQueue(node.next, pq);
        return;
    }
    private ListNode makeList(ListNode node , PriorityQueue<Integer> pq) {
        if(pq.size() == 0) {
            node.next = null;
            return node;
        }
        ListNode next = new ListNode(pq.remove());
        node.next = next;
        makeList(node.next, pq);
        return node;
    }
}