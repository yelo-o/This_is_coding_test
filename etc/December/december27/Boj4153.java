package etc.December.december27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        List<String> answerList = new ArrayList<>();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0 && c == 0) {
                break;
            } else {
                while(st.hasMoreTokens()){
                    list.add(a);
                    list.add(b);
                    list.add(c);
                }
                Collections.sort(list);
                if (a * a + b * b == c * c) {
                    answerList.add("right");
                } else {
                    answerList.add("wrong");
                }
                list.clear();
            }
        }
        br.close();
        for (String s : answerList) {
            System.out.println(s);
        }
    }
}
