import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); // 바구니 갯수
        int M = Integer.parseInt(st.nextToken()); // 바꿀 바구니 횟수

        int arr[] = new int[N];

        for (int x = 0; x < N; x++) {
            arr[x] = x + 1;
        }

        for (int y = 1; y <= M; y++) {

            st = new StringTokenizer(br.readLine(), " ");

            int i = Integer.parseInt(st.nextToken()) - 1;
            int j = Integer.parseInt(st.nextToken()) - 1;

            while (i < j) {

                int temp = arr[i];
                arr[i++] = arr[j];
                arr[j--] = temp;

            }

        }

        br.close();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}