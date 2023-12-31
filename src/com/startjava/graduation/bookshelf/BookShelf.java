package com.startjava.graduation.bookshelf;

public class BookShelf {
    private static int numberOfBooksOnTheShelf = 0;
    static final int BOOKSHELF_LIMIT = 10;
    private static String[] bookShelf = new String[BOOKSHELF_LIMIT];
    private Book book;

    public static void Add(Book book) {
        if(numberOfBooksOnTheShelf == BOOKSHELF_LIMIT) {
            System.out.println("The bookshelf is full. Delete some book.");
        } else {
            bookShelf[numberOfBooksOnTheShelf++] = book.toString();
        }
    }

    public static void Find(String title) {
        for(int i = 0; i < numberOfBooksOnTheShelf; i++) {
            String[] book = new String[3];
            book = bookShelf[i].split(", ");
            if(book[1].equals(title)) {
                System.out.println(book[1] + " has been found");
                System.out.println("|" + book[0] + ", " + book[1] + ", " + book[2] + " |");
                System.out.println("|---------------------------------------|");
            }
        }
    }

    public static void Delete(String title) {
        for(int i = 0; i < numberOfBooksOnTheShelf; i++) {
            String[] book = bookShelf[i].split(", ");
            if(book[1].equals(title)) {
                System.out.println(book[1] + " has been found and deleted");
                for (int j = i; j < numberOfBooksOnTheShelf; j++) {
                    bookShelf[j] = bookShelf[i + 1];
                }
                numberOfBooksOnTheShelf--;
            }
        }
    }

    public static void ReceiveNumberOfBooks() {
        System.out.println("In the bookshelf - " + numberOfBooksOnTheShelf + " books.");
    }

    public static void ReceiveNumberOfFreeShelves() {
        System.out.println("Free shelves - " + (BOOKSHELF_LIMIT - numberOfBooksOnTheShelf));
    };

    public static void ReceiveAllBooks() {
        ReceiveNumberOfBooks();
        ReceiveNumberOfFreeShelves();
        for(int i = 0; i < numberOfBooksOnTheShelf; i++) {
            System.out.println("|" + bookShelf[i] + "|");
            System.out.println("|---------------------------------------- |");
        }
    }

    public static void Clean() {
        for(int i = 0; i < numberOfBooksOnTheShelf; i++) {
            bookShelf[i] = null;
        }
        numberOfBooksOnTheShelf = 0;
        System.out.println("The bookshelf is empty");
    }
}
