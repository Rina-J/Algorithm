import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
            완전수(n = 자신을 제외한 모든 약수들의 합)
            6 = 1 + 2 + 3
            입력의 마지막엔 -1 주어짐
            n != 완전수 => n is NOT perfect. 출력
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringBuilder sb = new StringBuilder();
            int n = Integer.parseInt(br.readLine());

            ArrayList<Integer> arr = new ArrayList<>();

            if (n == -1) {
                break;
            }

            int sum = 0;

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                    arr.add(i);
                }
            }

            if(n == sum) {
                sb.append(n).append(" = ");
                
                for(int i =0; i<arr.size(); i++) {
                    if (i != arr.size()-1) {
                        sb.append(arr.get(i)).append(" + ");
                    } else {
                        sb.append(arr.get(i));
                    }
                }
                
            } else {
                sb.append(n).append(" is NOT perfect.");
            }
            System.out.println(sb);
        }
        br.close();
    }
}