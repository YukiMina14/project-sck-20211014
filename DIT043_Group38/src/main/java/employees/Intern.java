package employees;

public class Intern extends Employee{
    private int GPA;

    public Intern(String ID, String name, double salary, int GPA) {
        super(ID, name, salary);
        this.GPA = GPA;
    }

    @Override
    public double calculateSalary() {
        double netSalary = super.salary; //salary - 10%

        return netSalary;
    }
}
