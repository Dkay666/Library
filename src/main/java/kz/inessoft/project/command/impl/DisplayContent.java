package kz.inessoft.project.command.impl;

import kz.inessoft.project.command.Command;
import kz.inessoft.project.entity.Publication;
import kz.inessoft.project.storage.impl.Storage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import static kz.inessoft.project.consatnts.Constants.*;

/**
 * This command used to display content of the publications
 * @author Artyom Revinov
 */
public class DisplayContent implements Command {

    private void print(Publication publication) {

        System.out.println(SEPARATOR);

        switch (publication.getType()) {

            case BOOK:
                System.out.printf(FORMAT_BOOK_BODY, ID, AUTHOR, LABEL, RELASE_DATE,
                        PAGE_AMOUNT,PUBLISHER, GENRE, DESCRIPTION);
                break;

            case BOOKLET:
                System.out.printf(FORMAT_BOOKLET_BODY, ID, LABEL, RELASE_DATE, PUBLISHER, DESCRIPTION);
                break;

            case JOURNAL:
                System.out.printf(FORMAT_MAGAZINE_BODY, ID, LABEL, RELASE_DATE, PAGE_AMOUNT, PUBLISHER,
                        DESCRIPTION);
                break;
        }

        System.out.println(SEPARATOR);

        System.out.println(publication.getAllInfo()); //Show body result

    }

    private void displayPublication(String id) {

        try {

            Integer idPub = Integer.valueOf(id);

            try {

                Publication currentPublication = Storage.INSTANCE.read(idPub);

                currentPublication.setIdStorage(idPub); //Set id publication from array (index)

                print(currentPublication); // Print info

            } catch (IndexOutOfBoundsException i) {

                System.out.println("There is no publication with id " + idPub);
            }

        } catch (NumberFormatException n) {

            System.out.println(INCORRECT_COMMAND + id);
        }
    }

    @Override
    public void execute() throws IOException, SQLException {

        System.out.println("enter publication id");

        System.out.println(TO_RETURN_MENU);

        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;

        while (isRunning) { //Waiting input

            String userInput = scanner.nextLine();

            if (RETURN_MENU_CODE.equals(userInput)) {

                isRunning = false;

                new MenuCommand().execute();

            } else {

                displayPublication(userInput);
            }

        }
    }
}
