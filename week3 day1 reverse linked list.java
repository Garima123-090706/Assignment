class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr=head,prev=null,tmp;
        while(curr!=null)
        {
            tmp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=tmp;
        }
        return prev;
    }
}
