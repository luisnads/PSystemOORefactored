package PSystem.Command;

import PSystem.Menu;

public class RmEmployeeCommand implements Command {
    Menu menu;

    public RmEmployeeCommand(Menu menu) { this.menu = menu; }
    public boolean execute() { return menu.rmEmployee(); }
}
