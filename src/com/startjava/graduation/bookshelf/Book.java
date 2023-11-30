package com.startjava.graduation.bookshelf;

public class Book {
    private String author;
    private String title;
    private String yearOfIssue;
    private int lengthOfBookInformation;
    private static final int BOOK_INFO = 3;
    private String[] bookInfo;

    public Book(String bookInformation) {
        bookInfo = bookInformation.split(", ");
        if (bookInfo.length != BOOK_INFO) {
            throw new RuntimeException("wrong format");
        }
        author = bookInfo[0];
        title = bookInfo[1];
        yearOfIssue = bookInfo[2];
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s", author, title, yearOfIssue);
    }

    //это длина строки?//
    public int getLengthOfBookInformation() {
        return lengthOfBookInformation;
    }

    public void setLengthOfBookInformation(int lengthOfBookInformation) {
        this.lengthOfBookInformation = lengthOfBookInformation;
    }
}
