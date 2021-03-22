package com.practice.main;

import com.practice.LinkedLists.LinkedLists;
import com.practice.multithreading.UsingRunnable;
import com.practice.multithreading.UsingThreadClass;
import com.practice.searching.Searching;

public class Start {
    public static void main(String args[]){

     /* for(int i=0;i<8;i++){
         // UsingThreadClass th1 =new UsingThreadClass();
          UsingRunnable th1 = new UsingRunnable();
          Thread th =new Thread(th1);
          th.start();
      }
*/
     // int[] SortedArray = new int[]{1,2,3,5,7,8,9,11};
      //int[] UnSortedArray =new int[]{4,1,6,7,8,3,9,2};
      //int[] Garray = new int[]{1,4,6,2,1,2,5,7,8,5,4};
       // Searching sh = new Searching();
       /* System.out.println("Index is ::"+sh.LinearUnSortedSearch(UnSortedArray,9));
        System.out.println("Index is ::"+sh.LinearSortedSearch(SortedArray,8));
        System.out.println("Index is ::"+sh.BinarySearchIterative(SortedArray,9));
        System.out.println("Index is ::"+sh.BinarySearchRecursive(SortedArray,9,0,SortedArray.length-1));*/
        //sh.printDuplicate(Garray);
        //sh.printDuplicate1(Garray);
        LinkedLists ls=new LinkedLists();
        ls.addLast(5);
        ls.addLast(4);
        ls.addLast(3);
        ls.addLast(2);
        ls.addLast(3);
        ls.addLast(6);
        ls.addLast(3);
        ls.printList();
        //System.out.println();
      //  ls.deleteLinkedList();;
       /* ls.sortedInsert(9);
        ls.printList();
        System.out.println("Element present::"+ls.findElement(5));
        System.out.println("Element present::"+ls.findElement(0));
        ls.deleteFirst();
        ls.deleteFirst();
        ls.printList();
        ls.deleteLast();*/
        //ls.deleteNode(5);
       // ls.deleteAllOccurence(3);
        System.out.println();
        ls.reverseLinkedList();
        ls.printList();
    }
}
