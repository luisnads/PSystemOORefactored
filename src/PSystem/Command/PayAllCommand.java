package PSystem.Command;

import PSystem.Menu;

public class PayAllCommand implements Command {
    Menu menu;

    public PayAllCommand(Menu menu) { this.menu = menu; }
    public boolean execute() { return menu.payAll(); }
}
