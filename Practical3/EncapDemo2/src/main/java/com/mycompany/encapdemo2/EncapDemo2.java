
package com.mycompany.encapdemo2;

public class EncapDemo2 {

    public static void main(String[] args) {
        
         
    //set values using the setter method
         Employee2 e = new Employee2("JAndrue",55,75050.00);

    
    //display values using the getter method
	 System.out.println("Employee Name: " +e.getEmpName());
	 System.out.println("Employee Age: " +e.getAge());
	 System.out.println("Employee Salary: " +e.getSalary());
    } 
}

    
