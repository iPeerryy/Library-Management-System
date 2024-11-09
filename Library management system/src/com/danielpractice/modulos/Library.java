package com.danielpractice.modulos;

import java.awt.font.LineBreakMeasurer;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;

    public Library(){
        books = new ArrayList<>();
        members = new ArrayList<>();
    }



    public void addBook(Book book){
        books.add(book);
        System.out.println(book.getTitle() + " added to the librery.");
    }
    public Book findBookByTitle(String title){
        for (Book book : books){
            if (book.getTitle().equalsIgnoreCase(title)){
                return book;
            }
        }
        System.out.println(" Book not found.");
        return null;
    }
    public void registerMember(Member member){
        members.add(member);
        System.out.println("Member "+ member.getName() + " registered.");
    }
    public Member finMemberById(String id){
        for (Member member: members){
            if (member.getId().equals(id)){
                return member;
            }
        }
        System.out.println("Member not found.");
        return null;
    }

    public void lendBook(String title, String id) {
        Book book = findBookByTitle(title);
        Member member = finMemberById(id);

        if (member != null && book != null){
            member.borrowBook(book);
        }
    }
    public void receiveReturnedBook(String title, String id){
        Book book = findBookByTitle(title);
        Member member = finMemberById(id);

        if (member != null && book != null) {
            member.returnBook(book);
        }
    }
}
