package Day02;

import java.util.Scanner;

public class Day02_5 { // c s

	public static void main(String[] args) { // ms
		
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
		// 1. �Է°�ü 
//				Scanner scanner = new Scanner(System.in);
//				// 2. �Է¹��� ������ -> ������ �̵� 
//				System.out.println("�ݾ� : ");	int �ݾ� = scanner.nextInt();
//				// 3. ���� 
//				System.out.println(" �Է��� �ݾ� : " + �ݾ� );
//				System.out.println(" �ʸ���  : " + (�ݾ�/100000) + "��" );
//					
//				//�ݾ� = �ݾ� - ( �ݾ�/100000 )*100000 ; // �ݾ׿��� �ʸ��� ���� ����
//				�ݾ� -= ( �ݾ�/100000 )*100000 ;
//				System.out.println(" �ʸ��� ���� : " + �ݾ� );
//				System.out.println(" ���� : " + (�ݾ�/10000) + "��");
//				
//				�ݾ� -= (�ݾ�/10000) * 10000; // �ݾ׿��� ���� ���� ���� 
//				System.out.println(" õ�� : " + (�ݾ�/1000) + "��");
//				
//				�ݾ� -= (�ݾ�/1000) * 1000; // �ݾ׿��� õ�� ���� ���� 
//				System.out.println(" ��� : " + (�ݾ�/100) + "��");
		
//		
			//����3 : �ϳ��� ������ �Է¹޾� 7�� ������� ���[ true , false ]
			//System.out.println("������ �Է��Ͽ� 7�ǹ������ ���");
			Scanner sc = new Scanner(System.in);
//			System.out.println("���� �Է� : ");  int ���� = sc.nextInt();
//			boolean ������ = ���� % 7 == 0;
//			System.out.println(������);
//		
//			//����4 : �ϳ��� ������ �Է¹޾� Ȧ�� ���� Ȯ�� [ true , false ]
//			System.out.println("�ϳ��� ������ �Է¹޾� Ȧ������Ȯ��");
//			System.out.println("����2 �Է� : ");  int ����2 = sc.nextInt();
//			boolean ������2 = ���� % 2 != 0;
//			System.out.println(������2);
//		
//				
//			//����5 : �ϳ��� ������ �Է¹޾� 7�� ��� �̸鼭 ¦�� ���� Ȯ�� [ true , false ]
//			System.out.println("�ϳ��� ������ �Է¹޾� 7�ǹ���̸鼭 ¦������ Ȯ��");
//			System.out.println("����3 �Է� : ");  int ����3 = sc.nextInt();
//			boolean ������3 = ����3 % 7 == 0 && ����3 % 2 == 0;
//			System.out.println(������3);
//			
//				
//				
//			//����6 : �ΰ��� ������ �Է¹޾� �� ū�� ���  [ true , false ]
//			System.out.println("�ΰ��� ������ �Է¹޾� �� ū�� ��� ");
//			System.out.println("���� �Է� : ");  int ����1 = sc.nextInt();
//			System.out.println("���� �Է� : ");  int ����2 = sc.nextInt();
//			int ū��  = ����1 > ����2 ? ����1 : ����2;
//			System.out.println("�� ū�� : "+ū��);
//			
				
				//����7 : �������� �Է¹޾� �� ���� ����ϱ� 
						// �� ���� ���� => ������ * ������ * ������[3.14]
//			System.out.println("�������� �Է¹޾� �� ���� ����ϱ�");
//			System.out.println("������ �Է� : ");  int ������ = sc.nextInt();
//			System.out.println(������*������*3.14);
//				
				//����8 : �� �Ǽ��� �Է¹޾� �սǼ��� ���� ���� ���� ��% ���� ����ϱ�
						// ��) 54.5   84.3 �̸�    64.285714%
//			System.out.println("�� �Ǽ��� �Է¹޾� �սǼ��� ���� ���� ���� ��% ���� ����ϱ�");
//			System.out.println("����4 �Է� : ");  double ��1 = sc.nextDouble();
//			System.out.println("����5 �Է� : ");  double ��2 = sc.nextDouble();
//			System.out.println(��1/��2*100);
				//����9 : ��ٸ��� ���� ���ϱ�[������ �غ� ���̸� �Է¹޾� ����ϱ�]
						//��ٸ��� ���� = > (���� * �غ�) * ���� / 2
//				System.out.println("��ٸ��� ���� ���ϱ�");
//				System.out.println("���� �Է� : ");  int ���� = sc.nextInt();
//				System.out.println("�غ� �Է� : ");  int �غ� = sc.nextInt();
//				System.out.println("���� �Է� : ");  int ���� = sc.nextInt();
//				System.out.println(���� * �غ� * ����/2);
				//����10: Ű�� ������ �Է¹޾� ǥ��ü�� ����ϱ�
						//ǥ��ü�� ���� = > (Ű - 100) * 0.9
//				System.out.println(" Ű�� ������ �Է¹޾� ǥ��ü�� ����ϱ�");
//				System.out.println("Ű �Է�: "); int Ű = sc.nextInt();
//				double ǥ��ü�� = (Ű - 100)*0.9;
//				System.out.println(ǥ��ü��);
				
				//����11: Ű�� �����Ը� �Է¹޾� BMI ����ϱ�
						//BMI ���� = > ������ / ((Ű / 100) * (Ű / 100))
//			System.out.println("Ű�� �����Ը� �Է¹޾� BMI ����ϱ�");
//			System.out.println("Ű �Է� : ");  double Ű = sc.nextDouble();
//			System.out.println("������ �Է� : ");  double ������ = sc.nextDouble();
//			System.out.println(������ / ((Ű/100)*(Ű / 100)));
			
				//����12: inch �� �Է¹޾� cm �� ��ȯ�ϱ� [ 1 inch -> 2.54cm ] 
//			System.out.println("inch �� �Է¹޾� cm �� ��ȯ�ϱ�");
//			System.out.println("��ġ �Է� : ");  double ��ġ = sc.nextDouble();
//			System.out.println(��ġ*2.54 + " cm");
				
				//����13:  �߰����, �⸻���, �����򰡸� �Է¹޾� �ݿ������� ����ϱ�
						//�Ҽ� ��° �ڸ� ���� ���� ����ϱ�
						//�߰���� �ݿ����� => 30 %
						//�⸻��� �ݿ����� => 30 %
						//������ �ݿ����� => 40 %
		//System.out.println("�߰����, �⸻���, �����򰡸� �Է¹޾� �ݿ������� ����ϱ�");
		//System.out.println("�߰���� �Է� : ");  double mid = sc.nextDouble();
		//	System.out.println("�⸻��� �Է� : ");  double fin = sc.nextDouble();
		//	System.out.println("������ �Է� : ");  double test= sc.nextDouble();
		//	System.out.println(mid*0.3+fin*0.3+test*0.4);
				
			//����14 :  ���� ���� ���� �ϰ� x�� y�� �����ϱ�
		 	//int x = 10;  
			//int y = x-- + 5 + --x;  24
			//printf(" x�� �� : %d , y�ǰ� :  %d ", x, y)  23
//			
				//����15 : ���̸� �Է¹޾� ���̰� 10���̻��̸� �л� , 20���̻��̸� ���� , 40���̻��̸� �߳� ���� ����ϱ�
			System.out.println("���� �Է� : ");  int ���� = sc.nextInt();
//			String a = "�߳�";
//			String b = "����";
//			String c = "�л�";
//			String �з� = ���� >= 40 ? "�߳�" : ���� >= 20 ? "����" : "�л�";
//			System.out.println(�з�);
			
//			if (���� >= 40) {
//				System.out.println("�߳�");
//			}else if (����>=20) {
//				System.out.println("����");
//			} else {
//				System.out.println("�л�");
//			}
			
			//����16 : 3���� ������ �Է¹޾� ������������ ���� 
			
			
			
			
			
			//����17 : 4���� ������ �Է¹޾� ������������ ���� 
			
			// p. 102 Ȯ�ι���
		
			
			
			
	} // m e

} // c e
