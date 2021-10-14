package employees;

public class RegularEmployee extends Employee{

    //Attributes of regular employee


    public RegularEmployee(String ID, String name, double salary) {
        super(ID, name, salary);
    }

    @Override
    public double calculateSalary() {
        double netSalary = super.salary - (super.salary * 0.1); //salary - 10% tax

        return netSalary;
    }

}

//employee has 10% income tax
//<name>’s gross salary is <gross_salary> SEK per month.