package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    static Scanner scanner = new Scanner(System.in);
    static Bookshelf bookshelf = new Bookshelf();

    public static void main(String[] args) {
        int choice = 0;
        System.out.println("\nThe bookshelf is empty. You can add the first book.\n To continue - press \"Enter\"");
        scanner.nextLine();

        do {
            choice = selectMenu();
            switch (choice) {
                case 1:
                    save();
                    displayBookshelf();
                    break;
                case 2:
                    find();
                    break;
                case 3:
                    delete();
                    displayBookshelf();
                    break;
                case 4:
                    bookshelf.clear();
                    scanner.nextLine();
                    break;
            }
        } while(choice != 5);
    }

    public static int selectMenu() {
        int choice = 0;
        System.out.println("\nTo see the menu - press enter");
        scanner.nextLine();
        System.out.print("Menu: \n1.add book; \n2.find book;  \n3.delete book;  \n4. clean the bookshelf; \n5. exit." +
                "\nPress any number from 1 to 5\n");
        try {
            choice = scanner.nextInt();
            if(choice < 1 || choice > 5) {
                System.out.println("Wrong input. Try again");
                scanner.nextLine();
            }
        } catch (Exception e) {
            System.out.println("Wrong input. Try again.");
            scanner.nextLine();
        }
        return choice;
    }

    public static void save() {
        if(bookshelf.getCountBooks() >= bookshelf.CAPACITY) {
            System.out.println("The bookshelf is full. Delete some book.");
            scanner.nextLine();
        } else {
            System.out.println("Enter author");
            scanner.nextLine();
            String author = scanner.nextLine();
            System.out.println("Enter title");
            String title = scanner.nextLine();
            System.out.println("Enter year of issue");
            String year = scanner.nextLine();
            bookshelf.add(new Book(author, title, year));
        }
    }

    public static void find() {
        System.out.println("Enter title");
        scanner.nextLine();
        String title = scanner.nextLine();
        if(bookshelf.find(title) == null) {
            System.out.println("Book is not available.");
        } else {
            System.out.println(bookshelf.find(title).toString());
        }
    }

    public static void delete() {
        System.out.println("Enter title");
        scanner.nextLine();
        String title = scanner.nextLine();
        if(bookshelf.delete(title) == false) {
            System.out.println("Book is not available.");
        } else {
            System.out.println("Book has been deleted");
        }
    }

    public static void displayBookshelf() {
        System.out.println("Number of books - " + bookshelf.getCountBooks() + ". Free shelves - " +
                +bookshelf.getFreeShelves());
        int max = 0;
        for (Book book : bookshelf.getBooks()) {
            if (book.getInfoLength() > max) {
                max = book.getInfoLength();
            }
        }
        for (Book book : bookshelf.getBooks()) {
            System.out.println("|" + book.toString() + " ".repeat(max-book.getInfoLength()) + "|");
            System.out.println("|" + "-".repeat(max - 1) + "-|");
        }
    }
}