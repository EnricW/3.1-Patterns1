package level1;

import java.util.ArrayList;
import java.util.List;

class Undo {
    private static Undo instance;
    private final List<String> commandHistory;

    private Undo() {
        commandHistory = new ArrayList<>();
    }

    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void addCommand(String command) {
        commandHistory.add(command);
    }

    public void removeLastCommand() {
        if (!commandHistory.isEmpty()) {
            commandHistory.removeLast();
        } else {
            System.out.println("There are no commands in command history.");
        }
    }

    public void listCommands() {
        if (commandHistory.isEmpty()) {
            System.out.println("Command history is empty.");
        } else {
            System.out.println("Command history:");
            for (int i = 0; i < commandHistory.size(); i++) {
                System.out.println((i + 1) + ". " + commandHistory.get(i));
            }
        }
    }
}
