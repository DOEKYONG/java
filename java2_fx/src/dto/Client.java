package dto;

import java.io.InputStream;
import java.net.Socket;

public class Client {
	
	// ������ ������ Ŭ���̾�Ʈ�� Ŭ����
	
	// 1. ����
	Socket socket;
	
	// 2. ������
	public Client( Socket socket ) {
		this.socket = socket;
	}
	
	// 3. ������ �޽��� �޴¸޼ҵ�
	public void recive() {
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				try {
					while(true) {
						InputStream inputStream = socket.getInputStream();
						byte[] bytes = new byte[1000];
						inputStream.read(bytes); // �Է� ��Ʈ������ ����Ʈ �о����
						String msg = new String(bytes);
					}
				}catch (Exception e) {}
				
				
			}
		};
	}
	
	// 4. ������ �޼��� ������ �޼ҵ�
	public void send() {
		
	}

}
