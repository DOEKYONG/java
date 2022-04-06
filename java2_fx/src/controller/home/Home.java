package controller.home;


import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import controller.login.Login;
import controller.login.Main;
import dao.MemberDao;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

public class Home  implements Initializable{
	
public static Home home; // 객체 
	
	// * this : 현재 클래스의 메모리 호출
	public Home() { home = this; }
	
	@FXML
	private Label lblloginid;
	@FXML
	private Label lblpoint;
	@FXML
	private Label lbllogout; // fxml
	@FXML
	private Label lbldelete;
	@FXML
	private Label lblinfo;
	@FXML
	private Label lblupdate;
	@FXML
	private Label lblboard; // fxid가져오기
	@FXML
	private Label lblproduct;
	
	@FXML
	private BorderPane borderpane;
	
	public void accproduct(MouseEvent e) {loadpage("/view/product/product.fxml");}
	
	
	@FXML// 자유게시 레이블을 클릭했을때 이벤트
	public void accboard( MouseEvent e ) { loadpage("/view/board/board.fxml"); }	
	
	@FXML
	public void accinfo( MouseEvent e ) { loadpage("/view/home/info.fxml"); }
									// loadpage 메소드 안에 fxml 작성 안했기 때문에 fxml까지 작성해주셔야 해요
	@FXML
	public void accupdate(MouseEvent e) {loadpage("/view/home/update.fxml");}
	
	public void loadpage(String page ) {
		try {
			Parent parent = FXMLLoader.load(getClass().getResource(page));
			borderpane.setCenter(parent);
		}catch(Exception e ) {System.out.println("회원정보불러오기" + e);}
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		lblloginid.setText(Login.member.getMid()+"님");
		lblpoint.setText("포인트 : " + Login.member.getMpoint()+"점");
		
		
		
	}
	@FXML
	public void logout(MouseEvent e) {
		// 1. login 정보 지우기
		Login.member = null;  
		// 2. 페이지전환
		Main.instance.loadpage("/view/login/login");
	}
	@FXML
	public void delete(MouseEvent e) {
		
		// 1.메시지
		Alert alert = new Alert(AlertType.CONFIRMATION); // 확인,취소 버튼 타입
			alert.setHeaderText("정말탈퇴하시겠습니까??");
	// 2. 버튼확인
			Optional<ButtonType> optional = alert.showAndWait();
			
			if(optional.get() == ButtonType.OK) { // 확인버튼을 눌렀을때
				// 회원탈퇴 진행
				boolean result = MemberDao.memberDao.delete(Login.member.getMnum());
								// 현재 로그인중인 회원의 번호 호출
				if (result ) { // 탈퇴성공
					// 로그아웃 [ Login 클래스네 Member 객체 null 으로 수정 ]
					Login.member = null;
					// 페이지 전환
					Main.instance.loadpage("/view/login/login");
					
				} else { // 탈퇴실패
					
				}
				
			}
			// 아니면 반응없음...
			
		
	}
	
	
	
	
	
}
