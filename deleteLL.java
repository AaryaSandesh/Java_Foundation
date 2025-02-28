public class deleteLL {
    public static class Node{
        int val;
        Node next;
        Node(int x){
            val=x;
        }
    }
    public static void main(String[] args) {
           Node n1 = new Node(10);
           Node n2 = new Node(20);
           Node n3 = new Node(30);
           Node n4 = new Node(40);
           Node n5 = new Node(50);
           n1.next = n2;
           n2.next = n3;
           n3.next = n4;
           n4.next = n5;
           Node head = n1;
//	        Scanner scn = new Scanner(System.in);
//	        int k = scn.nextInt();
//	       head= deleteHead(head);
           head=deleteLast(head);
          print(head);
}
    public static Node deleteHead(Node head) {
        head=head.next;
        return head;
    }
    public static void print(Node head) {
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    public static Node deleteLast(Node head) {
         Node temp=head;
         if(temp.next==null) {
            return null;
         }
        while(temp.next.next!=null) {
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
}
