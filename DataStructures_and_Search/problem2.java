package DataStructures_and_Search;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class problem2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Map<Integer, Integer> mp = new HashMap<>();

        for(int i = 0; i < n; i++){
            if (!mp.containsKey(arr[i])){
                mp.put(arr[i], 1);
            } else{
                mp.put(arr[i], mp.get(arr[i])+1);
            }
        }

        System.out.println(mp);
    }

//    public static boolean hasRepetitiveElements(int[] arr) {
//        Arrays.sort(arr);
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] == arr[i + 1]) {
//                return true; // Repetitive elements found
//            }
//        }
//
//        return false;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] arrWithRepetition = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9};
//
//        System.out.println("Array has repetitive elements: " + hasRepetitiveElements(arr));
//        System.out.println("Array has repetitive elements: " + hasRepetitiveElements(arrWithRepetition));
//    }


}
