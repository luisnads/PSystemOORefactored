package PSystem.Command;

import PSystem.Menu;

public class ShowEmployeesCommand implements Command{
    Menu menu;

    public ShowEmployeesCommand(Menu menu) { this.menu = menu; }
    public boolean execute() { return menu.showEmployees(); }
}
