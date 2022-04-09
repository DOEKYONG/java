package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dto.Board;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class BoardDao {
	
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public static BoardDao boardDao = new BoardDao(); //db���� ��ü
	
	public BoardDao() { // �����ڿ��� �����ϴ� ���� : ��ü ������ �ٷ� db�����ϱ� ����
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx2?serverTimezone=UTC","root","1234");
		}catch (Exception e) {System.out.println("DB�������"+e);}
	}
	// �޼ҵ�
		// 1. �۾��� �޼ҵ�
	public boolean write ( Board board ) {
		try {
			String sql = "insert into board(btitle,bcontent,bwrite)values(?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, board.getBtitle());
			ps.setString(2, board.getBcontent());
			ps.setString(3, board.getBwrite());
			
			ps.executeUpdate();
			return true;
			
		}catch(Exception e) {System.out.println("sql����" +e);}
		
		return false;
		}
		// 2. ��� �� ȣ�� �޼ҵ�
	public ObservableList<Board> list() {
		 // *����Ʈ ����
		ObservableList<Board> boardlist = FXCollections.observableArrayList();
		try {
			String sql = "select * from board";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				
				// rs.get�ڷ���(�ش��ʵ������ȣ) : �� ���ڵ忡�� �ش� �ʵ��� ������ ��������
				// 1. ��üȭ
				Board board = new Board(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getInt(6));
				
				// 2. �ش� ��ü�� ����Ʈ�� ���
				boardlist.add(board);
			}
			return boardlist;
		}catch(Exception e) {System.out.println("sql����" +e);}
		
		return null;
		}
		// 3. �� ���� �޼ҵ�
	public boolean delete(int bnum) {return false;}
		// 4. �� ���� �޼ҵ�
	public boolean update(int bnum, String title, String content) {return false;}
	

}
