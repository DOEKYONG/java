package Day08;




public class Bank {

	// �ʵ�
	String ����;	//���¹�ȣ
	String ��й�ȣ; //��й�ȣ
	String �Ա�;	//�ݾ�
	String ���;	//���
	int ��ü;// ��ü
	boolean ����; // ����
	String ���; // ���
	int �ܾ� ;
	
	// ������
	public Bank() {}
	
	public Bank(int �ܾ�) {}
	
	
	public Bank(String ����, String ��й�ȣ, String �Ա�, String ���, int ��ü, boolean ����, String ��� ,int �ܾ�) {
		this.���� = ����;
		this.��й�ȣ = ��й�ȣ;
		this.�Ա� = �Ա�;
		this.��� = ���;
		this.��ü = ��ü;
		this.���� = ����;
		this.��� = ���;
		this.�ܾ� = �ܾ�;
	}



	// �޼ҵ�
	
	void ����() {
		System.out.println(" ------- ���µ�� ������ -------");
		// 1. �Է¹޾� 
		System.out.print(" ���¹�ȣ : ");	String ���� = Day08_5.scanner.next();
		System.out.print(" ��й�ȣ : ");	String ��й�ȣ = Day08_5.scanner.next();
		
		//*�ߺ�üũ
		for( Bank temp : Day08_5.banks ) {
			if(  temp !=null && temp.����.equals(����) ) {
				System.out.println(" �˸�]] ���� ������� ���� �Դϴ�. [ ��Ͻ��� ]");
				return; // ������� �޼ҵ� ���� ( ��Ͻ��� )
			}
		}
		// 2. ��üȭ [ �����뿩���� = true , �뿩ȸ��id = null ]
		Bank bank = new Bank(����,��й�ȣ,�Ա�,���,��ü,����,���,�ܾ�);
		// 3. �迭 ����[�ֱ�]
		int i = 0; // �ݺ�Ƚ�� [ �ε��� ]
		for( Bank temp : Day08_5.banks ) {
			if(temp == null ) {
				Day08_5.banks[i]=bank;
				System.out.println(" �˸�]] ���µ���� �Ǿ����ϴ�. ");
				return; // ���µ�� �޼ҵ� ���� ( ��ϼ��� )
			}
			i++; // �ε�������
		}
	}
		
	
	
	void �Ա�() {
		
		System.out.println("----------�Ա�������------------");
		System.out.println("���¹�ȣ�� �Է��ϼ��� : "); String ���� = Day08_5.scanner.next();
		System.out.println("��й�ȣ�� �Է��ϼ��� :");  String ��й�ȣ = Day08_5.scanner.next();
		int i = 0;
		for (Day08.Bank temp : Day08_5.banks) {
			if(temp!= null && temp.����.equals(����) && temp.��й�ȣ.equals(��й�ȣ)) {
				System.out.println("�Ա��� �ݾ��� �Է��ϼ���"); int �ݾ� = Day08_5.scanner.nextInt();
				Day08_5.banks[i].�ܾ� += �ݾ�;
				System.out.println("���� �ܾ��� : " + Day08_5.banks[i].�ܾ�);
				
			}
			i++;
		}

		
	}
	
	void ��� () {
		//Bank remain = new Bank(�ܾ�);
		System.out.println("----------���������------------");
		System.out.println("���¹�ȣ�� �Է��ϼ��� : "); String ���� = Day08_5.scanner.next();
		System.out.println("��й�ȣ�� �Է��ϼ��� :");  String ��й�ȣ = Day08_5.scanner.next();
		
		int i = 0;
		for (Day08.Bank temp : Day08_5.banks) {
			if(temp!= null && temp.����.equals(����) && temp.��й�ȣ.equals(��й�ȣ)) {
				
				System.out.println("����� �ݾ��� �Է��ϼ���"); int �ݾ� = Day08_5.scanner.nextInt();
				if(�ݾ�<Day08_5.banks[i].�ܾ�) {
					Day08_5.banks[i].�ܾ� -= �ݾ�;
					System.out.println("���� �ܾ��� : " + Day08_5.banks[i].�ܾ�);
				}
				else System.out.println("��ݾ��� �ܾ׺��� Ů�ϴ�.");
				return;
				
			}
			i++;
		}

		
	}
	void ��ü () {
		
	}
	void ����( ) {
		System.out.println(" ------- �����뿩 ������ -------");
		System.out.println(" ���¹�ȣ�Է� : ");	String ���� = Day08_5.scanner.next();
		
		for( Bank temp : Day08_5.banks ) {
			if( temp != null && temp.����.equals(����) ) {
				if( temp.���� ) {
					System.out.println(" �˸�]] �����û �մϴ�.");
					temp.���� = false; // ���������� ���� 
					return;
				}else {
					System.out.println(" �˸�]] �ش� ���¿� ������ �����մϴ�. . [ ����Ұ� ] ");
					return;
				}
			}
		}
		System.out.println(" �˸�]] ������ ���°� �����ϴ�. ");
	}
	void ��� () {
		System.out.println(" ------- ������� ������ -------");
		System.out.println("���¹�ȣ\t�ܾ�");
		for( Bank temp : Day08_5.banks) {
			if( temp != null ) { 		
				if(  temp.���� == true ) 
					System.out.println( temp.���� +"\t"+" " );
				else // �ش絵���� �����뿩���ΰ� false 
					System.out.println(  temp.���� +"\t"+" " );
			}
		}
	}
	
}
