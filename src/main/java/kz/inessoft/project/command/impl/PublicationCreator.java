package kz.inessoft.project.command.impl;

import kz.inessoft.project.command.Command;
import kz.inessoft.project.entity.impl.Book;
import kz.inessoft.project.entity.impl.Booklet;
import kz.inessoft.project.entity.impl.Journal;
import kz.inessoft.project.storage.impl.Storage;
import kz.inessoft.project.util.Validator;


import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import static kz.inessoft.project.consatnts.Constants.*;


/**
 * This Command used to create publications.
 * @author Artyom Revinov.
 */
public class PublicationCreator implements Command {

    private Scanner scanner = new Scanner(System.in);
    boolean isRunning = true;

    private void createBook() {

         Book book = new Book();

        System.out.println("enter book name");
        book.setName(Validator.takeLimitString(scanner.nextLine(),15));

        System.out.println("enter author name");
        book.setAuthor(Validator. takeLimitString(scanner.nextLine(),15));

        System.out.println("enter genre name");
        book.setGenre(Validator.takeLimitString(scanner.nextLine(),15));

        System.out.println("enter year");
        book.setYear(Validator.takeLimitString(scanner.nextLine(),4));

        System.out.println("enter page amount");
        book.setCountPage(Validator.takeLimitNumber(scanner.nextLine(),4));

        System.out.println("enter publisher name");
        book.setPublisher(Validator.takeLimitString(scanner.nextLine(),10));

        System.out.println("enter short description of the book");
        book.setDescription(Validator. takeLimitString(scanner.nextLine(),40));

        System.out.println("book added successfully");

        Storage.INSTANCE.create(book);
    }

    private void createMagazine() {

        Journal journal = new Journal();



        System.out.println("enter name of journal");
        journal.setName(Validator. takeLimitString(scanner.nextLine(),15));

        System.out.println("enter release month");
        journal.setMonth(Validator. takeLimitString(scanner.nextLine(),3));

        System.out.println("enter release year");
        journal.setYear(Validator. takeLimitString(scanner.nextLine(),4));

        System.out.println("enter page amount");
        journal.setCountPage(Validator.takeLimitNumber(scanner.nextLine(),4));

        System.out.println("enter publisher name");
        journal.setPublisher(Validator. takeLimitString(scanner.nextLine(),15));

        System.out.println("enter list of publications");
        journal.setDescription(Validator.takeLimitString(scanner.nextLine(),40));

        Storage.INSTANCE.create(journal);

        }





    private void createBooklet() {

        Booklet booklet = new Booklet();


        System.out.println("enter name of the booklet");
        booklet.setName(Validator.takeLimitString(scanner.nextLine(), 20));

        System.out.println("enter release month");
        booklet.setMonth(Validator.takeLimitString(scanner.nextLine(), 2));

        System.out.println("enter release year");
        booklet.setYear(Validator.takeLimitString(scanner.nextLine(), 4));

        System.out.println("enter publisher name");
        booklet.setPublisher(Validator.takeLimitString(scanner.nextLine(), 10));

        System.out.println("enter a short description of the booklet");
        booklet.setDescription(Validator.takeLimitString(scanner.nextLine(), 40));



        Storage.INSTANCE.create(booklet);
    }

    private void defineCommand(String command) throws IOException, SQLException {

        switch (command) {

            case RETURN_MENU_CODE:

                new MenuCommand().execute(); //Show menu library
                break;

            case CREATE_BOOKLET_CODE:

                createBooklet();
                new PublicationCreator().execute(); //Show items of menu
                break;

            case CREATE_MAGAZINE_CODE:

                createMagazine();
                new PublicationCreator().execute(); //Show items of menu
                break;

            case CREATE_BOOK_CODE:

                createBook();
                new PublicationCreator().execute(); //Show items of menu
                break;

            default: {
                isRunning = true; //Continue scanner of menu
                System.out.println(INCORRECT_COMMAND + command);
            }
        }
    }

    @Override
    public void execute() throws IOException, SQLException {

        System.out.println("00 - return to main menu\n1 - add booklet\n2 - add journal\n3 - add book");

        while (isRunning) { //Waiting need command

            isRunning = false; //Stop scanner of menu

            defineCommand(scanner.nextLine());
        }
    }
}
