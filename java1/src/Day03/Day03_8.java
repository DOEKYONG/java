package Day03;

import java.util.Scanner;

public class Day03_8 { // c s

	public static void main(String[] args) { // m s
		boolean run = true;
		int balance = 0 ;
		Scanner scanner = new Scanner(System.in);
		while(run) {
			
			System.out.println("------------------------");
			System.out.println("1.���� 2.��� 3.�ܰ� 4.����");
			System.out.println("------------------------");
			System.out.print("����>"); 
			int ���� = scanner.nextInt();
			
			if( ���� == 1) {
				
				System.out.println("���ݾ�>"); int ���ݾ� = scanner.nextInt();
				balance  += ���ݾ�;
			} else if(���� == 2) {
				System.out.println("��ݾ�>"); int ��ݾ� = scanner.nextInt();
				if (��ݾ� > balance ) {
					System.out.println("�ܾ׺���");
				}else {
					balance -= ��ݾ�;
				}
			} else if (���� == 3) {
				System.out.println("�ܰ�>"); 
				System.out.println(" �ܰ� : "+ balance );
			} else if (���� == 4 ) {
				break;
			} else {
				System.out.println("�˼����¹�ȣ");
			}
			
			
		}
		System.out.println("���α׷� ���� ");
		

	} // m e

} // c e
