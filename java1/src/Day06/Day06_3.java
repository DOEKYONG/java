package Day06;

import java.util.Scanner;

public class Day06_3 { // c s

	public static void main(String[] args) { //  m s
		Scanner scanner = new Scanner(System.in);
		Member[] memberlist = new Member[100]; 
		// Member Ŭ������ ������� ��ü(id,pw,name,phone) 100�� �����Ҽ��ִ¹迭����
		
		// ���࿡ Ŭ������ ��������쿡�� => 2�����迭
		// String[][] memberlist = new Member[100][4]; 
		
		while(true) { // ���α׷����� ���ѷ���
			
			System.out.println("------------ȸ����[Ŭ��������]---------------");
			System.out.println("1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã��");
			System.out.println(" ���� : "); int ch = scanner.nextInt();
			
			if( ch == 1) { // ȸ������
				// 1. id, password, name , phone �Է¹ޱ� ->����4��
				System.out.println("----------ȸ������������--------------");
				System.out.println( " ���̵� : "); String id = scanner.next();
				System.out.println( " ��й�ȣ : "); String password = scanner.next();
				System.out.println( " �̸� : "); String name  = scanner.next();
				System.out.println( " ����ó : "); String phone  = scanner.next();
				// 2. ��ü ����
				Member member = new Member();
				// 3. �Է¹��� ����4���� ��ü�� �ʵ忡 �����ϱ�
				member.id = id;
				// ��ü�� �ʵ� =�Է¹�����
				member.password = password;
				member.name= name;
				member.phone = phone;
				
				// * ���̵� �ߺ�üũ
				boolean idcheck= false;
				for( Member temp : memberlist ) {
					// * meberlist �迭�� ��ü���� �ϳ��� temp�� ���Թݺ�
					if( temp != null && temp.id.equals(id)) {
						System.out.println(" �˸�)) ������ξ��̵��Դϴ�.");
						idcheck = true;
						break;
					}
					
				}
				
				
				// ���̵� �ߺ��� ������� ����
				if (idcheck == false) {
					// 4. ������ ��ü�� �����ϴ� �迭�� ����
					// 1. ���� �ε��� ã�� [ ������ �ƴϸ� ����ȸ���� ���� ] 
				int i = 0; // �ε�����ġ����
				for(Member temp : memberlist) {
					// *meberlist �迭�� member ��ü �ϳ��� �����ͼ� temp���� �ݺ�
					// 2. ���鿡 �ε����� ��ü ����
					if(temp == null) {
						memberlist[i] = member; // �ش� �ε����� ���� ������� ��ü ����
						System.err.println(" �˸�)) ȸ�����Լ���!!");
						break; // for ������ [ �ȳ����� ��� ���鿡 ������ ��ü ����Ǳ⶧���� ]
 					}
					i++; // �ε�������
				} //  for�� end
				} // if end
			} // ȸ������ if( ch == 1) end
			else if (ch ==2 ) { // �α���
				System.out.println("-------------�α��� ������------------");
				System.out.println(" ���̵� : "); String loginid = scanner.next();
				System.out.println(" ��й�ȣ : ");	String loginpassword = scanner.next();
				
				// 2. ���� �迭 [ ȸ������Ʈ ]  �� �Է¹��� ���� ��
				boolean logincheck = false;  // true : �α��μ���  false �α��ν��з� ���
				for( Member temp : memberlist) {
					// *memberlist�� 0�� �ε������� �� �ε����� �ϳ��� temp�� ����
					if ( temp != null && temp.id.equals(loginid) && temp.password.equals(loginpassword)) {
						System.out.println(" �˸�)) �α��μ��� ");
						logincheck = true;  // �α��μ���
						
					}
				} // for end
				
				// 3. �α��� ���� ���� 
				if (logincheck == false ) {
					System.out.println(" �˸�)) ������ ȸ�������� �����ϴ�.");
				}
				
				
			} // �α��� end
			else if (ch ==3 ) {
				System.out.println("--------------���̵�ã�� ������ ------------------------");
				System.out.println(" �̸� : "); String name =scanner.next();
				System.out.println(" ����ó : "); String phone =scanner.next();
				boolean findcheck = false;
				// 2.�迭�� ������ �̸��� ����ó�� �ִ��� Ȯ��
				for (Member temp : memberlist) {
					
					if( temp != null && temp.name.equals(name)&& temp.phone.equals(phone) ) {
						System.out.println(" �˸�)) ���̵� ã�� ����");
						System.out.println(" ȸ�� ID : " +temp.id);
						findcheck = true;
						break;
					}
				}
				// 4. ������ ���ٰ� ���
				if (findcheck==false) {
					System.out.println("������ ȸ�������� �����ϴ�.");
				}
				
				
				
				
			} // ���̵�ã�� else if (ch ==3 ) end
			else if (ch ==4 ) {
				System.out.println(" ���̵� : "); String id =scanner.next();
				System.out.println(" ��ȭ��ȣ : "); String phone =scanner.next();
				boolean findcheck = false;
					for (Member temp : memberlist) {
					
					if( temp != null && temp.id.equals(id)&& temp.phone.equals(phone) ) {
						System.out.println(" �˸�)) ��й�ȣ ã�� ����");
						System.out.println(" ȸ�� ��й�ȣ : " +temp.password);
						findcheck = true;
						break;
					}
				}
				
					if (findcheck==false) {
						System.out.println("������ ȸ�������� �����ϴ�.");
					}
				
				
			} // ��й�ȣã��
			else {System.out.println(" �˸�)) �˼����� ��ȣ�Դϴ�.");} // �׿�
		} // while end
		
		
		
		
		

	} // m e

} // c e
