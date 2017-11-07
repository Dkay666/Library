package kz.inessoft.project.command.impl;

import kz.inessoft.project.command.Command;
import kz.inessoft.project.entity.Publication;
import kz.inessoft.project.storage.impl.Storage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import static kz.inessoft.project.consatnts.Constants.*;
import static kz.inessoft.project.consatnts.Constants.FORMAT_REGISTERED_PUB_HEADER;

/**
 * This command used to display all registered publications
 * @author Artyom Revionv
 */
public class RegisteredPublication implements Command{
    private void showPublication() {



        System.out.println(SEPARATOR);

        System.out.printf(FORMAT_REGISTERED_PUB_BODY, ID, TYPE, LABEL, RELASE_DATE, PAGE_AMOUNT, PUBLISHER);

        System.out.println(SEPARATOR);

        for (int i = 0; i < Storage.INSTANCE.readAll().size(); i++) {

            Publication currentPublication = Storage.INSTANCE.readAll().get(i);

            currentPublication.setIdStorage(i);

            System.out.println(currentPublication);
        }
    }


    @Override
    public void execute() throws IOException, SQLException {

        showPublication();

        System.out.println(TO_RETURN_MENU);

        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;

        while (isRunning) { //Waiting need command

            String command = scanner.next();

            if (RETURN_MENU_CODE.equals(command)) {

                isRunning = false;
            } else {

                System.out.println(INCORRECT_COMMAND + command);
            }
        }

        new MenuCommand().execute(); //Display Publication menu


    }
}
