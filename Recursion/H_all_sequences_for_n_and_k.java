package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

/*  Task  8  */
/*
    Given two positive integers n and k. Your task is to output all sequences
    like: x1, x2, ..., xN such that xi - natural and 1<=xi<=k.

    Note. Use recursion for solving this problem.

    Sample Input 1:
        2 3
    Sample Output 1:
        1 1
        1 2
        1 3
        2 1
        2 2
        2 3
        3 1
        3 2
        3 3
    Sample Input 2:
        3 3
    Sample Output 2:
        1 1 1
        1 1 2
        1 1 3
        1 2 1
        1 2 2
        1 2 3
        1 3 1
        1 3 2
        1 3 3
        2 1 1
        2 1 2
        2 1 3
        2 2 1
        2 2 2
        2 2 3
        2 3 1
        2 3 2
        2 3 3
        3 1 1
        3 1 2
        3 1 3
        3 2 1
        3 2 2
        3 2 3
        3 3 1
        3 3 2
        3 3 3
*/

public class H_all_sequences_for_n_and_k {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.print("k = ");
        int k = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        allSequencesFn(n, k, arr);
    }

    private static void allSequencesFn(int n, int k, ArrayList<Integer> arr){
        if (arr.size() == n) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= k; i++) {
            arr.add(i);
            allSequencesFn(n, k, arr);
            arr.remove(arr.size() - 1);
        }
    };
}
