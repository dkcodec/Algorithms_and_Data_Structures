package Recursion;

import java.util.Scanner;

/*  Task 2  */
/*
    Write and test a recursive function that returns the sum of the first n
    elements of an array.
*/

public class B_sum_of_the_first_n_elements_of_an_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int sizeArr = scanner.nextInt();

        if (sizeArr < 0) System.out.println("size less than 0");
        else {

            int[] arr = new int[sizeArr];

            System.out.println("Enter the values of array:");
            for (int i = 0; i < sizeArr; i++) {
                System.out.print((i + 1) + " value is ");
                int val = scanner.nextInt();
                arr[i] = val;
            }
            System.out.println();

            System.out.print("n = ");
            int n = scanner.nextInt();
            System.out.println("Sum of first n elements of an array is " + sumOfArrFn(n, arr));
        }
    }

    private static int sumOfArrFn(int n, int[] arr){
        int sum = 0;
        if (n == -1) return sum;
        sum = arr[n] + sumOfArrFn(n - 1, arr);
        return sum;
    }

}
