import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());

        br.close();

        System.out.println( n * (n-1) * (n-2) / 6 );
        System.out.println(3);
    }
}