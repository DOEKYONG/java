package ���ΰ���;

import java.util.Scanner;

public class ���������� {
	
//	����������
//
//	���� �ִ� ����
//
//	�ö󰡴¹�ư�� ��������
//	�ö󰡷��� ���� �Է�
//
//	�������¹�ư �� ��������
//	�������� ���� �Է�



	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	while (true) {
		System.out.println("---------����������-----------");
		System.out.println("������ġ�� ������ �Է��ϼ���  : "); int now = scanner.nextInt();
		while(true) { // ���������� �۵� while
		System.out.println(" 1.�ö󰡱� 2.�������� "); int ch = scanner.nextInt();
		if(ch == 1) { //�ö󰡱⸦ ����������� 
			System.out.println("�ö� ������ �Է��ϼ��� : "); int floor = scanner.nextInt();
			if(floor != now && floor>now ) { // �ö󰡷��� ������ �������� �ƴϸ鼭 �ö󰡷������� ���������� ������� 
				System.out.println(floor+"������ �ö󰩴ϴ�."); 
				now = floor; // �ö� ������ ������ ���� 
			}else if(floor == now) { // ���������� ���������� �ö󰡷� �� ��� 
				System.out.println("�ö󰥼������ϴ�!! ����"+floor+"���Դϴ�.");
			}else {System.out.println("�ö󰡷��� ������ ������������ �����ϴ�. ");} // �ö󰡷��� ������ ���������� ������� 
			
		}else if(ch == 2) { // �������� ����������� 
			if(now == 1) { // �������� 1���ϰ�� 
				System.out.println("1������ �� ������ �� �����ϴ�."); 
			}
			System.out.println("������ ������ �Է��ϼ��� : "); int floor = scanner.nextInt();
			if(floor != now && floor<now ) { // ���������� ���� �������� �ƴϸ鼭  �������� ���������� ������ �������
				System.out.println(floor+"������ ���������ϴ�.");
				now = floor; // ������������ ������ ���� 
			}else if(floor == now) { // �������������� �������� ������� 
				System.out.println("�������������ϴ�!! ����"+floor+"���Դϴ�.");
			}else {System.out.println("���������� ������ ������������ �����ϴ�.");}
			
		}
		else {System.out.println("�߸����Է��Դϴ�.");}
		}
		
		
		
		
		
	} // while end

	} // m e

} // c e
