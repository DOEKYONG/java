package 신덕용_0323;


import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;







public class Controller {
	
	DB db = new DB();
	// 회원리스트
	static ArrayList<Member> memberlist = new ArrayList<>();
	// 영화리스트
	static ArrayList<Movie> movielist = new ArrayList<>();
	// 티켓리스트
	static ArrayList<Ticket> ticketlist = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	
	//회원 시스템 ////////////////////////////////////////////////////////////////////////
	//
	public String sign (String id, String pw,String name, String phone) {
		
		//아이디 중복검사
		for(Member temp : memberlist) {
			if (temp !=null &&  temp.getId().equals(id)) {
				//만약에 공백이 아니면서 배열내 id와 입력받은 id와 동일하면
				System.out.println("현재 사용중인 아이디입니다.");
				return "bad"; //함수종료 --->아이디중복으로 회원가입 실패
			}
		}
		//회원정보 입력받기
		
		//객체화
		Member member = new Member( id, pw, name, phone,false);
		//회원정보 저장
		
		memberlist.add(member);
		db.memberSave();
	
		return "good";
	}
	
	public String login(String id,String pw) {
		db.memberLoad();
//		Member members = new Member("admin","aa","aa","aa");
//		memberlist.add(members);
		//로그인 중복체크
		for(Member temp : memberlist) {
			if(temp!=null) {
				if(id.equals("admin") && temp.getPw().equals(pw)) {
					return "admin";
				}
				else if(temp.getId().equals(id)&&temp.getPw().equals(pw)) {
					return temp.getId(); //로그인성공 리스트에있는 아이디 리턴
				}
				
			}
			
		}
		return "회원";
	}
	
	public String findid(String name, String phone) {//아이디찾기

		for(Member temp : Controller.memberlist) {
			if(temp!=null&&temp.getName().equals(name)&&temp.getPhone().equals(phone)) {
				return temp.getId();
			}
		}
		return "false";
	}
	// 비
	public String findpw(String id,String phone) {
		for(Member temp : Controller.memberlist) {
			if(temp!=null&&temp.getId().equals(id)&&temp.getPhone().equals(phone)) {
				return temp.getPw();
			}
		}
		return "false";
	}
	
	
	public void changepw() {}
	
	//영화시스템///////////////////////////////////////////////////////////////////////////
	
	public void reserve(String title, String intime, String seat) {
		for(Movie temp : movielist ) {
			if(temp!=null) {
				if(seat==null&temp.getTitle().equals(title)&&temp.getIntime().equals(intime)) {
					
				}
			}
		}
	}
	
	public void myreserve() {
		// 티켓리스트에 정보저장 -> 멤버의 아이디와 티켓의 아이디가 같다면 티켓리스트에 저장된 정보를 출력
		
		
	} //????
	
	// 예매번호생성
	

	
	public void ticketsave( String id ,String t_title, String t_intime, String t_outtime,String t_seat) {
		// 예매번호 생성
		int t_num1 = (int)(Math.random() * (99999 - 10000 + 1)) + 10000;
		// 예매할때 입력한 정보들 저장
		Ticket ticket = new Ticket(id,t_title,t_intime,t_outtime,t_seat,t_num1);
		ticketlist.add(ticket);
		
		
		for(Ticket temp : ticketlist) {
			if(temp.getT_id().equals(id)) {
				
				
			}
		}
		
		
		
	}
	
	public void cancle() {} // 예매취소 메소드
	
	//관리자 시스템/////////////////////////////////////////////////////////////////////////
	
//public static void moive_register (String title, String intime, String outtime, int money) {//영화등록
//		
//		
//		//영화티켓가격 계산
//		String [] startTime = intime.split(":");
//		
//		int startHour = Integer.parseInt(startTime[0]);
//		//int 시작분 = Integer.parseInt(startTime[1]);
//		
//		for(Movie temp: movielist) {
//		if(startHour <= 10) {
//			temp.setMoney(5000);
//			}
//		else {temp.setMoney(7000);}
//		}
//		
//		//객체화
//		Movie movie = new Movie(title, intime, outtime, money);
//		//리스트에 저장
//		movielist.add(movie);
//		
//		
//		
//		//파일처리
//		try {//예외가 발생할 것 같은 코드 묶음					
//			FileOutputStream outputStream = new FileOutputStream("D:/상영중인영화.txt", true);
//			String movieRecord = title + "," + intime+ "," +outtime+  ","+ money + "\n"; //, : 구분
//			outputStream.write(movieRecord.getBytes());	//문자열 ->바이트열
//			}catch (Exception e) {//예외[오류] 처리[잡기] : Exception 클래스
//				
//			}
//			System.out.println("영화 저장 완료");
//		
//	}
	
	public void movie_remove () {}
	
	public void sale() {}
	
	
	
}
