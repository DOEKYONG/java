package Day01;

import java.util.Scanner;

public class Day01_5 { // class start
	public static void main(String[] args) { // main start
		
	/*Scanner scanner = new Scanner(System.in);
	
	System.out.print("���̵�: "); String id = scanner.next();
	System.out.print("��й�ȣ: "); String pw = scanner.next();
	System.out.print("����: "); String name = scanner.next();
	System.out.print("�̸���: "); String email = scanner.next();
	
	System.out.println(">>>>>>>>>> ȸ������ �Ϸ� �Ʒ� ������ Ȯ�����ּ��� >>>>>>>>>");
	System.out.println("\t���̵�\t��й�ȣ\t����\t�̸���");
	System.out.println(id +"\t" + pw + "\t"+ name + "\t" + email);
	 */
	
	Scanner scanner1 = new Scanner(System.in);
	
	System.out.print("����: "); String num = scanner1.next();
	System.out.print("�ۼ���: "); String user = scanner1.next();
	System.out.print("����: "); String contents = scanner1.next();
	System.out.print("��¥: "); String date = scanner1.next();
	
	System.out.println("*------------�湮��------------|");
	System.out.println("*|����|�ۼ���|����\t     |��¥  |");
	System.out.println("*|"+num+"  |" +user+"|"+contents+"   |"+date+"|");
	System.out.println("* -----------------------------|");
	
	
	} // main end
} // class end
