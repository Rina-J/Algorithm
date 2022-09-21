import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
    	int totalPrice = Integer.parseInt(br.readLine());
    	int cnt = Integer.parseInt(br.readLine());
    	int s = 0;
    
    	StringTokenizer st;
    	
    	for(int i=1; i<=cnt; i++){
        	st = new StringTokenizer(br.readLine());
        	
        	int price = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            
            s += (price*num);
    	}
        
        if( totalPrice == s )
        	System.out.println("Yes");
        else
        	System.out.println("No");
    }
}   