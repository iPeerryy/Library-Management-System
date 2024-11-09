package com.danielpractice.modulos;

public class Book {
    private String author;
    private String title;
    private int isbn;
    private boolean status = true;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public void borrowBook(){
        if (status == false){
            System.out.println(title + " has been borrowed ");

        }else {
            System.out.println(title + " is already borrowed ");
        }


    }
    public void returnBook(){
        status = true;
        System.out.println(title + " has been returned");
    }

}
