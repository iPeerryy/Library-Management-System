package com.danielpractice.modulos;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private String id;
    private List<Book> borrowedBooks;

    public void setName(String name) {
        this.name = name;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void  borrowBook(Book book){
        if (book.isStatus()){
            book.borrowBook();
            borrowedBooks.add(book);
        }else{
            System.out.println(book.getTitle() + " is not available.");
        }
    }
    public void returnBook(Book book){
        if (borrowedBooks.contains(book)){
            book.returnBook();
            borrowedBooks.remove(book);
        } else {
            System.out.println("This books was not borrowed by " + name);
        }
    }
}
