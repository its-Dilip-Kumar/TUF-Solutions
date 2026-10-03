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
    public ListNode arrayToDoublyLinkedList(List<Integer> arr) {
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        for(int x:arr){
            ListNode temp=new ListNode(x);
            curr.next=temp;
            temp.prev=curr;
            curr=temp;
        }
         if (dummy.next != null) {
            dummy.next.prev = null;
        }
        return dummy.next;
    }
}