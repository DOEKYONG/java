package Day13;

import java.util.Calendar;
import java.util.Scanner;

public class Day13_3_�޷� {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner( System.in);
		System.out.print(" ���� :"); int year = scanner.nextInt();
		System.out.print(" �� :");	int month = scanner.nextInt();
		
		�޷�( year , month );
		
	} // main end 
	
	//1.�޷¸޼ҵ� 
	public static void �޷�( int year , int month ) {
		while(true) {
		// 1. Ķ���� Ŭ������ ���� ��¥/�ð� ��ü ȣ�� 
		Calendar calendar = Calendar.getInstance(); //��) 2022��3��18��
		// * �ش� ���� 1���� ����ã�� 
			// 1. ����� ���� Ķ���� ���� 
			calendar.set( year , month-1 , 1 ); // ��) 2022��3��1��
			// 2. 3��1���� ���� 
			int sweek = calendar.get( Calendar.DAY_OF_WEEK );
			// 3. 3���� ������ �� 
			int eday = calendar.getActualMaximum( Calendar.DAY_OF_MONTH );
		// 3. ��� 
		System.out.println(" ********************** "+year+"��" + month+"�� ******************");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		
		// * ���� �� 1���� ��ġ �տ� ���� ä��� 
		for( int i = 1 ; i < sweek ; i++ ) { // 3��1�� = ȭ = 3 
			System.out.print("\t"); // �������
		}
		// 1�Ϻ��� ��������¥ ���� ��� 
		for( int i = 1 ; i<=eday ; i++ ) {
			 // i = �ϼ� ���
			System.out.print(i+"\t");
			// ����ϸ��� �ٹٲ�ó�� [ �����=7 ] ������ 7�������
			if( sweek % 7 == 0 ) System.out.println();
			 // �Ϸ羿 ���� ���� 
			sweek++;
		}
		// ��ư [ 1.��(������)  2.��(������) 3.�ٽð˻� ]
		try { // ���࿡ try{}�ȿ��� ���� [����] �� �߻��ϸ� catch�� �̵�
			
		
		System.out.print(" \n \n 1.��(������)  2.��(������) 3.�ٽð˻� 4. ����");
		Scanner scanner = new Scanner(System.in); int ch = scanner.nextInt();
		if( ch ==1 ) {
			month -= 1;
			if (month == 0) {year -=1;  month = 12 ; }
			}
		else if(ch ==2) {
			month +=1;
			if ( month == 13) {month =1; year +=1 ;}
			}
		else if(ch ==3) {
			System.out.print(" ���� :");  year = scanner.nextInt();
			System.out.print(" �� :");	 month = scanner.nextInt();
		}
		else if(ch ==4) {
			System.out.println(" ���α׷� ����");
			return;
		}
		else {System.out.println("�˼����¹�ȣ");
		
		}
		} catch(Exception e) {
			System.out.println("���������Է������ּ���!");
		}
		
	} // while end
		
		
		
	} // �޷� �޼ҵ� end 
} // class end 

