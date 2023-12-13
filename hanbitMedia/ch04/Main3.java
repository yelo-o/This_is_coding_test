package hanbitMedia.ch04;

import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String move = sc.nextLine();
        char xChar = move.charAt(0);
        char yChar = move.charAt(1);

        int x = xChar - 'a' + 1;
        int y = yChar - '0';

        int cnt = 0;

        int[][] steps = new int[][]{{-2, -1}, {-1, -2}, {1, -2}, {2, -1},
                                    {2, 1}, {1, 2}, {-1, 2}, {-2, 1}};

        for (int i = 0; i < 8; i++) {
            int nx = -1, ny = -1;
            nx = x + steps[i][0];
            ny = y + steps[i][1];
            if (nx >= 1 && nx <= 8 && ny >= 1 && ny <= 8) {
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
