package etc.November.november23;

import java.io.IOException;
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int time = sc.nextInt();
        int minSum = min + time;

        if (minSum < 60) {
            System.out.println(hour + " " + minSum);
        } else {
            int hourIncrease = (minSum / 60);
            hour += hourIncrease;
            if (hour >= 24) {
                hour %= 24;
            }
            minSum -= 60;
            minSum %= 60;
            System.out.println(hour + " " + minSum);
        }
    }
}