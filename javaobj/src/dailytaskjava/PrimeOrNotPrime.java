package dailytaskjava;

import java.util.Scanner;

public class PrimeOrNotPrime {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
    	Scanner evenodd =new Scanner(System.in);
		System.out.println("enter the number");
		int n= evenodd.nextInt();
        if (isPrime(n)) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is not prime");
        }
    }
}
