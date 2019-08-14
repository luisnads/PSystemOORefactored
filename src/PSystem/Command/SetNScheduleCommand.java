package PSystem.Command;

import PSystem.Menu;

public class SetNScheduleCommand implements Command {
    Menu menu;

    public SetNScheduleCommand(Menu menu) { this.menu = menu; }

    public boolean execute() { return menu.setNSchedule(); }
}
