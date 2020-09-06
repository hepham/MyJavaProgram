package week3;

public class Task1 {
    public int gcd(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    // compute the fibonacci of $n
    public int fibonacci(int n) {
        int fib1 = 0;
        int fib2 = 1;
        int fib = fib1 + fib2;
        for (int i = 2; i < n; i++) {
            fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
        }
        return fib;
    }

    /**
     * print all prime numbers from 0 to $n use Sieve of Eratosthenes algorithm
     * useful link https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
     * notice that print each number in a line
     *
     * @param n
     */
    public void sieveEratosthenes(int n) {
        boolean a[] = new boolean[n+1];
        for (int i = 0; i < n; i++) {
            a[i] = true;
        }

        for (int j = 2; j <= (int)Math.sqrt(n); j++) {
            if (a[j] == true) {
                for (int i = j * 2; i <= n; i += j) {
                    a[i] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (a[i] == true)
                System.out.print(i + " ");
        }
    }
}
