package PSystem;

import java.util.ArrayList;

public class Comissioned extends Salaried {

    private double comission;
    private double totalSales;
    private ExcepctionT eMonitor;

    public Comissioned(String name, String address, double mensalSalary, double comission, int id, String paySchedule) {
        super(name, address, mensalSalary, id, paySchedule);
        this.comission = comission;
        this.totalSales = 0;
        this.eMonitor = new ExcepctionT();
    }

    public double sellComission(double value) { return value*comission; }
    public void setTotalSales(double value) { this.totalSales += value; }
    public double getTotalSales() { return this.totalSales; }
    public void resetTotalSales() { this.totalSales = 0; }
    public void setSell(ArrayList<Employee> employees, int id) {

        System.out.print("Insira o valor do resultado da venda: ");
        double sellResult = eMonitor.getDouble();

        Comissioned temp = (Comissioned) employees.get(id);
        double addForPay = temp.sellComission(sellResult);
        temp.setTotalSales(addForPay);
        employees.set(id, temp);
    }
    public void setCard(ArrayList<Employee> employees, int id) {
        System.out.println("Tipo de funcionário incorreto! Falha ao lançar cartão de ponto.");
    }
    public Employee toPay(Employee employee, double forPay) {
        Comissioned temp = (Comissioned) employee;
        double totalSales = temp.getTotalSales();
        temp.resetTotalSales();
        System.out.printf("O funcionário %s de [ID] %d recebeu %.2f via ", employee.getName(), employee.getId(), forPay+totalSales);
        return temp;
    }
}
