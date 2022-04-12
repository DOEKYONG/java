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
	    		boolean result2 = MemberDao.memberDao.idcheck(id);
	    		if(result2) {
	    			lblconfirm.setText("���� ������� ���̵��Դϴ�");
	    			return;
	    		}
	    		// 2. id ����üũ
	    		if(id.length() < 4 || id.length()>10) {
	    			lblconfirm.setText("���� ���̵� 4~10���̷� �Է����ּ���!");
	    			return;
	    		}
	    		// 3. ��й�ȣ ���� üũ
	    		if(password.length()<8 || password.length() > 10 ||
	    				passwordconfirm.length()<8 || passwordconfirm.length() > 10) {
	    			lblconfirm.setText("���� �н������ 4~10 ���̷� �Է����ּ���!");
	    			return;
	    		}
	    		// 4. ��й�ȣ ��ġ üũ
	    		if(! password.equals(passwordconfirm)) {
	    			lblconfirm.setText("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
	    			return;
	    		}
	    		// 5. �̸��� üũ
	    		if(email.indexOf("@") == -1 ) {
	    			lblconfirm.setText("�̸��� �������� �Է����ּ���");
	    			return;
	    		}
	    		
	    		// 6. �ּ�üũ
	    		if( !(address.contains("��") && address.contains("��") && address.contains("��"))) {
	    			lblconfirm.setText("���� �ּ����� ��,��,�� ���� ���� �Է����ּ���");
	    			return;
	    		}
	    		
	    		
	    	// * ��� ��ȿ���˻� ����� DB�� ����
	    		// 1. ��üȭ
	    		Member member = new Member(0,id,password,email,address,0,since);
	    		// 2. Db ��ü�� �޼ҵ� ȣ��
	    		boolean result = MemberDao.memberDao.signup(member);
	    		// 3. Ȯ��
	    		if (result ) {
	    			// 1. �޽���â ���
	    			Alert alert = new Alert( AlertType.INFORMATION ); // �޽��� ��ü
	    			alert.setTitle("�˸�"); // �޽��� ���� ����
	    			alert.setHeaderText("�޹������Ͽ� ������ �����մϴ�.");
	    			alert.setContentText("ȸ������ ����");
	    			alert.showAndWait(); // �޽��� ����;
	    			
	    			// 2. ȭ����ȯ
	    			Login.instance.loadpage("/view/login/loginpane.fxml");
	    			
	    			
	    		} else {
	    			lblconfirm.setText("���� DB���� �����ڿ��� ���� ");
	    		}
	    		
	    }

}