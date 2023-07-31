

package com.mycompany.personexample;

public class PersonExample {

    public static void main(String[] args) {
     
        // Create a Student object
        Student student = new Student();
        student.setName("KamalPerera");
        student.setId(111);
        student.setCourse("Chemestry");

        // Create a Lecturer object
        Lecturer lecturer = new Lecturer();
        lecturer.setName("Namal Silva");
        lecturer.setId(112);
        lecturer.setProgramme("Software Engineering");

        // Print details of the Student and Lecturer
        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getId());
        System.out.println("Course: " + student.getCourse());

        System.out.println("\nLecturer Details:");
        System.out.println("Name: " + lecturer.getName());
        System.out.println("ID: " + lecturer.getId());
        System.out.println("Programme: " + lecturer.getProgramme());
    }
}

   
