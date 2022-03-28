package 개인과제;

import java.util.Random;
import java.util.Scanner;

public class 로또1 {
	// 참고 계속 걸린시간 21분 30초 
	/* 로또 판별기 
	1. 사용자 6개 수 입력받기 -> 배열 저장 
		1. 1~45 사이 수 만 입력받기 아니면 재입력
		2. 중복x 재입력 
	2. 추첨번호 : 컴퓨터 난수 6개 발생 -> 배열 저장 
		1. 1~45 사이 
		2. 중복x
	3. 사용자번호 와 컴퓨터 추첨번호와 동일 수의 개수
 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int [] 사용자번호 = new int[6]; // 길이가 0~5 총 6인 int형 배열 선언
		int [] 추첨번호 = new int[6];// 길이가 0~5 총 6인 int형 배열 선언 
		for( int i = 0 ; i<6; i++ ) { // i가 6이 되기전까지 반복 
			System.out.println("1~45사이 입력 : ");
			int 번호 = scanner.nextInt(); 
			
			boolean 통과  = true; // 통과 여부 참 거짓  => true
			
			if ( 번호 <1 || 번호>45) { //번호가 1보다 작거나 45보다 큰 경우 
				System.out.println("선택할수 없는 번호 입니다. 재입력 ");
				i--; // 올바른 실행이 아니었기때문에 증가한i를 다시 감소시켜준다 
				통과 = false;  // 통과여부 false
			}
			for(int j= 0; j<6; j++) { // j가 6이 되기전까지 반복 
				if(번호 == 사용자번호[j] ) { // 중복체크 
					System.out.println("중복된 번호입니다. 재입력 ");
					통과 = false; // 통과여부 false
				}
			} // for2 end
			if(통과 == true ) 사용자번호[i] = 번호; // 위 통과여부가 true일 경우 사용자번호배열의 i번째 인덱스에 번호를 넣는다.
		} // for end
		System.out.print("\n 사용자가 선택한 번호 :"); 
		for ( int temp : 사용자번호 ) { // temp라는 임시 변수안에 사용자 번호안에 있는 내용들을 넣는다.
			System.out.print(temp+"\t"); // 사용자번호을 넣은temp들을 출력
		}
		
		for ( int i= 0 ; i<6; i++) { // i가 6이되기전까지 반복 
			Random random = new Random(); // 난수선언 
			int 추첨 = random.nextInt(45) + 1; // 난수생성 (45)는  0~44까지 생성이지만 뒤에 +1을 붙혀  1~45까지 생성 
			
			boolean 통과 = true; //통과여부 true 
			for ( int temp : 추첨번호 ) { // temp라는 임시변수안에 추첨번호라는배열에 있는 수를 넣는다.
				if(추첨 == temp) { //  중복체크 
					i--; // 증가한 인덱스 다시 감소 
					통과 = false; //통과여부 false => 해당조건문의 반환값?이 false
				}
			}
			
			if(통과) 추첨번호[i] = 추첨; //중복체크에 걸리지 않은경우 통과 조건의 기본은 true이기 때문에 통과 일경우 추첨번호 i인덱스에추첨 대입  
		}
		System.out.print("\n \t 추첨번호 : " );
		for ( int temp : 추첨번호 ) { // temp라는 임시변수 안에 추첨번호 안에있는 번호들을넣는다
			System.out.print(temp + "\t"); //추첨번호배열의 수를 넣은 temp를 공백과 출력 
		}
		int 동일한수 = 0; // 동일한수 체크하기위한 변수 초기값 = 0
		
		for ( int 비교기준 : 사용자번호 ) { // 비교기준이라는 임시변수에 사용자번호안에 있는 수들을 사용자번호배열의 길이만큼 넣는다  
			for ( int 비교대상 : 추첨번호) {  // 비교대상이라는 임시변수에 추첨번호 안에있는 수들을 추첨번호배열의 길이만큼 넣는다.
				if(비교기준 == 비교대상) 동일한수 ++; // 각각의 임시변수들에 넣은수가 같으면 동일한 수의 값을 1씩증가시킨다.
			}
		}
		System.out.println("동일한 수 : "+ 동일한수 ); // 동일한수 변수의 값을 출력 
		
		
	}

}
