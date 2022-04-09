package controller.login;

import java.net.URL;
import java.util.ResourceBundle;

import dao.MemberDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Loginpane implements Initializable {
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lblconfirm.setText("");
		
	}
	
	 @FXML
	    private TextField txtid;

	    @FXML
	    private Button btnlogin;

	    @FXML
	    private Button btnsignup;

	    @FXML
	    private Button btnfindid;

	    @FXML
	    private Button btnfindpassword;

	    @FXML
	    private PasswordField txtpassword;

	    @FXML
	    private Label lblconfirm;

	    @FXML
	    void accfindid(ActionEvent event) {
	    	Login.instance.loadpage("/view/login/findidpane.fxml");

	    }

	    @FXML
	    void accfindpassword(ActionEvent event) {
	    	Login.instance.loadpage("/view/login/findpasswordpane.fxml");
	    }

	    @FXML
	    void accsignup(ActionEvent event) {
	    	
	    	Login.instance.loadpage("/view/login/signuppane.fxml");
	    }

	    @FXML
	    void login(ActionEvent event) {
	    	// 1. 컨트롤에 입력된 값 가져오기
	    	String id = txtid.getText();
	    	String password = txtpassword.getText();
	    	// 2. db객체내 메소드 호출
	    	boolean result = MemberDao.memberDao.login(id, password);
	    	// 3. 결과확인
	    	if(result) {
	    		// 로그인 성공시 성공한 회원정보 저장  [로그아웃시 초기화 ]
	    		Login.member =  MemberDao.memberDao.getmember(id);
	    		
	    		// 페이지 전환 
	    		Main.instance.loadpage("/view/home/home.fxml");
	    		// *테스트'
	    		lblconfirm.setText("로그인성공");
	    		
	    	}else {
	    		lblconfirm.setText("동일한 회원이 존재하지않습니다.");
	    	}
	    	

	    }

	
	
}
