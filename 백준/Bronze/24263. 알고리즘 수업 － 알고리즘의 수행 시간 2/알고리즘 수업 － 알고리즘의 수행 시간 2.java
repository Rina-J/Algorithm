import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
            MenOfPassion(A[], n) {
                // 의사코드
                sum <- 0; // <- 는 화살표를 뜻함
                for i <- 1 to n // 1 to n 은 1에서 n까지라는 뜻
                    sum <- sum + A[i]; # 코드1
                return sum;

                // java 코드
                int sum = 0;
                for (int i = 1; i <= n; i++) {
                    sum += A[i];
                }
                return sum;
            }
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        br.close();
        
        System.out.println(n);
        System.out.println(1);
    }
}