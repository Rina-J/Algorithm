import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
           직사각형 완성
           x    y
           5    5
           5    7
           7    5
        => 7    7
        30 20
        10 10
        10 20
        30 10
        => 쌍을 이루지 않는 각각의 좌표
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int x3 = Integer.parseInt(st.nextToken());
        int y3 = Integer.parseInt(st.nextToken());

        br.close();

        int x4 = 0;
        int y4 = 0;

        // x1, x2가 같으면 x3이 동일값이 없기 때문에 x3을 대입
        // 같은 방식으로 x4와 y4를 구함
        if (x1 == x2) {
            x4 = x3;
        } else if (x1 == x3) {
            x4 = x2;
        } else {
            x4 = x1;
        }

        if (y1 == y2) {
            y4 = y3;
        } else if (y1 == y3) {
            y4 = y2;
        } else {
            y4 = y1;
        }

        System.out.println(x4 + " " + y4);
    }
}