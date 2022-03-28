package 개인과제;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보5 {
	
	/* 참고   0   14분 7초 
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
		int 플레이어승리수 =0 ;
		int 컴퓨터승리수 =0 ;
		int 게임수 = 0;
		Scanner scanner = new Scanner(System.in); 	//입력ㄱ 객체 선언 
		
		
		while(true) { // 프로그램시작  3번 선택시 프로그램종료 
			
			Random random = new Random(); // 난수선언 
			컴퓨터  = random.nextInt(3); // 난수생성 
			System.out.println("가위바위보 게임 "); 
			System.out.println("0가위 1바위 2보 3종료 ");플레이어 = scanner.nextInt(); 
			
			//종료조건
			if( 플레이어 == 3) { // 3번 선택시 
				System.out.println("총게임수 : " + 게임수 ); // 게임수 출력 
				if(플레이어승리수<컴퓨터승리수 ) { // 컴퓨터승리수가 더 큰경우 
					System.out.println("컴퓨터승리 !! " + 컴퓨터승리수 ); // 컴퓨터승리 , 컴퓨터 승리수 출력 
				}
				else if(플레이어승리수>컴퓨터승리수 ) { // 플레이어승리수가 더 큰경우  
					System.out.println("플레이어 승리 !! " + 플레이어승리수 ); // 플레이어승리 , 플레이어 승리수 출력 
				}
				else {System.out.println("무승부 ");} //나머지 경우  무승부 
			}
			else if (플레이어 >=0 && 플레이어<=2 ) { // 가위바위보중 올바른 입력을 했을경우 
				// 승패판단
				if((플레이어 == 0&& 컴퓨터==2 ) || (플레이어 == 1 && 컴퓨터 == 0 ) || (플레이어 ==2 && 컴퓨터==1 )) { //플레이어가 이기는 경우의수 
					System.out.println("플레이어승리 ");
					게임수 ++;  // 게임수 증가 
					플레이어승리수 ++; // 플레이어승리수 증가 
				}
				else if( (플레이어 == 0 &&컴퓨터 ==0) || (플레이어==1 && 컴퓨터==1 ) || (플레이어==2 && 컴퓨터==2) ) { //무승부 경의우의 수 
					System.out.println("무승부 "); // 무승부 
					게임수 ++; // 게임수 증가 
					
				}
				else { // 컴퓨터가 이기는 경우의수 
					System.out.println("컴퓨터 승리 "); //컴퓨터 승리
					게임수 ++; // 게임수증가 
					컴퓨터승리수++; // 컴퓨터승리 증가 
				}
				
			}
			else{System.out.println("알수없는입");} // 0~3	번 외 다른 숫자을 입력햇을경우  
			
			
			
			
			
			 
			
		} // while end 
		
	
		

	}

}
