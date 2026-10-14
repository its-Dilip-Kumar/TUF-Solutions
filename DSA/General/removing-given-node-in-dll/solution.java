/*
// Definition for a Node.
class ListNode {
    public int data;
    public ListNode prev;
    public ListNode next;
    public ListNode();
    public ListNode(int data);
    public ListNode(int data, ListNode prev, ListNode next);
};
*/

class Solution {
    public void deleteGivenNode(ListNode node) {
        node.prev.next=node.next;
        if(node.next!=null){
            node.next.prev=node.prev;
        }
        
    }
}