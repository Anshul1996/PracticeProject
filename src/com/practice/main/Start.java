package com.practice.main;

import com.practice.Lambda.Person;
import com.practice.LinkedLists.LinkedLists;
import com.practice.multithreading.UsingRunnable;
import com.practice.multithreading.UsingThreadClass;
import com.practice.searching.Searching;

import java.text.Collator;
import java.util.*;

public class Start {
    public static void main(String args[]){
      //System.out.print(Class.forName());
     /* for(int i=0;i<8;i++){
         // UsingThreadClass th1 =new UsingThreadClass();
          UsingRunnable th1 = new UsingRunnable();
          Thread th =new Thread(th1);
          th.start();
      }
*/
     // int[] SortedArray = new int[]{1,2,3,5,7,8,9,11};
     // Integer[] UnSortedArray =new Integer[]{4,1,6,7,8,3,9,2};
    /*  List<Integer> ll= Arrays.asList(UnSortedArray);
      Collections.sort(ll);
      System.out.println(ll);
      Arrays.sort(UnSortedArray);
      System.out.print(Arrays.toString(UnSortedArray));
      Arrays.sort(UnSortedArray, Collections.reverseOrder());
        System.out.print(Arrays.toString(UnSortedArray));*/

      /*  HashSet<Integer> hs=new LinkedHashSet<>(Arrays.asList(UnSortedArray));
        List<Integer> ls = new ArrayList<>(hs);
        System.out.println(ls);
        Collections.sort(ls);
        hs= new LinkedHashSet<>(ls);
        System.out.println(hs);

        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(56,"Anshul");
        hm.put(23,"Akshit");
        hm.put(12,"Atul");
        hm.put(67,"Ankush");
        hm.put(67,"Anil");*/

      //  TreeMap<Integer,String> tm =new TreeMap<>(hm);
       // System.out.println(tm);


   /*   int[] Garray = new int[]{4,1,2,1,2};*/
        Searching sh = new Searching();
        System.out.println( sh.strStr("hello","ll"));

       /* System.out.println("Index is ::"+sh.LinearUnSortedSearch(UnSortedArray,9));
        System.out.println("Index is ::"+sh.LinearSortedSearch(SortedArray,8));
        System.out.println("Index is ::"+sh.BinarySearchIterative(SortedArray,9));
        System.out.println("Index is ::"+sh.BinarySearchRecursive(SortedArray,9,0,SortedArray.length-1));*/
        //sh.printDuplicate(Garray);
        //sh.printDuplicate1(Garray);
       /* LinkedLists ls=new LinkedLists();
        ls.addLast(5);
        ls.addLast(4);
        ls.addLast(3);
        ls.addLast(2);
        ls.addLast(3);
        ls.addLast(6);
        ls.addLast(3);
        ls.printList();*/
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
      //  System.out.println();
       // ls.reverseLinkedList();
       // ls.printList();


     /* List<Person> ls = new ArrayList<>();
      ls.add(new Person("Rishab","Pant",23));
      ls.add(new Person("Pritvi","Shaw",21));
      ls.add(new Person("Kagiso","Rabada",29));
      Comparator com =new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
          if(o1.getAge() > o2.getAge())
            return 1;
          else
            return -1;

        }
      };
      Collections.sort(ls,com);
       ls.forEach(p->System.out.println(p.getAge()));

*/
       
    }
}

