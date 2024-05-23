import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
            (up-down) : 하루동안 올라가는 높이
            (length-down) : 낮에 올라갔을때 정상에 도달하면 내려가지 않음
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int up = Integer.parseInt(st.nextToken());;
        int down = Integer.parseInt(st.nextToken());;
        int length = Integer.parseInt(st.nextToken());;

        br.close();

        int day = (length - down) / (up - down);

        if ((length - down) % (up - down) != 0) {
            day++;
        }

        System.out.println(day);
    }
}
