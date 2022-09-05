import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main{
 
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int A = Integer.parseInt(br.readLine()); // 472
		int B = Integer.parseInt(br.readLine()); // 385
		
		br.close();
        
		StringBuilder sb = new StringBuilder();
        
		sb.append( A * (B%10) );
		sb.append('\n');
		
		sb.append( A * ((B%100)/10) );
		sb.append('\n');
        
		sb.append( A * (B/100) );
		sb.append('\n');
        
		sb.append( A * B );
 
		System.out.print(sb);
		
		/*
		// toCharArray() 라는 메서드를 이용해 character 배열로 만들어준 뒤 하나씩 배열에서 꺼내서 쓰는 방법
		  
		int A = Integer.parseInt(br.readLine());
		String B = br.readLine();
 
		char[] b = B.toCharArray();		
		
		System.out.println(A * (b[2]-'0')); 
		ㄴ b의 0,1,2번째인 5는 문자열 5이기때문에 아스키코드값 53임
		ㄴ 53-48 = 5 라서 아스키코드값 48인 '0'을 빼줌
		
		System.out.println(A * (b[1]-'0'));
		System.out.println(A * (b[0]-'0'));
		System.out.println(A * Integer.parseInt(B));
		*/
        
	}
 
}