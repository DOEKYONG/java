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
	    	// 1. ��Ʈ�ѿ� �Էµ� �� ��������
	    	String id = txtid.getText();
	    	String password = txtpassword.getText();
	    	// 2. db��ü�� �޼ҵ� ȣ��
	    	boolean result = MemberDao.memberDao.login(id, password);
	    	// 3. ���Ȯ��
	    	if(result) {
	    		// �α��� ������ ������ ȸ������ ����  [�α׾ƿ��� �ʱ�ȭ ]
	    		Login.member =  MemberDao.memberDao.getmember(id);
	    		
	    		// ������ ��ȯ 
	    		Main.instance.loadpage("/view/home/home.fxml");
	    		// *�׽�Ʈ'
	    		lblconfirm.setText("�α��μ���");
	    		
	    	}else {
	    		lblconfirm.setText("������ ȸ���� ���������ʽ��ϴ�.");
	    	}
	    	

	    }

	
	
}