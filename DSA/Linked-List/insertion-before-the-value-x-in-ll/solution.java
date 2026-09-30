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
    public ListNode insertBeforeX(ListNode head, int X, int val) {
        if(head==null) return null;
        if(head.data==X){
            ListNode node=new ListNode(val);
            node.next=head;
            return node;
        }

        ListNode temp=head;

        while(temp.next!=null && temp!=null && temp.next.data!=X){
            temp=temp.next;
        }

        if(temp!=null & temp.next!=null){
                    ListNode node=new ListNode(val);
        node.next=temp.next;
        temp.next=node;
        }

        return head;
    }
}