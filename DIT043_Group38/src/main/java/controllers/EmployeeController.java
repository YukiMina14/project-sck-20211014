package controllers;

import employees.*; //import the whole employee package yes eyse yes


import java.util.ArrayList;
import java.util.List;

    public class EmployeeController {
        private final List<Employee> employee = new ArrayList<Employee>();
        private String employeeID;
        private String employeeName;
        private double employeeSalary;


        public EmployeeController(){
        }

        public List<Employee> getEmployee() {
            return employee;
        }

        public String createEmployee(String employeeID, String employeeName, double unitPrice) {
            // Will check to see if the employee ID is empty or the employee name is empty or the price is <= 0
            if (employeeID.isEmpty() || employeeName.isEmpty() || unitPrice <= 0) {
                return "InvalID data for employee.";
            } else {
            /* If that's all clear, loop through all the employee in the arraylist to see if the employee ID is the same
               as the ID you inputted into your method
            */
                for (Employee employee : employee) {
                    if (employee.getEmployeeID().equals(employeeID)) {
                        return "Two employee cannot have the same ID!";
                    }
                }
            }
            // Otherwise, create a new employee and add to the employeeController arraylist.
            Employee employee = new RegularEmployee(employeeID, employeeName, unitPrice);
            employee.add(employee);
            return "employee " + employeeID + " was registered successfully";
        }

        // get employee from arraylist employee and print them out one by one, print value instead of object reference, format correctly

        public String printemployee() {

            StringBuilder result;
            result = new StringBuilder();
            for(Employee Employee: employee) {
                result.append(employee.toString());
            }
            return result.toString();

        }
    }

}
