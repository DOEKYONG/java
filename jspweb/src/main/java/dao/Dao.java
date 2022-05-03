package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {
		protected Connection con; // 패키지가 달라도 상속받으면 접근가능
								// public, private,protected,default
		protected PreparedStatement ps; // db조작 인터페이스
		protected ResultSet rs; // db결과 인터페이스
		public Dao() {
			
			try { // 예외처리 => 자바외 외부통신할때 : 일반예외가 무조건 발생 
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspweb?serverTimezone=UTC",
						"root","1234");
				System.out.println("연동 성공 ");
			}catch(Exception e ){ System.out.println("연동 실패 "+e);}
		}
}
