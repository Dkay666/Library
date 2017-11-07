package kz.inessoft.project.command.impl;

import kz.inessoft.project.command.Command;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * This command used to display menu of the application
 * @author Artyom Revinov
 */
public class MenuCommand implements Command {

    private boolean isRunning = true;


    private void defineCommand(int command) throws IOException, SQLException {

        switch (command) {

            case 1: new RegisteredPublication().execute();
                break;

            case 2: new PublicationCreator().execute();
                break;

            case 3: new DisplayContent().execute();
                break;

            case 4: new DeleteCommand().execute();
                break;

            case 5:
                break;

            default: {

                isRunning = true; //Continue scanning command
                System.err.println("unknown command");

            }
        }
    }

    private void showMenu() {


        System.out.println("1 - display all registered publications\n2 - create new publication\n" +
                "3 - display publications content\n4 - delete publication\n5 - exit");
    }

    @Override
    public void execute() throws IOException, SQLException {

        showMenu();

        Scanner scanner = new Scanner(System.in);

        while (isRunning) { //Waiting need command

            int choose = scanner.nextInt();

            isRunning = false; //Stop scanner

            defineCommand(choose);
        }
    }
    }

