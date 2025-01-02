package fastcampus.ch04_완전탐색_시뮬레이션;

import java.util.Scanner;

public class Q10448 {
    public static void main(String[] args) {

        preprocess();

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스

        while (T-- > 0) {
            int K = sc.nextInt();
            System.out.println(isEurekaNumber[K] ? "1" : "0");
        }
    }

    // 전처리 이용
    static boolean[] isEurekaNumber = new boolean[1001];

    public static void preprocess() {
        int[] triangleNumbers = new int[44];
        int triangleNumberCount = getTriangleNumbers(triangleNumbers, 1000);

        for (int i = 0; i < triangleNumberCount; i++) {
            for (int j = 0; j < triangleNumberCount; j++) {
                for (int k = 0; k < triangleNumberCount; k++) {
                    int sum = triangleNumbers[i] + triangleNumbers[j] + triangleNumbers[k];
                    if (sum <= 1000) {
                        isEurekaNumber[sum] = true;
                    }
                }
            }
        }
    }

    // 모든 삼각수
    public static int getTriangleNumbers(int[] triangleNumbers, int K) {
        int triangleNumberCount = 0; // triangleNumber의 갯수
        for (int i = 1; ; i++) {
            int triangleNumber = i * (i + 1) / 2;
            if (triangleNumber >= K) break;
            // triangleNumbers[0] = 1, triangleNumbers[1] = 3, triangleNumbers[2] 6, ...
            triangleNumbers[triangleNumberCount++] = triangleNumber;
        }
        return triangleNumberCount;
    }
}
