package Recursion;

import java.util.Scanner;

public class E_sequence_in_reverse_order {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("n = ");
        int n = scanner.nextInt();


        if (n > 0) sequenceReversFn(n);
        else System.out.println("size less than 0");
    }
    private static void sequenceReversFn(int n){
        int number;
        number = scanner.nextInt();
        if(n == 1){
            System.out.print(number + " ");
            return;
        }
        sequenceReversFn(n-1);
        System.out.print(number + " ");
    }
}
