package dao;

import java.util.ArrayList;

import dto.Chatting;

public class ChattingDao extends Dao {
	
	public ChattingDao() {
		super(); // 슈퍼클래스 호출 ( db연동 )
			// super.메소드()  super.필드명	   super() : 생성자
	}
	public static ChattingDao chattingDao = new ChattingDao();
	public static ChattingDao getChattingDao() { return chattingDao; }

	// 보내기 메소드
	public boolean send(Chatting chatting) {
		String sql = "insert into chatting(cname,ccontent) values(?,?)";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, chatting.getCname());
			ps.setString(2, chatting.getCcontent());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {System.out.println("보내기 오류"+ e);}
		return false;
	}
	
	// 출력메소드
	public ArrayList<Chatting> chattinglist(){
		ArrayList<Chatting> chattinglist = new ArrayList<Chatting>();
		String sql = "select * from chatting order by cno asc";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()){
				Chatting chatting = new Chatting(rs.getInt(1),rs.getString(2),rs.getString(3));
				chattinglist.add(chatting);
			}
			return chattinglist;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
		
	}
}
