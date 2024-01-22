package com.startjava.graduation.bookshelf;

import java.util.Arrays;
import java.util.Scanner;

public class Bookshelf {
    private static Scanner scanner = new Scanner(System.in);
    static final int CAPACITY = 10;
    private int countBooks;
    private Book[] bookshelf = new Book[CAPACITY];
    private int bookshelfLength = 0;

    public int getCountBooks() {
        return countBooks;
    }

    public Book[] getBooks() {
        return Arrays.copyOf(bookshelf, countBooks);
    }

    public int getBookshelfLength() {
        for (Book book : getBooks()) {
            if (book.getInfoLength() > bookshelfLength) {
                bookshelfLength = book.getInfoLength();
            }
        }
        return bookshelfLength;
    }

    public int getFreeShelves() {
        return (CAPACITY - countBooks);
    }

    public void save() {
        if(getCountBooks() >= CAPACITY) {
            System.out.println("The bookshelf is full. Delete some book.");
            scanner.nextLine();
        } else {
            System.out.println("Enter author");
            String author = scanner.nextLine();
            String title = enterTitle();
            System.out.println("Enter year of issue");
            String year = scanner.nextLine();
            bookshelf[countBooks++] = new Book(author, title, year);
            displayBookshelf();
        }
    }

    public static String enterTitle() {
        System.out.println("Enter title");
        return scanner.nextLine();
    }

    public void displayBookshelf() {
        System.out.println("\nNumber of books - " + getCountBooks() + ". Free shelves - " +
                +getFreeShelves());
        for (Book book : getBooks()) {
            System.out.println("|" + book.toString() + " ".repeat(getBookshelfLength()-book.getInfoLength()) + "|");
            System.out.println("|" + "-".repeat(getBookshelfLength() - 1) + "-|");
        }
    }

    public void find() {
        for(int i = 0; i < countBooks; i++) {
            if(bookshelf[i].getTitle().equals(enterTitle())) {
                System.out.println(bookshelf[i].toString());
                break;
            } else {
                System.out.println("Book is not available.");
                break;
            }
        }
    }

    public void delete() {
        if(isDeleted() == false) {
            System.out.println("Book is not available.");
        } else {
            System.out.println("Book has been deleted");
            displayBookshelf();
        }
    }

    public boolean isDeleted() {
        for (int i = 0; i < countBooks; i++) {
            if (bookshelf[i].getTitle().equals(enterTitle())){
                System.arraycopy(bookshelf, i + 1, bookshelf, i, countBooks - i - 1);
                bookshelf[countBooks - 1] = null;
                countBooks--;
                getBookshelfLength();
                return true;
            }
        }
        return false;
    }

    public void clear() {
        Arrays.fill(bookshelf, 0, countBooks, null);
        countBooks = 0;
    }
}