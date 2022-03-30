package controller.login;

import java.net.URL;
import java.util.ResourceBundle;

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
    	System.out.println("���̵�ã��");
    	
    	Login.instansce.loadpage("/view/login/findidpane.fxml");
    }

    @FXML
    void accfindpassword(ActionEvent event) {
    	System.out.println("��й�ȣã��");
   	Login.instansce.loadpage("/view/login/findpasswordpane.fxml");
    }

    @FXML
    void accsignup(ActionEvent event) {
    	System.out.println("ȸ������ ");
    	// login ��Ʈ�ѿ� �����ϴ� borderpane ��ü�� ���� ����
    		// * ���� : borderpane ��ü�� �ٸ� ��Ʈ�ѿ� �ִ�
    		// * new : ���ο� �޸� �Ҵ� [ ���� borderpane �ƴ� ���ο� borderpane ]
    					//Login login = new Login();
    	//-----------------------------�� �ȵ� -----------------------------------------------------
    	// * ȸ������ ��ư�� ������ login��Ʈ��Ŭ���� �� borderpane �����̳� center ������ ����
    	// ���� : �ٸ� Ŭ������ �����̳� ȣ��
    	Login.instansce.loadpage("/view/login/signuppane.fxml");
    	
    	
    }

    @FXML
    void login(ActionEvent event) {
    	System.out.println("�α���");
    }


	
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}