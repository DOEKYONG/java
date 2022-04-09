package controller.login;

import java.net.URL;
import java.util.ResourceBundle;

import dao.MemberDao;
import dto.Member;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class Findpasswordpane implements Initializable {
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	
	  @FXML
	    private Button btnfindpassword;

	    @FXML
	    private Button btnback;

	    @FXML
	    private Label lblconfirm;

	    @FXML
	    private TextField txtemail;

	    @FXML
	    private TextField txtid;

	    @FXML
	    void back(ActionEvent event) { 
	    	
	    	Login.instance.loadpage("/view/login/loginpane.fxml");
	    }

	    @FXML
	    void findpassword(ActionEvent event) {
	    	String id = txtid.getText();
	    	String email = txtemail.getText();
	    	
	    	String password = MemberDao.memberDao.findpassword(id, email);
	    	
	    	if(password != null) {
	    		
	    		Member.sendmail(email, password);
	    		Alert alert = new Alert( AlertType.INFORMATION ); // 메시지 객체 선언 
    			alert.setHeaderText("해당 이메일로 비밀번호를 전송했습니다.");
    		alert.showAndWait(); // 실행 
	    		
	    	}else {
	    		lblconfirm.setText("해당 이메일의 패스워드 정보가 없습니다.");
	    	}

	    }

}
