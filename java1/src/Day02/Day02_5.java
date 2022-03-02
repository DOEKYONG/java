package Day02;

import java.util.Scanner;

public class Day02_5 { // c s

	public static void main(String[] args) { // ms
		
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
		// 1. 입력객체 
//				Scanner scanner = new Scanner(System.in);
//				// 2. 입력받은 데이터 -> 변수로 이동 
//				System.out.println("금액 : ");	int 금액 = scanner.nextInt();
//				// 3. 연산 
//				System.out.println(" 입력한 금액 : " + 금액 );
//				System.out.println(" 십만원  : " + (금액/100000) + "장" );
//					
//				//금액 = 금액 - ( 금액/100000 )*100000 ; // 금액에서 십만원 단위 제거
//				금액 -= ( 금액/100000 )*100000 ;
//				System.out.println(" 십만원 제외 : " + 금액 );
//				System.out.println(" 만원 : " + (금액/10000) + "장");
//				
//				금액 -= (금액/10000) * 10000; // 금액에서 만원 단위 제거 
//				System.out.println(" 천원 : " + (금액/1000) + "장");
//				
//				금액 -= (금액/1000) * 1000; // 금액에서 천원 단위 제거 
//				System.out.println(" 백원 : " + (금액/100) + "개");
		
//		
			//문제3 : 하나의 정수를 입력받아 7의 배수인지 출력[ true , false ]
			//System.out.println("정수를 입력하여 7의배수인지 출력");
			Scanner sc = new Scanner(System.in);
//			System.out.println("정수 입력 : ");  int 정수 = sc.nextInt();
//			boolean 참거짓 = 정수 % 7 == 0;
//			System.out.println(참거짓);
//		
//			//문제4 : 하나의 정수를 입력받아 홀수 인지 확인 [ true , false ]
//			System.out.println("하나의 정수를 입력받아 홀수인지확인");
//			System.out.println("정수2 입력 : ");  int 정수2 = sc.nextInt();
//			boolean 참거짓2 = 정수 % 2 != 0;
//			System.out.println(참거짓2);
//		
//				
//			//문제5 : 하나의 정수를 입력받아 7의 배수 이면서 짝수 인지 확인 [ true , false ]
//			System.out.println("하나의 정수를 입력받아 7의배수이면서 짝수인지 확인");
//			System.out.println("정수3 입력 : ");  int 정수3 = sc.nextInt();
//			boolean 참거짓3 = 정수3 % 7 == 0 && 정수3 % 2 == 0;
//			System.out.println(참거짓3);
//			
//				
//				
//			//문제6 : 두개의 정수를 입력받아 더 큰지 출력  [ true , false ]
//			System.out.println("두개의 정수를 입력받아 더 큰지 출력 ");
//			System.out.println("정수 입력 : ");  int 정수1 = sc.nextInt();
//			System.out.println("정수 입력 : ");  int 정수2 = sc.nextInt();
//			int 큰수  = 정수1 > 정수2 ? 정수1 : 정수2;
//			System.out.println("더 큰수 : "+큰수);
//			
				
				//문제7 : 반지름을 입력받아 원 넓이 출력하기 
						// 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]
//			System.out.println("반지름을 입력받아 원 넓이 출력하기");
//			System.out.println("반지름 입력 : ");  int 반지름 = sc.nextInt();
//			System.out.println(반지름*반지름*3.14);
//				
				//문제8 : 두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇% 인지 출력하기
						// 예) 54.5   84.3 이면    64.285714%
//			System.out.println("두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇% 인지 출력하기");
//			System.out.println("정수4 입력 : ");  double 수1 = sc.nextDouble();
//			System.out.println("정수5 입력 : ");  double 수2 = sc.nextDouble();
//			System.out.println(수1/수2*100);
				//문제9 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기]
						//사다리꼴 계산식 = > (윗변 * 밑변) * 높이 / 2
//				System.out.println("사다리꼴 넓이 구하기");
//				System.out.println("윗변 입력 : ");  int 윗변 = sc.nextInt();
//				System.out.println("밑변 입력 : ");  int 밑변 = sc.nextInt();
//				System.out.println("높이 입력 : ");  int 높이 = sc.nextInt();
//				System.out.println(윗변 * 밑변 * 높이/2);
				//문제10: 키를 정수를 입력받아 표준체중 출력하기
						//표준체중 계산식 = > (키 - 100) * 0.9
//				System.out.println(" 키를 정수를 입력받아 표준체중 출력하기");
//				System.out.println("키 입력: "); int 키 = sc.nextInt();
//				double 표준체중 = (키 - 100)*0.9;
//				System.out.println(표준체중);
				
				//문제11: 키와 몸무게를 입력받아 BMI 출력하기
						//BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))
//			System.out.println("키와 몸무게를 입력받아 BMI 출력하기");
//			System.out.println("키 입력 : ");  double 키 = sc.nextDouble();
//			System.out.println("몸무게 입력 : ");  double 몸무게 = sc.nextDouble();
//			System.out.println(몸무게 / ((키/100)*(키 / 100)));
			
				//문제12: inch 를 입력받아 cm 로 변환하기 [ 1 inch -> 2.54cm ] 
//			System.out.println("inch 를 입력받아 cm 로 변환하기");
//			System.out.println("인치 입력 : ");  double 인치 = sc.nextDouble();
//			System.out.println(인치*2.54 + " cm");
				
				//문제13:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하기
						//소수 둘째 자리 까지 점수 출력하기
						//중간고사 반영비율 => 30 %
						//기말고사 반영비율 => 30 %
						//수행평가 반영비율 => 40 %
		//System.out.println("중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하기");
		//System.out.println("중간고사 입력 : ");  double mid = sc.nextDouble();
		//	System.out.println("기말고사 입력 : ");  double fin = sc.nextDouble();
		//	System.out.println("수행평가 입력 : ");  double test= sc.nextDouble();
		//	System.out.println(mid*0.3+fin*0.3+test*0.4);
				
			//문제14 :  연산 순서 나열 하고 x와 y값 예측하기
		 	//int x = 10;  
			//int y = x-- + 5 + --x;  24
			//printf(" x의 값 : %d , y의값 :  %d ", x, y)  23
//			
				//문제15 : 나이를 입력받아 나이가 10세이상이면 학생 , 20세이상이면 성인 , 40세이상이면 중년 으로 출력하기
			System.out.println("나이 입력 : ");  int 나이 = sc.nextInt();
//			String a = "중년";
//			String b = "성인";
//			String c = "학생";
//			String 분류 = 나이 >= 40 ? "중년" : 나이 >= 20 ? "성인" : "학생";
//			System.out.println(분류);
			
//			if (나이 >= 40) {
//				System.out.println("중년");
//			}else if (나이>=20) {
//				System.out.println("성인");
//			} else {
//				System.out.println("학생");
//			}
			
			//문제16 : 3개의 정수를 입력받아 오름차순으로 정렬 
			
			
			
			
			
			//문제17 : 4개의 정수를 입력받아 내림차순으로 정렬 
			
			// p. 102 확인문제
		
			
			
			
	} // m e

} // c e
