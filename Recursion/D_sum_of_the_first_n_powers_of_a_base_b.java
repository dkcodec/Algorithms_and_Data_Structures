package Recursion;

import java.util.Scanner;

/*  Task 4  */
/*
    Write and test a recursive function that returns the sum of the first n powers
    of a base b.

    𝑏^0 + 𝑏^1 + 𝑏^2 + … + 𝑏^𝑛

    Sample Input:
        b = 4, n = 3
    Sample Output:
        4^0 + 4^1 + 4^2 + 4^3 = 85
*/

public class D_sum_of_the_first_n_powers_of_a_base_b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.print("n = ");
        int n = scanner.nextInt();

        System.out.println("Answer is " + sumRecursionFn(n, b));
    }

    private static int sumRecursionFn(int power, int base){
        int sum = 0;
        if (power == -1) return sum;
        sum = pow(base, power) + sumRecursionFn(power - 1, base);

        return sum;
    }

    private static int pow(int num, int power){
        int result = 1;
        for (int i = 0; i < power; i++){
            result *= num;
        }
        return result;
    }
}
