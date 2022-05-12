package basics.recursion.linkedlist;

import java.util.LinkedList;

import programmingpaathsaala.tp04arrays.insertion;

public class reversell {
    static Node head;

    static class Node{
        int data;
        Node next;


        Node(int d){
            data=d;
            next=null;
        }
    }

    
    
    public static void main(String[] args) {
        reversell list=new reversell();
        list.head=new Node(25);
        list.head.next=new Node(35);
        list.head.next.next=new Node(45);
        list.head.next.next.next=new Node(55);

        Node abc=movelast(head);
        printlist(abc);

        System.out.println("list=");
        printlist(head);

        Node finhead=reverselist(head,2);

        System.out.println("After reverse");
        printlist(finhead);

       Node  reversehead=reverselist2(finhead);

       printlist(reversehead);

       
    
}



    private static Node movelast(Node head2) {
        Node prev=null;
        Node curr=head2;
        while(curr.next!=null){
            prev=curr;
            curr=curr.next;

        }
        prev.next=null;
        curr.next=head2;
        head2=curr;

        return head2;
    }



    private static Node reverselist2(Node finhead) {
            if(finhead==null || finhead.next==null) return finhead;

            Node node=reverselist2(finhead.next);
            finhead.next.next=finhead;
            finhead.next=null;
            return node;


    }



    private static Node reverselist(Node head2, int i) {

        Node curr=head2;
        Node prev=null;
        Node next=null;
        int x=0;
        while(x<i && curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            x++;
        }
        if(head2!=null)
        head2.next=reverselist(next, i);
        return prev;
    }



    private static void printlist(Node head2) {
        while(head2!=null){
            System.out.print(head2.data+" --> ");
            head2=head2.next;
        }
        System.out.println("NULL");
    }}
