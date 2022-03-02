package Day02;

import java.util.Scanner;

public class Day02_3 { // c s

	public static void main(String[] args) { // m s
		
		// 문제1 : 급여 계산
				/*
				 * 	[입력조건]
				 * 		기본급 , 수당
				 * 	[ 조건 ] 
				 * 		실수령액 = 기본급 + 수당 - 세금[기본급10%] 
				 * 	[출력조건] 
				 * 		실수령액 출력 
				 */
		// 내가 짠 코드
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("기본급입력:");   int pay = scanner.nextInt();
		System.out.println("수당입력::");   int bonus = scanner.nextInt();
		int 실수령액 = (int)((pay+bonus)-(pay*0.1));
		System.out.println(실수령액);
		
		
		/* **************답**********************************
		
		// * 입력 -> 저장 -> 계산 -> 출력
				// 1. 입력 객체 만든다. [ 자료형 소문자 , 클래스명 대문자 ]
				Scanner scanner = new Scanner(System.in); // 키보드로부터 데이터를 저장하는 객체!!!!!!!!!!!!!
				
				// 2. 입력받은 값을 변수에 저장한다. [ 입력객체는 입력받을때마다 기존 데이터가 사라짐 ]
				System.out.print("기본급 입력 : ");		
				int 기본급 = scanner.nextInt(); 
														// 입력객체명.nextInt() : int형 데이터 가져오기 
																// 입력객체명.next() : 문자열 데이터 가져오기
				System.out.print("수당 입력 : "); 			
				int 수당 = scanner.nextInt();
				
				// 3. 변수를 연산(계산) 한다
				
				int 세금 = (int)(기본급*0.1); // int*double 후에 int형으로 강제변환(캐스팅) 
				int 실수령액 = 기본급 + 수당 - 세금;  		// 100% : 1   10% : 0.1
				
				// 4. 출력한다.
				System.out.println("회원님의 실수령액 : " + 실수령액 );
								// 		문자열	+	변수명( 변수내 데이터 호출 )
								//  + : 1. 연결연산자 기능 2.더하기 기능
		
				// **************답***********************************/
				
				// 문제2 : 지폐 세기 
				/*
				 * [ 입력조건 ] 
				 * 		금액 
				 * [ 조건 ] 
				 * 		십만원 부터 백원 까지의 개수 세기 
				 * [ 출력조건 ]
				 * 		예) 356789 입력시 
				 * 		십만원 3장 
				 * 		만원 5장
				 * 		천원 6장 
				 * 		백원 7개
				 * 
				 */
		
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("금액입력");  int money = scanner1.nextInt();

		int first = money/100000;
		int second = (money-(first*100000))/10000;
		int third = (money-((first*100000+second*10000)))/1000;
		int fourth = (money-((first*100000+second*10000+third*1000)))/100;
		
		System.out.println("십만원: " + first + "장" +"\n" + " 만원: "  + second +"장" +"\n"+ " 천원: " + third + "장" +"\n"+" 백원: " + fourth +"개");
		
		// **************************답
		// 1. 입력객체 
//		Scanner scanner = new Scanner(System.in);
//		// 2. 입력받은 데이터 -> 변수로 이동 
//		System.out.println("금액 : ");	int 금액 = scanner.nextInt();
//		// 3. 연산 
//		System.out.println(" 입력한 금액 : " + 금액 );
//		System.out.println(" 십만원  : " + (금액/100000) + "장" );
//			
//		//금액 = 금액 - ( 금액/100000 )*100000 ; // 금액에서 십만원 단위 제거
//		금액 -= ( 금액/100000 )*100000 ;
//		System.out.println(" 십만원 제외 : " + 금액 );
//		System.out.println(" 만원 : " + (금액/10000) + "장");
//		
//		금액 -= (금액/10000) * 10000; // 금액에서 만원 단위 제거 
//		System.out.println(" 천원 : " + (금액/1000) + "장");
//		
//		금액 -= (금액/1000) * 1000; // 금액에서 천원 단위 제거 
//		System.out.println(" 백원 : " + (금액/100) + "개");
		//************************************************
		
	} // m e
} // c e
