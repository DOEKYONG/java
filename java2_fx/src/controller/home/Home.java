package controller.home;


import java.net.URL;
import java.util.ResourceBundle;

import controller.login.Login;
import controller.login.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class Home  implements Initializable{
	
	@FXML
	private Label lblloginid;
	private Label lblpoint;
	private Label lbllogout;
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		lblloginid.setText(Login.member.getMid()+"님");
		lblpoint.setText("포인트 : " + Login.member.getMpoint());
		
		
		
	}
	@FXML
	public void logout(MouseEvent e) {
		// 1. login 정보 지우기
		Login.member = null;  
		// 2. 페이지전환
		Main.instance.loadpage("/view/login/login");
	}
	
	
	
}
