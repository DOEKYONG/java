package Day08;



public class Member {

	// 1.�ʵ�
	String id;		// ���̵� 
	String password;// ��й�ȣ
	String name;	// �̸�
	// 2. ������
		// 1. �������[�⺻������]
			public Member () {}
		// 2. ��������
			public Member(String id, String password, String name) {
				this.id = id;
				this.password = password;
				this.name = name;
			}
	// 3. �޼ҵ�
			// 1. ȸ������ �޼ҵ� [ �μ�x ��ȯo : ���Լ���TRUE / ���Խ���FALSE]
			public boolean ȸ������() {
				System.out.println(" ----- ȸ������ ������ ------");
				// 1. �Է¹޴´� [ id pw name phone]
				System.out.println("���̵� : "); String id = Day08_5.scanner.next();
				// * ���̵� �ߺ�üũ ***********
				for (Day08.Member temp : Day08_5.members) {
					if ( temp != null && temp.id.equals(id)) {
						// ���࿡ ������ �ƴϸ鼭 �迭�� id�� �Է¹��� id�� �����ϸ�
						System.out.println("���� ������� ���̵��Դϴ�.");
						return false; // �Լ����� --> ���̵� �ߺ��Ǿ��⶧���� false[���Խ���]
					}
				}
				
				System.out.println("��й�ȣ : "); String password = Day08_5.scanner.next();
				System.out.println("�̸� : "); String name = Day08_5.scanner.next();
				
						// * scanner ��ü�� �ٸ� Ŭ������ static ����Ǿ�����.
						// * Ŭ������.�ʵ��.�Լ���();
						// * static �ʵ� �޼ҵ�� ��ü���� ȣ�Ⱑ�� [ Ŭ������.�ʵ��/�޼ҵ�� ]
				// 2. 4������ - > ��üȭ -> 1��
				Member member = new Member(id,password,name); // ��� �ʵ� �޴� �����ڷ� ��ü����
				// 3. �迭�� �� ������ ã�Ƽ� ���ο� ȸ��[��ü] �ֱ�
				int i = 0 ; // �ݺ�Ƚ�� [ �ε���üũ ]
				for( Member temp : Day08_5.members ) {
					if( temp == null ) { // ������̸�
						Day08_5.members[i] = member; // �� �ε����� ���ο� ȸ�� ����
						return true; // ȸ������ �޼ҵ� ���� ~~~~~~~ [ ��ȯ : true ]
					}
					i++; // i����
				}
				
				return false; // ȸ������ �޼ҵ� ����~~~~ [��ȯ false]
				// 4. ���� ������ true ��ȯ ���н� false ��ȯ
			}
			
			// 2. �α��� �޼ҵ� [ �μ�x��ȯo : ]
						// �α��μ����� ������ ���̵��ȯ / ���н� NULL ��ȯ
				String �α���() {
					System.out.println(" ----- �α��� ������ ------");
					System.out.println("���̵� : "); String id = Day08_5.scanner.next();
					System.out.println("��й�ȣ : "); String password = Day08_5.scanner.next();
					// 2. �迭�� ��ü id�� password�� �Է��� ���� �����ϸ�
					for (Day08.Member temp : Day08_5.members) {
						if(temp!= null && temp.id.equals(id) && temp.password.equals(password)) {
							return temp.id; // ������ id ��ȯ
						}
					}
					// 3. �α��� ������ �Է��� id��ȯ // ���н� null
					return null;
					
				}
					// 3. ���̵�ã�� �޼ҵ� [ �μ�x��ȯx]
				void ���̵�ã��() {
					System.out.println(" ----- ���̵�ã�� ������ ------");
					System.out.println("�̸� �Է� : ");String name = Day08_5.scanner.next();
					System.out.println("��й�ȣ �Է� : ");String password = Day08_5.scanner.next();
					
					for (Day08.Member temp : Day08_5.members ) {
						if(temp != null && temp.name.equals(name) && temp.password.equals(password) ) {
							System.out.println(" �˸�)) ���̵� ã�� ����");
							System.out.println(" ȸ�� ID : " +temp.id);
							return;
						} 
							
							
					}
					System.out.println("ã����� �̤�");
				}
					// 4. ��й�ã�� �޼ҵ� [ �μ�x��ȯx ]
				void ��й�ȣã��() {
					System.out.println(" ----- ��й�ȣã�� ������ ------");
					System.out.println("���̵� �Է� : ");String id = Day08_5.scanner.next();
					System.out.println("�̸� �Է� : ");String name = Day08_5.scanner.next();
					
					for (Day08.Member temp : Day08_5.members) {
						
						if( temp != null && temp.id.equals(id)&& temp.name.equals(name) ) {
							System.out.println(" �˸�)) ��й�ȣ ã�� ����");
							System.out.println(" ȸ�� ��й�ȣ : " +temp.password);
							return;
						}
						
					}
					System.out.println("ã����� �̤�");
				}
				
			
			
			
			
			
			
	
}
