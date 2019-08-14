package PSystem.Command;

import PSystem.Command.Command;

public class MenuController {
    Command slot;

    public void setCommand(Command command) { slot = command; }
    public boolean getOption() { return slot.execute(); }

}
