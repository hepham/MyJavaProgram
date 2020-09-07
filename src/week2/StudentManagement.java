package week2;

import java.util.Scanner;

public class StudentManagement {
    private Student students[] = new Student[100];
    private int n;

    public StudentManagement(Student[] students) {
        this.students = students;
    }

    public StudentManagement() {
    }

    public void addStudent(Student student) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong hoc sinh");
        n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1));
            System.out.printf("Ten: ");
            String name = sc.nextLine();
            System.out.printf("ID: ");
            String id = sc.nextLine();
            System.out.printf("Group: ");
            String group = sc.nextLine();
            System.out.printf("Email: ");
            String email = sc.nextLine();

            student = new Student(name, id, group, email);
            students[i] = student;
        }
    }

    public String getAllStudent() {
        for (int i = 0; i < n; i++) {
            System.out.println(students[i].getInfor());
        }
        return null;
    }

    public String studentsByGroup() {
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = students[i].getGroup();
        }
        int sopt = arr.length;
        for (int i = 0; i < sopt - 1; i++) {
            for (int j = i + 1; j < sopt; j++) {
                if (arr[i] .equals(arr[j])) {
                    for (int k = j + 1; k < sopt; k++) {
                        arr[k - 1] = arr[k];
                    }
                    sopt--;
                    j--;
                }
            }
        }
        for (int j=0 ;j< sopt;j++) {
            System.out.println(arr[j]);
            for (int i = 0; i < n; i++) {
                if (students[i].getGroup().equals(arr[j])) {
                    System.out.println(students[i].getInfor());
                }
            }
        }
        return null;
    }
    public void removeStudent(String id){
        for (int i = 0; i < n; i++) {
            if(students[i].getId().equals(id)){
                for (int j = i+1; j < n-1; j++) {
                    students[j-1]=students[j];
                }
                n--;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(students[i].getInfor());
        }
    }


}
