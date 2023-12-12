package hanbitMedia.ch04;

import java.io.*;
import java.util.Scanner;

public class Main1 {
    // TODO 지도와 계획서가 주어져있다.
    //  여행가는 N x N 크기의 정사각형 공간 위에 서 있다. 이 공간은 1 x 1 크기의 정사각형으로 나누어져 있다.
    //  가장 왼쪽 위 좌표는 (1, 1)이며, 가장 오른쪽 아래 좌표는 (N, N)이다.
    //  계획서는 L / R / U / D 가 적혀있으며, 좌 /우 / 상/ 하를 의미한다.
    //  계획서를 보고 최종 좌표를 출력하라.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //크기
        sc.nextLine();
        String[] plans = sc.nextLine().split(" "); //계획서
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        char[] moveTypes = {'L', 'R', 'U', 'D'};
        int x = 1, y = 1;
        for (int i = 0; i < plans.length; i++) {
            char plan = plans[i].charAt(0);
            //이동 후 좌표(nx, ny) 구하기
            //nx, ny 초기화
            int nx = -1, ny = -1;
            for (int j = 0; j < moveTypes.length; j++) {
                if (plan == moveTypes[j]) {
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }
            //공간을 무시하는 경우
            if (nx < 1 || ny < 1 || nx > n || ny > n) {
                continue;
            }
            //이동후 좌표로 위치 이동
            x = nx;
            y = ny;
        }

        System.out.println(x + " " + y);



    }
}
