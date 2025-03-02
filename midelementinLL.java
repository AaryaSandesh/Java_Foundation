public class midelementinLL {
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
           Node n6 = new Node(60);
           n1.next = n2;
           n2.next = n3;
           n3.next = n4;
           n4.next = n5;
           n5.next=n6;
           Node head=n1;
        
          Node s=mid(head);
          System.out.println(s);
    }
    public static Node mid(Node head) {
        Node f=head;
        Node s=head;
        while(f.next!=null && f.next.next!=null) {
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
}
