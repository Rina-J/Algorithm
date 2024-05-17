import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int q = 25;
        int d = 10;
        int n = 5;
        int p = 1;

        for (int i = 0; i < T; i++) {
            int C = Integer.parseInt(br.readLine());
            System.out.print(C / q + " ");
            C %= q;
            System.out.print(C / d + " ");
            C %= d;
            System.out.print(C / n + " ");
            C %= n;
            System.out.println(C / p);
        }
        br.close();
    }
}