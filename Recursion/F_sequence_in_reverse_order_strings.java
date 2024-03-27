package Recursion;

import java.util.Scanner;

public class F_sequence_in_reverse_order_strings {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("n = ");
        int n = scanner.nextInt();

        if(n < 0) System.out.println("n less than 0");
        else sequenceStrReversFn(n);
    }

    private static void sequenceStrReversFn(int n){
        String str = scanner.next();
        if (n == 1){
            System.out.println(str.toLowerCase());
            return;
        }
        sequenceStrReversFn(n-1);
        System.out.println(str.toLowerCase());
    }

}
