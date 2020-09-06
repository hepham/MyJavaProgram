import javafx.concurrent.Task;
import week3.Task1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Task1 test = new Task1();
        int k = test.gcd(125, 25);
        System.out.println(k);
        int fib=test.fibonacci(6);
        System.out.println(fib);
        test.sieveEratosthenes(100);
        int a[]=new int[2];
        a[0]=1;
        a[1]=2;

    }
}
