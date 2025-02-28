public class reverseLL {
    //Exact question lies on leetcode . 
    // The answer type is defined by leetcode question
    // https://leetcode.com/problems/reverse-linked-list/
    public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
         ListNode temp1=curr.next;
         curr.next=prev;
         prev=curr;
         curr=temp1;
        }
        head=prev;
        return head; 
     }
}
