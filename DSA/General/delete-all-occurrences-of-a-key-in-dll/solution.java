/*Definition of doubly linked list:
class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    ListNode() {
        val = 0;
        next = null;
        prev = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
        prev = null;
    }

    ListNode(int data1, ListNode next1, ListNode prev1) {
        val = data1;
        next = next1;
        prev = prev1;
    }
}
 */

class Solution {
    public ListNode deleteAllOccurrences(ListNode head, int target) {
        // Dummy node banao
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        if (head != null) {
            head.prev = dummy;
        }

        ListNode temp = head;

        while (temp != null) {
            if (temp.val == target) {
                // Node delete karo
                ListNode prevNode = temp.prev;
                ListNode nextNode = temp.next;

                prevNode.next = nextNode;
                if (nextNode != null) {
                    nextNode.prev = prevNode;
                }

                temp = nextNode;   // Aage badho
            } else {
                temp = temp.next;
            }
        }

        // Naya head return karo
        ListNode newHead = dummy.next;
        if (newHead != null) {
            newHead.prev = null;
        }

        return newHead;
    }
}
