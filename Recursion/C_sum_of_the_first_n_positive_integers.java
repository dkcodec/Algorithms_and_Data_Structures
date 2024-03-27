package Recursion;

import java.util.Scanner;

public class C_sum_of_the_first_n_positive_integers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n = ");
        int n = scanner.nextInt();

        if (n > 0)  System.out.println("Answer is " + sumRecursionFn(n));
        else System.out.println("n less than 0");
    }
    private static int sumRecursionFn(int number){
        int sum = 0;
        if (number == 0) return sum;
        sum = number + sumRecursionFn(number - 1);
        return sum;
    }
}
