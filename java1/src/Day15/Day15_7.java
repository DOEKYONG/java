package Day15;

import java.awt.Toolkit;

public class Day15_7 {

	public static void main(String[] args) {
		
		
		// 601 스레드 제어
			// 1. sleep() : 주어진 시간동안 일시정지
			
		// 602 sleep 예제
		
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // 소리 관련 클래스
		for ( int i= 0; i<10; i++) {
			toolkit.beep(); // 소리내기 [ 소리 1번 작동중에 for문 끝남 ]
			try {
				Thread.sleep(3000);
			}catch(Exception e) {}
			
		}

		
		
	}

}
