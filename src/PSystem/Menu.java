package PSystem;

import PSystem.Command.Command;
import java.util.Scanner;
import java.util.ArrayList;
import PSystem.Command.*;

public class Menu {

        private ExcepctionT eMonitor;
        private Scanner input;
        private ArrayList<Employee> employees;
        private EmployeesManager eManager;
        private pSchedule paymentManager;
        private boolean check;
        private Payroll payroll;
        private MenuController controller;

        public Menu()
        {
            this.eMonitor = new ExcepctionT();
            this.input = new Scanner(System.in);
            this.employees = new ArrayList<>();
            this.eManager = new EmployeesManager();
            this.paymentManager = new pSchedule();
            this.check = true;
            this.controller = new MenuController();
            System.out.println("Insira a data inicial que o sistema está rodando (ex.: 04/07/2019): ");
            int[] initialDate = eMonitor.getSystemDate();
            System.out.println("Insira o dia da semana que o sistema está iniciando (ex.: terça-feira): ");
            String dayInfo = input.nextLine();
            this.payroll = new Payroll(initialDate[0], initialDate[1], dayInfo);
        }

        public boolean addEmployee()
        {
            eManager.addEmployee(employees);
            return true;
        }
        public boolean rmEmployee()
        {
            eManager.rmEmployee(employees);
            return true;
        }
        public boolean cardPoint()
        {
            eManager.cardPoint(employees);
            return true;
        }
        public boolean setSellResult()
        {
            eManager.setSellResult(employees);
            return true;
        }
        public boolean serviceTax()
        {
            eManager.serviceTax(employees);
            return true;
        }
        public boolean setEmployee()
        {
            eManager.setEmployee(employees);
            return true;
        }
        public boolean payAll()
        {
            payroll.payAll(employees);
            return true;
        }
        public boolean setNSchedule()
        {
            paymentManager.setNSchedule(employees);
            return true;
        }
        public boolean newSchedule()
        {
            paymentManager.newSchedule();
            return true;
        }
        public boolean exitMenu() { return false; }
        public boolean showEmployees() {
            showEmployees(employees);
            return true;
        }
        public void loopHeader(ArrayList<Command> commands) {
            while(check) {
                System.out.println();
                payroll.getDateInfo();
                int option = header(eMonitor);
                controller.setCommand(commands.get(option));
                check = controller.getOption();
            }
        }
        private int header(ExcepctionT eMonitor) {
            System.out.println("[1] Adição de um novo funcionário.\n[2] Remoção de um funcionário.\n[3] Lançar um Cartão de Ponto.");
            System.out.println("[4] Lançar um resultado de venda.\n[5] Lançar uma taxa de serviço.\n[6] Alterar detalhes de um funcionário.");
            System.out.println("[7] Rodar a folha de pagamento para hoje.\n[8] Agenda de Pagamento.\n[9] Criação de Novas Agendas de Pagamento.");
            System.out.println("[0] Sair.");
            System.out.print("Insira a operação deseja realizar: ");
            return eMonitor.getInteger();
        }
        private void showEmployees(ArrayList<Employee> employees) {
            for(int i = 0; i < employees.size(); i++) {
                System.out.printf("Nome: %s\nID: %d\nForPay %.2f\n", employees.get(i).getName(), employees.get(i).getId(), employees.get(i).getForPay());
                if(employees.get(i) instanceof Hourly) {
                    System.out.println("Tipo: Horista");
                }
                else if(employees.get(i) instanceof Salaried) {
                    System.out.println("Tipo: Assalariado");
                }
                else if(employees.get(i) instanceof Comissioned) {
                    System.out.println("Tipo: Comissionado");
                }
            }
        }
}
