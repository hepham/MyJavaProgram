package week2;

import java.util.Scanner;

public class StudentManagement {
    private Student students[]=new Student[100];
    private int n;

    public StudentManagement(Student[] students, int n) {
        this.students = students;
        this.n = n;
    }

    public StudentManagement() {
    }

    public void addStudent(Student student){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap vao so luong hoc sinh");
        n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n ; i++) {
            System.out.println("Nhap thong tin sinh vien thu "+(i+1));
            System.out.printf("Ten: ");
            String name=sc.nextLine();
            System.out.printf("ID: ");
            String id=sc.nextLine();
            System.out.printf("Group: ");
            String group=sc.nextLine();
            System.out.printf("Email: ");
            String email=sc.nextLine();

            student=new Student(name,id,group,email);
            students[i]=student;
        }
    }
    public String getAllStudent(){
        for (int i = 0; i < n ; i++) {
            System.out.println(students[i].getInfor());
        }
        return null;
    }
}
