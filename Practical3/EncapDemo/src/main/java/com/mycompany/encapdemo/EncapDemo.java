
package com.mycompany.encapdemo;
public class EncapDemo {

    public static void main(String[] args) {
     
        Employee emp = new Employee();

        // Using setters to set values
        emp.setName("Andrue Silva");
        emp.setAge(55);
        emp.setSalary(75050.0);

        // Using getters to retrieve values and display the employee details
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Age: " + emp.getAge());
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}

    

