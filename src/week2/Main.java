package week2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Student students[]=new Student[100];

        StudentManagement management= new StudentManagement(students);
        Student student=new Student();

        management.addStudent(student);
        System.out.println("------------------------------");
        management.studentsByGroup();
        System.out.println("-------------------------------");
        System.out.println("Enter the student's id to remove");
        String id=sc.nextLine();
        management.removeStudent(id);
    }
}
