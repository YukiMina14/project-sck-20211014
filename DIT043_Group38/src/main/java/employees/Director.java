package employees;

public class Director extends Employee{
    public Director(String ID, String name, double salary) {
        super(ID, name, salary);
    }

    @Override
    public double calculateSalary() {
        double netSalary = super.salary; //salary - 10%

        return netSalary;
    }
}
