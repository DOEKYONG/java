package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dto.Product;

public class ProductDao {
	
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public static ProductDao productDao = new ProductDao();
	
	public ProductDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafx2?serverTimezone=UTC",
					"root","1234");
		}catch(Exception e ) {}
	}
	
	// 1. 제품 등록
	public boolean add(Product product) {
		
		try {
			String sql = "insert into product(pname,pimg,pcontent,pcategory,pprice,pactivation,mnum)values(?,?,?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, product.getPname());
			ps.setString(2, product.getPimg());
			ps.setString(3, product.getPcontent());
			ps.setString(4, product.getPcategory());
			ps.setInt(5, product.getPprice());
			ps.setInt(6, product.getPactivation());
			ps.setInt(7, product.getMnum());
			ps.executeUpdate();
			return true;
			
		}catch(Exception e){System.out.println("sql실패"+e);}
		return false;
	}
	
	// 2. 모든 제품 출력
	public ArrayList<Product> list() {
		
		ArrayList<Product> productlist = new ArrayList<>();
		try {
			String sql = "select * from product";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();					// SQL 실행  
			while( rs.next() ) {					// SQL 결과[ 레코드 단위 ]
				Product product = new Product(  	// 해당 레코드를 객체화
						rs.getInt(1) ,
						rs.getString(2),
						rs.getString(3), 
						rs.getString(4), 
						rs.getString(5),
						rs.getInt(6),
						rs.getInt(7),
						rs.getString(8),
						rs.getInt(9));
				productlist.add(product);			// 리스트에 객체 담기 
			}	
			return productlist;						// 리스트 반환
		}catch(Exception e ) { System.out.println( "[SQL 오류]"+e  ); }
		return null; // 만약에 실패시 NULL 반환
	}
		
	}
	
	// 3. 제품 조회
	
	// 4. 제품 삭제
	
	// 5. 제품 수정
	


