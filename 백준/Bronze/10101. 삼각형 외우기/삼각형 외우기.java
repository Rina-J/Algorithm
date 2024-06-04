import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
            Equilateral  정삼각형
            Isosceles   이등변 삼각형
            Scalene 부등변 삼각형
            Error   세 각의 합이 180이 아니면 삼각형이 아님

            60
            70
            50
            => Scalene
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        br.close();

        // 삼각형의 세각의 합은 180
        if (a + b + c != 180) {
            System.out.print("Error");
        } else {
            // 모든 각이 같으면 각 각의 크기는 60
            if (a == 60 && b == 60 && c == 60) {
                System.out.print("Equilateral");
              // 두 각이 같을때 조건
            } else if (a == b || b == c || c == a) {
                System.out.print("Isosceles");
                // 같은 각이 없는 경우
            } else {
                System.out.print("Scalene");
            }
        }
    }
}