package Recursion;

import java.util.*;

/*  Task 1  */
/*
    Write and test a recursive function that returns the sum of the squares of the
    first n positive integers.

    1^2 + 2^2 + … + 𝑛^2

    Sample Input:
        n = 4
    Sample Output:
        1^2 + 2^2 + 3^2 + 4^2 = 30
*/

public class A_sum_of_the_squares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n = ");
        int n = scanner.nextInt();

        System.out.println("Answer is " + sumRecursionFn(n));
    }

    private static int sumRecursionFn(int number){
        int sum = 0;
        if (number == 0) return sum;
        sum = pow(number, 2) + sumRecursionFn(number - 1);

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
