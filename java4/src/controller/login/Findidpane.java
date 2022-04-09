package controller.login;

import java.net.URL;
import java.util.ResourceBundle;

import dao.MemberDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Findidpane implements Initializable {
	

	
	 @FXML
	    private Button btnfid;

	    @FXML
	    private Button btnback;

	    @FXML
	    private Label lblconfirm;

	    @FXML
	    private TextField txtemail;

	    @FXML
	    void back(ActionEvent event) {
	    	Login.instance.loadpage("/view/login/loginpane.fxml");

	    }

	    @FXML
	    void findid(ActionEvent event) {
	    	String email = txtemail.getText();
	    	String id = MemberDao.memberDao.findid(email);
	    	// 3. 확인
	    	if( id != null) {
	    		// 1.메시지 
	    		Alert alert = new Alert( AlertType.INFORMATION ); // 메시지 객체 선언 
    			alert.setHeaderText("회원님의 아이디는 : "+id);
    		alert.showAndWait(); // 실행 
	    		
	    		
	    	}else {
	    		lblconfirm.setText("해당 이메일의 아이디 정보가 없습니다.");
	    	}

	    }
	    
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			
		}

}
