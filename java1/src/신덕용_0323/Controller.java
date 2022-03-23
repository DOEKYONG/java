package 신덕용_0323;


import java.util.ArrayList;



public class Controller {
	
	// 회원리스트
	static ArrayList<Member> memberlist = new ArrayList<>();
	// 영화리스트
	static ArrayList<Movie> movielist = new ArrayList<>();
	
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
	
		return "good";
	}
	
	public String login(String id,String pw) {
		
		Member members = new Member("admin","aa","aa","aa");
		memberlist.add(members);
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
	
	public void findid(String name, String phone) {//아이디찾기

		for(Member temp : memberlist) {
			if(temp!=null&&temp.getName().equals(name)&&temp.getPhone().equals(phone)) {
				System.out.println("회원님의 아이디: "+ temp.getId());
			} 
			else {System.out.println("해당 아이디를 찾을 수 없습니다.");
			}
		}///for
	}
	// 비
	public void findpw(String id,String phone) {
		for(Member temp : memberlist) {
			if(temp!=null&&temp.getId().equals(id)&&temp.getPhone().equals(phone)) {
				System.out.println("회원님의 비밀번호: "+ temp.getPw());
			}
			else {System.out.println("해당 비밀번호를 찾을 수 없습니다.");
			}
		}///for
	}
	
	
	public void changepw() {}
	
	//영화시스템///////////////////////////////////////////////////////////////////////////
	
	public void reserve() {}
	
	public void myreserve() {}
	
	public void cancle() {}
	
	//관리자 시스템/////////////////////////////////////////////////////////////////////////
	
	public void moive_register () {}
	
	public void movie_remove () {}
	
	public void sale() {}
	
	
	
}
