import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		/*
		 자바에서는 몇몇 문자는 단독으로 써서 출력할 수 없다. ( 대표적으로 백슬래시와 큰 따옴표가 있다. )
		 그래서 문자를 출력하기 위해 조합을 만들어서 출력할 수 있도록 하는데 이를 Escape Sequance 라고 한다.
		 이스케이프 시퀀스는 역슬래시(\) + 문자 의 조합으로 쓰인다. 
		 System.out.println("\"); 이렇게 역슬래시 단독으로 출력 할 수 없음
		 ㄴ System.out.println("\\"); 이렇게 역슬래시를 두번쓰면 역슬래시 하나 출력가능함
		*/
		
		StringBuilder sb = new StringBuilder();
		sb.append("\\    /\\\n");
		sb.append(" )  ( ')\n");
		sb.append("(  /  )\n");
 		sb.append(" \\(__)|\n");
		
		System.out.println(sb);
		
		// BufferedWriter는 newLine() 이라는 개행 메서드가 있으나 StringBuilder는 없기에
		// 각 열 끝에 \n으로 개행해줌
		
		/*
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");    
		*/
 
	}
}