import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 1; // 거리는 1거리가 늘어날때마다 +6을 하던 값에 +6 반복
        int range = 2; // 범위는 2부터 시작하여 +6씩 1거리가 늘어남

        br.close();
        
        if (N == 1) {
            System.out.print(1);
        } else {
            while (range <= N) {
                range = range + (6 * count);
                count++;
            }
            System.out.print(count);
        }
    }
}