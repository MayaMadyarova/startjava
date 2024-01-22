package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    static Scanner scanner = new Scanner(System.in);
    static Bookshelf bookshelf = new Bookshelf();
    static final int EXIT = 5;
    static int choice = 0;

    public static void main(String[] args) {
        do {
            menu();
            choice = inputNumber();
            switchChoice();
        } while(choice != EXIT);
    }

    static void menu() {
        System.out.println("""
                To continue - press "Enter"
                """);
        scanner.nextLine();
        String menu = """
                Menu:
                1.add book;
                2.find book;
                3.delete book;
                4.clean the bookshelf;
                5.exit.
                Press any number from 1 to 5.
                """;
        System.out.print(menu);
    }

    public static int inputNumber() {
        int choice = 0;
        try {
            choice = scanner.nextInt();
            if(choice < 1 || choice > EXIT) {
                System.out.println("Wrong input. Try again");
                scanner.nextLine();
            }
        } catch (Exception e) {
            System.out.println("Wrong input. Try again.");
            scanner.nextLine();
        }
        return choice;
    }

    public static void switchChoice() {
        switch (choice) {
            case 1:
                save();
                break;
            case 2:
                find();
                break;
            case 3:
                delete();
                displayBookshelf();
                break;
            case 4:
                scanner.nextLine();
                bookshelf.clear();
                System.out.println("\nThe bookshelf is empty. You can add the first book.");
                break;
        }
    }

    public static void save() {
        if(bookshelf.getCountBooks() >= bookshelf.CAPACITY) {
            System.out.println("The bookshelf is full. Delete some book.");
            scanner.nextLine();
        } else {
            System.out.println("Enter author");
            scanner.nextLine();
            String author = scanner.nextLine();
            String title = enterTitle();
            System.out.println("Enter year of issue");
            String year = scanner.nextLine();
            bookshelf.add(new Book(author, title, year));
            displayBookshelf();
        }
    }

    public static void displayBookshelf() {
        System.out.println("\nNumber of books - " + bookshelf.getCountBooks() + ". Free shelves - " +
                +bookshelf.getFreeShelves());
        int max = bookshelf.getBookshelfLength();
        for (Book book : bookshelf.getBooks()) {
            System.out.println("|" + book.toString() + " ".repeat(max-book.getInfoLength()) + "|");
            System.out.println("|" + "-".repeat(max - 1) + "-|");
        }
    }

    public static void find() {
        scanner.nextLine();
        String title = enterTitle();
        if(bookshelf.find(title) == null) {
            System.out.println("Book is not available.");
        } else {
            System.out.println(bookshelf.find(title).toString());
        }
    }

    public static void delete() {
        scanner.nextLine();
        String title = enterTitle();
        if(bookshelf.delete(title) == false) {
            System.out.println("Book is not available.");
        } else {
            System.out.println("Book has been deleted");
        }
    }

    public static String enterTitle() {
        System.out.println("Enter title");
        return scanner.nextLine();
    }
}