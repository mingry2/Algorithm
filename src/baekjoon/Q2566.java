package baekjoon;

import java.util.Scanner;

public class Q2566 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[10][10];

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int max = arr[1][1];
        int rows = 1;
        int cols = 1;

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    rows = i;
                    cols = j;
                }
            }
        }

        System.out.println(max);
        System.out.println(rows + " " + cols);

    }
}
