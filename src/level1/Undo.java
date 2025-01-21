package level1;

import level1.exceptions.EmptyHistoryException;
import level1.exceptions.MaxHistorySizeReachedException;

import java.util.ArrayList;
import java.util.List;

class Undo {
    private static Undo instance;
    private final List<String> commandHistory;
    private static final int MAX_HISTORY_SIZE = 10;

    private Undo() {
        commandHistory = new ArrayList<>();
    }

    public static synchronized Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void addCommand(String command) throws MaxHistorySizeReachedException {
        if (commandHistory.size() >= MAX_HISTORY_SIZE) {
            throw new MaxHistorySizeReachedException("The maximum history size has been reached.");
        }
        commandHistory.add(command);
    }

    public void removeLastCommand() throws EmptyHistoryException {
        if (commandHistory.isEmpty()) {
            throw new EmptyHistoryException("The command history is empty.");
        }
        commandHistory.remove(commandHistory.size() - 1);
    }

    public void listCommands() throws EmptyHistoryException {
        if (commandHistory.isEmpty()) {
            throw new EmptyHistoryException("The command history is empty.");
        } else {
            System.out.println("Command history:");
            for (int i = 0; i < commandHistory.size(); i++) {
                System.out.println((i + 1) + ". " + commandHistory.get(i));
            }
        }
    }
}
