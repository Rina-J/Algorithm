import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        int count = 0;

        while ((str = br.readLine()) != null) {

            System.out.println(str);
            count++;
            
            if (count >= 100) {
                break;
            }

        }
        br.close();
    }
}