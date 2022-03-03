package Day03;

public class Day03_7 {

	public static void main(String[] args) {
		
		// 문제3
		int sum = 0;
		for (int i =0; i<=100; i++) {
			if(i%3==0) {
				sum += i ;
			}
		}
		System.out.println(sum);
		
	
		// 문제5
		for ( int x = 1 ; x<=10; x++) {
			for ( int y = 1; y<=10; y++) {
				if( (4*x) + (5*y) == 60 ) {
					System.out.println(x +" "+ y);
				}
			}
		}
		
		// 6.
		for( int i = 1 ; i<=5 ; i++ ) {
			// i는 1부터 5까지 1씩증가하면 실행 반복처리 
			// i = 현재줄수 
			for( int s = 1 ; s<=i ; s++ ) {
				System.out.print("*"); // 별찍기 
			}
			System.out.println(); // 줄바꿈처리
		}
	}

}


