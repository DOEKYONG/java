package Day05;

import java.util.Scanner;

public class Day05_3 {

	public static void main(String[] args) {
		
		// p.181
			// 1.
			// 2.
			// 3. 2 :객체 비교시 equals 메소드 사용
			// 4. 2 : 길이가 없을경우 값 추가 불가
			// 5. 3 : boolean 초기값은 false
			// 6. 3 , 5
			//		{1행} {2행} {3행} => 3
			// 		{78 83 93 87 88} = > 5
			// 7. 
		int max = 0; // 최대값 저장하는 변수
		int[] array = {1,5,3,8,2}; // 선언+초기값 선언
		for(int i = 0; i<array.length; i++) {
			// *i는 0 부터 배열의길이 까지 1씩증가
			if(max < array[i]) {
				max = array[i];
			}
		}
		
		System.out.println(" max: " + max);
		
		// 8. 
		int[][] array2 = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum = 0; 
		double avg = 0.0;
		
		// 풀이
		int count = 0;
		for( int 행 = 0 ; 행<array2.length; 행++) {
			// *i는 0부터 배열의 행길이[3]미만까지 1씩증가
			for ( int 열 = 0; 열<array2[행].length; 열++) {
				// *열은 0부터 배열의 열길이 [ 2, 3, 5 ] 미만까지 1씩증가
				sum += array2[행][열];
			}
			count += array2[행].length;
			
		}
		avg = (double)sum /count;
		System.out.println(" sum : "+ sum);
		System.out.println(" avg : "+ avg);
		
		// 9.
		boolean run = true; //while문 스위치 변수
		int studentNum = 0; //학생수 변수
		int[] scores = null; // 점수배열
		Scanner scanner = new Scanner(System.in);
		
		// while (true){}
		while(run) {
			
			System.out.println("-----------------------------------------");
			System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택 : ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) { // 학생수 입력받기
				System.out.print("학생수>"); studentNum = scanner.nextInt();
				// 입력받은 학생 수 만큼 배열길이 변경
				scores = new  int[studentNum];
			}
			else if(selectNo == 2) { // 학생 점수 입력받기
				for ( int i =0; i<scores.length; i++) {
					System.out.printf(" scores[%d] : %d \n ", i ,scores[i]);  
					scores[i] = scanner.nextInt(); // 입력받아 i 번째 인덱스에 저장
				}
			}
			else if(selectNo == 3) { // 학생 점수 출력하기
				for ( int i =0; i<scores.length; i++) {
					System.out.printf(" scores[%d] : %d \n ", i ,scores[i]);
				}
			}
			else if(selectNo == 4) {
				int 최고점수 = 0;
				double 평균점수 = 0.0;
				int 총합계 = 0;
				
				for (int i = 0; i<scores.length; i++) {
					
					// 최고점수 구하기
					if (최고점수 < scores[i] ) 최고점수 = scores[i];
					// 누적합계
					총합계 += scores[i];
				}
				
				//평균점수 구하기
				평균점수  = (double)총합계 / scores.length;
				
				System.out.println("최고점수 : "+ 최고점수);
				System.out.println("평균점수 : "+ 평균점수);
			}
			else if(selectNo == 5) {
				run = false; // = break;
			}
			
			
		}// while end
		System.out.println("프로그램 종료");
		
		
		
	} // m e

} // c  e
