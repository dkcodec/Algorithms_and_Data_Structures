package Recursion.Assignment2;

import java.util.ArrayList;
import java.util.Scanner;

/*

    Task 1

    Sometimes it's better to use dynamic size arrays. Try to solve this problem using Arraylist.
    You are given n lines. In each line there are zero or more integers.
    You need to answer a few queries where you need to tell the number located in yth position of xth line.
    Take your input from System.in.

    Input Format
        The first line has an integer n.
        In each of the next n lines there will be an integer d denoting number of integers on that line and then there will be d space-separated integers.
        In the next line there will be an integer denoting number of queries.
        Each query will consist of two integers x and y.

    Output Format
        In each line, output the number located in yth position of xth line. If there is no such position, just print "ERROR!"

    Example:
        3
        3 1 2 3
        2 4 5
        0
        2
        1 2
        2 3
    Output:
        2
        ERROR!


*/

public class A_ArrayList {

    static Scanner scanner = new Scanner(System.in);

    static ArrayList<ArrayList<Integer>> lines = new ArrayList<>();

    public static void main(String[] args) {
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            int arrSize = scanner.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int j = 0; j < arrSize; j++){
                arr.add(scanner.nextInt());
            }
            lines.add(arr);
        }

        int query = scanner.nextInt();
        for(int i = 0; i < query; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (x <= lines.size() && y<= lines.get(x-1).size()){
                System.out.println(lines.get(x-1).get(y-1));
            } else {
                System.out.println("ERROR!");
            }
        }
    }
}
