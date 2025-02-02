package baekjoon;

import java.util.Scanner;

public class Q2563 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[][] paper = new boolean[100][100];
        int count = sc.nextInt(); // 색종이 갯수

        for (int i = 0; i < count; i++) {
            int row = sc.nextInt();
            int col = sc.nextInt();
            for (int j = row; j < row + 10; j++) {
                for (int k = col; k < col + 10; k++) {
                    paper[j][k] = true;
                }
            }
        }

        int result = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (paper[i][j] == true) {
                    result++;
                }
            }
        }

        System.out.println(result);

    }

}
