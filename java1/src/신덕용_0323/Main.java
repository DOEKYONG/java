package �Ŵ���_0323;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Controller con = new Controller();
		Main mem = new Main();
		
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
					adminmenu();
				}
				
				else { // �α��μ��� 
					System.out.println(result + "�� ȯ�� �մϴ�.");
					membermenu(result);
				}
			}
				
				else if(ch.equals("3") || ch.equals("���̵�ã��")) {
					System.out.println("�̸�: "); String name = scanner.next();
					System.out.println("��ȭ��ȣ: "); String phone = scanner.next();
					con.findid(name, phone);
					String result = con.findid(name, phone);
					if(result.equals("false")) {
						System.out.println("�޼���)) �������� �ʴ� ȸ���Դϴ�.");
					}
					else {
						System.out.println("�޼���)) ȸ������ ���̵�� "+ result + " �Դϴ�.");
					}
				
						
				}
				else if(ch.equals("4") || ch.equals("��й�ȣã��")){
					System.out.println("���̵�: "); String id = scanner.next();
					System.out.println("��ȭ��ȣ: "); String phone = scanner.next();
					String result = con.findid(id, phone);
					con.findpw(id,phone);
					if (result.equals("false")) {
						System.out.println("�������� �ʴ� ȸ���Դϴ�.");
					}
					else {System.out.println("ȸ������ ��й�ȣ�� " + result + "�Դϴ�.");}
					
				}
				
				
				
				else {System.out.println("�߸����Է�");}
				
			}
			catch(Exception e) {}
		}
		
		
		
	}
	
	
	public static void membermenu(String id) {
		Controller con = new Controller();
		Scanner scanner =new Scanner(System.in);
		System.out.println("1.���� 2.������� 3.����Ȯ��   ����: "); String ch = scanner.next();
		
		if(ch.equals("1")||ch.equals("����")) {
			System.out.println("��ȭ����: "); String title = scanner.nextLine();
			//////�ش� ��ȭ�� �󿵽ð� ���//
			System.out.println("��ȭ�ð�: "); String intime = scanner.next();
			System.out.println("��ȭ�����½ð�: "); String outtime = scanner.next();
			////������ ��ȭ�� �󿵰� �¼� ����///
			System.out.println("�¼�����: "); String seat = scanner.next();
			// ���Ź�ȣ���� 
			//int t_num = (int)(Math.random() * (99999 - 10000 + 1)) + 10000;
			con.ticketsave(id,title,intime,outtime,seat);
			
		}
		else if(ch.equals("2")||ch.equals("�������")){
			System.out.println("��ȭ����: "); String title = scanner.nextLine();
			//////�ش� ��ȭ�� �󿵽ð� ���//
			System.out.println("��ȭ�ð�: "); String intime = scanner.next();
			//////�������
		}
		else if(ch.equals("3")||ch.equals("����Ȯ��")) {
			System.out.println("");
			////////���Ÿ�� �ڵ�����
			////////////////
			System.out.println("1.������� 2.�ڷΰ���"); String confirm = scanner.next();
		}
		else {}
		
		
	}
	
public static void adminmenu() {
	Scanner scanner =new Scanner(System.in);
	//Controller con = new Controller();
		while(true) {
			System.out.println("������ �޴�))");
			System.out.println("1.��ȭ��� 2.��ȭ���� 3.����Ȯ�� 4.�α׾ƿ�"); 
			System.out.println("���� : ");
			String ch =scanner.next();
			if(ch.equals("1")||ch.equals("��ȭ���")) {
				System.out.println("��ȭ����: "); 
				String title = scanner.next();
				System.out.println("�󿵰�����: "); 
				String screen = scanner.next();
				System.out.println("��ȭ�ð�: "); 
				String intime = scanner.next();
				
			}
			else if(ch.equals("2")||ch.equals("��ȭ����")){
				System.out.println("��ȭ����: "); 
				String title = scanner.nextLine();
				System.out.println("�󿵰�����: "); 
				String screen = scanner.next();
				System.out.println("��ȭ�ð�: "); 
				String intime = scanner.next();
			}
			else if(ch.equals("3")||ch.equals("����Ȯ��")) {
				System.out.println("");
			}
			else if(ch.equals("4")||ch.equals("�α׾ƿ�")) {
				System.out.println("�޼���)) �α׾ƿ� �߽��ϴ�.");
				break;
			}
			else {
				System.out.println("�޼���)) �������� �ʴ� �޴� �Դϴ�.");
			}
		}
	}
	
}
