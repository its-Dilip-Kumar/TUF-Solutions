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
    public List<Integer> LLTraversal(ListNode head) {
        if(head==null) return new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        ListNode temp=head;

        while(temp.next!=null){
            ans.add(temp.data);
            temp=temp.next;
        }
        ans.add(temp.data);
        return ans;

    }
}