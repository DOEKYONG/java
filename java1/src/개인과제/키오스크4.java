package ���ΰ���;

import java.util.Scanner;

public class Ű����ũ4 {

	//����Ƚ�� :0  �ɸ��ð� : 16��53
	// Day01 : �����
	// Day02 : ����[����] ����[���]
	// Day03 : if[���] for[�ݺ���]
	
	// ���Ǳ� ���α׷�
		// 1. �޴��� [ 1.�ݶ�(300) 2.ȯŸ(200) 3.���̴�(100) 4.���� ] 
		// 		// 1.�޴��ǿ��� ��ǰ�����ϸ� ��ٱ��Ͽ� �ֱ� 
		//		// 2.��� �����ϸ� �˸�( ������ )
		// 2. �ʱ� ��� [ ��ǰ �� 10���� ]
		// 3. ������ �ݾ��Է¹޾� ������ ��ŭ ������ �ܵ� ��� 
				// 1. ������ �ݾ׺��� ���ž� �� �� ũ�� ���� ��� [ �ݾ׺��� ]

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//���뺯��
		int �ݶ���� =10 ; int ȯŸ��� =10 ; int ���̴���� =10;
		int �ݶ󱸸ż�=0; int ȯŸ���ż� = 0 ; int ���̴ٱ��ż� =0 ;
		while(true) {
		System.out.println("---------�޴�-----------");
		System.out.println("1.�ݶ�300 2.ȯŸ200 3.���̴�100 4.���� ");int ch =scanner.nextInt();
		if(ch==1) {
			if(�ݶ���� ==0 ) {
				System.out.println("�ݶ������� �����մϴ�.");
			}
			else {
				System.out.println("�ݶ� ��ҽ��ϴ� ");
				�ݶ󱸸ż� ++;
				�ݶ���� --;
			}
		}
		else if (ch==2) {
			if(ȯŸ��� ==0 ) {
				System.out.println("ȯŸ������ �����մϴ�.");
			}
			else {
				System.out.println("ȯŸ�� ��ҽ��ϴ� ");
				ȯŸ���ż� ++;
				ȯŸ��� --;
			}
		}
		else if (ch==3) {
			if(���̴���� ==0 ) {
				System.out.println("���̴������� �����մϴ�.");
			}
			else {
				System.out.println("���̴ٸ� ��ҽ��ϴ� ");
				���̴ٱ��ż� ++;
				���̴���� --;
			}
		}
		else if (ch==4) {
			System.out.println("--------����������------------");
			System.out.println("��ǰ\t����\t�ݾ� ");
			if(�ݶ󱸸ż� != 0) {System.out.println("�ݶ�\t"+�ݶ󱸸ż�+"\t"+(�ݶ󱸸ż�*300));}
			if(ȯŸ���ż� != 0) {System.out.println("ȯŸ\t"+ȯŸ���ż�+"\t"+(ȯŸ���ż�*200));}
			if(���̴ٱ��ż� != 0) {System.out.println("���̴�\t"+���̴ٱ��ż�+"\t"+(���̴ٱ��ż�*100));}
			int �Ѱ����� = (�ݶ󱸸ż�*300)+(ȯŸ���ż�*200)+(���̴ٱ��ż�*100);
			System.out.println("�Ѱ����� : " + �Ѱ�����);
			System.out.println("1.���� 2.��� "); int ch2 = scanner.nextInt();
			if(ch2==1) {
				while(true) {
					System.out.println("�ݾ��� �Է��ϼ��� : "); int �ݾ� = scanner.nextInt();
					if(�ݾ�<�Ѱ����� ) {
						System.out.println("�ݾ��̺����մϴ� �ٽ� �ݾ��� �������ּ��� ");
					} 
					else {
						System.out.println("���ſϷ�!!");
						System.out.println("�ܵ� : " + (�ݾ�-�Ѱ�����)+"��");
						�ݶ󱸸ż� = 0; ȯŸ���ż� =0; ���̴ٱ��ż� =0;
						break;
					}
				}//while end
			}
			else if(ch2==2 ) {
				System.out.println("���Ÿ������� ");
				�ݶ���� += �ݶ󱸸ż�; ȯŸ��� += ȯŸ���ż�; ���̴����+= ���̴ٱ��ż�;
				�ݶ󱸸ż� = 0; ȯŸ���ż� =0; ���̴ٱ��ż� =0;
			}
			else {
				System.out.println("�߸����Է�...");
			}
			
			
			
		}
		else {System.out.println("�߸����Է�");}
		}// while end
	} //me

}//ce
