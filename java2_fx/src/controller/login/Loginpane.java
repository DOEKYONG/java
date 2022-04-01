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
	

    @FXML
    private TextField txtid;

    @FXML
    private PasswordField txtpassword;

    @FXML
    private Button btnlogin;

    @FXML
    private Button btnsignup;

    @FXML
    private Button btnfindid;

    @FXML
    private Button btnfindpassword;

    @FXML
    private Label lblconfirm;

    @FXML
    void accfindid(ActionEvent event) {
    	System.out.println("아이디찾기");
    	
    	Login.instansce.loadpage("/view/login/findidpane.fxml");
    	
    	
    }

    @FXML
    void accfindpassword(ActionEvent event) {
    	System.out.println("비밀번호찾기");
   	Login.instansce.loadpage("/view/login/findpasswordpane.fxml");
    }

    @FXML
    void accsignup(ActionEvent event) {
    	System.out.println("회원가입 ");
    	// login 컨트롤에 존재하는 borderpane 객체내 센터 변경
    		// * 문제 : borderpane 객체가 다른 컨트롤에 있다
    		// * new : 새로운 메모리 할당 [ 기존 borderpane 아닌 새로운 borderpane ]
    					//Login login = new Login();
    	//-----------------------------위 안됨 -----------------------------------------------------
    	// * 회원가입 버튼을 누르면 login컨트롤클래스 내 borderpane 컨테이너 center 페이지 변경
    	// 문제 : 다른 클래스내 컨테이너 호출
    	Login.instansce.loadpage("/view/login/signuppane.fxml");
    	
    	
    }

    @FXML
    void login(ActionEvent event) {
    	String id = txtid.getText();
    	String password = txtpassword.getText();
    	// 2. db객체내 메소드 호출
    	boolean result = MemberDao.memberDao.login(id, password);
    	// 3. 결과 확인 
    	if(result) {
    		// 페이지전환 [ 다음시간 ]
    		// *테스트
    		lblconfirm.setText("로그인성공");
    	} else {
    		lblconfirm.setText("동일한 회원정보가 없습니다.");
    	}
    	
    }


	
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
