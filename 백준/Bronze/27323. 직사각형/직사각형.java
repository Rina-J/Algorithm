import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
           정수 A(세로), B(가로)인 직사각형 넓이 구하기
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        br.close();

        System.out.print(A*B);
    }
}