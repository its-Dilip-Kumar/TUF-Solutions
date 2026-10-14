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
    public static ListNode findKth(ListNode head,int k){
        while(head!=null && k>1){
            head=head.next;
            k--;
        }
        return head;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode prevNode=null;
        ListNode nextNode=null;
        ListNode temp=head;
        while(temp!=null){
            ListNode kthNode=findKth(temp,k);
            if(kthNode==null){
                if(prevNode!=null){
                    prevNode.next=temp;
                    break;
                }
            }else{
                nextNode=kthNode.next;
                kthNode.next=null;
                ListNode reverseHead=reverse(temp);
                if(head==temp){
                    head=reverseHead;
                }else{
                    prevNode.next=reverseHead;
                }
                prevNode=temp;
                temp=nextNode;
            }
        }
        return head;
    }
}