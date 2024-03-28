package Recursion;

import java.util.Scanner;

/*  Task 5  */
/*
    Given a positive integer N and a sequence of N elements. You have to
    display given sequence in reverse order.

    Note. The program is forbidden to declare arrays, and use the cycles (even
    for input).

    Sample Input:
        3
        1 2 3
    Sample Output:
        3 2 1
*/

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
