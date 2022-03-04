package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_5 { // c s
	
	/* 로또 판별기 
	1. 사용자 6개 수 입력받기 -> 배열 저장 
		1. 1~45 사이 수 만 입력받기 아니면 재입력
		2. 중복x 재입력 
	2. 추첨번호 : 컴퓨터 난수 6개 발생 -> 배열 저장 
		1. 1~45 사이 
		2. 중복x
	3. 사용자번호 와 컴퓨터 추첨번호와 동일 수의 개수
 */
	
	
	public static void main(String[] args) { // m s
		
		Scanner scanner = new Scanner(System.in); 
		int[] 사용자번호 = new int[6];
		int[] 추첨번호 = new int[6];
		
		// 1. 사용자에게 입력받기
		for( int i = 0 ; i<6 ; i++) {
			// i는 1부터 6까지 1씩증가반복 => 6회반복
			System.out.println(" 1~45 사이 입력 : ");
			int 번호 = scanner.nextInt();
			
			boolean 통과 = true;
			
			// 조건1 : 유효성검사
			if ( 번호 <1 || 번호>45) {
				System.out.println(" 알림)) 선택할수 없는 번호입니다. [재입력] ");
					
				// 1보다 작거나 45보다 크면 선택할수 없는 번호입력시 재입력
			
				i--; // 현재 i는 정상입력x	
				통과 = false; // 저장 x
			} 	// i e
			
			// 조건2 : 중복체크
				// 1. 배열내 모든 인덱스 호출
				// 2. 입력받은 값과 같은지 비교
			for ( int j = 0 ; j < 6; j++ ) {
				if(번호 ==사용자번호[j] ) {
					// 2. 입력받은 값과 j번째 인덱스값과 같은지비교
					System.out.println(" 알림)) 중복된 번호입니다. [재입력] ");
					i--; // 현재 i는 정상입력x
					통과 = false;
				} // i e 2
			} // for2 e
			// 정상입력 이면 배열에 저장하기
			if(통과 == true)사용자번호[i] = 번호;	
		} // f e
		
		System.out.print("\n사용자가 선택한 번호 : ");
		// 
		for ( int temp : 사용자번호) {
			System.out.print(temp + "\t");
		}
		
		// 2. 컴퓨터가 난수 생성
		
//		Random random = new Random();
//		컴퓨터 = random.nextInt(45);
		for (int i=0; i<6; i++) {
			Random random = new Random(); // 1. 난수객체
			int 추첨 =  random.nextInt(45)+1; // 2. 난수를 int형으로 가져오기
			
			
			// 조건 1 : 중복체크
			boolean 통과 = true;
			for (int temp : 추첨번호 ) {
				if(추첨 == temp ) {
					i--; // 중복이 있을경우 현재 i 예외
					통과 = false; // 저장 x
					
				}
			}
			if(통과) 추첨번호[i] = 추첨;
		}
		
		System.out.print("\n \t 추첨번호 : ");
		// 
		for ( int temp : 추첨번호) {
			System.out.print(temp + "\t");
		}
		// 3. 비교 = 두 배열간 동일한 수 찾기
		int 동일한수 = 0;
		
		//방법 1
//		for(int i =0 ; i<사용자번호.length ; i++) {
//			// i 비교 기준점
//			for( int j = 0 ; j<추첨번호.length ; j++) {
//				if(사용자번호[i] == 추첨번호[j] ) {
//						
//					동일한수++;
//				}
//			}
//		}
		
		// 방법 2
		for ( int 비교기준 : 사용자번호 ) {
			// 사용자번호 배열내 하나씩 비교기준 대입
			for ( int 비교대상 : 추첨번호 ) {
				// 추첨번호 배열내 하나씩 비교대상 대입
				if( 비교기준 == 비교대상) 동일한수++;
			}
		}
		System.out.println(" 동일한 수 : " + 동일한수);
		
			
		
		

	} // m e

} // c e
