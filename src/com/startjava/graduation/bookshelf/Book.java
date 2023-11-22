package com.startjava.graduation.bookshelf;

import java.util.Date;

public class Book {
    private String author;
    private String title;
    private String yearOfIssue;
    private int lengthOfBookInformation;

    public Book(String bookInformation) {
        String[] bookInfo = new String[3];
        try {
            bookInfo = bookInformation.split(", ");
        } catch(RuntimeException e) {
            System.out.println("wrong format");
        }
        this.author = bookInfo[0];
        this.title = bookInfo[1];
        this.yearOfIssue = bookInfo[2];
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s", author, title, yearOfIssue);
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setName(String title) {
        this.title = title;
    }

    public String getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(String yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public int getLengthOfBookInformation() {
        return lengthOfBookInformation;
    }

    public void setLengthOfBookInformation(int lengthOfBookInformation) {
        this.lengthOfBookInformation = lengthOfBookInformation;
    }
}
