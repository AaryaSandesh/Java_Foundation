import java.util.Scanner;

public class LinkedListBasics {
   public static class Node{
		int val;
		Node next;
		Node(int x){
			 val=x;
		}
		
	}
	 public static void main(String[] args) {
		Node n1=new Node(10);
		Node n2=new Node(20);
		Node n3=new Node(30);
		Node n4=new Node(40);
		Node n5=new Node(50);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		Node head=n1;
		Scanner scn=new Scanner(System.in);
		 
		int k=scn.nextInt();
//	   head=insertFirst(head,10);
//		   
//		head=insertLast(null,k);
		head=insert(head,k,90);
		 print(head);
		
	}
	 public static int size(Node head) {
		 int count=0;
		 Node temp=head;
		 while(temp!=null) {
			 count++;
			 temp=temp.next;
		 }
		 return count;
	 }
	 public static void print(Node head) {
		 Node temp=head;
		 while(temp!=null) {
			 System.out.println(temp.val);
			 temp=temp.next;
		 }
	 }
	 public static Node insertFirst(Node head,int val) {
		 Node n1=new Node(val);
		 n1.next=head;
		 head=n1;
		  return n1;
	 }
	 public static Node insertLast(Node head,int val) {
		 
		 if (head==null) {
			 Node n1=new Node(val);
			 return n1;
			  		 }
		 else {
		 Node n1=new Node(val);

		 Node temp=head;
		 while(temp.next!=null) {
			 temp=temp.next;
		 }
		 temp.next=n1;
		
		 }
		 return head;
	 }
	 public static Node insert(Node head,int k,int val) {
		 if (head==null || k==0) {
			  return insertFirst(head,val);
			  		 } 
		 
		 else if(k>=size(head)) {
			 return insertLast(head,val);
		 }
	 else {
		 Node n1=new Node(val);
		 Node temp=head;
		 for(int i=0;i<k-1;i++) {
			 temp=temp.next;
		 }
		 Node temp1=temp.next;
		 temp.next=n1;
		 n1.next=temp1;
	 }
		  return head;
	 }  
}
