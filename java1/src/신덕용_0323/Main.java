package 신덕용_0323;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Controller con = new Controller();
		
		while(true) {
			try {
				System.out.println("1. 회원가입 2. 로그인 3. 아이디찾기 4. 비밀번호찾기"); String ch = scanner.next();
				if(ch.equals("1")) {
				System.out.println("----------------회원가입-----------------");
				System.out.println("아이디 : ");	String id = scanner.next();
				System.out.println("비밀번호 : ");	String pw = scanner.next();
				System.out.println("이름 : ");	String name = scanner.next(); 
				System.out.println("전화번호 : ");	String phone = scanner.next();
				String result = con.sign(id, pw,name,phone);
				if(result == "bad") {
					System.out.println("회원가입실패");
				}
				else if (result == "good") {
					System.out.println("회원가입성공");
				}
				}
				
				
				
				
				else if (ch.equals("2") ) {
				System.out.println("");//
				System.out.println("아이디를 입력하세요 :"); String id = scanner.next();
				System.out.println("비밀번호를 입력하세요 : "); String pw = scanner.next();
				String result = con.login(id, pw); // 리턴값 String이니깐 String 변수 result생성
				
				if(result.equals("admin")) {
					System.out.println("관리자로 로그인");
				}
				
				else { // 회원가입성공 
					System.out.println(result + "님 환영 합니다.");
				}
			}
				
				else if(ch.equals("3") || ch.equals("아이디찾기")) {
					System.out.println("이름: "); String name = scanner.next();
					System.out.println("전화번호: "); String phone = scanner.next();
					//String result = con.findid(name, phone);
					con.findid(name,phone);
//					if(result.equals("fail")) {
//						//System.out.println("회원님의 아이디: "+result);
//						System.out.println("해당아이디를 찾을수 없습니다.");
//					}
//					else {//System.out.println("해당아이디를 찾을수 없습니다.");
//						System.out.println("회원님의 아이디: "+result);
//					}
					
					
				}
				else if(ch.equals("4") || ch.equals("비밀번호찾기")){
					System.out.println("아이디: "); String id = scanner.next();
					System.out.println("전화번호: "); String phone = scanner.next();
					
					con.findpw(id,phone);
				}
				
				
				
				else {System.out.println("잘못된입력");}
				
			}
			catch(Exception e) {}
		}
	}
}
