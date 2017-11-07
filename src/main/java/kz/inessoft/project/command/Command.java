package kz.inessoft.project.command;

import java.io.IOException;
import java.sql.SQLException;

/**
 * This interface has been implemented in command
 * for creating commands action
 * @author Artyom Revinov
 */
public interface Command {
     public void execute() throws IOException, SQLException;
}
