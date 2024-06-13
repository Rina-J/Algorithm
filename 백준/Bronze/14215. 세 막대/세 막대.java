import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] s = new int[3];

        for (int i = 0; i < 3; i++) {
            s[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(s);

        if (s[0] + s[1] > s[2]) {
            System.out.println(s[0] + s[1] + s[2]);
        } else {
            System.out.println((s[0] + s[1]) * 2 - 1);
        }
    }
}