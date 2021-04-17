package com.practice.LinkedLists;

public class LinkedLists {
    public static class Node{
       private final int data;
       private  Node next;
        public Node(int d){
            data=d;
            next=null;
        }
        public Node(int d ,Node n){
            data=d;
            next=n;
        }
    }
    Node head;
    private  int size =0;
    public void addFirst(int val){
        head = new Node(val,head);
        size++;
    }
    public void addMiddle(int val,int pos){
        Node curr=head;
        int currpos=1;
        while(currpos != pos && curr != null){
            curr=curr.next;
            currpos++;
        }
        Node newNode = new Node(val,curr.next);
        curr.next=newNode;
    }
    public void addLast(int val){
        Node newNode = new Node(val,null);
        Node curr=head;
        if(isEmpty(curr)) {
            head = newNode;
            return;
        }
            while (curr.next != null){
                curr=curr.next;
            }
            curr.next=newNode;

    }
   public void sortedInsert(int val){
        Node curr = head;
        Node newNode = new Node(val,null);
        if(curr == null || curr.data > val)
        {
            newNode.next=head;
            head=newNode;
            return;
        }
        while(curr.next != null && curr.next.data < val){
            curr=curr.next;
        }
        newNode.next=curr.next;
        curr.next=newNode;
   }
   public boolean findElement(int val){
        Node curr=head;
        if(isEmpty(curr))
            return false;
        while(curr != null){
            if(curr.data == val)
                return true;
            curr=curr.next;
        }
        return false;
   }
  public void  deleteFirst(){
        if(isEmpty(head))
        {
            System.out.println("List is empty");
            return;
        }
        head=head.next;
        size--;
  }
  public  void deleteLast(){
        Node curr=head;
        if(isEmpty(curr)){
            System.out.println("List is Empty");
        }
        while(curr.next.next != null){
            curr=curr.next;
        }
        curr.next=null;
        size--;
    }
    public void deleteNode(int val){
        Node curr=head;
        if(isEmpty(curr)){
            System.out.println("List is Empty");
        }
        if(head.data == val)
        {
            head=null;
            return;
        }
        while(curr.next != null){
            if(curr.next.data == val){
               curr.next=curr.next.next;
                size--;
                return;
            }
            curr=curr.next;
        }
    }
    public void deleteAllOccurence(int val){
        Node curr=head;
        while(curr != null && curr.data == val){
            head=head.next;
            curr=head;
        }
        while(curr != null){
            if(curr.next != null && curr.next.data == val){
                curr.next=curr.next.next;
            }else{
                curr=curr.next;
            }
        }
    }
    public void deleteLinkedList(){
        head=null;
        size=0;
    }
    public void reverseLinkedList(){
        Node curr=head;
        Node prev=null;
        Node next=null;
        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head = prev;
    }
    public void printList(){
        Node curr=head;
       if(isEmpty(curr)){
           System.out.println("Empty List");
           return;
       }
       while(curr != null){
           System.out.print(curr.data+" ");
           curr=curr.next;
       }
    }
    public void removeDuplicate(){
        Node curr = head;
        if(isEmpty(curr)){
            System.out.println("Empty List");
            return;
        }
        if(curr.next != null && curr.data == curr.next.data){
            curr.next=curr.next.next;
        }
        else{
            curr=curr.next;
        }
    }
    public boolean isEmpty(Node n){
        return n == null;
    }
    public int  size(){
     return size;
    }
}
