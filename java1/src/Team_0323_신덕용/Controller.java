package Team_0323_신덕용;

import java.util.ArrayList;
import java.util.Random;




public class Controller {
	// 회원리스트
		static ArrayList<Member> memberlist = new ArrayList<>();
		// 영화리스트
		static ArrayList<Movie> movielist = new ArrayList<>();
		// 예매리스트
		static ArrayList<Ticket> ticketlist = new ArrayList<>();
		// 좌석배열 
		static String[] theater = {	"[ 0 ]","[ 1 ]","[ 2 ]","[ 3 ]","[ 4 ]","[ 5 ]","[ 6 ]","[ 7 ]","[ 8 ]","[ 9 ]",
				"[ 10 ]","[ 11 ]","[ 12 ]","[ 13 ]","[ 14 ]","[ 15 ]","[ 16 ]","[ 17 ]","[ 18 ]","[ 19 ]",
				"[ 20 ]","[ 21 ]","[ 22 ]","[ 23 ]","[ 24 ]","[ 25 ]","[ 26 ]","[ 27 ]","[ 28 ]","[ 29 ]",
				"[ 30 ]","[ 31 ]","[ 32 ]","[ 33 ]","[ 34 ]","[ 35 ]","[ 36 ]","[ 37 ]","[ 38 ]","[ 39 ]",
				"[ 40 ]","[ 41 ]","[ 42 ]","[ 43 ]","[ 44 ]","[ 45 ]","[ 46 ]","[ 47 ]","[ 48 ]","[ 49 ]"};
	
		DB db = new DB();
	// 회원가입 메소드
	public int sign ( String id, String pw, String name, String phone) {
		Member member = new Member( id,pw,name,phone,false);
		for(Member temp : Controller.memberlist) {
			if (temp !=null &&  temp.getId().equals(id)) {
				//만약에 공백이 아니면서 배열내 id와 입력받은 id와 동일하면
				System.out.println("메세지)) 현재 사용중인 아이디입니다.");
				return 2; //함수종료 --->아이디중복으로 회원가입 실패
			}
		}
		memberlist.add(member);
		db.memberSave();
		return 1;
	}
	// 로그인 메소드
	public String login(String id,String pw) {
		
		for(Member temp : memberlist) {
			if(id.equals("admin")&& temp.getPw().equals(pw)) {
				return "admin";
			}
		else if(temp!=null && temp.getId().equals(id)&&temp.getPw().equals(pw)) {
				return temp.getId();
			}
		}return "false";
	}
	
	// 아이디찾기 메소드
	public String findid(String name, String phone) {
		for(Member temp : memberlist) {
			if(temp!=null && temp.getName().equals(name)&&temp.getPhone().equals(phone)) {
				return temp.getId();
			}
		} return "false";
	}
	
	// 비밀번호 찾기 메소드
	public String findpw(String id, String phone) {
		for (Member temp : memberlist) {
			if(temp!=null && temp.getId().equals(id)&&temp.getPhone().equals(phone)) {
				return temp.getPw();
			}
		} return "false";
	}
	// 일반회원 메뉴
	// 예매
	public void reserve(int num,String t_id,int seat ) {
		Random random = new Random();
		int t_num = random.nextInt(99999999)+10000000;
		
		
		
		
			if(num!= 0 ) {
				System.out.println("선택한 영화의 이름 : "+movielist.get(num-1).getTitle());
				System.out.println("선택한 영화의 시간 : " + movielist.get(num-1).getIntime());
				String t_title = movielist.get(num-1).getTitle();
				String t_intime = movielist.get(num-1).getIntime();
				String t_outtime = null;
				
				int t_money = movielist.get(num-1).getMoney(); 
				Ticket ticket = new Ticket ( t_id,  t_title,  t_intime, t_outtime, seat, t_num,t_money);
				ticketlist.add(ticket);
			}
		
		
	}
	// 예매 상세정보 
	public void myreserve() {
	}
	// 예매 취소
	public int cancle(int num) {
		String str = "0000";
	
		int v = Integer.parseInt(str);
		for(Ticket temp : ticketlist) {
			if(temp.getT_num() == num) {
				int seat = temp.getT_seat();
				temp.setT_intime("취소");
				
				temp.setT_num(0000000);
				theater[temp.getT_seat()] = "[ "+seat+" ]";
				temp.setT_money(0);
				
				return 2;
			}
		}return 3;
		
	}
	
	
	
	
	
	////관리자메뉴///////////////////////////////////////
	// 영화등록
	public void moive_register(String title,String intime,String runtime) {
		String [] startTime = intime.split(":");
		int startHour = Integer.parseInt(startTime[0]);
		int money = 0;
		if(startHour <= 10) {
			money = 5000;
		}else {
			money = 7000;
		}
		Movie movie = new Movie(title,intime,runtime,money);
		movielist.add(movie);
		db.movieSave();
		System.out.println("저장완료");
		
	}
	
	// 영화삭제
	public String movie_remove(String title, String intime) {
		for(Movie temp : movielist) {
			if(temp!=null && temp.getTitle().equals(title) && temp.getIntime().equals(intime))
			{
				movielist.remove(temp);
				db.movieSave();
				return "suc";
				
			}
		}
		
		return "false";
	}
	
	
	
	

}
