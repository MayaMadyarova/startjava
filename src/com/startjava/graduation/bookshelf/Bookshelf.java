package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    static final int CAPACITY = 3;
    private int countBooks;
    private Book[] bookshelf = new Book[CAPACITY];

    public int getCountBooks() {
        return countBooks;
    }

    public Book[] getBooks() {
        return Arrays.copyOf(bookshelf, countBooks);
    }

    public int getFreeShelves() {
        return (CAPACITY - countBooks);
    }

    public Book add(Book book) {
        bookshelf[countBooks++] = book;
        return book;
    }

    public Book find(String title) {
        for(int i = 0; i < countBooks; i++) {
            if(bookshelf[i].getTitle().equals(title)) {
                return bookshelf[i];
            }
        }
        return null;
    }

    public boolean delete(String title) {
        boolean del = false;
        if (bookshelf[countBooks - 1].getTitle().equals(title)) {
            bookshelf[countBooks - 1] = null;
            countBooks--;
            del = true;
        } else {
            for (int i = 0; i < countBooks - 1; i++) {
                if (bookshelf[i].getTitle().equals(title)) {
                    System.arraycopy(bookshelf, i + 1, bookshelf, i, countBooks - i - 1);
                    bookshelf[countBooks - 1] = null;
                    countBooks--;
                    del = true;
                    break;
                }
            }
        }
        return del;
    }

    public void clear() {
        Arrays.fill(bookshelf, 0, countBooks, null);
        countBooks = 0;
        System.out.println("The bookshelf is empty");
    }
}