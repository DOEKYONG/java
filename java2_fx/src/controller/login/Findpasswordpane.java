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

public class Findpasswordpane implements Initializable{



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
	System.out.println("뒤로가기 버튼 눌렀음");
	Login.instansce.loadpage("/view/login/loginpane.fxml");
}

@FXML
void findpassword(ActionEvent event) {
	String id = txtid.getText();
	String email = txtemail.getText();
	
	String result = MemberDao.memberDao.findpassword( id, email);
	
	if(result==null) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setHeaderText("일치하는 회원정보가 없습니다.");
		//lblconfirm.setText("동일한 회원정보가 없습니다.");
		alert.showAndWait();
		
		///
	}
	else {////페이지 전환[다음주]
		//테스트
		// 이메일 전송 메소드 호출
		Member.sendmail(email, result);
		
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setHeaderText("해당 이메일로 비밀번호를 전송했습니다.");
		//lblconfirm.setText("회원님의 비밀번호는" + result + "입니다." );
		alert.showAndWait();
		}

}

@Override
public void initialize(URL arg0, ResourceBundle arg1) {
	// TODO Auto-generated method stub
	
}
}
