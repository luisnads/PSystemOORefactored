package PSystem;

import java.util.ArrayList;

public class Salaried extends Employee{

    double mensalSalary;

    public Salaried(String name, String address, double mensalSalary, int id, String paySchedule) {
        super(name, address, id, paySchedule);
        this.mensalSalary = mensalSalary;
        super.forPay = mensalSalary;
    }

    public void resetForPay() { super.forPay = mensalSalary; }
    public void setSell(ArrayList<Employee> employees, int id) {
        System.out.println("Tipo de funcionário incorreto! Falha ao lançar resultado de venda.");
    }
    public void setCard(ArrayList<Employee> employees, int id) {
        System.out.println("Tipo de funcionário incorreto! Falha ao lançar cartão de ponto.");
    }
    public Employee toPay(Employee employee, double forPay) {
        System.out.printf("O funcionário %s de [ID] %d recebeu %.2f via ", employee.getName(), employee.getId(), forPay);
        return employee;
    }
}
