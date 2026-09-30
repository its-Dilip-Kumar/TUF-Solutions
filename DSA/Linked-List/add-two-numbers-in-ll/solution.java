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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        int carry=0;
        while(temp1!=null || temp2!=null || carry!=0){
            int val1=(temp1!=null) ? temp1.data : 0;
            int val2=(temp2!=null) ? temp2.data : 0;
            int sum=val1+val2+carry;
            carry=sum/10;
            int digit=sum%10;
            curr.next=new ListNode(digit);
            curr=curr.next;
            if(temp1!=null){
                temp1=temp1.next;
            }
            if(temp2!=null){
                temp2=temp2.next;
            }
        }
        return dummy.next;
    }
}