
package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookShelfTest {
    static Scanner scanner = new Scanner(System.in);
    static BookShelf bookShelf = new BookShelf();

    public static void main(String[] args) {
        String answer = "";
        System.out.println("The bookshelf is empty. You can add the first book.\n To continue - press \"Enter\"");
        scanner.nextLine();
        bookShelf.receiveAllBooks();
        System.out.println("\nTo see the menu - press \"enter\"");
        scanner.nextLine();

        do {
            if(answer.equals("")) {
                displayMenu();
                int number = scanner.nextInt();
                switch (number) {
                    case 1:
                        Book book = inputData();
                        bookShelf.add(book);
                        bookShelf.receiveAllBooks();
                        displayBookShelf();
                        break;
                        case 2:
                        System.out.println("Enter title");
                        scanner.nextLine();
                        String bookTitle = scanner.nextLine();
                        bookShelf.find(bookTitle);
                        bookShelf.receiveAllBooks();
                        displayBookShelf();
                        break;
                    case 3:
                        System.out.println("Enter title");
                        scanner.nextLine();
                        bookShelf.delete(scanner.nextLine());
                        bookShelf.receiveAllBooks();
                        displayBookShelf();
                        break;
                    case 4:
                        bookShelf.receiveAllBooks();
                        scanner.nextLine();
                        displayBookShelf();
                        break;
                    case 5:
                        bookShelf.countBooks();
                        scanner.nextLine();
                        displayBookShelf();
                        break;
                    case 6:
                        bookShelf.countFreeShelves();
                        scanner.nextLine();
                        displayBookShelf();
                        break;
                    case 7:
                        bookShelf.clear();
                        scanner.nextLine();
                        displayBookShelf();
                        break;
                }
            }
            System.out.println("Press \"Enter\" to continue or write \"exit\"");
            answer = scanner.nextLine();
        } while(!answer.equals("exit"));
    }

    public static Book inputData() {
        System.out.println("Enter author");
        scanner.nextLine();
        String author = scanner.nextLine();
        System.out.println("Enter title");
        String title = scanner.nextLine();
        System.out.println("Enter year of issue");
        String year = scanner.nextLine();
        return new Book(author, title, year);
    }

    public static void displayMenu() {
        System.out.print("Menu: \n1.add book; \n2.find book;  \n3.delete book; \n4.receive all books;" +
                " \n5. receive number of books in the bookshelf \n6. receive number of free shelves;" +
                " \n7. clean the bookshelf");
        System.out.println("\nPress any number from 1 to 7 to do action with book");
    }

    public static void displayBookShelf() {
        Book[] bookShelf1 = bookShelf.getBookShelf1();
        for(int i = 0; i < bookShelf.getCountBooks(); i++) {
            System.out.println(bookShelf1[i].toString());
            System.out.println("|" + "_".repeat(bookShelf1[i].getbookLength()) + "|");
        }
    }
}
