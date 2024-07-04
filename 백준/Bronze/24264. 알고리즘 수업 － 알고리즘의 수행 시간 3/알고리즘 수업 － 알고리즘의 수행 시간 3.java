import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
            MenOfPassion(A[], n) {
                sum <- 0;
                for i <- 1 to n
                    for j <- 1 to n
                        sum <- sum + A[i] × A[j]; # 코드1
                return sum;

                // java 코드
                int sum = 0;
                for (int i = 1; i <= n; i++) { 
                    for (int j = 1; j <= n; j++) {
                        sum += A[i] * A[j];
                    }
                }
                return sum;
            }
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());

        br.close();

        System.out.println(n*n);
        System.out.println(2);
    }
}