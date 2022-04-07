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
	    
	    // 1. Ŭ���̾�Ʈ ���ϼ���
	    Socket socket;
	    // 2. Ŭ���̾�Ʈ ���� �޼ҵ�
	    public void clientstart() {
	    	// ��Ƽ������
	    	Thread thread = new Thread() {
	    		@Override
	    		public void run() {
	    			try {
	    				socket = new Socket("127.0.0.1",1234);
	    				send(Login.member.getMid()+"�� �����߽��ϴ�. \n");
	    				receive();
	    			}catch(Exception e) {}
	    			
	    		};
	    	}; // ��Ƽ������ ���� ��
	    	thread.start(); //��Ƽ ������ ����
	    }
	    // 3. Ŭ���̾�Ʈ ���� �޼ҵ�
	    public void clientstop() { try{socket.close();}catch(Exception e) {}}
	    
	    // 4. �������� �޽��� ������ �޼ҵ�
	    public void send (String msg) {
	    	Thread thread = new Thread() {
	    		@Override
	    		public void run() {
	    			
	    			try {
	    				OutputStream outputStream = socket.getOutputStream();
	    				outputStream.write(msg.getBytes());
	    				outputStream.flush(); // 3. ��Ʈ�� �ʱ�ȭ [ ��Ʈ�� �� ����Ʈ ����� ]
	    			}catch(Exception e) {}
	    		}
	    	}; // ��Ƽ������ ���� ��
	    	thread.start();
	    }
	    
	    // 5. �������� �޽��� �ޱ� �޼ҵ�
	    public void receive() {
	    	try {
	    		while(true) {
	    			InputStream inputStream = socket.getInputStream();
	    			byte[] bytes = new byte[1000];
	    			inputStream.read(bytes);
	    			String msg = new String(bytes);
	    			txtcontent.appendText(msg); // �Է¹��� ������ ä��â�� �߰��ϱ�
	    		}
	    	}catch(Exception e) {}
	    }

	    @FXML
	    void connect(ActionEvent event) {
	    	if( btnconnect.getText().equals("ä�ù� ����")) {
	    		
	    		clientstart();
	    		
	    		txtcontent.appendText("---[ä�ù� ����]---\n");
	    		btnconnect.setText("ä�ù� ������");
	    		txtmsg.setEditable(false); // 
		    	txtcontent.setDisable(false); //
		    	btnsend.setDisable(false); // 
	    		txtmsg.requestFocus();
	    		
	    	}else {
	    		
	    		clientstop();
	    		
	    		txtcontent.appendText("---[ä�ù� ����]---\n");
	    		btnconnect.setText("ä�ù� ����");
	    		txtmsg.setEditable(true); // 
		    	txtcontent.setDisable(true); //
		    	btnsend.setDisable(true); //
	    		
	    	}

	    }

	    @FXML
	    void send(ActionEvent event) { // ���� ��ư�� ��������
	    	String msg= txtmsg.getText()+"\n"; // ���� �޽���
	    	send(msg); // �޽��� ������
	    	txtmsg.setText(""); // �������� �޽��� �Է�â �����
	    	txtmsg.requestFocus(); // ������ �� �޽����Է�â���� ��Ŀ��(Ŀ��) �̵�
	    	
	    }
	    
	    @Override
	    public void initialize(URL arg0, ResourceBundle arg1) {
	    	// ä��fxml �������� �ʱⰪ �޼ҵ�
	    		// * ä�ù� �������� �Ʒ� fxid�� �����ϰ� ����
	    	txtmsg.setText("ä�ù� ������ ��밡��");
	    	txtmsg.setEditable(true); // ä���Է�â ��������
	    	txtcontent.setDisable(true); // ä��â ��� ������
	    	btnsend.setDisable(true); // ���۹�ư ������
	    	
	    }

}
