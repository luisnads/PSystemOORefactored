package PSystem.Command;

import PSystem.Menu;

public class ExitMenuCommand implements Command {
    Menu menu;

    public ExitMenuCommand(Menu menu) { this.menu = menu; }

    public boolean execute() { return menu.exitMenu(); }
}
