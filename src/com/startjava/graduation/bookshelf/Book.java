package com.startjava.graduation.bookshelf;

public class Book {
    private String author;
    private String title;
    private String year;
    private int infoLength;

    public Book(String author, String title, String year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getInfoLength() {
        return toString().length();
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s", author, title, year);
    }
}