package Graphs.problem2;

import java.util.ArrayList;
import java.util.List;

public class graph {
    public static void main(String[] args) {
        List<Integer> T = new ArrayList<>();
        T.add(1);
        T.add(2);
        T.add(3);
        T.add(4);
        T.add(10);
        T.add(11);
        T.add(12);
        T.add(20);
        T.add(28);
        T.add(33);

        int[][] A1 = new int[T.size()][T.size()];
        int[][] B1 = new int[T.size()][T.size()];

        List<Integer[]> A = new ArrayList<>();
        List<Integer[]> B = new ArrayList<>();

        for (int i = 0; i < T.size(); i++) {
            for (int j = 0; j < T.size(); j++) {
                int x = T.get(i);
                int y = T.get(j);
                if (x != y && x % y == 0) {
                    Integer[] t = {x, y};
                    A.add(t);
                    A1[i][j] = 1;
                    A1[j][i] = 1;
                }
            }
        }

        B.add(new Integer[]{1, 3});
        B.add(new Integer[]{2, 4});
        B.add(new Integer[]{2, 2});
        B.add(new Integer[]{12, 33});

        for (Integer[] t : B) {
            int i = t[0] - 1;
            int j = t[1] - 1;
            B1[i][j] = 1;
            B1[j][i] = 1;
        }

        for (int[] row : A1) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int[] row : B1) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
