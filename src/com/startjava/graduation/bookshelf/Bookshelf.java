package com.startjava.graduation.bookshelf;

import java.util.Arrays;
import java.util.Scanner;

public class Bookshelf {
    static final int CAPACITY = 10;
    private int countBooks;
    private Book[] bookshelf = new Book[CAPACITY];
    private int bookshelfLength;

    public int getCountBooks() {
        return countBooks;
    }

    public Book[] getBooks() {
        return Arrays.copyOf(bookshelf, countBooks);
    }

    public int getBookshelfLength() {
        return bookshelfLength;
    }

    public int getFreeShelves() {
        return (CAPACITY - countBooks);
    }

    public void add(Book book) {
        bookshelf[countBooks++] = book;
        if (book.getInfoLength() > bookshelfLength) {
            bookshelfLength = book.getInfoLength();
        }
    }

    public Book find(String title) {
        for(int i = 0; i < countBooks; i++) {
            if(bookshelf[i].getTitle().equals(title)){
                return bookshelf[i];
            }
        }
        return null;
    }

    public boolean delete(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (bookshelf[i].getTitle().equals(title)) {
                Book copyBook = bookshelf[i];
                System.arraycopy(bookshelf, i + 1, bookshelf, i, countBooks - i - 1);
                bookshelf[countBooks - 1] = null;
                countBooks--;
                if(copyBook.getInfoLength() == bookshelfLength) {
                    updateBookshelfLength();
                }
                return true;
            }
        }
        return false;
    }

    private void updateBookshelfLength() {
        bookshelfLength = 0;
        for (Book book : getBooks()) {
            if (book.getInfoLength() > bookshelfLength) {
                bookshelfLength = book.getInfoLength();
            }
        }
    }

    public void clear() {
        Arrays.fill(bookshelf, 0, countBooks, null);
        countBooks = 0;
    }
}