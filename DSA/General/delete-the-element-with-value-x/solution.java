/*
Definition of singly linked list:
class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}
*/

class Solution {
    public ListNode deleteNodeWithValueX(ListNode head, int X) {
        if(head==null) return null;
        if(head.data==X){
            return head.next;
        }
        ListNode temp=head;
        while(temp.next!=null && temp.next.data!=X){
            temp=temp.next;
        }
        
        if(temp.next!=null){
            temp.next=temp.next.next;
        }

        return head;
    }
}