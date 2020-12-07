package de.telran.application;

import de.telran.dao.Library;
import de.telran.dao.MyLibrary;
import de.telran.data.Book;

import java.util.ArrayList;
import java.util.Collections;

public class LibraryApp {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "Joan Rollings", 2005, 435);
        Book book2 = new Book("Winnie the Pooh", "Alex Milan", 1957, 256);
        Book book3 = new Book("Sherlock Holms", "Artur Conan Doyle", 1892, 388);
        Book book4 = new Book("Litle  Prince", "Saint-Exupery", 1938, 300);

        Library myLib = new Library(10);
        System.out.println(myLib.getSize() + " ---------------------------------");
        myLib.addBook(book1);
        myLib.addBook(book2);
        myLib.addBook(book3);
        myLib.addBook(book4);
        Book[] books = {book1, book2, book3, book4};
        System.out.println(myLib.getSize() + " ---------------------------------");
        myLib.display();
        myLib.addBook(new Book("War and Pece", "Lev Tolstoy", 1886, 678));
        System.out.println("-----------------------------------");
        myLib.display();
        System.out.println(myLib.getSize() + " ---------------------------------");
        myLib.deleteBook(book3);
        myLib.display();
        System.out.println("-----------------------------------");
        myLib.searchBookByAuthor("Alex Milan");
        myLib.searchBookByAuthor("Aliev P.");
        System.out.println("-----------------------------------");
        myLib.searchBookByTitle("Harry Potter");
        myLib.searchBookByTitle("Litle  Prince");

        myLib.searchThickestBook(books);

        System.out.println();
        System.out.println("new, new, new, new, new, new, new, new, new, new, new, new, new");
        MyLibrary library = new MyLibrary();

        /*
        library.getLibraryBooks().add(book1);
        System.out.println(library.getLibraryBooks().size());
        library.getLibraryBooks().add(book2);
        System.out.println(library.getLibraryBooks().size());
        library.getLibraryBooks().add(book3);
        System.out.println(library.getLibraryBooks().size());
         */

        Collections.addAll(library.getLibraryBooks(), myLib.getBooks());

        System.out.println(library.getLibraryBooks().size());

        ((ArrayList) library.getLibraryBooks()).trimToSize();
        //System.out.println(library.getLibraryBooks());
        for (Book b : library.getLibraryBooks()) {
            if (b != null)
                System.out.println(b);
        }


    }
}
