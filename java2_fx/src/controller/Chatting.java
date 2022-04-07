package controller;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;

import controller.login.Login;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Chatting implements Initializable {

	 @FXML
	    private Button btnconnect;

	    @FXML
	    private TextArea txtcontent;

	    @FXML
	    private TextArea txtmsg;

	    @FXML
	    private Button btnsend;

	    @FXML
	    private TextArea txtname;

	    @FXML
	    private TextArea txtport;

	    @FXML
	    private TextArea txtip;
	    
	    // 1. 클라이언트 소켓선언
	    Socket socket;
	    // 2. 클라이언트 실행 메소드
	    public void clientstart() {
	    	// 멀티스레드
	    	Thread thread = new Thread() {
	    		@Override
	    		public void run() {
	    			try {
	    				socket = new Socket("127.0.0.1",1234);
	    				send(Login.member.getMid()+"님 입장했습니다. \n");
	    				receive();
	    			}catch(Exception e) {}
	    			
	    		};
	    	}; // 멀티스레드 구현 끝
	    	thread.start(); //멀티 스레드 실행
	    }
	    // 3. 클라이언트 종료 메소드
	    public void clientstop() { try{socket.close();}catch(Exception e) {}}
	    
	    // 4. 서버에게 메시지 보내기 메소드
	    public void send (String msg) {
	    	Thread thread = new Thread() {
	    		@Override
	    		public void run() {
	    			
	    			try {
	    				OutputStream outputStream = socket.getOutputStream();
	    				outputStream.write(msg.getBytes());
	    				outputStream.flush(); // 3. 스트림 초기화 [ 스트림 내 바이트 지우기 ]
	    			}catch(Exception e) {}
	    		}
	    	}; // 멀티스레드 구현 끝
	    	thread.start();
	    }
	    
	    // 5. 서버에게 메시지 받기 메소드
	    public void receive() {
	    	try {
	    		while(true) {
	    			InputStream inputStream = socket.getInputStream();
	    			byte[] bytes = new byte[1000];
	    			inputStream.read(bytes);
	    			String msg = new String(bytes);
	    			txtcontent.appendText(msg); // 입력받은 내용을 채팅창에 추가하기
	    		}
	    	}catch(Exception e) {}
	    }

	    @FXML
	    void connect(ActionEvent event) {
	    	if( btnconnect.getText().equals("채팅방 입장")) {
	    		
	    		clientstart();
	    		
	    		txtcontent.appendText("---[채팅방 입장]---\n");
	    		btnconnect.setText("채팅방 나가기");
	    		txtmsg.setEditable(false); // 
		    	txtcontent.setDisable(false); //
		    	btnsend.setDisable(false); // 
	    		txtmsg.requestFocus();
	    		
	    	}else {
	    		
	    		clientstop();
	    		
	    		txtcontent.appendText("---[채팅방 퇴장]---\n");
	    		btnconnect.setText("채팅방 입장");
	    		txtmsg.setEditable(true); // 
		    	txtcontent.setDisable(true); //
		    	btnsend.setDisable(true); //
	    		
	    	}

	    }

	    @FXML
	    void send(ActionEvent event) { // 전송 버튼을 눌렀을때
	    	String msg= txtmsg.getText()+"\n"; // 보낼 메시지
	    	send(msg); // 메시지 보내기
	    	txtmsg.setText(""); // 보내기후 메시지 입력창 지우기
	    	txtmsg.requestFocus(); // 보내기 후 메시지입력창으로 포커스(커서) 이동
	    	
	    }
	    
	    @Override
	    public void initialize(URL arg0, ResourceBundle arg1) {
	    	// 채팅fxml 열렸을때 초기값 메소드
	    		// * 채팅방 입장전에 아래 fxid를 사용못하게 금지
	    	txtmsg.setText("채팅방 입장후 사용가능");
	    	txtmsg.setEditable(true); // 채팅입력창 수정금지
	    	txtcontent.setDisable(true); // 채팅창 목록 사용금지
	    	btnsend.setDisable(true); // 전송버튼 사용금지
	    	
	    }

}
