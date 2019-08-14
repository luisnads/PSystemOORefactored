package PSystem.Command;

import PSystem.Menu;

public class SetSellResultCommand implements Command{
    Menu menu;

    public SetSellResultCommand(Menu menu) { this.menu = menu; }
    public boolean execute() { return menu.setSellResult(); }
}
