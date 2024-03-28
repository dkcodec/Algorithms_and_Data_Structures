package Recursion;

import java.util.Scanner;

/*  Task 6  */
/*
    Given a positive integer N and a sequence of N strings. You have to display
    given sequence in reverse order.

    Note. The program is forbidden to declare arrays (only one char array in
    function is allowed), and use the cycles (even for input).

    Input: First line contains n (1<=n<=100). The next n lines contain onedimension char arrays. Array is no longer that 20 symbols.
    Output: The sequence of element in reverse order.

    Sample Input:
        3
        Abc
        bcdh
        abcdef
    Sample Output:
        abcdef
        bcdh
        abc
*/

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
