import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); // 바구니 갯수
        int M = Integer.parseInt(st.nextToken()); // 공 넣는 횟수

        int[] arr = new int[N + 1];

        for (int x = 1; x <= M; x++) {

            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken()); // 시작 바구니 num
            int j = Integer.parseInt(st.nextToken()); // 마지막 바구니 num
            int k = Integer.parseInt(st.nextToken()); // 번호가 적힌 공

            for (int y = i; y <= j; y++) {

                arr[y] = k;

            }

        }

        br.close();

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {

            sb.append(arr[i] + " ");

        }
        
        System.out.println(sb);


    }

}
