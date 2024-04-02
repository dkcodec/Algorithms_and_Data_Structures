package Recursion.Assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*

   Task 2

    Try to solve this problem using List. For this problem, we have 2 types of queries:
    a. Insert y at index x: Insert x y
    b. Delete the element at index x: Delete x
    Given a list, L, of N integers, perform Q queries on the list. Once all queries are completed, print the modified list as a single line of space-separated integers.

    Input Format
        The first line contains an integer, N (the initial number of elements in L).
        The second line contains N space-separated integers describing L.
        The third line contains an integer, Q (the number of queries).
        The 2Q subsequent lines describe the queries, and each query is described over two lines.

    - If the first line of a query contains the String Insert, then the second line contains two space separated integers x y, and the value y must be inserted into L at index x.
    - If the first line of a query contains the String Delete, then the second line contains index x, whose element must be deleted from L.

    Output Format
        Print the updated list L as a single line of space-separated integers.

    Input:
        5
        12 0 1 78 12
        2
        Insert
        5 23
        Delete
        0

    Output:
        0 1 78 12 23

*/

public class B_insert_Delete {
    static Scanner scanner = new Scanner(System.in);
    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {

        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            list.add(scanner.nextInt());
        }

        int query = scanner.nextInt();
        for(int i = 0; i < query; i++){
            String str = scanner.next();
            switch (str) {
                case "Insert": {
                    int x = scanner.nextInt();
                    int el = scanner.nextInt();
                    if (x >= list.size()){
                        list.add(el);
                        break;
                    }else {
                        list.set(x, el);
                        break;
                    }
                }
                case "Delete": {
                    int x = scanner.nextInt();
                    if (x <= list.size()){
                        list.remove(x);
                    }else {
                        System.out.println("ERROR!");
                        break;
                    }
                }
            }
        }

        for(int el : list){
            System.out.print(el + " ");
        }
        System.out.println();
    }
}
