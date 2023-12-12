package hanbitMedia.ch03;

import java.io.*;
import java.util.Scanner;

public class Main1 {
    // TODO 당신은 음식점의 계산을 도와주는 점원이다.
    //  카운터에는 거스름돈으로 사용할 500원, 100원, 50원, 10원짜리 동전이 무한히 존재한다고 가정한다.
    //  손님에게 거슬러 줘야할 돈이 N원일때 거슬러줘야 할 동전의 최소 개수를 구하라. 단, 거슬러 줘야할 돈 N은 항상 10의 배수이다.
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = {500, 100, 50, 10};
        int count = 0;
        for (int j : arr) {
            count += N / j;
            N %= j;
        }
        System.out.println(count);
    }
}
