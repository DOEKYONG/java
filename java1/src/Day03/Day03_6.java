package Day03;

import java.util.Scanner;

public class Day03_6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
//		// ������1 : �Է¹��� �� ��ŭ * ���
//		System.out.println(" ����1) ������ : "); int s1 = scanner.nextInt();
//		for ( int i = 1 ; i<=s1 ; i++) {
//			System.out.print("*");
//		}
//		System.out.println("\n-------------------�������м�---------------------------------");
//
//		// ������2 : �Է¹��� �� ��ŭ * ��� [ �� 5������ �ٹٲ� ó�� ]
//		System.out.println(" ����2) ������ : "); int s2 = scanner.nextInt();
//		for ( int i =1 ; i<=s2 ; i++) {
//			// *i�� 1���� �Է¹��� ������ i�� 1������ �ϸ鼭 ���๮ �ݺ�ó��
//			System.out.print("*");
//			// 5������ �ٹٲ� -> 5������� -> ���ã��
//			if( i%5 == 0 ) System.out.println();
//		}
//		System.out.println("\n-------------------�������м�---------------------------------");
//		
//		// ������3 : �Է¹��� �� ��ŭ ���
//		System.out.println("����3) �ٰ��� : "); int �� = scanner.nextInt();
//		for ( int i = 1 ; i<=��; i++) {
//			
//			for(int j =1 ; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		System.out.println("\n-------------------�������м�---------------------------------");
//		
//		// ������4 : �Է¹��� �� ��ŭ ���
//		
//		System.out.println("����4) �ٰ��� : "); 
//		for ( int i = 1 ; i<=��; i++) {
//			for( int j = ��; j >= i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		System.out.println("\n-------------------�������м�---------------------------------");
		
		// ������5 : �Է¹��� �� ��ŭ ���
		
		System.out.println("����5) �ٰ��� : "); int ��2 = scanner.nextInt();
		for( int i = 1 ; i<=��2 ; i++ ) {
			//1.�������
			for( int b = 1 ; b<=��2-i ; b++ ) { 
				System.out.print(" "); // ���� => �����̹� 
			}
			//2.�����
			for( int s = 1 ; s<=i ; s++ ) {
				System.out.print("*");
			}
			//3. �ٹٲ�
			System.out.println();
		}
		
		// ������6 : �Է¹��� �� ��ŭ ��� 
		
		System.out.println("����6) �ٰ��� : "); 
		for(int i = 1 ; i<=��2; i++) {
			
			
			//1.�������
			for( int b = 1 ; b<=i-1 ; b++ ) { 
				System.out.print(" "); // ���� => �����̹� 
			}
			//2.�����
			for( int s = 1 ; s<=��2-i+1 ; s++ ) {
				System.out.print("*");
			}
			//3. �ٹٲ�
			System.out.println();
			
		}
		
		// ������7 : �Է¹��� �� ��ŭ ���
		System.out.println("����7) �ټ� :");
		int line7 = scanner.nextInt();
		
		for( int i = 1 ; i<=line7 ; i++) {
		
			// 1. �������
			for( int b = 1 ; b<=line7-i ; b++) {
				System.out.print(" ");
			}
			// 2. �����
			for(int s = 1; s<=i*2-1; s++) {
				System.out.print("*");
			}
			// 3. �ٹٲ�
			System.out.println();
		}
		
		// ������8 : �Է¹��� �� ��ŭ ���
				System.out.println("����7) �ټ� :");
				
				for( int i = 1 ; i<=line7 ; i++) {
				
					// 1. �������
					for( int b = 1 ; b<=line7-i ; b++) {
						System.out.print(" ");
					}
					// 2. �����
					for(int s = 1; s<=i*2-1; s++) {
						System.out.print(i);
					}
					// 3. �ٹٲ�
					System.out.println();
				}
		// ������9 :
				
				
		
		
		
		
		
		
	}

}
