package Day07;



public class Member {
	// 1.�ʵ�
	int mno;		// ȸ����ȣ
	String id;		// ���̵� 
	String password;// ��й�ȣ
	String name;	// �̸�
	String phone;	// ����ó
	// 2.������ [ �����ڸ� == Ŭ������ ]
		// 1. �������[�⺻������]
		public Member () {}
		// 2. ����ʵ带 �޴»�����
		public Member(int mno, String id, String password, String name, String phone) {
			this.mno = mno; // ȸ����ȣ [ �ڵ���ȣ , �ߺ�x ]
			this.id = id; 	// ���̵� [�ߺ�x]
			this.password = password; // ��й�ȣ
			this.name = name;	//�̸�
			this.phone = phone;	//����ó
		}
		
		// ���� 
	// 3.�޼ҵ�
		// 1. ȸ������ �޼ҵ� [ �μ�x ��ȯo : ���Լ���TRUE / ���Խ���FALSE]
	boolean ȸ������() {
		System.out.println(" ----- ȸ������ ������ ------");
		// 1. �Է¹޴´� [ id pw name phone]
		System.out.println("���̵� : "); String id = Day07_5_BookApplication.scanner.next();
		// * ���̵� �ߺ�üũ ***********
		for (Member temp : Day07_5_BookApplication.members) {
			if ( temp != null && temp.id.equals(id)) {
				// ���࿡ ������ �ƴϸ鼭 �迭�� id�� �Է¹��� id�� �����ϸ�
				System.out.println("���� ������� ���̵��Դϴ�.");
				return false; // �Լ����� --> ���̵� �ߺ��Ǿ��⶧���� false[���Խ���]
			}
		}
		
		System.out.println("��й�ȣ : "); String password = Day07_5_BookApplication.scanner.next();
		System.out.println("�̸� : "); String name = Day07_5_BookApplication.scanner.next();
		System.out.println("����ó : "); String phone = Day07_5_BookApplication.scanner.next();
				// * scanner ��ü�� �ٸ� Ŭ������ static ����Ǿ�����.
				// * Ŭ������.�ʵ��.�Լ���();
				// * static �ʵ� �޼ҵ�� ��ü���� ȣ�Ⱑ�� [ Ŭ������.�ʵ��/�޼ҵ�� ]
		
		
		// * ȸ����ȣ �ڵ��ο� [ ���� �ֱٿ� ������ ȸ��[������ȸ��]�� ��ȣ + 1 ]
					int bno = 0; // ȸ����ȣ �����ϴ� ���� 
					int j = 0; // �ݺ�Ƚ�� [ �ε��� ]
					for( Member temp : Day07_5_BookApplication.members ) {
						if( temp == null ) { // null ã�� [ null ã������ null-1 �ϸ� ������ȸ�� ]
							if( j == 0 ) {   // ù��° �ε���[0���ε���]�� null => ùȸ�� => ùȸ����ȣ = 1 �ο�
								bno = 1; break; // ������ 
							}
							else { // ù��° ȸ���� �ƴϸ� 
								bno = Day07_5_BookApplication.members[ j-1 ].mno + 1 ; // null �� [ ������ȸ�� ]��ȣ�� +1
								break; // ������ 
							}
						}
						j++; // �ε��� ����
					}
		
		
		// 2. 4������ - > ��üȭ -> 1��
		Member member = new Member(bno,id,password,name,phone); // ��� �ʵ� �޴� �����ڷ� ��ü����
		// 3. �迭�� �� ������ ã�Ƽ� ���ο� ȸ��[��ü] �ֱ�
		int i = 0;
		for ( Member temp : Day07_5_BookApplication.members) {
			if(temp == null) {
				Day07_5_BookApplication.members[i] =member; // ���ε����� ���ο� ȸ������
				System.out.println("ȸ����ȣ : " + bno);
				return true; // ȸ������ �޼ҵ� ���� ~~~~~ [��ȯ : true]
			}
			i++;
		}
		return false; // ȸ������ �޼ҵ� ����~~~~ [��ȯ false]
		// 4. ���� ������ true ��ȯ ���н� false ��ȯ
	}
		

	// 2. �α��� �޼ҵ� [ �μ�x��ȯo : ]
			// �α��μ����� ������ ���̵��ȯ / ���н� NULL ��ȯ
	String �α���() {
		System.out.println(" ----- �α��� ������ ------");
		System.out.println("���̵� : "); String id = Day07_5_BookApplication.scanner.next();
		System.out.println("��й�ȣ : "); String password = Day07_5_BookApplication.scanner.next();
		// 2. �迭�� ��ü id�� password�� �Է��� ���� �����ϸ�
		for (Member temp : Day07_5_BookApplication.members) {
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
		System.out.println("�̸� �Է� : ");String name = Day07_5_BookApplication.scanner.next();
		System.out.println("��ȭ��ȣ �Է� : ");String phone = Day07_5_BookApplication.scanner.next();
		
		for (Member temp : Day07_5_BookApplication.members ) {
			if(temp != null && temp.name.equals(name) && temp.phone.equals(phone) ) {
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
		System.out.println("���̵� �Է� : ");String id = Day07_5_BookApplication.scanner.next();
		System.out.println("��ȭ��ȣ �Է� : ");String phone = Day07_5_BookApplication.scanner.next();
		
		for (Member temp : Day07_5_BookApplication.members) {
			
			if( temp != null && temp.id.equals(id)&& temp.phone.equals(phone) ) {
				System.out.println(" �˸�)) ��й�ȣ ã�� ����");
				System.out.println(" ȸ�� ��й�ȣ : " +temp.password);
				return;
			}
			
		}
		System.out.println("ã����� �̤�");
	}
	
	
		// 5. ȸ��Ż�� �޼ҵ� 
		// 6. ȸ������ �޼ҵ� 
	
}