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
	    	// * ��Ʈ�ѿ� �Էµ� ������ ������
	    	String id = txtid.getText();
	    	String password = txtpassword.getText();
	    	String passwordconfirm = txtpasswordconfirm.getText();
	    	String email = txtemail.getText();
	    	String address = txtaddress.getText();
	    	
	    	// ���糯¥ �������� [ SimpleDateFormat : ��¥ ���(����) ��ȯ Ŭ���� ]
	    	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	    	
	    	String since = format.format(new Date());
	    	
	    	// * ��ȿ���˻� [ ���� ]
	    		// 1. id �ߺ�üũ
	    		// 2. id ����üũ
	    		// 3. ��й�ȣ üũ
	    		// 4. ��й�ȣ ��ġ üũ
	    		if(password.equals(passwordconfirm)) {
	    			lblconfirm.setText("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
	    			return;
	    		}
	    		// 3. �̸��� üũ
	    		// 4. �ּ�üũ
	    	// * ��� ��ȿ���˻� ����� DB�� ����
	    		// 1. ��üȭ
	    		Member member = new Member(0,id,password,email,address,0,since);
	    		// 2. Db ��ü�� �޼ҵ� ȣ��
	    		boolean result = MemberDao.memberDao.signup(member);
	    		// 3. Ȯ��
	    		if (result ) {
	    			System.out.println("���Լ���");
	    			
	    		} else {
	    			System.out.println("���Խ���");
	    		}
	    		
	    }

}
