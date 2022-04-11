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
		// ���̵� �ߺ�üũ �޼ҵ� ( �μ� : ���̵� �μ��ι޾� db�� �����ϴ��� üũ )
	public boolean idcheck(String id) {
		// �˻�  : select * from ���̺�� where ���� (�ʵ�� = �� )
		
		try {
			String sql = "select * from member where mid=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery(); // select ���� -> �˻��� ����� ���� ->resultset��ߵ�
			// resultset ó�� �⺻���� : null --- next()---> ������ڵ�
			if(rs.next()) { // �˻������� ������� ������ ���̵� �����ϴ°� 
				
				return true; // �ߺ�����
			}
			
		}catch (Exception e) {System.out.println("sql����"+e);}
		
		return false;
	}
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
			
		}catch (Exception e) {System.out.println("sql����"+e);}
		
		return false;
	}
	
		// 3. ���̵�ã�� �޼ҵ� ( �μ� : ���̵�ã��� �ʿ��� �̸���
	public String findid(String email) {
		
		try {
			String sql  = "select * from member where memail=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, email);
			rs =  ps.executeQuery();
			if(rs.next()) {
				return rs.getString(2); // �������ʵ������ȣ ���̵� ã��ϱ� ���̵� �����;ߵż� 2
				
			}
			
			
		} catch (Exception e) {System.out.println("sql����"+e);}
		
		return null;
		}
		
		// 4. ��й�ȣã�� �޼ҵ� ( �μ� : ��й�ȣã�� �� �ʿ��� ���̵�, �̸���)
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
			
			
		}catch (Exception e) {System.out.println("sql����"+e);}
		
		return null;
		}
	
	// 5. ���̵� �μ��� ȸ������ ȣ��
	public Member getmember(String id ) {
		try {
			String sql = "select * from member where mid=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs =	ps.executeQuery();
			if(rs.next()) {
				// 1. ��ü����
				Member member = new Member(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getInt(6),
						rs.getString(7)
						);
				// rs.next() : ����� ���� ���ڵ�(��,����)
				// rs.getInt(�ʵ������ȣ) : �ش��ʵ��� �ڷ����� ���������ΰ�������
				// rs.getString(�ʵ������ȣ) : �ش� �ʵ��� �ڷ����� ���ڿ��� ��������
				// 2. ��ȯ
				return member;
			}
			
			
		}catch(Exception e) {System.out.println("sql����"+e);}
		return null;
		
	}
	
	// 6. ȸ��Ż��
	public boolean delete(int mnum) {
		try {
			String sql = "delete from member where mnum=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, mnum);
			ps.executeUpdate();
			return true;
		}catch(Exception e) {System.out.println("sql����"+e);}
		return false;
	}
	
	// 7. ȸ������ [ �̸���, �ּ� �μ��� �޾Ƽ� ]
	public boolean update(int mnum,String email,String address) {
		
		try {
			String sql = "update member set memail=?, maddress=? where mnum=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, address);
			ps.setInt(3, mnum);
			
			ps.executeUpdate();
			return true;
			
			
		} catch(Exception e){System.out.println("sql����"+e);}
		return false;
	}
	// 8. �ش� ȸ����ȣ�� �ش� idã��
	public String getmid(int mnum) {
		try {
		String sql = "select mid from member where mnum =?";
		ps = con.prepareStatement(sql);
		ps.setInt(1, mnum);
		rs = ps.executeQuery();
		if( rs.next() ) {
			return rs.getString(1);
		}
		}catch(Exception e) {System.out.println("sql����"+e);}
		return null;
	}

}
