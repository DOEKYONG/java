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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class Signuppane implements Initializable {
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lblconfirm.setText("");
		
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
	    		boolean result2 = MemberDao.memberDao.idcheck(id);
	    		if(result2) {
	    			lblconfirm.setText("실패 사용중인 아이디입니다");
	    			return;
	    		}
	    		// 2. id 길이체크
	    		if(id.length() < 4 || id.length()>10) {
	    			lblconfirm.setText("실패 아이디 4~10사이로 입력해주세요!");
	    			return;
	    		}
	    		// 3. 비밀번호 형식 체크
	    		if(password.length()<8 || password.length() > 10 ||
	    				passwordconfirm.length()<8 || passwordconfirm.length() > 10) {
	    			lblconfirm.setText("실패 패스워드는 4~10 사이로 입력해주세요!");
	    			return;
	    		}
	    		// 4. 비밀번호 일치 체크
	    		if(! password.equals(passwordconfirm)) {
	    			lblconfirm.setText("비밀번호가 일치하지 않습니다.");
	    			return;
	    		}
	    		// 5. 이메일 체크
	    		if(email.indexOf("@") == -1 ) {
	    			lblconfirm.setText("이메일 형식으로 입력해주세요");
	    			return;
	    		}
	    		
	    		// 6. 주소체크
	    		if( !(address.contains("시") && address.contains("구") && address.contains("동"))) {
	    			lblconfirm.setText("실패 주소형식 시,구,동 포함 으로 입력해주세요");
	    			return;
	    		}
	    		
	    		
	    	// * 모든 유효성검사 통과시 DB에 저장
	    		// 1. 객체화
	    		Member member = new Member(0,id,password,email,address,0,since);
	    		// 2. Db 객체내 메소드 호출
	    		boolean result = MemberDao.memberDao.signup(member);
	    		// 3. 확인
	    		if (result ) {
	    			// 1. 메시지창 출력
	    			Alert alert = new Alert( AlertType.INFORMATION ); // 메시지 객체
	    			alert.setTitle("알림"); // 메시지 제목 설정
	    			alert.setHeaderText("앵무새마켓에 가입을 축하합니다.");
	    			alert.setContentText("회원가입 성공");
	    			alert.showAndWait(); // 메시지 실행;
	    			
	    			// 2. 화면전환
	    			Login.instance.loadpage("/view/login/loginpane.fxml");
	    			
	    			
	    		} else {
	    			lblconfirm.setText("실패 DB오류 관리자에게 문의 ");
	    		}
	    		
	    }

}
