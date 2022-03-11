package Day08;

import java.util.Scanner;

import Day07.Book;



public class Day08_5 {
	// 계좌프로그램
	// 요구사항
	// 회원 주요기능 : 1.회원가입 2.로그인 3.아이디찾기 4비밀번호찾기
	// 주요기능 : 1 계좌성생 2 입금 3 출금 4 이체 5 대출
	// 설계 : 통장, 대출 , 회원
		// 필드
		// 메소드
 
	static Scanner scanner = new Scanner(System.in); // static : 모든곳에서 사용가능 
	static Member[] members = new Member[1000]; // 모든 클래스에서 사용하는 회원목록 배열
	static Bank[] banks = new Bank[1000];
	
	public static void main(String[] args) {
		
		Day08_5 application = new Day08_5();
		application.menu();
		

	}// m e
	
	void menu() {
		while( true) { // 무한루프 [ 종료조건 없음 ]
			System.out.println("-------------- 도서 대여 프로그램 -------------");
			System.out.print("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기 : ");
			int ch = scanner.nextInt();
			Member member = new Member(); // 1~4 {}괄호에서 사용 가능
			if( ch == 1 ) {
				
				boolean result =  member.회원가입();// 회원가입 메소드 호출 
				if( result ) 
					System.err.println(" 알림]] 회원가입 성공 ");
				else 
					System.err.println(" 알림]] 회원가입 실패");
				
			} 
			else if( ch ==2 ) {
				String result = member.로그인(); // 로그인 메소드 호출 
				
				if( result == null ) { // 로그인실패 
					System.out.println(" 알림]] 동일한 회원정보가 없습니다.");
				}else{ // 일반 
					// 1. 일반회원 메뉴 메소드 호출
					System.out.println(" 알림]] 안녕하세요~ "+result+"님");
					membermenu(); // 인수1개 [ 로그인 성공한 id ] 
				}
			}
			else if( ch ==3 ) {
				member.아이디찾기();// 아이디 찾기 메소드 호출 
			}
			else if( ch ==4 ) {
				member.비밀번호찾기(); // 비밀번호 찾기 메소드 소출 
			}
			else { System.err.println(" 알림]] 알수 없는 번호입니다. "); } 
		}
	} // menu end 
	
	// 2. 일반회원 메뉴 메소드
	void membermenu(  ) { // 인수 변수명은 달라도 되지만 자료형 동일 
		while(true) {
			System.out.println(" --------------- 계좌 메뉴 ------------------");
			System.out.print("1.계좌생성 2.입금 3.출금 4.이체 5.대출 6.내 계좌목록 선택 : ");
			int ch = scanner.nextInt();
			Bank bank = new Bank();
			if( ch == 1 ) 		{ 
				bank.계좌();
			}
			else if( ch ==2 ) 	{bank.입금();  }
			else if( ch == 3 ) 	{ bank.출금(); }
			else if( ch == 4 ) 	{  }
			else if( ch == 5 ) 	{ bank.대출(); } 
			else if ( ch == 6)  { bank.목록(); }
			else { System.err.println(" 알림]] 알수 없는 번호입니다. "); }
		}
	} // 일반회원 메뉴 종료 
	
	
	
	
	
	
	

} // class end
