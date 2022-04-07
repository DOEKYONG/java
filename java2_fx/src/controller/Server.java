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
	 
	 // * 서버에 연결된 클라이언트를 저장하는 리스트
	 // * 멀티스레드를 관리해주는 스레드풀
	 // 1. 서버소켓 선언
	 ServerSocket serverSocket;
	 // 2. 서버실행 메소드
	 public void serverstart() {}
	 // 3. 서버종료 메소드
	 public void serverstop() {}

	  @FXML
	  void server(ActionEvent event) {
	    	
	   if( btnserver.getText().equals("서버 실행") ) {
	    		
		   txtserver.appendText("서버 실행합니다.\n");
	    		
	    	btnserver.setText("서버 중지");
	   } else {
	    	txtserver.appendText("서버 중지합니다. \n");
	    	btnserver.setText("서버 실행");
	    }

	    }
	    @Override
	    public void initialize(URL arg0, ResourceBundle arg1) {
	    	txtserver.setDisable(true); // 해당 fxid 사용금지
	    	
	    }

}
