package com.bptn.course._08_inheritance_in_depth;

public class Student {
    String name;
    int grade;
    public static String principalName = "Ms. McKoy";
    String studentID;
    static int nextID = 100;
    // Create Constructor
    // Create static method newPrincipal
    // Create static method resetID
    // Create toString() method
    public Student(String name, int grade){
        this.name = name;
        this.grade = grade;
        this.studentID = name.substring(0,1).toUpperCase() + nextID;
        nextID++;
    }
    public static void newPrincipal(String newPrincipalName){
        principalName = newPrincipalName;
    }
    public static void resetID(){
        nextID = 100;
    }

    public String toString() {
        return name + " " + studentID;
    }

    // Do not modify the code below:
    public static void main(String[] args) {
        Student s1 = new Student("Muhammed", 11);
        Student s2 = new Student("Alan", 11);
        Student s3 = new Student("Sophie", 11);

        System.out.println("Principal Name for student 1: " + Student.principalName);
        System.out.println("Student ID for student 1: " + s1.studentID);
        System.out.println("Student ID for student 2: " + s2.studentID);
        System.out.println("Student ID for student 3: " + s3.studentID);

        Student.newPrincipal("Mr. McKoy");
        System.out.println("New principal name: " + Student.principalName);

        Student.resetID();
        Student s4 = new Student("kevin", 11);
        System.out.println("Student ID for student 4: " + s4.studentID);
        System.out.println("String representation of student 4: " + s4.toString());
    }
}
