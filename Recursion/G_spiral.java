package Recursion;

import java.util.Scanner;

/*  Task 7  */
/*
    Print the square that consists of NxN cells filled with numbers from 1 to
    N*N in a spiral mode (see examples).

    Note. Use recursion for solving this problem.

    Sample Input 1:
        3
    Sample Output 1:
        1 2 3
        8 9 4
        7 6 5
    Sample Input 2:
        4
    Sample Output 2:
        1 2 3 4
        12 13 14 5
        11 16 15 6
        10 9 8 7
*/

public class G_spiral {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("n = ");
        int n = scanner.nextInt();
        int[][] spiralSquare = new int[n][n];

        if(n>0) spiralFn(spiralSquare, 1, 0, n);
        else System.out.println("n less than 0");

        outPutSquareFn(spiralSquare);
    }
    private static void spiralFn(int[][] square, int num, int start, int size){
        if (size <= 0) {
            return;
        }
        // top row
        for (int i = 0; i < size; i++) {
            square[start][start + i] = num++;
        }
        // right column
        for (int i = 1; i < size; i++) {
            square[start + i][start + size - 1] = num++;
        }
        // bottom row
        for (int i = size - 2; i >= 0; i--) {
            square[start + size - 1][start + i] = num++;
        }
        // left column
        for (int i = size - 2; i > 0; i--) {
            square[start + i][start] = num++;
        }
        // inner square
        spiralFn(square, num, start + 1, size - 2);
    }

    private static void outPutSquareFn(int[][] square){
        for (int[] row : square) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
