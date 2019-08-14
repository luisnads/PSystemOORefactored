package PSystem.Command;

import PSystem.Menu;

public class AddEmployeCommand implements Command {
    Menu menu;

    public AddEmployeCommand(Menu menu) { this.menu = menu; }
    public boolean execute() { return menu.addEmployee(); }
}
