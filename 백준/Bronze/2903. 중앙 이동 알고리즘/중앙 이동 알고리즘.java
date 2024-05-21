import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        br.close();

        int total = (int) Math.pow(Math.pow(2, N) + 1,  2);

        System.out.println(total);
    }
}