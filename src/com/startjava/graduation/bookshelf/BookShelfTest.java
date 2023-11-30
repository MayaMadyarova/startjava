package com.startjava.graduation.bookshelf;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BookShelfTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        System.out.println("The bookshelf is empty. You can add the first book.\n To continue - press \"Enter\"");
        scanner.nextLine();
        BookShelf.ReceiveAllBooks();
        System.out.println("\nTo see the menu - press \"enter\"");
        scanner.nextLine();

        do {
            if(answer.equals("")) {
                System.out.print("Menu: \n1.add book; \n2.find book;  \n3.delete book; \n4.receive all books;" +
                        " \n5. receive number of books in the bookshelf \n6. receive number of free shelves;" +
                        " \n7. clean the bookshelf");
                System.out.println("\nPress any number from 1 to 7 to do action with book");
                int number = scanner.nextInt();
                switch (number) {
                    case 1:
                        System.out.println("Enter author, title, year of issue in the format : author, title, year of issue");
                        scanner.nextLine();
                        String bookInformation = scanner.nextLine();
                        try {
                            Book book = new Book(bookInformation);
                            BookShelf.Add(book);
                            BookShelf.ReceiveAllBooks();
                        } catch (RuntimeException e) {
                            System.out.println(e.getMessage());
                        }
                        break;

                    case 2:
                        System.out.println("Enter title");
                        scanner.nextLine();
                        String title = scanner.nextLine();
                        BookShelf.Find(title);
                        BookShelf.ReceiveAllBooks();
                        break;
                    case 3:
                        System.out.println("Enter title");
                        scanner.nextLine();
                        BookShelf.Delete(scanner.nextLine());
                        BookShelf.ReceiveAllBooks();
                        break;
                    case 4:
                        BookShelf.ReceiveAllBooks();
                        scanner.nextLine();
                        break;
                    case 5:
                        BookShelf.ReceiveNumberOfBooks();
                        scanner.nextLine();
                        break;
                    case 6:
                        BookShelf.ReceiveNumberOfFreeShelves();
                        scanner.nextLine();
                        break;
                    case 7:
                        BookShelf.Clean();
                        scanner.nextLine();
                        break;
                }
            }
            System.out.println("Press \"Enter\" to continue or write \"exit\"");
            answer = scanner.nextLine();
        } while(!answer.equals("exit"));
    }
}
