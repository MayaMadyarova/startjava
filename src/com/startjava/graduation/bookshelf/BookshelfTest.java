package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    static Scanner scanner = new Scanner(System.in);
    static Bookshelf bookshelf = new Bookshelf();

    public static void main(String[] args) {
        int number = 0;
        System.out.println("\nThe bookshelf is empty. You can add the first book.\n To continue - press \"Enter\"");
        scanner.nextLine();

        do {
            number = selectMenu();
            switch (number) {
                case 1:
                    if(bookshelf.getCountBooks() >= bookshelf.MAX) {
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
                    break;
                case 2:
                    System.out.println("Enter title");
                    scanner.nextLine();
                    String title = scanner.nextLine();
                    if(bookshelf.find(title) == null) {
                        System.out.println("Book is not available.");
                    } else {
                        System.out.println(bookshelf.find(title).toString());
                    }
                    break;
                case 3:
                    System.out.println("Enter title");
                    scanner.nextLine();
                    title = scanner.nextLine();
                    if(bookshelf.delete(title) == 0) {
                        System.out.println("Book is not available.");
                    } else {
                        System.out.println("Book has been deleted");
                    }
                    break;
                case 4:
                    bookshelf.receiveAllBooks();
                    displayBookshelf();
                    scanner.nextLine();
                    break;
                case 5:
                    bookshelf.clear();
                    scanner.nextLine();
                    break;
            }
        } while(number != 6);
    }

    public static int selectMenu() {
        int number = 0;
        System.out.println("\nTo see the menu - press enter");
        scanner.nextLine();
        System.out.print("Menu: \n1.add book; \n2.find book;  \n3.delete book; \n4.receive all books;" +
                " \n5. clean the bookshelf; \n6. exit. \nPress any number from 1 to 6\n");
        try {
            number = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Wrong input.");
            scanner.nextLine();
        }
        return number;
    }

    public static void displayBookshelf() {
        for(Book book : bookshelf.getBookshelf()) {
            System.out.println(book.toString());
            System.out.println("|" + "_".repeat(book.getInfoLength()) + "|");
        }
    }
}