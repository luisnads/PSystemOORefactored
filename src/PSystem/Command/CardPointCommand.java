package PSystem.Command;

import PSystem.Menu;

public class CardPointCommand implements Command {
    Menu menu;

    public CardPointCommand(Menu menu) { this.menu = menu; }
    public boolean execute() { return menu.cardPoint(); }
}
