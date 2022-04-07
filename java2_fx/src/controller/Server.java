package controller;

import java.net.ServerSocket;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Server implements Initializable {
	 @FXML
	 private Button btnserver;

	 @FXML
	 private TextArea txtserver;
	 
	 // * ������ ����� Ŭ���̾�Ʈ�� �����ϴ� ����Ʈ
	 // * ��Ƽ�����带 �������ִ� ������Ǯ
	 // 1. �������� ����
	 ServerSocket serverSocket;
	 // 2. �������� �޼ҵ�
	 public void serverstart() {}
	 // 3. �������� �޼ҵ�
	 public void serverstop() {}

	  @FXML
	  void server(ActionEvent event) {
	    	
	   if( btnserver.getText().equals("���� ����") ) {
	    		
		   txtserver.appendText("���� �����մϴ�.\n");
	    		
	    	btnserver.setText("���� ����");
	   } else {
	    	txtserver.appendText("���� �����մϴ�. \n");
	    	btnserver.setText("���� ����");
	    }

	    }
	    @Override
	    public void initialize(URL arg0, ResourceBundle arg1) {
	    	txtserver.setDisable(true); // �ش� fxid ������
	    	
	    }

}
