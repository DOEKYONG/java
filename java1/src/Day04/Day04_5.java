package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_5 { // c s
	
	/* �ζ� �Ǻ��� 
	1. ����� 6�� �� �Է¹ޱ� -> �迭 ���� 
		1. 1~45 ���� �� �� �Է¹ޱ� �ƴϸ� ���Է�
		2. �ߺ�x ���Է� 
	2. ��÷��ȣ : ��ǻ�� ���� 6�� �߻� -> �迭 ���� 
		1. 1~45 ���� 
		2. �ߺ�x
	3. ����ڹ�ȣ �� ��ǻ�� ��÷��ȣ�� ���� ���� ����
 */
	
	
	public static void main(String[] args) { // m s
		
		Scanner scanner = new Scanner(System.in); 
		int[] ����ڹ�ȣ = new int[6];
		int[] ��÷��ȣ = new int[6];
		
		// 1. ����ڿ��� �Է¹ޱ�
		for( int i = 0 ; i<6 ; i++) {
			// i�� 1���� 6���� 1�������ݺ� => 6ȸ�ݺ�
			System.out.println(" 1~45 ���� �Է� : ");
			int ��ȣ = scanner.nextInt();
			
			boolean ��� = true;
			
			// ����1 : ��ȿ���˻�
			if ( ��ȣ <1 || ��ȣ>45) {
				System.out.println(" �˸�)) �����Ҽ� ���� ��ȣ�Դϴ�. [���Է�] ");
					
				// 1���� �۰ų� 45���� ũ�� �����Ҽ� ���� ��ȣ�Է½� ���Է�
			
				i--; // ���� i�� �����Է�x	
				��� = false; // ���� x
			} 	// i e
			
			// ����2 : �ߺ�üũ
				// 1. �迭�� ��� �ε��� ȣ��
				// 2. �Է¹��� ���� ������ ��
			for ( int j = 0 ; j < 6; j++ ) {
				if(��ȣ ==����ڹ�ȣ[j] ) {
					// 2. �Է¹��� ���� j��° �ε������� ��������
					System.out.println(" �˸�)) �ߺ��� ��ȣ�Դϴ�. [���Է�] ");
					i--; // ���� i�� �����Է�x
					��� = false;
				} // i e 2
			} // for2 e
			// �����Է� �̸� �迭�� �����ϱ�
			if(��� == true)����ڹ�ȣ[i] = ��ȣ;	
		} // f e
		
		System.out.print("\n����ڰ� ������ ��ȣ : ");
		// 
		for ( int temp : ����ڹ�ȣ) {
			System.out.print(temp + "\t");
		}
		
		// 2. ��ǻ�Ͱ� ���� ����
		
//		Random random = new Random();
//		��ǻ�� = random.nextInt(45);
		for (int i=0; i<6; i++) {
			Random random = new Random(); // 1. ������ü
			int ��÷ =  random.nextInt(45)+1; // 2. ������ int������ ��������
			
			
			// ���� 1 : �ߺ�üũ
			boolean ��� = true;
			for (int temp : ��÷��ȣ ) {
				if(��÷ == temp ) {
					i--; // �ߺ��� ������� ���� i ����
					��� = false; // ���� x
					
				}
			}
			if(���) ��÷��ȣ[i] = ��÷;
		}
		
		System.out.print("\n \t ��÷��ȣ : ");
		// 
		for ( int temp : ��÷��ȣ) {
			System.out.print(temp + "\t");
		}
		// 3. �� = �� �迭�� ������ �� ã��
		int �����Ѽ� = 0;
		
		//��� 1
//		for(int i =0 ; i<����ڹ�ȣ.length ; i++) {
//			// i �� ������
//			for( int j = 0 ; j<��÷��ȣ.length ; j++) {
//				if(����ڹ�ȣ[i] == ��÷��ȣ[j] ) {
//						
//					�����Ѽ�++;
//				}
//			}
//		}
		
		// ��� 2
		for ( int �񱳱��� : ����ڹ�ȣ ) {
			// ����ڹ�ȣ �迭�� �ϳ��� �񱳱��� ����
			for ( int �񱳴�� : ��÷��ȣ ) {
				// ��÷��ȣ �迭�� �ϳ��� �񱳴�� ����
				if( �񱳱��� == �񱳴��) �����Ѽ�++;
			}
		}
		System.out.println(" ������ �� : " + �����Ѽ�);
		
			
		
		

	} // m e

} // c e
