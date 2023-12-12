package etc.November.november01;

public class Sol1 {
    public static void main(String[] args) {
        // 정수 배열 arr가 주어집니다. arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고, 50보다 작은 홀수라면 2를 곱하고 다시 1을 더합니다.
        // 이러한 작업을 x번 반복한 결과인 배열을 arr(x)라고 표현했을 때, arr(x) = arr(x + 1)인 x가 항상 존재합니다.
        // 이러한 x 중 가장 작은 값을 return 하는 solution 함수를 완성해 주세요.
        // 단, 두 배열에 대한 "="는 두 배열의 크기가 서로 같으며, 같은 인덱스의 원소가 각각 서로 같음을 의미합니다.
        int[] arr = {1, 2, 3, 100, 99, 98};

        int answer = 0;

        //arr의 원소들이 변하지 않는 시점까지 반복
        int cnt =0;
        while(cnt < arr.length) {
            cnt = 0;
            for (int i=0; i<arr.length; i++) {
                if (arr[i]%2==0 && arr[i]>=50) { //원소의 값이 50보다 크거나 같은 짝수 -> 나누기 2
                    int tmp = 0;
                    tmp = arr[i];
                    arr[i] = arr[i] / 2;
                    if (tmp == arr[i]) {
                        cnt++;
                    }
                } else if (arr[i]%2!=0 && arr[i]<50) { //원소의 값이 50보다 작은 홀수 -> 곱하기 2 + 1
                    int tmp = 0;
                    tmp = arr[i];
                    arr[i] = arr[i] * 2 + 1;
                    if (tmp == arr[i]) {
                        cnt++;
                    }
                } else {
                    int tmp = 0;
                    tmp = arr[i];
                    if (tmp == arr[i]) {
                        cnt++;
                    }
                }
            }
            answer++;
        }

        System.out.println(answer);
//        for (int i: arr) {
//            System.out.println(i);
//        }

    }
}
