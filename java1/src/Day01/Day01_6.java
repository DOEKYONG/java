package Day01;

import java.util.Scanner;

public class Day01_6 { // class start
	public static void main(String[] args) { // main start
		Scanner scanner1 = new Scanner(System.in);
		
		System.out.print("����: "); String num = scanner1.next();
		System.out.print("�ۼ���: "); String user = scanner1.next();
		System.out.print("����: "); String contents = scanner1.next();
		System.out.print("��¥: "); String date = scanner1.next();
		
		System.out.println("*------------�湮��------------|");
		System.out.println("*|����|�ۼ���|����       |��¥  |");
		System.out.println("*| "+num+" |" +user+"|"+contents+"   |"+date+"|");
		System.out.println("* ----------------------------|");
	} // main end
} // class end
