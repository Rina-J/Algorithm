import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
           x, y, w, h
           (x, y) : 직사각형의 x,y축
           (w, h) : 오른쪽 위 꼭짓점
           직사각형의 경계선까지 가는 거리의 최솟값
           1 <= x <= w-1
           1 <= y <= h-1

           1) 6 2 10 3
           2) 653 375 1000 1000

              h-y / w-x / x / y : 4가지 중 최솟값 출력
           1)  1    8     6   2    => 1
           2) 625  347  653  375   => 347
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        br.close();

        int xMin = Math.min(x, w-x);
        int yMin = Math.min(y, h-y);
        
        System.out.println(Math.min(xMin, yMin));
    }
}