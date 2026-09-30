
/*Definition for Singly Linked List
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return null;
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        int nthFromStart=count-n+1;

        if(nthFromStart==1) return head.next;
        temp=head;
        for(int i=1;i<nthFromStart-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}