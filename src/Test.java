import javafx.concurrent.Task;
import week3.Task1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua mang");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("Nhap vao cac phan tu cua mang");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    for (int k = j + 1; k < n; k++) {
                        arr[k - 1] = arr[k];
                    }
                    n--;
                    j--;
                }
            }
        }
        System.out.println("So phan tu cua mang la "+n);
        System.out.println("Mang sau khi xoa cac phan tu trung nhau la");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
