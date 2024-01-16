package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    static final int MAX = 10;
    private int countBooks;
    private Book[] bookshelf = new Book[MAX];

    public int getCountBooks() {
        return countBooks;
    }

    public Book[] getBookshelf() {
        return Arrays.copyOf(bookshelf, countBooks);
    }

    public int getFreeShelves() {
        return (MAX - countBooks);
    }

    public Book add(Book book) {
        bookshelf[countBooks++] = book;
        return book;
    }

    public Book find(String title) {
        Book book = null;
        for(int i = 0; i < countBooks; i++) {
            if(bookshelf[i].getTitle().equals(title)) {
                book = bookshelf[i];
            }
        }
        return book;
    }

    public int delete(String title) {
        int a = 0;
        for(int i = 0; i < countBooks; i++) {
            if(bookshelf[i].getTitle().equals(title)) {
                System.arraycopy(bookshelf, i + 1, bookshelf, i, countBooks - i - 1);
                countBooks--;
                a = 1;
            }
        }
        return a;
    }

    public void receiveAllBooks() {
        System.out.println("Number of books in the bookshelf - " + getCountBooks());
        System.out.println("Number of free shelves - " + getFreeShelves());
    }

    public void clear() {
        Arrays.fill(bookshelf, 0, countBooks, null);
        countBooks = 0;
        System.out.println("The bookshelf is empty");
    }
}