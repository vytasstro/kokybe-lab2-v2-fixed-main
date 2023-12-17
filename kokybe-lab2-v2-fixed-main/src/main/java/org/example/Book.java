package org.example;

public class Book {
    private String bookName;


    private String authorName;
    private int publishedDate;
    private int bookPrice;

    public Book(String n, String a, int y, float p) {
        this.bookName = n;
        this.authorName = a;
        this.publishedDate = y;
    }

    public String givBooksName() {
        return bookName;
    }

    public String AuthorName() {
        return authorName;
    }

    public int gimmePublishedYear() {
        return publishedDate;
    }

    public float gimmeBookPrice() {
        return bookPrice;
    }

    public void alterBookName(String n) {
        this.bookName = n;
    }

    public void alterAuthorName(String a) {
        this.authorName = a;
    }

    public void alterPublishedYear(int y) {
        this.publishedDate = y;
    }

    public void alterBookPrice(int p) {
        this.bookPrice = p;
    }

    public void showBookDetails() {
        System.out.println("Book: " + bookName);
            System.out.println("Author: " + authorName);
            System.out.println("Published in: " + publishedDate);
        System.out.println("Cost: $" + bookPrice);
    }

    public static void main(String[] args) {
        Book b = new Book("Java Programming", "John Doe", 2022, 29.99f);
            b.showBookDetails();
        b.alterBookPrice(34.99f);
        b.showBookDetails();
    }
}
