package Day07;

public class Book {
	
	// 1. �ʵ�
		String ISBN; // ISBN [ ������ȣ = �ĺ��� ]
		String bname; // ������
		String bwriter; // �۰�
		boolean brental; // �����뿩����
		String mid; // �뿩��ID
	
	
	
	// 2. ������
		// 1. �������[�⺻������] : �޼ҵ�ȣ���
		
		public Book() {}
		// 2. Ǯ������[����ʵ�޴»�����] : �������
		
		public Book(String ISBN, String bname, String bWriter, boolean brental, String mid) {
			this.ISBN = ISBN;
			this.bname = bname;
			this.bwriter = bWriter;
			this.brental = brental;
			this.mid = mid;
		}
		
		
		
		
	
	// 3. �޼ҵ�
		// 1. �����˻�
		void �����˻�() {
			
		}
		// 2. �������
		void �������() {
			System.out.println("------------�������������------------------");
			System.out.println("ISBN\t������\t�۰�\t�뿩���ɿ���");
			for( Book temp : Day07_5_BookApplication.books) {
				if( temp != null ) { // ������ �����ϸ� 
					if(  temp.brental ) // �ش絵���� �����뿩���ΰ� true �̸� 
						System.out.println( temp.ISBN +"\t"+ temp.bname +"\t" + temp.bwriter +"\t" + "�뿩����");
					else // �ش絵���� �����뿩���ΰ� false 
						System.out.println( temp.ISBN +"\t"+ temp.bname +"\t" + temp.bwriter +"\t" + "�뿩��");
				}
			}
		}
//		// 3. �����뿩
//		void �����뿩(String loginid) {
//			System.out.println("------------�����뿩������------------------");
//			System.out.println(" ���� ISBN : "); String isbn = Day07_5_BookApplication.scanner.next();
//			for ( Book temp : Day07_5_BookApplication.books) {
//				
//				if ( temp.ISBN.equals(isbn) && temp.brental) {
//				
//					if(temp.brental) {
//						System.out.println("�ش� ���� �뿩 �մϴ�..");
//						temp.brental = false; // �뿩�����κ���
//						temp.mid = loginid;
//						return;
//					}else {
//						System.out.println("�ش絵�� �뿩�� �����Դϴ�.");
//						
//						return;
//					}
//				}
//			}
//			System.out.println("������ ���� ISBN�� �����ϴ�. �뿩�Ұ�");
//			
//		}
//		// 4. �����ݳ�
//		void �����ݳ� (String loginid) {
//			System.out.println("---------�����ݳ�������-------------");
//			�����뿩���(loginid);
//			
//		}
		// 5. �������
		void ������� () {
			System.out.println("------------�������������------------------");
			System.out.println("���� ISBN : "); String ISBN = Day07_5_BookApplication.scanner.next();
			// ���� ������ȣ �ߺ�üũ
			for ( Book temp : Day07_5_BookApplication.books) {
				if(temp != null) {
				if(  temp.ISBN.equals(ISBN)) {
				System.out.println("�̹� ��ϵ� �����ĺ���ȣ�Դϴ�.");
				return;
				}
				}
			}
			System.out.println("���� ���� : "); String bname = Day07_5_BookApplication.scanner.next();
			System.out.println("���� �۰� : "); String bwriter = Day07_5_BookApplication.scanner.next();
			
			Book book = new Book(ISBN,bname,bwriter,true,null);
			
			int i = 0 ;
			for ( Book temp : Day07_5_BookApplication.books) {
				if(temp == null) {
					Day07_5_BookApplication.books[i] = book;
					System.out.println("������ϿϷ�!!!");
					return;
				}
				i++;
			}
			
			
		}
		// 6. ��������
		void ��������() {
			
		}
}
