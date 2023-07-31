
package com.mycompany.encapdemo3;

public class Employee3 {
  
    private String empName;
    private double basicSalary;
    private double bonus;

    public Employee3() {
        // Default constructor
    }

    public Employee3(String empName, double basicSalary, double bonus) {
        this.empName = empName;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    // Getter and Setter for Employee Name
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    // Getter and Setter for Basic Salary
    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    // Getter for Bonus 
    public double getBonus() {
        return bonus;
    }

    // calculate Bonus Amount
    public double calculateBonusAmount() {
        return basicSalary + bonus;
    }
}


    

