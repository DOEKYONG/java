package 개인과제;

import java.util.Random;
import java.util.Scanner;

public class 로또2 {
	// 참고 계속 걸린시간 29분 26초 
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
		
		Scanner scanner = new Scanner(System.in); //입력객체선언 
		int[] 사용자번호 = new int[6]; // 사용자번호 길이가 6 인 배열 
		int[] 추첨번호 = new int[6]; // 추첨번호 길이가 6인 배열 
		for(int i = 0; i<6; i++) { // i가 6이되기전 까지 반복 
			System.out.println("1~45 사이 입력 : "); 
			int 번호  = scanner.nextInt(); 
			boolean 통과  = true; // 통과여부 true
			
			if(번호<1 || 번호>45) { // 0이나 45초과하는 수를입력했을경우 
				System.out.println("잘못된입력 "); 
				i--; // 조건에 맞지않은 입력은 인덱스 카운터를 세지 않기 때문 
				통과 = false; // 통과여부 false
			}
			// 중복체크
			for(int j = 0; j<6; j++) { // j가 6이되기전까지 반복 
				if(번호==사용자번호[j]) { // 내가 입력한번호가 사용자번호배열에 있는 수와 같을경우 
					System.out.println("중복된번호입니다.");
					i--; // 중복된수는 인덱스 카운터 세지 않기때문에 
					통과 = false; // 통과여부 false
				}
			}
			if(통과 == true)사용자번호[i] = 번호; // 통과여부가 참이면 내가 입력한 번호를 사용자번호 배열의 i인덱스에넣는다.
		}
		System.out.print("\n사용자가 선택한번호 : ");
		for (int temp : 사용자번호 ) { // 템프라는 임시변수에 사용자번호배열의 값 넣는다.  
			System.out.print(temp+"\t"); // temp의 값을 공백과 함께 가로로  출력 
		} 
		
		
		
		// 컴퓨터 난수생성 
		for(int i= 0 ; i<6; i++ ) { // i가 6이되기 전까지 반복 
		
			Random random = new Random(); // 난수선언 
			int 추첨 = random.nextInt(45)+1; // 난수생성 
			boolean 통과  = true; // 통과조건 참 
			
			// 중복체크
			for(int  j = 0 ; j<6; j++) { // j가 6이되기전까지 반복 
				if(추첨==추첨번호[j]) { // 추첨 (컴퓨터가난수로생성한수 ) 가 추첨번호j의 인덱스의 값과 같다면 
					System.out.println("중복된번호입니다.");
					i--; // 중복된 인덱스는 인덱스카운터세지않는다.
					통과 = false; //통과조건 거짓 
				}
			}
			if(통과 == true) { // 통과조건이 참이면 
				추첨번호[i] = 추첨; // 추첨번호배열에 추첨을 넣는다 
			}
		}
			
			System.out.print("\n컴퓨터가 선택한 번호 :");
			for ( int j=0; j<6; j++ ) { // j가 6이되기전까지 반복 
				
				System.out.print(추첨번호[j]+"\t"); // 추첨번호 j 번째인덱스출력
			}
			
			int 동일한수 = 0; // 동일한수 카운트 
			
			for(int i = 0; i<사용자번호.length; i++ ) { // i가 사용자번호배열의 길이만큼 반복 
				for(int j =0 ; j<추첨번호.length ; j++) { // j가 추첨번호배열의 길이만큼반복 
					if(사용자번호[i] == 추첨번호[j] ) { // 사용자번호 i번째 배열의 값과 추첨번호j번째 배열의 값이같으면 
						동일한수++; // 동일한수 카운트 증가 
					}
				}
			}
			System.out.println(" 동일한 수 : " + 동일한수); // 동일한 수  카운트 출 
		
		
		
		
		
		
		
	}

}
