/*Definition of singly linked list:
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
 */

class Solution {
    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode nex=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp=reverse(slow.next);
        ListNode p1=head;
        ListNode p2=temp;
        while(p1!=null && p2!=null){
            if(p1.val==p2.val){
                p1=p1.next;
                p2=p2.next;
            }else{
                return false;
            }
        }
        return true;
    }
}