package PSystem;

import java.util.ArrayList;

public class Hourly extends Employee{

    private double hourPay;
    private ExcepctionT eMonitor = new ExcepctionT();

    public Hourly(String name, String address, double hourPay, int id, String paySchedule) {
        super(name, address, id, paySchedule);
        this.hourPay = hourPay;
    }

    public double totalTime(int[] tIn, int[] tOut) { //ExtractMethod
        int tHours = tOut[0] - tIn[0];
        double minutes = (tOut[1] - tIn[1])/60.0;
        return tHours + minutes;
    }

    public double setCard(int[] tIn, int[] tOut) {
        double extra = 0;
        double tTime = totalTime(tIn, tOut);
        if(tTime > 8)
            extra = (tTime - 8)*0.5*hourPay;
        return (tTime*hourPay) + extra;
    }

    public void resetForPay() { super.forPay = 0; }
    public void setSell(ArrayList<Employee> employees, int id) {
        System.out.println("Tipo de funcionário incorreto! Falha ao lançar resultado de venda.");
    }
    public void setCard(ArrayList<Employee> employees, int id) {
        System.out.print("Insira o horário de entrada do funcionário: ");
        int[] tIn = eMonitor.getTime();
        System.out.print("Insira o horário de saída do funcionário: ");
        int[] tOut = eMonitor.getTime();

        Hourly temp = (Hourly) employees.get(id);
        double addForPay = temp.setCard(tIn, tOut);
        employees.get(id).addForPay(addForPay);
        System.out.println("Cartão de ponto lançado com sucesso!");
    }
    public Employee toPay(Employee employee, double forPay) {
        System.out.printf("O funcionário %s de [ID] %d recebeu %.2f via ", employee.getName(), employee.getId(), forPay);
        return employee;
    }
}
