package Day02;

import java.util.Scanner;

public class Day02_3 { // c s

	public static void main(String[] args) { // m s
		
		// ����1 : �޿� ���
				/*
				 * 	[�Է�����]
				 * 		�⺻�� , ����
				 * 	[ ���� ] 
				 * 		�Ǽ��ɾ� = �⺻�� + ���� - ����[�⺻��10%] 
				 * 	[�������] 
				 * 		�Ǽ��ɾ� ��� 
				 */
		// ���� § �ڵ�
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("�⺻���Է�:");   int pay = scanner.nextInt();
		System.out.println("�����Է�::");   int bonus = scanner.nextInt();
		int �Ǽ��ɾ� = (int)((pay+bonus)-(pay*0.1));
		System.out.println(�Ǽ��ɾ�);
		
		
		/* **************��**********************************
		
		// * �Է� -> ���� -> ��� -> ���
				// 1. �Է� ��ü �����. [ �ڷ��� �ҹ��� , Ŭ������ �빮�� ]
				Scanner scanner = new Scanner(System.in); // Ű����κ��� �����͸� �����ϴ� ��ü!!!!!!!!!!!!!
				
				// 2. �Է¹��� ���� ������ �����Ѵ�. [ �Է°�ü�� �Է¹��������� ���� �����Ͱ� ����� ]
				System.out.print("�⺻�� �Է� : ");		
				int �⺻�� = scanner.nextInt(); 
														// �Է°�ü��.nextInt() : int�� ������ �������� 
																// �Է°�ü��.next() : ���ڿ� ������ ��������
				System.out.print("���� �Է� : "); 			
				int ���� = scanner.nextInt();
				
				// 3. ������ ����(���) �Ѵ�
				
				int ���� = (int)(�⺻��*0.1); // int*double �Ŀ� int������ ������ȯ(ĳ����) 
				int �Ǽ��ɾ� = �⺻�� + ���� - ����;  		// 100% : 1   10% : 0.1
				
				// 4. ����Ѵ�.
				System.out.println("ȸ������ �Ǽ��ɾ� : " + �Ǽ��ɾ� );
								// 		���ڿ�	+	������( ������ ������ ȣ�� )
								//  + : 1. ���Ῥ���� ��� 2.���ϱ� ���
		
				// **************��***********************************/
				
				// ����2 : ���� ���� 
				/*
				 * [ �Է����� ] 
				 * 		�ݾ� 
				 * [ ���� ] 
				 * 		�ʸ��� ���� ��� ������ ���� ���� 
				 * [ ������� ]
				 * 		��) 356789 �Է½� 
				 * 		�ʸ��� 3�� 
				 * 		���� 5��
				 * 		õ�� 6�� 
				 * 		��� 7��
				 * 
				 */
		
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("�ݾ��Է�");  int money = scanner1.nextInt();

		int first = money/100000;
		int second = (money-(first*100000))/10000;
		int third = (money-((first*100000+second*10000)))/1000;
		int fourth = (money-((first*100000+second*10000+third*1000)))/100;
		
		System.out.println("�ʸ���: " + first + "��" +"\n" + " ����: "  + second +"��" +"\n"+ " õ��: " + third + "��" +"\n"+" ���: " + fourth +"��");
		
		// **************************��
		// 1. �Է°�ü 
//		Scanner scanner = new Scanner(System.in);
//		// 2. �Է¹��� ������ -> ������ �̵� 
//		System.out.println("�ݾ� : ");	int �ݾ� = scanner.nextInt();
//		// 3. ���� 
//		System.out.println(" �Է��� �ݾ� : " + �ݾ� );
//		System.out.println(" �ʸ���  : " + (�ݾ�/100000) + "��" );
//			
//		//�ݾ� = �ݾ� - ( �ݾ�/100000 )*100000 ; // �ݾ׿��� �ʸ��� ���� ����
//		�ݾ� -= ( �ݾ�/100000 )*100000 ;
//		System.out.println(" �ʸ��� ���� : " + �ݾ� );
//		System.out.println(" ���� : " + (�ݾ�/10000) + "��");
//		
//		�ݾ� -= (�ݾ�/10000) * 10000; // �ݾ׿��� ���� ���� ���� 
//		System.out.println(" õ�� : " + (�ݾ�/1000) + "��");
//		
//		�ݾ� -= (�ݾ�/1000) * 1000; // �ݾ׿��� õ�� ���� ���� 
//		System.out.println(" ��� : " + (�ݾ�/100) + "��");
		//************************************************
		
	} // m e
} // c e
