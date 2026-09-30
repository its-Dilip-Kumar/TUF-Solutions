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
    public ListNode insertAtKthPosition(ListNode head, int X, int K) {
        if(K==1){
            ListNode node=new ListNode(X);
            node.next=head;
            return node;
        }

        if(head==null) return null;

        ListNode temp=head;
        for(int i=1;i<K-1 && temp!=null;i++){
            temp=temp.next;
        }

        if(temp==null) return head;
        ListNode node=new ListNode(X);
        node.next=temp.next;
        temp.next=node;
        return head;

    }
}