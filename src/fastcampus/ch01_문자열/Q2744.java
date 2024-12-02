package fastcampus.ch01_문자열;

import java.util.Scanner;

public class Q2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("단어를 입력해주세요. : ");
        String str = sc.nextLine();

        char[] ans = str.toCharArray(); // toCharArray() : 문자열 -> char형 배열로 반환

        for (int i = 0; i < str.length(); i++) { // A : 65 , a : 97
            char ch = str.charAt(i);
            if ('A' <= ch && ch <= 'Z')
                ans[i] = (char) ('a' + ch - 'A');
            else
                ans[i] = (char)('A' + ch - 'a');
        }

        System.out.println(ans);

    }
}
