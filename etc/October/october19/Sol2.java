package etc.October.october19;

import java.util.Arrays;

public class Sol2 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5};
        int len = numbers.length;
        int num1 = 1;
        int num2 = 3;

        int[] answer = Arrays.copyOfRange(numbers, num1, num2+1);
        for(int i: answer) {
            System.out.println(i);
        }

    }

}
