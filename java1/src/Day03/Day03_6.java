package Day03;

import java.util.Scanner;

public class Day03_6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
//		// 별문제1 : 입력받은 수 만큼 * 출력
//		System.out.println(" 문제1) 별개수 : "); int s1 = scanner.nextInt();
//		for ( int i = 1 ; i<=s1 ; i++) {
//			System.out.print("*");
//		}
//		System.out.println("\n-------------------문제구분선---------------------------------");
//
//		// 별문제2 : 입력받은 수 만큼 * 출력 [ 단 5개마다 줄바꿈 처리 ]
//		System.out.println(" 문제2) 별개수 : "); int s2 = scanner.nextInt();
//		for ( int i =1 ; i<=s2 ; i++) {
//			// *i는 1부터 입력받은 수까지 i는 1씩증가 하면서 실행문 반복처리
//			System.out.print("*");
//			// 5개마다 줄바꿈 -> 5배수마다 -> 배수찾기
//			if( i%5 == 0 ) System.out.println();
//		}
//		System.out.println("\n-------------------문제구분선---------------------------------");
//		
//		// 별문제3 : 입력받은 줄 만큼 출력
//		System.out.println("문제3) 줄갯수 : "); int 줄 = scanner.nextInt();
//		for ( int i = 1 ; i<=줄; i++) {
//			
//			for(int j =1 ; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		System.out.println("\n-------------------문제구분선---------------------------------");
//		
//		// 별문제4 : 입력받은 줄 만큼 출력
//		
//		System.out.println("문제4) 줄갯수 : "); 
//		for ( int i = 1 ; i<=줄; i++) {
//			for( int j = 줄; j >= i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		System.out.println("\n-------------------문제구분선---------------------------------");
		
		// 별문제5 : 입력받은 줄 만큼 출력
		
		System.out.println("문제5) 줄갯수 : "); int 줄2 = scanner.nextInt();
		for( int i = 1 ; i<=줄2 ; i++ ) {
			//1.공백찍기
			for( int b = 1 ; b<=줄2-i ; b++ ) { 
				System.out.print(" "); // 공백 => 스페이바 
			}
			//2.별찍기
			for( int s = 1 ; s<=i ; s++ ) {
				System.out.print("*");
			}
			//3. 줄바꿈
			System.out.println();
		}
		
		// 별문제6 : 입력받은 줄 만큼 출력 
		
		System.out.println("문제6) 줄갯수 : "); 
		for(int i = 1 ; i<=줄2; i++) {
			
			
			//1.공백찍기
			for( int b = 1 ; b<=i-1 ; b++ ) { 
				System.out.print(" "); // 공백 => 스페이바 
			}
			//2.별찍기
			for( int s = 1 ; s<=줄2-i+1 ; s++ ) {
				System.out.print("*");
			}
			//3. 줄바꿈
			System.out.println();
			
		}
		
		// 별문제7 : 입력받은 줄 만큼 출력
		System.out.println("문제7) 줄수 :");
		int line7 = scanner.nextInt();
		
		for( int i = 1 ; i<=line7 ; i++) {
		
			// 1. 공백찍기
			for( int b = 1 ; b<=line7-i ; b++) {
				System.out.print(" ");
			}
			// 2. 별찍기
			for(int s = 1; s<=i*2-1; s++) {
				System.out.print("*");
			}
			// 3. 줄바꿈
			System.out.println();
		}
		
		// 별문제8 : 입력받은 줄 만큼 출력
				System.out.println("문제7) 줄수 :");
				
				for( int i = 1 ; i<=line7 ; i++) {
				
					// 1. 공백찍기
					for( int b = 1 ; b<=line7-i ; b++) {
						System.out.print(" ");
					}
					// 2. 별찍기
					for(int s = 1; s<=i*2-1; s++) {
						System.out.print(i);
					}
					// 3. 줄바꿈
					System.out.println();
				}
		// 별문제9 :
				
				
		
		
		
		
		
		
	}

}
