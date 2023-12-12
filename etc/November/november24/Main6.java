package etc.November.november24;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();
        long answer =Math.abs(N - M);
        System.out.println(answer);
    }
}
