package fastcampus.ch03_배열;

import java.util.Scanner;

public class Q3273 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 수열의 크기
        int[] arr = new int[n]; // 수열에 포함되는 수
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt(); // a + b = x

        boolean[] exist = new boolean[1_000_001];
        for (int i = 0; i < n; i++) {
            exist[arr[i]] = true;
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            int pairValue = x - arr[i];
            if (0 <= pairValue && pairValue <= 1_000_000) {
                count += exist[pairValue] ? 1 : 0;
            }
        }
        System.out.println(count / 2);
    }
}
