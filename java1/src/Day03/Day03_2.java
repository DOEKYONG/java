package Day03;

import java.util.Scanner;

public class Day03_2 {
	
	public static void main(String[] args) {
		
		// 입력객체 = {} 당 1번 선언
		Scanner scanner = new Scanner(System.in);
		
//		// 문제 1  :  2개의 정수를 입력받아서 더 큰수 출력
//		System.out.println("정수1입력: ");
//		int 정수1 = scanner.nextInt();
//		System.out.println("정수2입력: ");
//		int 정수2 = scanner.nextInt();
//		
//		// 제어
//		if( 정수1 > 정수2 ) { 
//			System.out.println(" 더 큰수 : " + 정수1);
//		} else if ( 정수1 < 정수2 ) {
//			System.out.println("더 큰수 : "+ 정수2);
//		} else {
//			System.out.println(" 같다 ");
//		}
		
		// 문제2 : 3개의 정수를 입력받아서 가장 큰수 출력
//		System.out.println("정수3입력: "); //변수명 중복x
//		int 정수3 = scanner.nextInt();
//		System.out.println("정수4입력: ");
//		int 정수4 = scanner.nextInt();
//		System.out.println("정수5입력: ");
//		int 정수5 = scanner.nextInt();
//		int max = 0;	//가장 큰수를 저장하는 임시 저장
//			// max에 첫번째 값 넣어두기
//		if ( max < 정수4 ) {
//			// 만약에 max보다 정수4가 더 크면 교체
//			max = 정수4;
//		}
//		if( max < 정수5 ) {
//			max = 정수5;
//		}
//		System.out.println("가장 큰수 : " + max );
		// 문제3 : 4개의 정수를 입력받아서 가장 큰수 출력
//		System.out.println("정수5입력: ");
//		int 정수6 = scanner.nextInt();
//		System.out.println("정수5입력: ");
//		int 정수7 = scanner.nextInt();
//		System.out.println("정수5입력: ");
//		int 정수8 = scanner.nextInt();
//		System.out.println("정수5입력: ");
//		int 정수9 = scanner.nextInt();
//		int max2= 정수6;
//		if ( max2 < 정수7 ) {max2 = 정수7;}
//		if ( max2 < 정수8 ) {max2 = 정수8;}
//		if ( max2 < 정수9 ) {max2 = 정수9;}
//		System.out.println("가장 큰수 : " + max2 );
		
		//문제16 : 3개의 정수를 입력받아 오름차순으로 정렬
//		System.out.println("정수10입력: ");
//		int 정수10 = scanner.nextInt();
//		System.out.println("정수11입력: ");
//		int 정수11 = scanner.nextInt();
//		System.out.println("정수12입력: ");
//		int 정수12 = scanner.nextInt();
//		
//		if ( 정수10 > 정수11 ) {
//			// 교체[ 스왑 = 두개 변수에 데이터 교환방법]
//			int temp = 정수10;
//			정수10 = 정수11;
//			정수11 = temp;
//		}
//		if ( 정수10 > 정수12 ) {
//			int temp = 정수10;
//			정수10 = 정수12;
//			정수12=temp;
//		}
//		if( 정수11 > 정수12) {
//			int temp = 정수11;
//			정수11 = 정수12;
//			정수12 = temp;
//		}
//		System.out.println("입력한 값 오름차순 : "+정수10+ " "+정수11+" "+정수12);
		
		//문제17 : 4개의 정수를 입력받아 내림차순으로 정렬 
		
		System.out.println("정수13입력: ");
		int 정수13 = scanner.nextInt();
		System.out.println("정수14입력: ");
		int 정수14 = scanner.nextInt();
		System.out.println("정수15입력: ");
		int 정수15 = scanner.nextInt();
		System.out.println("정수16입력: ");
		int 정수16 = scanner.nextInt();
		
		if ( 정수13 < 정수14 ) {
			int temp = 정수13;
			정수13 = 정수14;
			정수14 = temp;
		}
		if ( 정수13 < 정수15 ) {
			int temp = 정수13;
			정수13 = 정수15;
			정수15 = temp;
		}
		if ( 정수13 < 정수16 ) {
			int temp = 정수13;
			정수13 = 정수16;
			정수16 = temp;
		}
		if ( 정수14 < 정수15 ) {
			int temp = 정수14;
			정수14 = 정수15;
			정수15 = temp;
		}
		if ( 정수14 < 정수16 ) {
			int temp = 정수14;
			정수14 = 정수16;
			정수16 = temp;
		}
		if ( 정수15 < 정수16 ) {
			int temp = 정수15;
			정수15 = 정수16;
			정수16 = temp;
		}
		System.out.printf("%d %d %d %d",정수13,정수14,정수15,정수16);
	}
}
