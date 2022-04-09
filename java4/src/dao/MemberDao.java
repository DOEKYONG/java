package dao;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dto.Member;

public class MemberDao { // DB ���ٰ�ü
	
	private Connection con; // DB������ ���Ǵ� Ŭ���� : DB����Ŭ����
	private PreparedStatement ps; // ����� DB�� SQL ���� �Ҷ� ���Ǵ� �������̽� : DB�����������̽�
	private ResultSet rs; // ������� �����ϴ� �������̽� 
	
	public static MemberDao memberDao = new MemberDao(); // DB ���� ��ü;
	
	public MemberDao() {
	      try {
	         Class.forName("com.mysql.cj.jdbc.Driver");
	         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx2?serverTimezone=UTC","root","1234");
	         
	         
	      }catch(Exception e) {System.out.println("DB�������"+e);}
	      
	   }
	// �޼ҵ�
		// 1. ȸ������ �޼ҵ� ( �μ� : db�� ���� ���̵� ��й�ȣ �̸����ּ� )
	public boolean signup(Member member) {
		
		try {
		// 1. SQL �ۼ�
		String sql = "insert into member(mid,mpassword,memail,maddress,mpoint,msince)values(?,?,?,?,?,?)";
		// 2. SQL ����
		ps = con.prepareStatement(sql); // PreparedStatement �������̽��� ����� db�� sql�ֱ�
		ps.setString(1, member.getMid());
		ps.setString(2, member.getMpassword());
		ps.setString(3, member.getMemail());
		ps.setString(4, member.getMaddress());
		ps.setInt(5, member.getMpoint());
		ps.setString(6, member.getMsince());
		// 3. SQL ����
		ps.executeUpdate();
		
		return true;
		} catch (Exception e) {System.out.println("sql����"+e);}
		return false;
		}
	
		// 2. �α��� �޼ҵ� ( �μ� : �α��ν� �ʿ��� ���̵�, ��й�ȣ)
	public boolean login(String id, String password) { return false;}
	
		// 3. ���̵�ã�� �޼ҵ� ( �μ� : ���̵�ã��� �ʿ��� �̸���
	public String findid(String eamil) {return null;}
		
		// 4. ��й�ȣã�� �޼ҵ� ( �μ� : ��й�ȣã�� �� �ʿ��� ���̵�, �̸���)
	public String findpassword(String id,String eamil) {return null;}

}
