package Recursion;

import java.util.Scanner;

public class H_all_sequences_for_n_and_k {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("n = ");
        int n = scanner.nextInt();
        System.out.println("k = ");
        int k = scanner.nextInt();

        allSequencesFn(n, k);
    }

    private static void allSequencesFn(int n, int k){
        int counter = 0;
        if (counter == k){
            System.out.println();
        }
    };
}
