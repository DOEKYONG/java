package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_3 { //  c s
	
	

	public static void main(String[] args) { // m s
		// 준비
		int 플레이어; 		// 사용자가 선택한 수
		int 컴퓨터;  		// 컴퓨터가 난수를 생성한 수 저장
		int 게임수=0; 		// 총 가위바위보 실행 횟수
		int 플레이어승리수 = 0;	 int 컴퓨터승리수 = 0; // 각 승리 수 저장
		Scanner scanner = new Scanner(System.in); // 입력객체
		
		while (true) { // 프로그램 실행
			System.out.println("---------------가위바위보 게임----------------");
			System.out.print(" 가위(0) 바위(1) 보(2)      종료(3)    선택 : ");
			플레이어 = scanner.nextInt(); // 입력한 수 저장
			System.out.println(" 플레이어가 낸수 : "+플레이어 );
			
			Random random = new Random(); // 난수 객체 선언
					// random.nextInt() : int가 표현할수 있는 범위내 난수발생
					// random.nextInt(수) : 0 ~ 수 전까지 범위내 난수발생
						// random.nextInt(10) : 0 ~ 9 중 난수 발생 
						// random.nextInt(11)+10 : 10 ~ 20 중 난수 발생 
			
			컴퓨터 = random.nextInt(3);		// 난수를 정수(int)로 가져오기
			
			
				// 종료조건
			
			 if(플레이어 == 3) {
				System.out.println("게임종료");
				System.out.println(" 게임수 :" + 게임수 );
				if ( 플레이어승리수 > 컴퓨터승리수 ) {System.out.println(" 최종 승리자 : 플레이어 "+플레이어승리수);} 
				else if ( 플레이어승리수 < 컴퓨터승리수) {System.out.println(" 최종 승리자 : 컴퓨터 "+컴퓨터승리수);}
				else System.out.println(" 최종 승리자 : 무승부 ");
				break;
				
			} else if (플레이어 >= 0 && 플레이어 <=2) {
				// 승리자 판단
				if((플레이어 == 0 && 컴퓨터 ==2) || (플레이어 == 1 && 컴퓨터 ==0)  || (플레이어 == 2 && 컴퓨터 ==1) ) {
						System.out.println("플레이어승리");
						플레이어승리수++;
				}
				else if((플레이어 == 0 && 컴퓨터 ==0) || (플레이어 == 1 && 컴퓨터 ==1)  || (플레이어 == 2 && 컴퓨터 ==2)) {
					System.out.println("무승부");
				}
			
					
				else {
					System.out.println("컴퓨터승리");
					컴퓨터승리수++;
				}
				// 게임수증가
				게임수++;
				
			} else {
				System.out.println("알수없음");
			}
			
			
			
			
			
			
			
			
			
			
			
		} // w e
		

	} // m e

} // c e
