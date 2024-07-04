import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
            MenOfPassion(A[], n) {
                sum <- 0;
                for i <- 1 to n - 1
                    for j <- i + 1 to n
                        sum <- sum + A[i] × A[j]; # 코드1
                return sum;

                // java 코드
                int sum = 0;
                for (int i = 1; i < n-1; i++) { // 인덱스 0부터 n-1까지 반복
                    for (int j = i+1; j <= n; j++) {
                        sum += A[i] * A[j];
                    }
                }
                return sum;
            }

        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());

        br.close();

        System.out.println( n * (n - 1) / 2 );
        System.out.println(2); // n^2-n / 2
    }
}