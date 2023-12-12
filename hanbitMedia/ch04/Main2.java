package hanbitMedia.ch04;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //크기
        int count = 0;
        //00시 00분 00초부터 ~ 5시 59분 59초까지 3이 하나라도 포함되는 경우의 수
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= 59; j++) {
                for (int k = 0; k <= 59; k++) {
                    String h = String.valueOf(i);
                    String m = String.valueOf(j);
                    String s = String.valueOf(k);
                    if (h.contains("3") || m.contains("3") || s.contains("3")) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
