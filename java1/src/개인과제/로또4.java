package ���ΰ���;

import java.util.Random;
import java.util.Scanner;

public class �ζ�4 {
	/* �ζ� �Ǻ���  
	 * ���� 1 18�� 
	1. ����� 6�� �� �Է¹ޱ� -> �迭 ���� 
		1. 1~45 ���� �� �� �Է¹ޱ� �ƴϸ� ���Է�
		2. �ߺ�x ���Է� 
	2. ��÷��ȣ : ��ǻ�� ���� 6�� �߻� -> �迭 ���� 
		1. 1~45 ���� 
		2. �ߺ�x
	3. ����ڹ�ȣ �� ��ǻ�� ��÷��ȣ�� ���� ���� ����
 */

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[]  ��÷��ȣ = new int[6]; // ���̰� 6�� ��Ʈ�迭 ���� 
		int[] ����ڹ�ȣ = new int[6];//���̰� 6�� ��Ʈ�迭 ���� 
		
		//����� �Է�
		for(int i = 0; i<6; i++) { // i�� 6������ �ݺ��� ���� 
			System.out.println("1~45�Է� : "); 
			int ��ȣ =  scanner.nextInt();
			boolean ��� = true; // ������� �� 
			
			//��ȿ���˻� 
			if(��ȣ<1|| ��ȣ>45) { // ��ȿ���˻� 0�̳�45�ʰ��ϴ� �� �Է½� 
				System.out.println("�˼����� �Է� ");
				i--; // �ݺ����ε��� ī��Ʈ ���� 
				��� = false; // ������� false
				
			}
			
			//�ߺ�üũ
			for(int j= 0 ; j<6; j++) { // j�� 6�� �Ǳ������� �ݺ� 
				if(��ȣ == ����ڹ�ȣ[j] ) { // ���� �Է��� ��ȣ�� ����ڹ�ȣ�迭�ȿ��ִ� ���� ������ 
					System.out.println("�ߺ��� �� "); 
					i--; // �ε��� ī��Ʈ ���� 
					��� = false; // ������� false
					
				}
			} if(��� ) { //������ΰ� ���̸� 
				����ڹ�ȣ[i] = ��ȣ;// ����ڹ�ȣ �迭 �ȿ� ��ȣ���� 
			}
		}
		System.out.print("\n����ڰ� ������ ��ȣ ");
		for(int temp : ����ڹ�ȣ ) { // int�� temp��� �ӽú����ȿ� ����ڹ�ȣ �迭�� �� ���� 
			System.out.print(temp+ "\t"); // temp�� �� ����� ��� 
		}
		//��ǻ�ͳ�������
		for(int i = 0 ; i<6; i++) { // i�� 6�̵Ǳ� ������ �ݺ� 
			Random random = new Random(); // �������� 
			int ��÷ = random.nextInt(45)+1; // �������� 
			boolean ���  =true; // ������� �� 
			
			//�ߺ�üũ 
			for( int temp : ��÷��ȣ ) { //int �� �ӽú��� temp �ȿ� ��÷��ȣ �ֱ� 
			if(temp == ��÷ ) { // temp�� ���� ��÷�� ���� ������ 
				i--; // ������ �ݺ��� �ε��� �ٽ� ���� 
				��� = false; // ������� ���� 
			} 
		}
		if(��� == true) { // ������� ���Ͻ� 
			��÷��ȣ[i] = ��÷; // ��÷��ȣ�迭 �ȿ� ��÷�ֱ� 
		}
		
	
			
		}
		
		System.out.print("\t\n��ǻ�Ͱ������� ��ȣ ");
		for(int temp : ��÷��ȣ) { // �ӽú��� temp�ȿ� ��÷��ȣ�� �ְ� 
			System.out.print(temp + "\t"); // temp ��� ������Բ� 
		}
		
		//�����Ѽ� 
		int �����Ѽ� = 0; // �����Ѽ� ī��Ʈ 
		for(int temp : ����ڹ�ȣ ) { //temp�ȿ� ����ڹ�ȣ �ֱ� 
			for(int temp2 : ��÷��ȣ ) { // temp2 �ȿ� ��÷��ȣ �ֱ� 
				if(temp == temp2 ) { // temp�� temp2�� ������ 
					�����Ѽ�++; //�����Ѽ� ī��Ʈ 
				}
			}
		}
		System.out.println("�����Ѽ� :" + �����Ѽ� );
		
		
		

	}

}
