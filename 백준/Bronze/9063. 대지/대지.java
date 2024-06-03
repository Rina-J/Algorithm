import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
           옥구슬 개수 N (1 ≤ n ≤ 100000)
           옥구슬의 위치 좌표(두개의 정수)
           3
           20 24
           40 21
           10 12
           => 360
           (maxX - minX) * (maxY - minY)
           (40-10) * (24-12) = 360
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] x = new int[N];
        int[] y = new int[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(x);
        Arrays.sort(y);
        
        br.close();

        System.out.println( (x[N-1] - x[0]) * (y[N-1] - y[0]) );
    }
}