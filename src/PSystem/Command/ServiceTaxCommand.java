package PSystem.Command;

import PSystem.Menu;

public class ServiceTaxCommand implements Command{
    Menu menu;

    public ServiceTaxCommand(Menu menu) { this.menu = menu; }
    public boolean execute() { return menu.serviceTax(); }
}
