package level3.remote;

import level3.commands.Command;

public class RemoteControl {
    public void submit(Command command) {
        command.execute();
    }
}
