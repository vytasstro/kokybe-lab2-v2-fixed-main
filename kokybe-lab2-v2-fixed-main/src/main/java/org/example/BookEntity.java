package org.example;

public class BookEntity {
    private String bookName;
    private String authorName;
    private int publishedYear;
    private float bookPrice;

    public BookEntity(String n, String a, int y, float p) {
        this.bookName = n;
        this.authorName = a;
        this.publishedYear = y;
        this.bookPrice = p;
    }

    public String gimmeBookName() {
        return bookName;
    }

    public String gimmeAuthorName() {
        return authorName;
    }

    public int gimmePublishedYear() {
        return publishedYear;
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
        this.publishedYear = y;
    }

    public void alterBookPrice(float p) {
        this.bookPrice = p;
    }

    public void showBookDetails() {
        System.out.println("Book: " + bookName);
        System.out.println("Author: " + authorName);
        System.out.println("Published in: " + publishedYear);
        System.out.println("Cost: $" + bookPrice);
    }

    public static void main(String[] args) {
        BookEntity b = new BookEntity("Java Programming", "John Doe", 2022, 29.99f);
        b.showBookDetails();
        b.alterBookPrice(34.99f);
        b.showBookDetails();
    }
}
