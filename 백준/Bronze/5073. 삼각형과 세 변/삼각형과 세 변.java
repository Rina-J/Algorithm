import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
            삼각형의 세변의 길이 주어짐
            Equilateral  정삼각형
            Isosceles   이등변 삼각형
            Scalene 부등변 삼각형
            Invalid   삼각형이 아님(가장 긴 변의 길이보다 나머지 두 변의 길이의 합이 길지않을 경우)
            
            0 0 0이 주어지면 종료

            7 7 7   Equilateral
            6 5 4   Scalene
            3 2 5   Invalid
            6 2 6   Isosceles
            0 0 0
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0) {
                break;
            } else {
                if (a + b <= c || a + c <= b || b + c <= a) {
                    System.out.println("Invalid");
                } else if (a == b && b == c && c == a) {
                    System.out.println("Equilateral");
                } else if (a == b || b == c || c == a) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }
            }
        }
    }
}