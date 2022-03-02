package Day02;

public class Day02_2 { // class start
	
	public static void main(String[] args) { // main start
		
		// ; : 실행 단위 구분
		// 동일한 변수명은 사용할수 없다.
		
		// p.40 byte : 1바이트 +-128
		byte var1 = -128;   System.out.println(var1);
		byte var2 = -30;	System.out.println(var2);
		byte var3 = 30;		System.out.println(var3);
		//byte var4 = 300; 	System.out.println(var4);
			// 오류발생 : 128 이상은 저장할수 없다.
		byte var4 = 'j';     System.out.println(var4);
			// 문자 -> 정수 변환 [ 아스키코드 규칙 ]
		
		// p.43 char : 2바이트 [ 1문자 ] : 유니코드(2바이트:전세계 모든문자) vs 아스키코드
		char c1 = 'a'; System.out.println(c1);
		char c2 = 97; System.out.println(c2);	// 10진수 : 0~9
			//정수 -> 문자 변환						
		char c3 = '\u0041'; System.out.println(c3);	//16진수 표현
		char c4 = '가'; System.out.println(c4);
		char c5 = 44032; System.out.println(c5);
		char c6 = '\uac00'; System.out.println(c6);
		// 진법 [ 왜??? : 컴퓨터가 2진수만 사용하면 표현단위 적다 ---> 표현단위 다양성
			// 2진수 : 0 , 1	/ 기계어(2진코드) / 용량(1비트)
			// 8진수 : 0 ~ 7
			// 10진수 : 0 ~ 9
			// 16진수 0 ~ 9 a b c d e f
		
		// p.44 short : 2바이트 정수 +-3만정도
		short num1 = 30000; System.out.println(num1);
		// short num2 = 40000; System.out.println(num2); // 오류발생
		
		// p.45 int : 4바이트 정수  +- 20억도 (정수 기본타입)
		int num2 = 10; System.out.println(num2);	// 10진수
		int num3 = 012; System.out.println(num3);	// 8진수는 앞에 0 붙이기
		int num4 = 0xA; System.out.println(num4);	//16진수는 앞에 0x 붙이기
		
		// p.46 long : 8바이트 정수 +-20억이상 [데이터 뒤에 L ]
		long num5 = 10000000000L; System.out.println(num5);
					
		// 47.~48 float : 4바이트 / double ( 실수 기본타입) : 8바이트
		double num6 =3.14; System.out.println(num6);
		float num7 = 3.14f; System.out.println(num7);
		
		
		
		
	} // main end
} // class end
