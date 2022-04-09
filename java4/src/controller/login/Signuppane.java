package controller.login;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.ResourceBundle;

import dao.MemberDao;
import dto.Member;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Signuppane implements Initializable {
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	   @FXML
	    private TextField txtid;

	    @FXML
	    private Button btnsignup;

	    @FXML
	    private Button btnback;

	    @FXML
	    private PasswordField txtpassword;

	    @FXML
	    private Label lblconfirm;

	    @FXML
	    private PasswordField txtpasswordconfirm;

	    @FXML
	    private TextField txtaddress;

	    @FXML
	    private TextField txtemail;

	    @FXML
	    void back(ActionEvent event) {
	    	Login.instance.loadpage("/view/login/loginpane.fxml");

	    }

	    @FXML
	    void signup(ActionEvent event) {
	    	// * 컨트롤에 입력된 데이터 가져옥
	    	String id = txtid.getText();
	    	String password = txtpassword.getText();
	    	String passwordconfirm = txtpasswordconfirm.getText();
	    	String email = txtemail.getText();
	    	String address = txtaddress.getText();
	    	
	    	// 현재날짜 가져오기 [ SimpleDateFormat : 날짜 모양(형식) 변환 클래스 ]
	    	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	    	
	    	String since = format.format(new Date());
	    	
	    	// * 유효성검사 [ 제한 ]
	    		// 1. id 중복체크
	    		// 2. id 형식체크
	    		// 3. 비밀번호 체크
	    		// 4. 비밀번호 일치 체크
	    		if(password.equals(passwordconfirm)) {
	    			lblconfirm.setText("비밀번호가 일치하지 않습니다.");
	    			return;
	    		}
	    		// 3. 이메일 체크
	    		// 4. 주소체크
	    	// * 모든 유효성검사 통과시 DB에 저장
	    		// 1. 객체화
	    		Member member = new Member(0,id,password,email,address,0,since);
	    		// 2. Db 객체내 메소드 호출
	    		boolean result = MemberDao.memberDao.signup(member);
	    		// 3. 확인
	    		if (result ) {
	    			System.out.println("가입성공");
	    			
	    		} else {
	    			System.out.println("가입실패");
	    		}
	    		
	    }

}
