package Day04;

import java.util.Scanner;

public class Day04_1 { // c s

	public static void main(String[] args) { // m s
		
		
		// for 예1 )
		for( int i = 1; i<=10; i++) {
			// i는 1부터 10이하까지 1씩증가하면서 실행문 반복처리 => 10번실행
			System.out.print(i + " ");
		} // for end
		
		System.out.println();
		
		// while 예1)
		int i = 1; // 1. 초기값
		while ( i <=10 ) { // 2. 조건식
			
			System.out.print(i + " ");
			i++; // 3. 증감식
		} // while end
		System.out.println();
		
		// for 예2) 1~100 누적합계
		int sum = 0;
		for (int j = 1 ; j<=100; j++) {
			sum += j;
		}
		System.out.println(sum);
		
		
		// while 예2) 1~100 누적합계
		int j = 1 ; // 1. 초기값
		int sum2 =  0;
		while (j<=100) { // 2. 조건식
			sum2 += j;	// 4. 실행문
			j++; // 3. 증감식
		}
		System.out.println(sum2);
		
		// while 예3) 무한루프
		while(true) { // 조건식이 true 실행 // true 상수 => 무한루프
			System.out.println("무한루프");
			Scanner scanner = new Scanner(System.in);
			int exit = scanner.nextInt();
			if ( exit == 3 )
				break; // 가장 가까운 반복문탈출 [ if제외 ]
		}
		
	} // m e

} // c e
