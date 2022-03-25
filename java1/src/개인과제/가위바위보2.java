package 개인과제;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보2 {
	/*
	 * 
	 * 참고   5+ 계속... 시간 19분 00초
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
		// 변수선언 
		int 플레이어;
		int 컴퓨터;
		int 게임수 =0;
		int 플레이어승=0; int 컴퓨터승=0;
		Scanner scanner = new Scanner(System.in); // 입력객체 선언 
		
		while(true) { // 프로그램 시작 종료조건 3선택했을때 조건에 맞는경우 
			System.out.println("0.가위 1.바위 2.보 3.종료 "); 플레이어 =scanner.nextInt();
			
			Random random = new Random();// 난수선언 
			컴퓨터 = random.nextInt(3); // 0~2까지 난수선
			
			//종료조건
			if(플레이어 == 3) { // 3번 선택시 
				System.out.println("게임종료 ");
				System.out.println("총게임횟수 : " +게임수 );
				if(플레이어승<컴퓨터승) { // 컴퓨터승이 플레이어승보다 많을시 컴퓨터승 
					System.out.println("컴퓨터승리!!" + 컴퓨터승 );
				}
				else if(컴퓨터승<플레이어승) { // 플레이어승이컴퓨터보다 많을시 플레이어승 
					System.out.println("플레이어승리!! " + 플레이어승 );
				}
				else {System.out.println("무승부");} // 그밖의 경우의수 무승부 
				break; // 프로그램종료 
			}
			//승패 판단 
			else if (플레이어>=0 && 플레이어 <=2) { // 플레이어가 가위바위보 번호를 벗어나지 않는경우에 
				 if((플레이어==0&&컴퓨터==2 ) || (플레이어 == 1 && 컴퓨터 == 0 ) || (플레이어 ==2 && 컴퓨터==1)) { // 플레이어승리경우 
						System.out.println("플레이어승!"); 
						플레이어승 ++; // 플레이어승 1 증가 
					}
					else if((플레이어==0 && 컴퓨터==0 ) || (플레이어==1&&컴퓨터==1 ) || (플레이어==2 && 컴퓨터==2)) { // 비기는 경우
						System.out.println("무승부 ");
					}
					else { // 나머지 경우 = 컴퓨터승리
						System.out.println("컴퓨터승리! " );
						컴퓨터승 ++; // 컴퓨터승 1증가 
					} 게임수 ++; // 게임수 1증가 
			}
			else {System.out.println("잘못된입력 ");}
			
			
			
			
			
		}//while end
		
		
		
	}
}
