import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
            factor(약수), multiple(배수), neither(약수,배수 둘다x)
            마지막 줄에는 0이 2개 주어짐, 0이 나오면 break;
            A가 B의 약수    B % A == 0
            A가 B의 배수    A % B == 0

            8 16            factor
            32 4            multiple
            17 5            neither
            0 0             break;
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int A = Integer.parseInt(st.nextToken());;
            int B = Integer.parseInt(st.nextToken());;

            if (A == 0 && B == 0) {
                break;
            } else if (B % A == 0) {
                System.out.println("factor");
            } else if (A % B == 0) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }

        }
        br.close();
    }
}