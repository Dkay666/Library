package kz.inessoft.project.runner;


import kz.inessoft.project.command.impl.MenuCommand;
import kz.inessoft.project.consatnts.Constants;
import kz.inessoft.project.consatnts.Constants.*;


import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Simple runner class with main method
 * @author Artyom Revinov.
 */
public class LibraryRunner {



    public static void main(String[] args) throws IOException, SQLException {
        Scanner scanner = new Scanner(System.in);
        Constants constants = new Constants();
        MenuCommand menuCommand = new MenuCommand();


        System.out.println(constants.WELCOME);

       menuCommand.execute();
    }
}
