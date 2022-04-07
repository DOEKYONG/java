package dto;

import java.io.InputStream;
import java.net.Socket;

public class Client {
	
	// 서버에 들어오는 클라이언트의 클래스
	
	// 1. 소켓
	Socket socket;
	
	// 2. 생성자
	public Client( Socket socket ) {
		this.socket = socket;
	}
	
	// 3. 서버로 메시지 받는메소드
	public void recive() {
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				try {
					while(true) {
						InputStream inputStream = socket.getInputStream();
						byte[] bytes = new byte[1000];
						inputStream.read(bytes); // 입력 스트림으로 바이트 읽어오기
						String msg = new String(bytes);
					}
				}catch (Exception e) {}
				
				
			}
		};
	}
	
	// 4. 서버가 메세지 보내는 메소드
	public void send() {
		
	}

}
