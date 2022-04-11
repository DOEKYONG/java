package dao;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dto.Member;

public class MemberDao { // DB 접근객체
	
	private Connection con; // DB연동시 사용되는 클래스 : DB연동클래스
	private PreparedStatement ps; // 연결된 DB내 SQL 조작 할때 사용되는 인터페이스 : DB조작인터페이스
	private ResultSet rs; // 결과물을 조작하는 인터페이스 
	
	public static MemberDao memberDao = new MemberDao(); // DB 연동 객체;
	
	public MemberDao() {
	      try {
	         Class.forName("com.mysql.cj.jdbc.Driver");
	         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx2?serverTimezone=UTC","root","1234");
	         
	         
	      }catch(Exception e) {System.out.println("DB연결실패"+e);}
	      
	   }
	// 메소드
		// 아이디 중복체크 메소드 ( 인수 : 아이디를 인수로받아 db에 존재하는지 체크 )
	public boolean idcheck(String id) {
		// 검색  : select * from 테이블명 where 조건 (필드명 = 값 )
		
		try {
			String sql = "select * from member where mid=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery(); // select 실행 -> 검색은 결과물 존재 ->resultset써야됨
			// resultset 처음 기본값은 : null --- next()---> 결과레코드
			if(rs.next()) { // 검색했을때 결과물이 있으면 아이디 존재하는거 
				
				return true; // 중복존재
			}
			
		}catch (Exception e) {System.out.println("sql실패"+e);}
		
		return false;
	}
		// 1. 회원가입 메소드 ( 인수 : db에 넣을 아이디 비밀번호 이메일주소 )
	public boolean signup(Member member) {
		
		try {
		// 1. SQL 작성
		String sql = "insert into member(mid,mpassword,memail,maddress,mpoint,msince)values(?,?,?,?,?,?)";
		// 2. SQL 조작
		ps = con.prepareStatement(sql); // PreparedStatement 인터페이스내 연결된 db에 sql넣기
		ps.setString(1, member.getMid());
		ps.setString(2, member.getMpassword());
		ps.setString(3, member.getMemail());
		ps.setString(4, member.getMaddress());
		ps.setInt(5, member.getMpoint());
		ps.setString(6, member.getMsince());
		// 3. SQL 실행
		ps.executeUpdate();
		
		return true;
		} catch (Exception e) {System.out.println("sql실패"+e);}
		return false;
		}
	
		// 2. 로그인 메소드 ( 인수 : 로그인시 필요한 아이디, 비밀번호)
	public boolean login(String id, String password) { 
		
		try {
			String sql = "select * from member where mid =? and mpassword=?";
			
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, password);
			
			rs = ps.executeQuery();
			if(rs.next()) {
				return true;
			}
			
		}catch (Exception e) {System.out.println("sql실패"+e);}
		
		return false;
	}
	
		// 3. 아이디찾기 메소드 ( 인수 : 아이디찾기시 필요한 이메일
	public String findid(String email) {
		
		try {
			String sql  = "select * from member where memail=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, email);
			rs =  ps.executeQuery();
			if(rs.next()) {
				return rs.getString(2); // 가져올필드순서번호 아이디 찾기니깐 아이디 가져와야돼서 2
				
			}
			
			
		} catch (Exception e) {System.out.println("sql실패"+e);}
		
		return null;
		}
		
		// 4. 비밀번호찾기 메소드 ( 인수 : 비밀번호찾기 시 필요한 아이디, 이메일)
	public String findpassword(String id,String email) {
		try {
			String sql = "select * from member where mid=? and memail=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, email);
			rs = ps.executeQuery();
			if(rs.next()) {
				return rs.getString(3);
			}
			
			
		}catch (Exception e) {System.out.println("sql실패"+e);}
		
		return null;
		}
	
	// 5. 아이디 인수로 회원정보 호출
	public Member getmember(String id ) {
		try {
			String sql = "select * from member where mid=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs =	ps.executeQuery();
			if(rs.next()) {
				// 1. 객체선언
				Member member = new Member(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getInt(6),
						rs.getString(7)
						);
				// rs.next() : 결과내 다음 레코드(줄,가로)
				// rs.getInt(필드순서번호) : 해당필드의 자료형이 정수형으로가져오기
				// rs.getString(필드순서번호) : 해당 필드의 자료형이 문자열로 가져오기
				// 2. 반환
				return member;
			}
			
			
		}catch(Exception e) {System.out.println("sql실패"+e);}
		return null;
		
	}
	
	// 6. 회원탈퇴
	public boolean delete(int mnum) {
		try {
			String sql = "delete from member where mnum=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, mnum);
			ps.executeUpdate();
			return true;
		}catch(Exception e) {System.out.println("sql실패"+e);}
		return false;
	}
	
	// 7. 회원수정 [ 이메일, 주소 인수로 받아서 ]
	public boolean update(int mnum,String email,String address) {
		
		try {
			String sql = "update member set memail=?, maddress=? where mnum=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, address);
			ps.setInt(3, mnum);
			
			ps.executeUpdate();
			return true;
			
			
		} catch(Exception e){System.out.println("sql실패"+e);}
		return false;
	}
	// 8. 해당 회원번호로 해당 id찾기
	public String getmid(int mnum) {
		try {
		String sql = "select mid from member where mnum =?";
		ps = con.prepareStatement(sql);
		ps.setInt(1, mnum);
		rs = ps.executeQuery();
		if( rs.next() ) {
			return rs.getString(1);
		}
		}catch(Exception e) {System.out.println("sql실패"+e);}
		return null;
	}

}
