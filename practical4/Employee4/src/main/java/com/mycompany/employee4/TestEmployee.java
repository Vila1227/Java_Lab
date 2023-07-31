
package com.mycompany.employee4;
public class TestEmployee {

    public static void main(String[] args) {
     
        // Create an object for Mr. Bogdan
        Employee4 bogdan = new Employee4();
        bogdan.setEmpID(111);
        bogdan.setEmpName("Bogdan");
        bogdan.setEmpDesignation("Teacher");

        // Create an object for Ms. Bird
        Employee4 bird = new Employee4();
        bird.setEmpID(1112);
        bird.setEmpName("Ms. Bird");
        bird.setEmpDesignation("Business Analyst");

        // Print employee details using getters
        System.out.println("Employee ID: " + bogdan.getEmpID());
        System.out.println("Employee Name: " + bogdan.getEmpName());
        System.out.println("Employee Designation: " + bogdan.getEmpDesignation());

        System.out.println("\nEmployee ID: " + bird.getEmpID());
        System.out.println("Employee Name: " + bird.getEmpName());
        System.out.println("Employee Designation: " + bird.getEmpDesignation());
    }
}
        
        
