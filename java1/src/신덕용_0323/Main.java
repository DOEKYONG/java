package �Ŵ���_0323;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Controller con = new Controller();
		
		while(true) {
			try {
				System.out.println("1. ȸ������ 2. �α��� 3. ���̵�ã�� 4. ��й�ȣã��"); String ch = scanner.next();
				if(ch.equals("1")) {
				System.out.println("----------------ȸ������-----------------");
				System.out.println("���̵� : ");	String id = scanner.next();
				System.out.println("��й�ȣ : ");	String pw = scanner.next();
				System.out.println("�̸� : ");	String name = scanner.next(); 
				System.out.println("��ȭ��ȣ : ");	String phone = scanner.next();
				String result = con.sign(id, pw,name,phone);
				if(result == "bad") {
					System.out.println("ȸ�����Խ���");
				}
				else if (result == "good") {
					System.out.println("ȸ�����Լ���");
				}
				}
				
				
				
				
				else if (ch.equals("2") ) {
				System.out.println("");//
				System.out.println("���̵� �Է��ϼ��� :"); String id = scanner.next();
				System.out.println("��й�ȣ�� �Է��ϼ��� : "); String pw = scanner.next();
				String result = con.login(id, pw); // ���ϰ� String�̴ϱ� String ���� result����
				
				if(result.equals("admin")) {
					System.out.println("�����ڷ� �α���");
				}
				
				else { // ȸ�����Լ��� 
					System.out.println(result + "�� ȯ�� �մϴ�.");
				}
			}
				
				else if(ch.equals("3") || ch.equals("���̵�ã��")) {
					System.out.println("�̸�: "); String name = scanner.next();
					System.out.println("��ȭ��ȣ: "); String phone = scanner.next();
					//String result = con.findid(name, phone);
					con.findid(name,phone);
//					if(result.equals("fail")) {
//						//System.out.println("ȸ������ ���̵�: "+result);
//						System.out.println("�ش���̵� ã���� �����ϴ�.");
//					}
//					else {//System.out.println("�ش���̵� ã���� �����ϴ�.");
//						System.out.println("ȸ������ ���̵�: "+result);
//					}
					
					
				}
				else if(ch.equals("4") || ch.equals("��й�ȣã��")){
					System.out.println("���̵�: "); String id = scanner.next();
					System.out.println("��ȭ��ȣ: "); String phone = scanner.next();
					
					con.findpw(id,phone);
				}
				
				
				
				else {System.out.println("�߸����Է�");}
				
			}
			catch(Exception e) {}
		}
	}
}
