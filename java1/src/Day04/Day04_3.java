package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_3 { //  c s
	
	

	public static void main(String[] args) { // m s
		// �غ�
		int �÷��̾�; 		// ����ڰ� ������ ��
		int ��ǻ��;  		// ��ǻ�Ͱ� ������ ������ �� ����
		int ���Ӽ�=0; 		// �� ���������� ���� Ƚ��
		int �÷��̾�¸��� = 0;	 int ��ǻ�ͽ¸��� = 0; // �� �¸� �� ����
		Scanner scanner = new Scanner(System.in); // �Է°�ü
		
		while (true) { // ���α׷� ����
			System.out.println("---------------���������� ����----------------");
			System.out.print(" ����(0) ����(1) ��(2)      ����(3)    ���� : ");
			�÷��̾� = scanner.nextInt(); // �Է��� �� ����
			System.out.println(" �÷��̾ ���� : "+�÷��̾� );
			
			Random random = new Random(); // ���� ��ü ����
					// random.nextInt() : int�� ǥ���Ҽ� �ִ� ������ �����߻�
					// random.nextInt(��) : 0 ~ �� ������ ������ �����߻�
						// random.nextInt(10) : 0 ~ 9 �� ���� �߻� 
						// random.nextInt(11)+10 : 10 ~ 20 �� ���� �߻� 
			
			��ǻ�� = random.nextInt(3);		// ������ ����(int)�� ��������
			
			
				// ��������
			
			 if(�÷��̾� == 3) {
				System.out.println("��������");
				System.out.println(" ���Ӽ� :" + ���Ӽ� );
				if ( �÷��̾�¸��� > ��ǻ�ͽ¸��� ) {System.out.println(" ���� �¸��� : �÷��̾� "+�÷��̾�¸���);} 
				else if ( �÷��̾�¸��� < ��ǻ�ͽ¸���) {System.out.println(" ���� �¸��� : ��ǻ�� "+��ǻ�ͽ¸���);}
				else System.out.println(" ���� �¸��� : ���º� ");
				break;
				
			} else if (�÷��̾� >= 0 && �÷��̾� <=2) {
				// �¸��� �Ǵ�
				if((�÷��̾� == 0 && ��ǻ�� ==2) || (�÷��̾� == 1 && ��ǻ�� ==0)  || (�÷��̾� == 2 && ��ǻ�� ==1) ) {
						System.out.println("�÷��̾�¸�");
						�÷��̾�¸���++;
				}
				else if((�÷��̾� == 0 && ��ǻ�� ==0) || (�÷��̾� == 1 && ��ǻ�� ==1)  || (�÷��̾� == 2 && ��ǻ�� ==2)) {
					System.out.println("���º�");
				}
			
					
				else {
					System.out.println("��ǻ�ͽ¸�");
					��ǻ�ͽ¸���++;
				}
				// ���Ӽ�����
				���Ӽ�++;
				
			} else {
				System.out.println("�˼�����");
			}
			
			
			
			
			
			
			
			
			
			
			
		} // w e
		

	} // m e

} // c e
