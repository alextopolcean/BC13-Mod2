package de.telran.data;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int dateOfIssue;
    private int pages;

    public Book(String title, String author, int dateOfIssue, int pages) {
        this.title = title;
        this.author = author;
        this.dateOfIssue = dateOfIssue;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getDateOfIssue() {
        return dateOfIssue;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getDateOfIssue() == book.getDateOfIssue() &&
                getPages() == book.getPages() &&
                getTitle().equals(book.getTitle()) &&
                getAuthor().equals(book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getAuthor(), getDateOfIssue(), getPages());
    }

    @Override
    public String toString() {
        return "Book: " + title + ", " + author +
                ", dateOfIssue: " + dateOfIssue +
                ", pages: " + pages;
    }
}
