package PSystem;

import PSystem.Command.*;
import java.util.ArrayList;

public class Main {

    public static void addCommands(ArrayList<Command> commands, Menu menu)
    {
        commands.add(new ExitMenuCommand(menu));
        commands.add(new AddEmployeCommand(menu));
        commands.add(new RmEmployeeCommand(menu));
        commands.add(new CardPointCommand(menu));
        commands.add(new SetSellResultCommand(menu));
        commands.add(new ServiceTaxCommand(menu));
        commands.add(new SetEmployeeCommand(menu));
        commands.add(new PayAllCommand(menu));
        commands.add(new SetNScheduleCommand(menu));
        commands.add(new NewScheduleCommand(menu));
        commands.add(new ShowEmployeesCommand(menu));
    }

    public static void main(String[] args) {
        System.out.println("================ Seja bem-vindo ao Sistema Folha de Pagamento! ================");
        Menu newMenu = new Menu();
        ArrayList<Command> commands = new ArrayList<>();
        addCommands(commands, newMenu);
        newMenu.loopHeader(commands);
    }
}
