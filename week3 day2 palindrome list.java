/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast,slow;
        fast=slow=head;
        if(head==null){
            return true;
        }
        while (fast.next!=null && fast.next.next!=null){
            slow= slow.next;
            fast=fast.next.next;
        }
        ListNode temp= reverse(slow.next);
        while(temp!=null){
            if(temp.val!=head.val){
                return false;
            }
            else{
                temp =temp.next;
                head=head.next;
            }
        }
        return true;
    }
    public ListNode reverse(ListNode temp){
        ListNode it,itp,itn;
        it=temp;
        itp= null;
        while(it!=null){
            itn=it.next;
            it.next=itp;
            itp=it;
            it=itn;
        }
        return itp;
    }
}
