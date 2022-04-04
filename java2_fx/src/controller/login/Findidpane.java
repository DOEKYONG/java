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
    private Button btnfindid;

    @FXML
    private Button btnback;

    @FXML
    private Label lblconfirm;

    @FXML
    private TextField txtemail;

    @FXML
    void back(ActionEvent event) {
    	System.out.println("뒤로가기 버튼 눌렀음");
    	Login.instansce.loadpage("/view/login/loginpane.fxml");
    }

    @FXML
    void findid(ActionEvent event) {
    	String email = txtemail.getText();
    	
    	String result = MemberDao.memberDao.findid(email);
    	if(result == null) {
    		// 페이지 전환 [ 다음주 ]
    		// * 테스트
    		
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setHeaderText("일치하는 회원정보가 없습니다.");
    		alert.showAndWait();
    	}
    	else {
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setHeaderText("회원님의 아이디는" + result + "입니다.");
    		alert.showAndWait();
    		//lblconfirm.setText("회원님의 아이디는" + result + "입니다." );
    	}

    }

    @Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
    
}
