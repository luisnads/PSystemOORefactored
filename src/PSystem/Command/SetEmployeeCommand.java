package PSystem.Command;

import PSystem.Menu;

public class SetEmployeeCommand implements Command{
    Menu menu;

    public SetEmployeeCommand(Menu menu) { this.menu = menu; }

    public boolean execute() { return menu.setEmployee(); }
}
