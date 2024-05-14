import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {


        /*
        column 열    row 행
        N: 줄갯수     M: 원소갯수
        4 3       =>                4 4 4
                                    6 6 6
        1 1 1                       5 6 100
        2 2 2                       0 0 0
        0 1 0
        0 0 0

        3 3 3
        4 4 4
        5 5 100
        0 0 0
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];

        // 첫번째 배열
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr1[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 두번째 배열
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 각 배열끼리 합
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append((arr1[i][j] + arr2[i][j]) + " ");
            }
            sb.append("\n");
        }

        br.close();

        System.out.println(sb);
    }
}