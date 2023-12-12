package etc.October.october25;

public class Sol2 {
    public static void main(String[] args) {
        int n = 8; //n미터 벽
        int m = 4; //롤러 길이
        int[] section = new int[] {2, 3, 6}; //정렬 불필요
        int maxPaint = 0, cntPaint = 0;
        for (int i=0; i< section.length; i++) {
            for (int point : section) {
                if (maxPaint <= point) {
                    maxPaint = point + m;
                    cntPaint++;
                }
            }
        }
        System.out.println(cntPaint);
    }

}
