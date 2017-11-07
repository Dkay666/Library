package kz.inessoft.project.consatnts;

import java.util.Scanner;

/**
 * @author Artyom Revionov
 */
public class Constants {

    public static final String WELCOME =
                                   "==WELCOME=TO=LIBRARY=STOCK==\n";



    //Format

    public static final String FORMAT_REGISTERED_PUB_BODY = "%-10s%-10s%-21s%-20s%-15s%-15s%n";
    public static final String FORMAT_BOOK_BODY = "%-11s%-16s%-21s%-15s%-15s%-15s%-16s%-41s%n";
    public static final String FORMAT_BOOKLET_BODY = "%-10s%-21s%-20s%-16s%-41s%n";
    public static final String FORMAT_MAGAZINE_BODY = "%-10s%-21s%-20s%-15s%-16s%-41s%n";
    public static final String FORMAT_REGISTERED_PUB_HEADER = "%-20s%-20s%-20s%n";
    public static final int DEFAULT_COUNT_FOR_PAGE = 0;


    //Code command
    public static final String RETURN_MENU_CODE = "00";
    public static final String CREATE_BOOKLET_CODE = "1";
    public static final String CREATE_MAGAZINE_CODE = "2";
    public static final String CREATE_BOOK_CODE = "3";


    //Common
    public static final String ID = "ID";
    public static final String BOOK = "Book";
    public static final String AUTHOR = "Author";
    public static final String GENRE = "Genre";
    public static final String DESCRIPTION = "Description";
    public static final String JOURNAL = "Journal";
    public static final String BOOKLET = "Booklet";
    public static final String LABEL = "Name";
    public static final String EMPTY = "";
    public static final String TYPE = "Type";
    public static final String TO_RETURN_MENU = "\nTo return to main menu enter: \"00\"  ";
    public static final String RELASE_DATE = "Release date";
    public static final String PAGE_AMOUNT = "Pages";
    public static final String PUBLISHER = "Publisher";
    public static final String ADD_BOOKLET = "Add booklet";
    public static final String ADD_BOOK = "Add book";
    public static final String ADD_MAGAZINE = "Add journal";
    public static final String MENU = "MENU\n";
    public static final String SEPARATOR = "----------------------------------------------------------------------------------";
    public static final String INCORRECT_COMMAND = "Unknown command ";
}
