import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
            정사각형 개수 n (1 ≤ n ≤ 10^9) => int 범위를 초과함
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());

        System.out.println(4 * n);
    }
}