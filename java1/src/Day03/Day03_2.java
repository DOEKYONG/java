package Day03;

import java.util.Scanner;

public class Day03_2 {
	
	public static void main(String[] args) {
		
		// �Է°�ü = {} �� 1�� ����
		Scanner scanner = new Scanner(System.in);
		
//		// ���� 1  :  2���� ������ �Է¹޾Ƽ� �� ū�� ���
//		System.out.println("����1�Է�: ");
//		int ����1 = scanner.nextInt();
//		System.out.println("����2�Է�: ");
//		int ����2 = scanner.nextInt();
//		
//		// ����
//		if( ����1 > ����2 ) { 
//			System.out.println(" �� ū�� : " + ����1);
//		} else if ( ����1 < ����2 ) {
//			System.out.println("�� ū�� : "+ ����2);
//		} else {
//			System.out.println(" ���� ");
//		}
		
		// ����2 : 3���� ������ �Է¹޾Ƽ� ���� ū�� ���
//		System.out.println("����3�Է�: "); //������ �ߺ�x
//		int ����3 = scanner.nextInt();
//		System.out.println("����4�Է�: ");
//		int ����4 = scanner.nextInt();
//		System.out.println("����5�Է�: ");
//		int ����5 = scanner.nextInt();
//		int max = 0;	//���� ū���� �����ϴ� �ӽ� ����
//			// max�� ù��° �� �־�α�
//		if ( max < ����4 ) {
//			// ���࿡ max���� ����4�� �� ũ�� ��ü
//			max = ����4;
//		}
//		if( max < ����5 ) {
//			max = ����5;
//		}
//		System.out.println("���� ū�� : " + max );
		// ����3 : 4���� ������ �Է¹޾Ƽ� ���� ū�� ���
//		System.out.println("����5�Է�: ");
//		int ����6 = scanner.nextInt();
//		System.out.println("����5�Է�: ");
//		int ����7 = scanner.nextInt();
//		System.out.println("����5�Է�: ");
//		int ����8 = scanner.nextInt();
//		System.out.println("����5�Է�: ");
//		int ����9 = scanner.nextInt();
//		int max2= ����6;
//		if ( max2 < ����7 ) {max2 = ����7;}
//		if ( max2 < ����8 ) {max2 = ����8;}
//		if ( max2 < ����9 ) {max2 = ����9;}
//		System.out.println("���� ū�� : " + max2 );
		
		//����16 : 3���� ������ �Է¹޾� ������������ ����
//		System.out.println("����10�Է�: ");
//		int ����10 = scanner.nextInt();
//		System.out.println("����11�Է�: ");
//		int ����11 = scanner.nextInt();
//		System.out.println("����12�Է�: ");
//		int ����12 = scanner.nextInt();
//		
//		if ( ����10 > ����11 ) {
//			// ��ü[ ���� = �ΰ� ������ ������ ��ȯ���]
//			int temp = ����10;
//			����10 = ����11;
//			����11 = temp;
//		}
//		if ( ����10 > ����12 ) {
//			int temp = ����10;
//			����10 = ����12;
//			����12=temp;
//		}
//		if( ����11 > ����12) {
//			int temp = ����11;
//			����11 = ����12;
//			����12 = temp;
//		}
//		System.out.println("�Է��� �� �������� : "+����10+ " "+����11+" "+����12);
		
		//����17 : 4���� ������ �Է¹޾� ������������ ���� 
		
		System.out.println("����13�Է�: ");
		int ����13 = scanner.nextInt();
		System.out.println("����14�Է�: ");
		int ����14 = scanner.nextInt();
		System.out.println("����15�Է�: ");
		int ����15 = scanner.nextInt();
		System.out.println("����16�Է�: ");
		int ����16 = scanner.nextInt();
		
		if ( ����13 < ����14 ) {
			int temp = ����13;
			����13 = ����14;
			����14 = temp;
		}
		if ( ����13 < ����15 ) {
			int temp = ����13;
			����13 = ����15;
			����15 = temp;
		}
		if ( ����13 < ����16 ) {
			int temp = ����13;
			����13 = ����16;
			����16 = temp;
		}
		if ( ����14 < ����15 ) {
			int temp = ����14;
			����14 = ����15;
			����15 = temp;
		}
		if ( ����14 < ����16 ) {
			int temp = ����14;
			����14 = ����16;
			����16 = temp;
		}
		if ( ����15 < ����16 ) {
			int temp = ����15;
			����15 = ����16;
			����16 = temp;
		}
		System.out.printf("%d %d %d %d",����13,����14,����15,����16);
	}
}
