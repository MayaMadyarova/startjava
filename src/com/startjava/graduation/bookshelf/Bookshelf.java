package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    static final int CAPACITY = 10;
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
        for (int i = 0; i < countBooks; i++) {
            if (bookshelf[i].getTitle().equals(title)) {
                System.arraycopy(bookshelf, i + 1, bookshelf, i, countBooks - i - 1);
                bookshelf[countBooks - 1] = null;
                countBooks--;
                del = true;
                break;
            }
        }
        return del;
    }

    public void clear() {
        Arrays.fill(bookshelf, 0, countBooks, null);
        countBooks = 0;
    }

    public int getBookshelfLength() {
        int max = 0;
        for (Book book : getBooks()) {
            if (book.getInfoLength() > max) {
                max = book.getInfoLength();
            }
        }
        return max;
    }
}