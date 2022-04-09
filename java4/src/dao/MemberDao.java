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
	public boolean login(String id, String password) { return false;}
	
		// 3. 아이디찾기 메소드 ( 인수 : 아이디찾기시 필요한 이메일
	public String findid(String eamil) {return null;}
		
		// 4. 비밀번호찾기 메소드 ( 인수 : 비밀번호찾기 시 필요한 아이디, 이메일)
	public String findpassword(String id,String eamil) {return null;}

}
