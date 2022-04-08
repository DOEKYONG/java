package application.Day26;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Day26_server {
	
	// ��ſ� ���� �����
		// 1. �������� �����
			// ���� : Ŭ���̾�Ʈ���� ������ ���񽺸� �������ִ� ��ǻ��
			// ���� : PC���� ��� ������
	// 2. �������� ���ε�
	// ������ ip�ּҿ� port��ȣ ����
	// *ip : ��� �ν� ��ȣ [ pc�� �ĺ��ϴ� ��ȣ ]
	// *port : pc�� ���μ��� (���α׷�) �ĺ��ϴ� ��ȣ
		// ip�� 6���� ���� port ��밡��
		// *port : 3306 ��ȣ�� mysql ���α׷����� �����ϴ� ��ȣ
	
	public static void main(String[] args) {
		
		
		try{
			// 1. �������� �����
			ServerSocket serverSocket = new ServerSocket();
			// 2. �������� ���ε�						// ip�ּ�		,   port ����
			serverSocket.bind(new InetSocketAddress("127.168.102.50",5000));
			// 3. Ŭ���̾�Ʈ�� ��û ���
			while(true) {
				System.out.println("������ ���� ������Դϴ�.");
				// 4. ��û�� ������� ����
				Socket socket = serverSocket.accept(); // ��������.accept() : ��û����
				// 5. ������ ������ ���� Ȯ��
				InetSocketAddress socketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
				System.out.println("Ŭ���̾�Ʈ�� ������ �Ǿ����ϴ�. ����� Ŭ���̾�Ʈ ���� : " + socketAddress.getHostName());
				
				// 6. Ŭ���̾�Ʈ���� ������ ���� �ϱ�
				InputStream inputStream = socket.getInputStream();
				byte[] bytes = new byte[1000];
				inputStream.read(bytes);
				System.out.println("Ŭ���̾�Ʈ�� ���� �޼��� : " + new String(bytes));
				
				// 7. Ŭ���̾�Ʈ���� ������ ������
				Scanner scanner = new Scanner(System.in);
				System.out.println("Ŭ���̾�Ʈ���� ���� �޽��� : ");
				String msg = scanner.next();
					// 2. ������ ��� ��Ʈ��
				OutputStream outputStream = socket.getOutputStream();
					// 3. ��������
				outputStream.write(msg.getBytes());
				
				
			}
			
		}catch(Exception e ) {}
		
		
	}

}