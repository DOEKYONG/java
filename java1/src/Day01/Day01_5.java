package Day01;

import java.util.Scanner;

public class Day01_5 { // class start
	public static void main(String[] args) { // main start
		
	/*Scanner scanner = new Scanner(System.in);
	
	System.out.print("아이디: "); String id = scanner.next();
	System.out.print("비밀번호: "); String pw = scanner.next();
	System.out.print("성명: "); String name = scanner.next();
	System.out.print("이메일: "); String email = scanner.next();
	
	System.out.println(">>>>>>>>>> 회원가입 완료 아래 정보를 확인해주세요 >>>>>>>>>");
	System.out.println("\t아이디\t비밀번호\t성명\t이메일");
	System.out.println(id +"\t" + pw + "\t"+ name + "\t" + email);
	 */
	
	Scanner scanner1 = new Scanner(System.in);
	
	System.out.print("순번: "); String num = scanner1.next();
	System.out.print("작성자: "); String user = scanner1.next();
	System.out.print("내용: "); String contents = scanner1.next();
	System.out.print("날짜: "); String date = scanner1.next();
	
	System.out.println("*------------방문록------------|");
	System.out.println("*|순번|작성자|내용\t     |날짜  |");
	System.out.println("*|"+num+"  |" +user+"|"+contents+"   |"+date+"|");
	System.out.println("* -----------------------------|");
	
	
	} // main end
} // class end
