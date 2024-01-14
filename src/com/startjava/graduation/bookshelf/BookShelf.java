package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class BookShelf {
    private int countBooks = 0;
    private Book[] bookShelf1 = new Book[10];

    public Book[] getBookShelf1() {
        return bookShelf1;
    }

    public int getCountBooks() {
        return countBooks;
    }

    public void add(Book book) {
        if(countBooks == 10) {
            System.out.println("The bookshelf is full. Delete some book.");
        } else {
            bookShelf1[countBooks++] = book;
        }
    }

    public void find(String title) {
        for(int i = 0; i < countBooks; i++) {
            if(bookShelf1[i].getTitle().equals(title)) {
                System.out.println(bookShelf1[i] + " has been found");
            } else {
                System.out.println("The book is not available on the shelf " + (i + 1));
            }
        }
    }

    public void delete(String title) {
        for(int i = 0; i < countBooks; i++) {
            if(bookShelf1[i].getTitle().equals(title)) {
                System.out.println(bookShelf1[i] + " has been found and deleted");
                System.arraycopy(bookShelf1, i + 1, bookShelf1, i, countBooks--);
            }
        }
    }

    public void receiveAllBooks() {
        countBooks();
        countFreeShelves();
    }

    public void countBooks() {
        System.out.println("In the bookshelf - " + countBooks + " books.");
    }

    public void countFreeShelves() {
        System.out.println("Free shelves - " + (10 - countBooks));
    }

    public void clear() {
        Arrays.fill(bookShelf1, null);
        countBooks = 0;
        System.out.println("The bookshelf is empty");
    }
}
