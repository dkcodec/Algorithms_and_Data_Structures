package Recursion;

import java.util.Scanner;

/*  Task 9  */
/*

    Given a string (one dimension char array) consisting of M distinct symbols.
    Print all the permutations (all possible variants) of the symbols of this string.

    Sample Input 1:
        AB
    Sample Output 1:
        ABBA
    Sample Input 2:
        IOX
    Sample Output 2:
        XOI
        OIX
        IXO
        XIO
        OXI
        IOX
*/

public class I_all_the_permutations {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        String input = scanner.next();
        char[] inpurChr = new char[input.length()];
        inpurChr = input.toCharArray();
        allPermutationsFn(inpurChr, 0);
    }
    private static void allPermutationsFn(char[] input, int startPoint){
        if(startPoint == input.length - 1){
            System.out.println(input);
            return;
        }
        for(int i = startPoint; i < input.length; i++){
            swapFn(input, startPoint, i);
            allPermutationsFn(input, startPoint + 1);
        }
    }

    private static void swapFn(char[] arr, int a, int b){
        char t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}
