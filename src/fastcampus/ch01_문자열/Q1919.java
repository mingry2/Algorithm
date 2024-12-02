package fastcampus.ch01_문자열;

import java.util.Scanner;

public class Q1919 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("영어 단어를 입력해주세요 : ");
        String a = sc.next();
        String b = sc.next();

        int[] countA = getAlphabetCount(a);
        int[] countB = getAlphabetCount(b);

        int ans = 0;
        for (int i = 0; i < 26; i++)
            ans += Math.abs(countA[i] - countB[i]);

        System.out.println("제거해야하는 최소 개수 : " + ans);
    }

    private static int[] getAlphabetCount(String a) {
        int[] count = new int[26];
        for (int i = 0; i < a.length(); i++)
            count[a.charAt(i) - 'a']++;
        return count;
    }
}
