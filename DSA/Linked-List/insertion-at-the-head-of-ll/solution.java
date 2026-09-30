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
    public ListNode insertAtHead(ListNode head, int X) {
        if(head==null){
            return new ListNode(X);
        }
        ListNode temp=new ListNode(X);
        temp.next=head;
        return temp;
    }
}