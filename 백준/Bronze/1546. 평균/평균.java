import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); // 과목 수
        int sum = 0; // 과목 점수의 총 합
        int max = 0; // 점수 중 최댓값

        int arr[] = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {

            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
            if (max < arr[i]) {
                max = arr[i];
            }

        }
        
        System.out.println((double) sum * 100 / max / N);
        
    }
    
}