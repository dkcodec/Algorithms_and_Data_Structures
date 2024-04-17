package Recursion.Assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import static java.util.Collections.reverse;

public class C_reverse_recursion {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> a = new ArrayList<Integer>();
        String[] strNums;
        strNums = bi.readLine().split(" ");
        for (int i = 0; i < strNums.length; i++) {
            a.add(Integer.parseInt(strNums[i]));
        }

        reverseFn(a, a.size(), 0);
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }
    }

    static void reverseFn(ArrayList<Integer> arr, int n, int i) {
        if (i > n / 2) {
            return;
        }
        int t = arr.get(i);
        arr.set(i, arr.get(n - 1 - i));
        arr.set(n - 1 - i, t);
        reverseFn(arr, n, i + 1);
    }
}
