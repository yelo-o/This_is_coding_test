package hanbitMedia.ch03;

import java.io.*;
import java.util.Scanner;

public class Main4 {
    // TODO 1이 될 때까지
    //  연산은 2가지가 있으며 2가지 방법을 이용해서 1을 만드는 최소 횟수를 찾아라
    //  1. N에서 1을 뺀다.
    //  2. N을 K로 나눈다.

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int cnt = 0;

        while (n >= k) { //n이 k보다 작아지기 전까지 계속
            while (n % k != 0) { //나눠떨어지도록 -1을 해서 맞춰준다.
                n -= 1;
                cnt++;
            }
            n /= k;
            cnt++;
        }

        while (n > 1) {
            n -= 1;
            cnt++;
        }

        System.out.println(cnt);

    }
}
