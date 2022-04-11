package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dto.Board;
import dto.Reply;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class BoardDao {
	
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public static BoardDao boardDao = new BoardDao(); //db연동 객체
	
	public BoardDao() { // 생성자에서 연동하는 이유 : 객체 생성시 바로 db연동하기 위해
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx2?serverTimezone=UTC","root","1234");
		}catch (Exception e) {System.out.println("DB연결실패"+e);}
	}
	// 메소드
		// 1. 글쓰기 메소드
	public boolean write ( Board board ) {
		try {
			String sql = "insert into board(btitle,bcontent,bwrite)values(?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, board.getBtitle());
			ps.setString(2, board.getBcontent());
			ps.setString(3, board.getBwrite());
			
			ps.executeUpdate();
			return true;
			
		}catch(Exception e) {System.out.println("sql오류" +e);}
		
		return false;
		}
		// 2. 모든 글 호출 메소드
	public ObservableList<Board> list() {
		 // *리스트 선언
		ObservableList<Board> boardlist = FXCollections.observableArrayList();
		try {
			String sql = "select * from board order by bnum desc";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				
				// rs.get자료형(해당필드순서번호) : 현 레코드에서 해당 필드의 데이터 가져오기
				// 1. 객체화
				Board board = new Board(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getInt(6));
				
				// 2. 해당 객체를 리스트에 담기
				boardlist.add(board);
			}
			return boardlist;
		}catch(Exception e) {System.out.println("sql오류" +e);}
		
		return null;
		}
		// 3. 글 삭제 메소드
	public boolean delete(int bnum) {
		
		try {
			String sql = "delete from board where bnum=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, bnum);
			ps.executeUpdate();
			return true;
			
		}catch(Exception e) {System.out.println("sql오류" +e);}
		
		
		return false;
		}
		// 4. 글 수정 메소드
	public boolean update(int bnum, String title, String content) {
		
		try {
			String sql = "update board set btitle=?,bcontent=? where bnum=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setInt(3, bnum);
			ps.executeUpdate();
			return true;
			
			
		}catch(Exception e){System.out.println("sql오류" +e);}
		
		
		return false;
		}
	
	// 5. 댓글 작성 메소드
	public boolean rwrite(Reply reply) {
		try {
		String sql = "insert into reply(rcontent,rwrite,bnum)values(?,?,?)";
		ps = con.prepareStatement(sql);
		ps.setString(1, reply.getRcontent());
		ps.setString(2, reply.getRwrite());
		ps.setInt(3, reply.getBnum());
		ps.executeUpdate();
		return true;
		} catch(Exception e) {System.out.println("sql오류" +e);}
		return false;
	}
	
	
	// 6. 댓글 호출 메소드
	public ObservableList<Reply> replylist(int bnum) {
		
		ObservableList<Reply> replyList = FXCollections.observableArrayList();
		
		try {
			String sql = "select * from reply where bnum=? order by rnum desc";
			ps = con.prepareStatement(sql);
			ps.setInt(1, bnum);
			rs = ps.executeQuery();
			while(rs.next()) {
				Reply reply = new Reply(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getInt(5));
				replyList.add(reply);
			}
			return replyList;
			
		}catch(Exception e) {System.out.println("sql오류" +e);}
		return null;
	}
	

}
