package hanbitMedia.ch03;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    // TODO 숫자 카드 게임
    //  N행  M열 의 카드가 있을 때 가장 높은 숫자가 쓰인 카드 한 장 뽑기
    //  1<=n , M<=100
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int result = 0;
        for (int i = 0; i < n; i++) {
            int minVal = 20000;
            for (int j = 0; j < m; j++) {
                int num = sc.nextInt();
                minVal = Math.min(num, minVal);
            }
            if (result < minVal) {
                result = minVal;
            }
        }
        System.out.println(result);

    }
}
