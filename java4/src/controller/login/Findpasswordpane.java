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

public class Findpasswordpane implements Initializable {
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	
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
	    	
	    	Login.instance.loadpage("/view/login/loginpane.fxml");
	    }

	    @FXML
	    void findpassword(ActionEvent event) {
	    	String id = txtid.getText();
	    	String email = txtemail.getText();
	    	
	    	String password = MemberDao.memberDao.findpassword(id, email);
	    	
	    	if(password != null) {
	    		
	    		Member.sendmail(email, password);
	    		Alert alert = new Alert( AlertType.INFORMATION ); // �޽��� ��ü ���� 
    			alert.setHeaderText("�ش� �̸��Ϸ� ��й�ȣ�� �����߽��ϴ�.");
    		alert.showAndWait(); // ���� 
	    		
	    	}else {
	    		lblconfirm.setText("�ش� �̸����� �н����� ������ �����ϴ�.");
	    	}

	    }

}
