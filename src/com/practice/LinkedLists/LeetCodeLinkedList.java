package com.practice.LinkedLists;

class LeetCodeLinkedList {
    class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
            next=null;
        }
    }
    Node head;
    /** Initialize your data structure here. */
    public LeetCodeLinkedList() {

    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        Node curr=head;
        int k=0;
        while(curr != null){
            if(k == index){
                return curr.data;
            }
            curr=curr.next;
            k++;
        }
        return -1;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        if(head == null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        Node curr=head;
        if(head == null){
            head=newNode;
            return;
        }
        while(curr.next != null){
            curr=curr.next;
        }
        curr.next=newNode;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        Node newNode = new Node(val);
        Node curr=head;

        //if(get(index) == -1) return;
        if(index == 0){
            addAtHead(val);
        }
        int k=1;
        while(k < index && curr != null){
            curr=curr.next;
            k++;


            System.out.print(k+"::"+curr.data+",");
        }
        if(k == index && curr.next == null ){
            curr.next=newNode;
        }else if(k == index && curr.next != null){
            newNode.next=curr.next;
            curr.next=newNode;
        }
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        // if(get(index) == -1) return;
        Node curr= head;
        if(index == 0){
            head=head.next;
            return;
        }
        int k=1;
        while(k < index && curr != null){
            curr=curr.next;
            k++;
        }
        if(curr.next != null)
            curr.next=curr.next.next;
    }

    public void printLinkedList(){
        Node curr = head;
        if(head == null){
            System.out.print("Empty Linked List");
        }
        while(curr != null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
    public static void main(String args[]){

      /*  ["MyLinkedList","addAtHead","addAtHead","addAtHead","addAtIndex","deleteAtIndex",
                "addAtHead","addAtTail",   "get","addAtHead","addAtIndex","addAtHead"]
[[],[7],[2],[1],[3,0],[2],[6],[4],    [4], [4],[5,0],[6]]*/
        LeetCodeLinkedList myLinkedList = new LeetCodeLinkedList();
        myLinkedList.addAtHead(7);
        myLinkedList.addAtHead(2);
        myLinkedList.addAtHead(1);
        myLinkedList.printLinkedList();
        myLinkedList.addAtIndex(3, 0);
        myLinkedList.printLinkedList();// linked list becomes 1->2->3
        myLinkedList.deleteAtIndex(2);
        myLinkedList.printLinkedList();
        myLinkedList.addAtHead(6);
        myLinkedList.printLinkedList();
        myLinkedList.addAtTail(4);
        myLinkedList.printLinkedList();
        System.out.println("---"+myLinkedList.get(4));
        myLinkedList.addAtHead(4);


        myLinkedList.addAtIndex(5, 0);

        myLinkedList.addAtHead(6);

        myLinkedList.printLinkedList();// return 2

    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */