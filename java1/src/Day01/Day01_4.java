package Day01;

import java.util.Scanner;

public class Day01_4 { // class start

	public static void main(String[] args) { // main start
		
		// ����1 : �Ѹ��� �̸�,  1����, 2����, 3���� �⼮���θ� �Է¹޾� ���
							// �Է� -> ���� -> ���
		// 1. �Է°�ü ���� [�ѹ��� ����]
		Scanner �Է°�ü = new Scanner(System.in);	
		// 2. �Է¹��� ������ �ȳ�
		System.out.println("�̸� :");
		// 3.  �Է¹��� ������ �������� -> �ٸ���(String:���ڿ�)�� ����
		String �̸� = �Է°�ü.next();
			// = : ����( �����ʰ��� ���� ����[����] )
			// �ȳ� ���						//  �Է¹޾� �ٸ� ��ü�� ����
		System.out.println("1���� : ");  String ����1 = �Է°�ü.next();
		System.out.println("2���� : ");  String ����2 = �Է°�ü.next();
		System.out.println("3���� : ");  String ����3 = �Է°�ü.next();
		
		// 4. ���
		System.out.println("\t\t[�⼮��]]");
		System.out.println("-------------------------------------");
		System.out.println("�̸�\t1����\t2����\t3����\t���");
		 System.out.println( �̸� +"\t"+ ����1 +"\t"+����2+"\t"+����3  );
		
		
	
		
		
		
		
	} // main end
} // class end
