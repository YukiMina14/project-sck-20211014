package employees;

public abstract class Employee {
    private final String employeeID; //every employee should have an ID called employeeID to prevent confusion with item ID's
    private String name; //every employee should have a name
    protected double salary; //protected so everyone in the same package can get accesses but not other packages.

    //constructor for the abstract class
    public Employee (String ID ,String name, double salary) {
        this.employeeID = ID;
        this.name       = name;
        this.salary     = salary;
    }

    //Because all employees has different names and salary, they should be overridden by the subclasses.
    public abstract double calculateSalary(); //Method not implemented


    //getter and setter methods
    public String getEmployeeID(){
        return this.employeeID;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getSalary(){
        return this.salary;
    }

    public void setSalary(double Salary){
        this.salary = salary;
    }

    @Override //overrides the default toString method
    public String toString(){
        //<name>’s gross salary is <gross_salary> SEK per month.
        return  this.name + " " + this.calculateSalary();
    }
}
