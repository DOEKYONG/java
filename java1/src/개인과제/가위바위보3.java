package 개인과제;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보3 {
	/* 참고 2 시간 17분 
	 * 가위바위보게임
		1. 사용자에게 가위[0]바위[1]보[2] 종료[3] 중에  입력받기
		2. 컴퓨터 난수발생[0~2] 
		3. 사용자와 컴퓨터중 승리자 판단 [ 경우의수 ]
		4. 3번 선택하기 전까지 게임 실행 
		5. 3번 선택시 게임종료 
			1. 총 게임수 출력	예) 3판
			2. 최종 승리 출력	예) 컴퓨터 2  사용자 1
	 */
	public static void main(String[] args) {
		// 공통변수 선언 
		int 플레이어;
		int 컴퓨터;
		int 게임수 = 0;
		int 플레이어승리수= 0; int 컴퓨터승리수 = 0;
		Scanner scanner = new Scanner(System.in); // 입렬객체입력 
		
		while(true) { // 프로그램 시작 종료조건 3 선택시 종료 
			System.out.println("---가위바위보---");
			System.out.println("0. 가위 1. 바위 2. 보 3. 종료 "); 플레이어 = scanner.nextInt();
			
		
			Random random = new Random(); // 난수 선언 
			컴퓨터 = random.nextInt(3); // 0~2 난수 선언 
		// 종료조건
			if(플레이어 == 3 ) { // 게임종료 버튼 
				System.out.println("알림)) 게임종료 ");
				System.out.println("총 게임횟수 : " + 게임수);
				
				if(플레이어승리수<컴퓨터승리수) {System.out.println("최종 승리 : 컴퓨터승리!! "+컴퓨터승리수);} // 컴퓨터 승리가 많을시 컴퓨터 승리와 횟수 출력 
				else if(플레이어승리수 > 컴퓨터승리수) {System.out.println("최종승리 : 플레이어승리!!"+플레이어승리수 );} // 플레이어 승리가 많을시 플레이어 승리와 횟수출력
				else {System.out.println("최종승리 : 무승부 ");} // 무승부시 출력 
				break; // 반복문 탈출 프로그램 종료 
			}
			else if(플레이어>=0 && 플레이어 <=2 ) { // 플레이어가 0~2 (유효한 숫자)를 입력했을시 
				// 승리판단
				if( (플레이어==0 &&컴퓨터==2 ) || (플레이어==1 && 컴퓨터==0 ) || (플레이어 == 2 && 컴퓨터 ==1 )) { // 플레이어가 이기는 경우의수 
					// 가위       보                바위			가위			보		      바위 
					System.out.println("플레이어승리");
					플레이어승리수 ++; // 플레이어 승리수 추가 
				}else if ((플레이어 == 0 &&컴퓨터 == 0) || (플레이어==1 &&컴퓨터==1 ) || (플레이어==2&&컴퓨터==2)) { // 무승부 경우의수 
					System.out.println("무승부");
				}
				else { // 컴퓨터 승리 경우의수 
					System.out.println("컴퓨터승리!!"); 
				컴퓨터승리수++; // 컴퓨터 승리수 추가 
				}
				
			}
			else {System.out.println("알수없는 행동 ");}
			
			
			
		} // while end
		
		
	}

}
