package week2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        StudentManagement management= new StudentManagement();
        Student student=new Student();
        management.addStudent(student);
        management.getAllStudent();
    }
}
