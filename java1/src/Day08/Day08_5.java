package Day08;

import java.util.Scanner;

import Day07.Book;



public class Day08_5 {
	// �������α׷�
	// �䱸����
	// ȸ�� �ֿ��� : 1.ȸ������ 2.�α��� 3.���̵�ã�� 4��й�ȣã��
	// �ֿ��� : 1 ���¼��� 2 �Ա� 3 ��� 4 ��ü 5 ����
	// ���� : ����, ���� , ȸ��
		// �ʵ�
		// �޼ҵ�
 
	static Scanner scanner = new Scanner(System.in); // static : �������� ��밡�� 
	static Member[] members = new Member[1000]; // ��� Ŭ�������� ����ϴ� ȸ����� �迭
	static Bank[] banks = new Bank[1000];
	
	public static void main(String[] args) {
		
		Day08_5 application = new Day08_5();
		application.menu();
		

	}// m e
	
	void menu() {
		while( true) { // ���ѷ��� [ �������� ���� ]
			System.out.println("-------------- ���� �뿩 ���α׷� -------------");
			System.out.print("1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã�� : ");
			int ch = scanner.nextInt();
			Member member = new Member(); // 1~4 {}��ȣ���� ��� ����
			if( ch == 1 ) {
				
				boolean result =  member.ȸ������();// ȸ������ �޼ҵ� ȣ�� 
				if( result ) 
					System.err.println(" �˸�]] ȸ������ ���� ");
				else 
					System.err.println(" �˸�]] ȸ������ ����");
				
			} 
			else if( ch ==2 ) {
				String result = member.�α���(); // �α��� �޼ҵ� ȣ�� 
				
				if( result == null ) { // �α��ν��� 
					System.out.println(" �˸�]] ������ ȸ�������� �����ϴ�.");
				}else{ // �Ϲ� 
					// 1. �Ϲ�ȸ�� �޴� �޼ҵ� ȣ��
					System.out.println(" �˸�]] �ȳ��ϼ���~ "+result+"��");
					membermenu(); // �μ�1�� [ �α��� ������ id ] 
				}
			}
			else if( ch ==3 ) {
				member.���̵�ã��();// ���̵� ã�� �޼ҵ� ȣ�� 
			}
			else if( ch ==4 ) {
				member.��й�ȣã��(); // ��й�ȣ ã�� �޼ҵ� ���� 
			}
			else { System.err.println(" �˸�]] �˼� ���� ��ȣ�Դϴ�. "); } 
		}
	} // menu end 
	
	// 2. �Ϲ�ȸ�� �޴� �޼ҵ�
	void membermenu(  ) { // �μ� �������� �޶� ������ �ڷ��� ���� 
		while(true) {
			System.out.println(" --------------- ���� �޴� ------------------");
			System.out.print("1.���»��� 2.�Ա� 3.��� 4.��ü 5.���� 6.�� ���¸�� ���� : ");
			int ch = scanner.nextInt();
			Bank bank = new Bank();
			if( ch == 1 ) 		{ 
				bank.����();
			}
			else if( ch ==2 ) 	{bank.�Ա�();  }
			else if( ch == 3 ) 	{ bank.���(); }
			else if( ch == 4 ) 	{  }
			else if( ch == 5 ) 	{ bank.����(); } 
			else if ( ch == 6)  { bank.���(); }
			else { System.err.println(" �˸�]] �˼� ���� ��ȣ�Դϴ�. "); }
		}
	} // �Ϲ�ȸ�� �޴� ���� 
	
	
	
	
	
	
	

} // class end
