package com.danielpractice.principal;

import com.danielpractice.modulos.Book;
import com.danielpractice.modulos.Library;
import com.danielpractice.modulos.Member;

public class Principal extends Book {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book();
        book1.setAuthor("Grabiel Garcia Marques");
        book1.setIsbn(1);
        book1.setTitle("Los amores de Juan");
        library.addBook(book1);
        Book book2 = new Book();
        book2.setTitle("Como ser millonario en un día");
        book2.setIsbn(2);
        book2.setAuthor("Pedro Henrique Ureña");
        library.addBook(book2);

        Member member1 = new Member();
        member1.setName("Jose Daniel");
        member1.setId("J28920");
        library.registerMember(member1);

        library.lendBook("Los amores de Juan", "J28920");
        library.receiveReturnedBook("Los amores de Juan","J28920");
    }
}
