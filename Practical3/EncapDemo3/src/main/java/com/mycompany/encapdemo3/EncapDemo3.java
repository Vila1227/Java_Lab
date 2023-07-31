
package com.mycompany.encapdemo3;
public class EncapDemo3 {

    public static void main(String[] args) {
        // Create an instance of Employee using the constructor
        Employee3 emp = new Employee3("Bogdan", 50000, 10000);

        // Using getters to retrieve values and display the employee details
        System.out.println("Employee Name: " + emp.getEmpName());
        System.out.println("Basic Salary: " + emp.getBasicSalary());
        System.out.println("Bonus: " + emp.getBonus());
        System.out.println("Bonus Amount: " + emp.calculateBonusAmount());
    }
}


