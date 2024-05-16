import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        
        /*
        A   A   B   C   D   D
        a   f   z   z
        0   9   1   2   1
        a   8   E   W   g   6
        P   5   h   3   k   x

        Aa0aP Af985 Bz1Eh Cz2W3 D1gk D6x

        => Aa0aPAf985Bz1EhCz2W3D1gkD6x
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] arr = new char[5][15];

        for (int i = 0; i < 5; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[j][i] == '\0') {
                    continue;
                }
                System.out.print(arr[j][i]);
            }
        }
        br.close();
    }
}