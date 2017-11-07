package kz.inessoft.project.command.impl;

import kz.inessoft.project.command.Command;
import kz.inessoft.project.storage.impl.Storage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * This command used to delete values from Library by name
 * @author Artyom Revinov
 */
public class DeleteCommand implements Command{

    private void removeFromStorage(String name){

        try {
            Storage.INSTANCE.delete(name);

            System.out.println("Publication with name " + name + " was deleted");
        } catch (IndexOutOfBoundsException i){

            System.out.println("There is no publication with index" + name);
        }
    }


    @Override
    public void execute() throws IOException, SQLException {
        System.out.println("enter name of the publication to delete");


        boolean isRunning = true;

        Scanner scanner = new Scanner(System.in);

        while (isRunning){

            String choose = scanner.nextLine();

                removeFromStorage(choose);

                isRunning = false;
            }
        System.out.println("to exit to main menu enter 00");

        isRunning = true;

        while (isRunning){

            int choose = scanner.nextInt();

            if (choose == 0){
                isRunning = false;
                new MenuCommand().execute();
            }

        }
        }
    }

