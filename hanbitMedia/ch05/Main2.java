package hanbitMedia.ch05;

import java.util.LinkedList;
import java.util.Queue;

public class Main2 {
    public static void main(String[] args) {
        //스택 선언
        Queue<Integer> que = new LinkedList<>();

        // 삽입(5) - 삽입(2) - 삽입(3) - 삽입(7) - 삭제() - 삽입(1) - 삽입(4) - 삭제()
        que.offer(5);
        que.offer(2);
        que.offer(3);
        que.offer(7);
        que.poll();
        que.offer(1);
        que.offer(4);
        que.poll();


        while (!que.isEmpty()) {
            System.out.println(que.poll());
        }

    }
}
