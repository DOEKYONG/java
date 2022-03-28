package 개인과제;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보4 {
	/* 참고  0 12분 27초 
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
		int 플레이어승리수 = 0;
		int 컴퓨터승리수 = 0;
		
		Scanner scanner = new Scanner(System.in); // 입력객체 선언 
		
		while(true) { // 프로그램시작 종료조건 3번 선택시 
			System.out.println("====가위바위보====");
			System.out.println("0.가위 1.바위 2.보 3.종료");
			플레이어 = scanner.nextInt();
			
			Random random = new Random(); // 난수 선
			컴퓨터 = random.nextInt(3); // 난수 생성 0~2 
			// 종료조건
			if( 플레이어 ==3 ) { // 3번 선택시 
				System.out.println("총게임수 : " + 게임수 ); // 게임수 출력  
				if(플레이어승리수<컴퓨터승리수 ) { // 컴퓨터승리수가 더 크면 
					System.out.println("컴퓨터승리 " +컴퓨터승리수);// 컴퓨터 승리와 승리횟수 출력 
				}
				else if(플레이어승리수>컴퓨터승리수 ) { // 플레이어 승리수가 더 크면 
				System.out.println("플레이어승리 " + 플레이어승리수 ); // 플레이어 승리와 승리횟수 출력 
				}
				else {System.out.println("무승부 ");} // 나머지는 무승부 
				break; // 반복문 탈출 프로그램 종료 
			}
			
			else if ( 플레이어>=0 && 플레이어 <=2) { // 유효한 숫자를 입력했을때 
				 if((플레이어 ==0 && 컴퓨터 ==2) || (플레이어 == 1 && 컴퓨터 == 0 ) || (플레이어 == 2 && 컴퓨터 == 1) ) { //플레이어가 이길 경우의수 
						System.out.println("플레이어승리!! ");
						게임수++; // 게임수증가 
						플레이어승리수++; // 플레이어 승리수 증가 
						
					}
				 else if ((플레이어 ==0 &&컴퓨터==0) || (플레이어==1 && 컴퓨터==1 ) || (플레이어== 2 && 컴퓨터 == 2)  ) { // 무승부 경ㅇ우의수 
					 System.out.println("무승");
					 게임수++; // 게임수 증가 
				 }
				 else {System.out.println("컴퓨터승리!!");  // 나머지는 컴퓨터가 이길 경우의 수 
				 게임수++; // 게임수 증가 
				컴퓨터승리수 ++;  // 컴퓨터 승리수 증가 
				}
			}
		
			
			
			
			
		} // while end
		
	}
	
}
