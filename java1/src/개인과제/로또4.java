package 개인과제;

import java.util.Random;
import java.util.Scanner;

public class 로또4 {
	/* 로또 판별기  
	 * 참고 1 18분 
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
		int[]  추첨번호 = new int[6]; // 길이가 6인 인트배열 선언 
		int[] 사용자번호 = new int[6];//길이가 6인 인트배열 선언 
		
		//사용자 입력
		for(int i = 0; i<6; i++) { // i가 6전까지 반복문 실행 
			System.out.println("1~45입력 : "); 
			int 번호 =  scanner.nextInt();
			boolean 통과 = true; // 통과여부 참 
			
			//유효성검사 
			if(번호<1|| 번호>45) { // 유효성검사 0이나45초과하는 수 입력시 
				System.out.println("알수없는 입력 ");
				i--; // 반복문인덱스 카운트 감소 
				통과 = false; // 통과여부 false
				
			}
			
			//중복체크
			for(int j= 0 ; j<6; j++) { // j가 6이 되기전까지 반복 
				if(번호 == 사용자번호[j] ) { // 내가 입력한 번호가 사용자번호배열안에있는 값과 같으면 
					System.out.println("중복된 수 "); 
					i--; // 인덱스 카운트 감소 
					통과 = false; // 통과여부 false
					
				}
			} if(통과 ) { //통과여부가 참이면 
				사용자번호[i] = 번호;// 사용자번호 배열 안에 번호대입 
			}
		}
		System.out.print("\n사용자가 선택한 번호 ");
		for(int temp : 사용자번호 ) { // int형 temp라는 임시변수안에 사용자번호 배열의 값 대입 
			System.out.print(temp+ "\t"); // temp의 값 공백과 출력 
		}
		//컴퓨터난수생성
		for(int i = 0 ; i<6; i++) { // i가 6이되기 전까지 반복 
			Random random = new Random(); // 난수선언 
			int 추첨 = random.nextInt(45)+1; // 난수생성 
			boolean 통과  =true; // 통과여부 참 
			
			//중복체크 
			for( int temp : 추첨번호 ) { //int 형 임시변수 temp 안에 추첨번호 넣기 
			if(temp == 추첨 ) { // temp의 값과 추첨의 값이 같으면 
				i--; // 증가한 반복문 인덱스 다시 감소 
				통과 = false; // 통과여부 거짓 
			} 
		}
		if(통과 == true) { // 통과여부 참일시 
			추첨번호[i] = 추첨; // 추첨번호배열 안에 추첨넣기 
		}
		
	
			
		}
		
		System.out.print("\t\n컴퓨터가선택한 번호 ");
		for(int temp : 추첨번호) { // 임시변수 temp안에 추첨번호를 넣고 
			System.out.print(temp + "\t"); // temp 출력 공백과함께 
		}
		
		//동일한수 
		int 동일한수 = 0; // 동일한수 카운트 
		for(int temp : 사용자번호 ) { //temp안에 사용자번호 넣기 
			for(int temp2 : 추첨번호 ) { // temp2 안에 추첨번호 넣기 
				if(temp == temp2 ) { // temp와 temp2와 같으면 
					동일한수++; //동일한수 카운트 
				}
			}
		}
		System.out.println("동일한수 :" + 동일한수 );
		
		
		

	}

}
