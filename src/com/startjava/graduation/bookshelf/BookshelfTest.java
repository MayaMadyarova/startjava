package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    private static Scanner scanner = new Scanner(System.in);
    private static Bookshelf bookshelf = new Bookshelf();
    private static final int EXIT = 5;

    public static void main(String[] args) {
        int item = 0;
        do {
            displayBookshelf();
            displayMenu();
            item = inputItem();
            scanner.nextLine();
            runCommand(item);
        } while(item != EXIT);
    }

    private static void displayBookshelf() {
        if(bookshelf.getCountBooks() == 0) {
            System.out.println("\nThe bookshelf is empty. You can add the first book.");
        } else {
            System.out.println("\nNumber of books - " + bookshelf.getCountBooks() +
                    ". Free shelves - " + bookshelf.getFreeShelves());
            int length = bookshelf.getBookshelfLength();
            for (Book book : bookshelf.getBooks()) {
                System.out.println("|" + book.toString() + " ".repeat(length - book.getInfoLength()) + "|");
                System.out.println("|" + "-".repeat(length - 1) + "-|");
            }
        }
    }

   private static void displayMenu() {
        System.out.println("\nTo continue - press \"Enter\"");
        scanner.nextLine();
        System.out.print("""
                Menu:
                1.add book;
                2.find book;
                3.delete book;
                4.clean the bookshelf;
                5.exit.
                Press any number from 1 to 5.
                """);
    }

    private static int inputItem() {
        int item = 0;
        try {
            item = scanner.nextInt();
            if(item < 1 || item > EXIT) {
                System.out.println("Wrong input. Try again");
            }
        } catch (Exception e) {
            System.out.println("Wrong input. Try again.");
        }
        return item;
    }

    private static void runCommand(int item) {
        switch (item) {
            case 1:
                save();
                break;
            case 2:
                find();
                break;
            case 3:
                delete();
                break;
            case 4:
                bookshelf.clear();
                break;
        }
    }

    private static void save() {
        if(bookshelf.getCountBooks() >= bookshelf.CAPACITY) {
            System.out.println("The bookshelf is full. Delete some book.");
            scanner.nextLine();
        } else {
            System.out.println("Enter author");
            String author = scanner.nextLine();
            String title = enterTitle();
            System.out.println("Enter year of issue");
            String year = scanner.nextLine();
            bookshelf.add(new Book(author, title, year));
        }
    }

    private static String enterTitle() {
        System.out.println("Enter title");
        return scanner.nextLine();
    }

    private static void find() {
        String title = enterTitle();
        if(bookshelf.find(title) == null) {
            System.out.println("Book is not available.");
        } else {
            System.out.println(bookshelf.find(title));
        }
    }

    private static void delete() {
        String title = enterTitle();
        if(!bookshelf.delete(title)) {
            System.out.println("Book is not available.");
        } else {
            System.out.println("Book has been deleted");
        }
    }
}