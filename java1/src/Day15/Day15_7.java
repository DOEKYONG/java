package Day15;

import java.awt.Toolkit;

public class Day15_7 {

	public static void main(String[] args) {
		
		
		// 601 ������ ����
			// 1. sleep() : �־��� �ð����� �Ͻ�����
			
		// 602 sleep ����
		
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // �Ҹ� ���� Ŭ����
		for ( int i= 0; i<10; i++) {
			toolkit.beep(); // �Ҹ����� [ �Ҹ� 1�� �۵��߿� for�� ���� ]
			try {
				Thread.sleep(3000);
			}catch(Exception e) {}
			
		}

		
		
	}

}
