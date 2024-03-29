import java.util.ArrayList;

public class SalaryWorker extends Worker {
    private double annualSalary;

    public SalaryWorker(String ID, String firstName, String lastName, String title, int yob, double hourlyPayRate, double annualSalary) {
        super(ID, firstName, lastName, title, yob, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked){
        return annualSalary / 52;
    }

    @Override
    public String displayWeeklyPay(double hoursWorked) {
        String weeklyPay = String.format("%.2f", calculateWeeklyPay(0));
        return weeklyPay;
    }
}