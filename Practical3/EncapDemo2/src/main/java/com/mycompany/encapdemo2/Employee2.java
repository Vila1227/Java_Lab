
package com.mycompany.encapdemo2;
public class Employee2 {   private String empName;
    private int age;
    private double salary;

    //Constructor
    
    public Employee2(String en,int a,double sl){
    	empName = en;
    	age = a;
	salary = sl;
    }

    //Getter method for Name

    public String getEmpName(){
        return empName;
    }

    //Getter method for Age

    public int getAge(){
        return age;
    }

    //Getter method for Salary

    public double getSalary(){
        return salary;
    }

}

    

