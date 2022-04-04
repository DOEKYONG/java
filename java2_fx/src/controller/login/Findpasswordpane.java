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

public class Findpasswordpane implements Initializable{



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
	System.out.println("�ڷΰ��� ��ư ������");
	Login.instansce.loadpage("/view/login/loginpane.fxml");
}

@FXML
void findpassword(ActionEvent event) {
	String id = txtid.getText();
	String email = txtemail.getText();
	
	String result = MemberDao.memberDao.findpassword( id, email);
	
	if(result==null) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setHeaderText("��ġ�ϴ� ȸ�������� �����ϴ�.");
		//lblconfirm.setText("������ ȸ�������� �����ϴ�.");
		alert.showAndWait();
		
		///
	}
	else {////������ ��ȯ[������]
		//�׽�Ʈ
		// �̸��� ���� �޼ҵ� ȣ��
		Member.sendmail(email, result);
		
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setHeaderText("�ش� �̸��Ϸ� ��й�ȣ�� �����߽��ϴ�.");
		//lblconfirm.setText("ȸ������ ��й�ȣ��" + result + "�Դϴ�." );
		alert.showAndWait();
		}

}

@Override
public void initialize(URL arg0, ResourceBundle arg1) {
	// TODO Auto-generated method stub
	
}
}
