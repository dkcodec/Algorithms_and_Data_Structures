package DataStructures_and_Search;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class poblem1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        int mx = -1000, mxI = 0;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if (mx < arr[i]){
                mx = arr[i];
                mxI = i;
            }
        }

        int temp = arr[0];
        arr[0] = arr[mxI];
        arr[mxI] = temp;

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + ", ");
        }
    }
}
