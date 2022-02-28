package Day01;

import java.util.Scanner;

public class Day01_6 { // class start
	public static void main(String[] args) { // main start
		Scanner scanner1 = new Scanner(System.in);
		
		System.out.print("순번: "); String num = scanner1.next();
		System.out.print("작성자: "); String user = scanner1.next();
		System.out.print("내용: "); String contents = scanner1.next();
		System.out.print("날짜: "); String date = scanner1.next();
		
		System.out.println("*------------방문록------------|");
		System.out.println("*|순번|작성자|내용       |날짜  |");
		System.out.println("*| "+num+" |" +user+"|"+contents+"   |"+date+"|");
		System.out.println("* ----------------------------|");
	} // main end
} // class end
