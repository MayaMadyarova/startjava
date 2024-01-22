package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    private static Scanner scanner = new Scanner(System.in);
    private static Bookshelf bookshelf = new Bookshelf();
    private static final int EXIT = 5;
    private static int item = 0;

    public static void main(String[] args) {
        do {
            displayMenu();
            item = inputItem();
            scanner.nextLine();
            runCommand();
        } while(item != EXIT);
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

    private static void runCommand() {
        switch (item) {
            case 1:
                bookshelf.save();
                break;
            case 2:
                bookshelf.find();
                break;
            case 3:
                bookshelf.delete();
                break;
            case 4:
                bookshelf.clear();
                System.out.println("\nThe bookshelf is empty. You can add the first book.");
                break;
        }
    }
}