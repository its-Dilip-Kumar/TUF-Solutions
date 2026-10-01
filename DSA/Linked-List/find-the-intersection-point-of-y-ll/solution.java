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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null) return null;
        ListNode p1=headA;
        ListNode p2=headB;
        while(p1!=p2){
            p1=(p1==null) ? headB : p1.next;
            p2=(p2==null) ? headA : p2.next;
        }
        return p1;
    }
}
