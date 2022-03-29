package 개인과제;

import java.util.Random;
import java.util.Scanner;

public class 로또3 { // c s
	
	/* 로또 판별기  
	 * 참고 2 20분 12초 
	1. 사용자 6개 수 입력받기 -> 배열 저장 
		1. 1~45 사이 수 만 입력받기 아니면 재입력
		2. 중복x 재입력 
	2. 추첨번호 : 컴퓨터 난수 6개 발생 -> 배열 저장 
		1. 1~45 사이 
		2. 중복x
	3. 사용자번호 와 컴퓨터 추첨번호와 동일 수의 개수
 */

	public static void main(String[] args) { // m s
		Scanner scanner = new Scanner(System.in ); // 입력객체 선언 
		int[] 사용자번호 = new int[6]; // 사용자번호 길이가 6인 인트배열 
		int[] 추첨번호 = new int[6]; // 추첨번호 길이가 6인 인트배열 
		
		// 1. 사용자에게 입력받기
		for(int i = 0 ; i<6; i++) { // i 가 6이되기전까지 반복
			System.out.println("1~45 입력  :");
			int 번호  = scanner.nextInt(); 
			boolean 통과 = true; // 통과여부 참 
			if(번호>45 || 번호<1) { // 유효성검사 번호가 45초과거나 0이면  아래 코드 실행 
				System.out.println("잘못된입력 ");
				i--; // 유효하지않은입력이기 때문에 증가한 i인덱스 다시 감소  
				통과=false; // 통과여부 거짓 
				
			}
//		 	중복체크
			for(int j = 0 ; j < 6 ; j++) { // J가 6이 되기전까지 반복 
				if(사용자번호[j] == 번호 ) { // 사용자 번호 배열의 값과 번호가 같다면 
					System.out.println("중복된번호 ");
					i--; // i인덱스 감소 
					통과=false; //통과여부 거짓 
				}
			}
			if(통과) { // 통과여부가 통과이면 
				사용자번호[i] = 번호; // 사용자번호i번째 인덱스에 번호 대입  6번 도는for문 안에 있기때문에 6개의 수 저장됨 
			}
			
		}
		System.out.print("\n사용자가 선택한 번호 : "); // 줄바꿈과 메세지 출력 
		for( int temp : 사용자번호) { // int temp 라는 임시변수에 사용자번호배열의 값 넣기 
			System.out.print(temp + "\t"); // temp에 들어간 값 사용자번호 배열의 길이만큼 반복해서 출력 
			
		}
		
	
		
		
		// 2 컴퓨터 난수 생성
		for(int i = 0 ; i<6; i++) { // i가 6이되기전까지 반복 
			Random random = new Random(); // 난수선언 
			int 추첨 = random.nextInt(45)+1; // 1~45까지의 난수 선언 
			
			boolean 통과  = true; // 통과여부 참 
			for ( int temp : 추첨번호 ) { // 임시변수 temp안에 추첨번호 넣기 
				if(추첨 == temp) { // 추첨과 temp안에 넣으 추첨번호가 같다면 
					i--; // 인덱스 카운트 감소 
					통과 = false; // 통과여부 감소 
				}
			}
			if(통과==true) { // 통과여부가 참이면 
				추첨번호[i] = 추첨; //추첨번호 배열 안에 추첨 대입 
			}
		}
		System.out.print("\n컴퓨터가 선택한 번호 : "); //
		for( int temp : 추첨번호 ) { // int temp 안에 추첨번호 넣기 
			System.out.print(temp + "\t"); // temp안에 넣은 추첨번호와 공백 출력 
		}
		// 3. 동일한수??
		
		int 동일한수 = 0; // 동일한수 카운트 
		//
		for(int temp  : 추첨번호 ) { // 템프안에 추천번호 넣기 
			for( int temp2 : 사용자번호 ) { //  템프2안에 사용자번호 넣기 
				if(temp==temp2 ) { // 둘이 같다면 
					동일한수++; // 동일한수 카운트 체크 
				}
			}
		}
		System.out.println("동일한수 : " + 동일한수 ); // 동일한수 출
		

	} // m e

} // c e
