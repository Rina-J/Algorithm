import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); // 바구니 갯수
        int M = Integer.parseInt(st.nextToken()); // 공 바꾸는 횟수

        int arr[] = new int[N];

        // 초기 바구니들의 공 번호
        for (int i = 0; i < N; i++) {
            arr[i] = i+1;
        }

        for (int x = 1; x <= M; x++) {

            st = new StringTokenizer(br.readLine(), " ");

            int i = Integer.parseInt(st.nextToken())-1;
            int j = Integer.parseInt(st.nextToken())-1;

            int temp = arr[i];

            arr[i] = arr[j];
            arr[j] = temp;

        }

        br.close();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}