package etc.October.october23;

public class Sol10 {
    public static void main(String[] args) {
        //이 문제에서 두 정수 배열의 대소관계를 다음과 같이 정의합니다.
        // 두 배열의 길이가 다르다면, 배열의 길이가 긴 쪽이 더 큽니다.
        // 배열의 길이가 같다면 각 배열에 있는 모든 원소의 합을 비교하여 다르다면 더 큰 쪽이 크고, 같다면 같습니다.
        // 두 정수 배열 arr1과 arr2가 주어질 때, 위에서 정의한 배열의 대소관계에 대하여
        // arr2가 크다면 -1, arr1이 크다면 1, 두 배열이 같다면 0을 return 하는 solution 함수를 작성해 주세요.
        int[] arr1 = new int[]{49, 13};
        int[] arr2 = new int[]{70, 11, 2};
        int sum1 = 0;
        int sum2 = 0;
        for(int a : arr1) {
            sum1 += a;
        }
        for(int a : arr2) {
            sum2 += a;
        }
        int answer = 0;
        if (arr1.length > arr2.length) {
            answer = 1;
        } else if (arr1.length < arr2.length) {
            answer = -1;
        } else if (arr1.length == arr2.length) {
            if (sum1 > sum2) {
                answer = 1;
            } else if (sum1 < sum2){
                answer = -1;
            } else {
                answer = 0;
            }
        }


    }

}
