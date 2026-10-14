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
    public ListNode deleteKthElement(ListNode head, int k) {
        if(head==null || k<=0) return head;
        if(k==1){
            head=head.next;
            if(head!=null){
                head.prev=null;
            }
            return head;
        }
        ListNode temp=head;
        while(temp!=null && k>1){
            temp=temp.next;
            k--;
        }

        temp.prev.next=temp.next;
        if(temp.next!=null){
            temp.next.prev=temp.prev;
        }
        

        return head;

    }
}