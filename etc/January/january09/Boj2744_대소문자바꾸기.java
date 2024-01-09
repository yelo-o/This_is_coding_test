package etc.January.january09;

import java.io.BufferedReader;
import java.util.Scanner;

public class Boj2744_대소문자바꾸기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            String tmp = "";
            tmp += s.charAt(i);
            if (tmp.equals(tmp.toLowerCase())) { // 소문자
                answer += tmp.toUpperCase();
            } else {
                answer += tmp.toLowerCase();
            }
        }
        System.out.println(answer);
    }
}
