package etc.January.january02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long V = Long.parseLong(st.nextToken());
        long count = 1;
        long height = 0; // 높이
        while (true) {
            height += A;
            if (height >= V) {
                System.out.println(count);
                break;
            }
            height -= B;
            count++;
        }
    }
}
