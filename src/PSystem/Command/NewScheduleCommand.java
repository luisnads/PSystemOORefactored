package PSystem.Command;

import PSystem.Menu;

public class NewScheduleCommand implements Command {
    Menu menu;

    public NewScheduleCommand(Menu menu) { this.menu = menu; }

    public boolean execute() { return menu.newSchedule(); }
}
