package de.telran.dao;

import de.telran.data.Book;

public class Library {
    private Book[] books;
    private int size;

    public Library(int capacity) {
        books = new Book[capacity];
        size = 0;
    }
    // Library library = new Library(60);
    // library.size -> 0

    public int getSize() {
        return size;
    }

    public boolean addBook(Book book) {
        if (size < books.length) {
            books[size] = book;
            size++;
            return true;
        }
        return false;
    }

    public Book[] getBooks() {
        return books;
    }

    public boolean deleteBook(Book book) {
        for (int i = 0; i < size; i++) {
            if (books[i].equals(book)) {
                books[i] = books[size - 1];
                size--;
                return true;
            }

        }
        return false;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }

    }


    public void searchBookByAuthor(String author) {
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().equalsIgnoreCase(author)) {
                flag = true;
                System.out.println(books[i]);
            }

        }
        if (!flag) {
            System.out.println("Book not found!");
        }
    }

    public void searchBookByTitle(String title) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                found = true;
                System.out.println(books[i]);
            }
        }
        if (!found) {
            System.out.println("Book not found");
        }
    }
    public void searchThickestBook(Book[] books) {
        Book thickestBook = books[0];
        for (int i = 0; i < books.length; i++) {
            if (books[i].getPages() > thickestBook.getPages()) {
                thickestBook = books[i];
            }
        }
        System.out.println("The thickest " + thickestBook);
    }

}
