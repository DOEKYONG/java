package controller.home;

import java.net.URL;
import java.util.ResourceBundle;

import controller.login.Login;
import controller.login.Main;
import dao.MemberDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Update implements Initializable {
	

    @FXML
    private Label lblemail;

    @FXML
    private Label lbladdress;

    @FXML
    private Button btnupdate;

    @FXML
    private TextField txtemail;

    @FXML
    private TextField txtaddress;

    @FXML
    void update(ActionEvent event) {
    	String email = txtemail.getText();
    	String address = txtaddress.getText();
    	
    boolean result =	MemberDao.memberDao.update(Login.member.getMnum(), email, address);
    	if(result ) {
    		Alert alert = new Alert(AlertType.INFORMATION);
    			alert.setHeaderText("ȸ�������� �����Ǿ����ϴ� [ �ٽ� �α������ּ��� ] ");
    			alert.showAndWait();
    			Main.instance.loadpage("/view/login/login.fxml");
    			Login.member = null;
    	}else {
    		Alert alert = new Alert(AlertType.INFORMATION);
			alert.setHeaderText("ȸ������ ���� ���� [ �����ڿ��� ���� ] ");
			alert.showAndWait();
    	}

    }
	
	
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		txtemail.setText(Login.member.getMemail());
		txtaddress.setText(Login.member.getMaddress());
		
	}
	

}
