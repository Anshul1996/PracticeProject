package com.practice.Inheritence;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

class Books{
    String BookName;
    String AuthorName;
    Books(String BookName,String AuthorName){
        this.BookName=BookName;
        this.AuthorName=AuthorName;
    }
}
class Library{
    private List<Books> bookList;
    Library(List<Books> bookList){
        this.bookList=bookList;
    }
    public  List<Books> getBookList(){
        return bookList;
    }
}
public class Composition {
    public static void main(String args[]) {
        Books b1 = new Books("Abc", "qwe");
        Books b2 = new Books("def", "rty");
        Books b3 = new Books("jkl", "opu");

        List<Books> ls = new ArrayList<Books>();
        ls.add(b1);
        ls.add(b2);
        ls.add(b3);

        Library l1= new Library(ls);
        List<Books> bks = l1.getBookList();
        for(Books s : bks){
            System.out.println("Book name is : "+s.BookName+" :: "+"Author Name is : "+s.AuthorName);
        }
    }
}
