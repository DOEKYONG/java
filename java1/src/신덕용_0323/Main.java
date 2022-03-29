package 신덕용_0323;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Controller con = new Controller();
		Main mem = new Main();
		
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
					adminmenu();
				}
				
				else { // 로그인성공 
					System.out.println(result + "님 환영 합니다.");
					membermenu(result);
				}
			}
				
				else if(ch.equals("3") || ch.equals("아이디찾기")) {
					System.out.println("이름: "); String name = scanner.next();
					System.out.println("전화번호: "); String phone = scanner.next();
					con.findid(name, phone);
					String result = con.findid(name, phone);
					if(result.equals("false")) {
						System.out.println("메세지)) 존재하지 않는 회원입니다.");
					}
					else {
						System.out.println("메세지)) 회원님의 아이디는 "+ result + " 입니다.");
					}
				
						
				}
				else if(ch.equals("4") || ch.equals("비밀번호찾기")){
					System.out.println("아이디: "); String id = scanner.next();
					System.out.println("전화번호: "); String phone = scanner.next();
					String result = con.findid(id, phone);
					con.findpw(id,phone);
					if (result.equals("false")) {
						System.out.println("존재하지 않는 회원입니다.");
					}
					else {System.out.println("회원님의 비밀번호는 " + result + "입니다.");}
					
				}
				
				
				
				else {System.out.println("잘못된입력");}
				
			}
			catch(Exception e) {}
		}
		
		
		
	}
	
	
	public static void membermenu(String id) {
		Controller con = new Controller();
		Scanner scanner =new Scanner(System.in);
		System.out.println("1.예매 2.예매취소 3.예매확인   선택: "); String ch = scanner.next();
		
		if(ch.equals("1")||ch.equals("예매")) {
			System.out.println("영화제목: "); String title = scanner.nextLine();
			//////해당 영화의 상영시간 출력//
			System.out.println("영화시간: "); String intime = scanner.next();
			System.out.println("영화끝나는시간: "); String outtime = scanner.next();
			////선택한 영화의 상영관 좌석 선택///
			System.out.println("좌석선택: "); String seat = scanner.next();
			// 예매번호생성 
			//int t_num = (int)(Math.random() * (99999 - 10000 + 1)) + 10000;
			con.ticketsave(id,title,intime,outtime,seat);
			
		}
		else if(ch.equals("2")||ch.equals("예매취소")){
			System.out.println("영화제목: "); String title = scanner.nextLine();
			//////해당 영화의 상영시간 출력//
			System.out.println("영화시간: "); String intime = scanner.next();
			//////결제취소
		}
		else if(ch.equals("3")||ch.equals("예매확인")) {
			System.out.println("");
			////////예매목록 자동생성
			////////////////
			System.out.println("1.예매취소 2.뒤로가기"); String confirm = scanner.next();
		}
		else {}
		
		
	}
	
public static void adminmenu() {
	Scanner scanner =new Scanner(System.in);
	//Controller con = new Controller();
		while(true) {
			System.out.println("관리자 메뉴))");
			System.out.println("1.영화등록 2.영화삭제 3.매출확인 4.로그아웃"); 
			System.out.println("선택 : ");
			String ch =scanner.next();
			if(ch.equals("1")||ch.equals("영화등록")) {
				System.out.println("영화제목: "); 
				String title = scanner.next();
				System.out.println("상영관선택: "); 
				String screen = scanner.next();
				System.out.println("영화시간: "); 
				String intime = scanner.next();
				
			}
			else if(ch.equals("2")||ch.equals("영화삭제")){
				System.out.println("영화제목: "); 
				String title = scanner.nextLine();
				System.out.println("상영관선택: "); 
				String screen = scanner.next();
				System.out.println("영화시간: "); 
				String intime = scanner.next();
			}
			else if(ch.equals("3")||ch.equals("매출확인")) {
				System.out.println("");
			}
			else if(ch.equals("4")||ch.equals("로그아웃")) {
				System.out.println("메세지)) 로그아웃 했습니다.");
				break;
			}
			else {
				System.out.println("메세지)) 존재하지 않는 메뉴 입니다.");
			}
		}
	}
	
}
