package hanbitMedia.ch03;

import java.io.*;
import java.util.Arrays;

public class Main2 {
    // TODO 큰 수의 법칙
    //  N : 주어지는 개수 , M : , K : 연속가능 수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        int k = Integer.parseInt(split[2]);

        String[] numStr = br.readLine().split(" ");
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(numStr[i]);
        }
        Arrays.sort(num);
        int first = num[n - 1];
        int second = num[n - 2];

        int cnt = (m / (k + 1)) * k; // 1뭉탱이 개수 -> 1 뭉탱이는 first k개 + second 1개로 구성
        cnt = cnt + m % (k + 1); // 1뭉탱이가 안되는 것도 더해준다.
        System.out.println(cnt);

        System.out.println(first * cnt + second * (m - cnt));

        bw.flush();
        bw.close();
        br.close();

    }
}
