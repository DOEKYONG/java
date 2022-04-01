package controller.login;

import java.net.URL;
import java.util.ResourceBundle;

import dao.MemberDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Findidpane implements Initializable {

	
	

    @FXML
    private Button btnfindid;

    @FXML
    private Button btnback;

    @FXML
    private Label lblconfirm;

    @FXML
    private TextField txtemail;

    @FXML
    void back(ActionEvent event) {
    	System.out.println("뒤로가기 버튼 눌렀음");
    	Login.instansce.loadpage("/view/login/loginpane.fxml");
    }

    @FXML
    void findid(ActionEvent event) {
    	
    	String result = MemberDao.memberDao.findid(email);

    }

    @Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
    
}
