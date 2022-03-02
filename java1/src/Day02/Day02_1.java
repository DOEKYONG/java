package Day02; // 패키지 이름

public class Day02_1 { // class start
	
	// 1. 모든 코드작성은 클래스 {} 안에서 작성한다.
		// 2. 실행할 코드는 main 함수 {} 안에서 작성한다. [ 스레드 : 코드 읽어주는 기능 ]  
		// 3. 자동완성 : 1~3글자 -> ctrl+스페이바
		// 4. { } 안에서 tab 들여쓰기
		
		// 메모리 : 컴퓨터 저장하는 공간 [ RAM ] : 자원
		
		// 변수 
			// 1. 데이터 1개 저장하는 메모리 공간 [ 저장상자 ] 
			// 2. 변수 선언 [  자료형 변수명 ; ]
			// 3. 변수 초기화(처음값) [ 자료형 변수명 = 데이터; ]
			// 4. 변수 호출 [ 변수명 ]
		
		// 용량 단위
			// 0 혹은 1 -> 1비트 
			// 01010101 -> 8비트 -> 1바이트
			// 1024바이트 -> 1kb -> 1024kb -> 1mb -> 1024mb -> 1gb
		// 자료형
			// 1. 메모리 아껴쓰자 
		
			// boolean : 1비트	: 참(true) , 거짓(false)
			// char : 2바이트		: 문자 1개 [ 아스키코드(c언어) -> 유니코드(java) ]
			// byte : 1바이트 	: 정수 +-128
			// short : 2바이트 	: 정수 +-3만정도
			// int : 4바이트 		: 정수 +-20억정도
			// long : 8바이트		: 정수 +-20억이상
			// float : 4바이트 	: 실수(소수점) 8자리 표현 가능 
			// double : 8바이트 	: 실수(소수점) 18자리 표현 가능 
		
			// 예) 다이소에서 사탕1개를 선물상자 구매할 예정  [ 작은상자 ] 
			// 예) 데이터 1를 저장하는 메모리 공간 사용할 예정 [ 작은 데이터 공간 ] 
				// 빈공간 -> 메모리 증가 -> 속도 감소
	
	public static void main(String[] args) { // main start
		
		//p.35 예제1 
				int value = 10;	// 1. 변수 선언과 초기화
				// int : +-20억정도의 데이터를 저장할수 있는 상자
					// value[아무거나] : 상자의 이름 ( 개발자가 구분하기 위해서 )
						// = : 오른쪽 데이터가 왼쪽으로 대입[저장]
				// * 정수 10를 int형 value 변수에 저장 
				
				int result = value +10;
				// int : +-20억정도의 데이터를 저장할수 있는 상자 
					// reult[아무거나] : 상자의 이름 
						// 변수호출(변수불러오기) + 10 666
						//   10 + 10 
				System.out.println(result); // 출력함수( 변수명 ) ;
		
		
	} // main end
} // class end
