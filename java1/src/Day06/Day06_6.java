package Day06;

import java.util.Scanner;

public class Day06_6 { //  c s
	// ��ȸ���� �Խ��� [ Ŭ���� ���� ]
	
	// 0. �Խù� ���� => Ŭ��������
		// �ʵ� : ����, ���� ,�ۼ���, ��й�ȣ
		// ������ : �����������
	
	// 1. ùȭ�� [ ��� �Խù�(��ȣ,�ۼ���,����) ��� ]
	// 2. �޴� [ 1. �۾��� 2.�ۺ��� ]
		// 1.�۾��� [ ����,����,�ۼ���,��й�ȣ�� => 4������ -> ��üȭ ]
		// 2. �ۺ��� [ �ش� �۹�ȣ��  �Է¹޾� �ش�� ��������(��ȣ,�ۼ���,����,����) ǥ�� ]
			// �۹�ȣ�� �迭�� ����Ǵ� ���� [ �ε��� ]
			// �ۺ��� �޴�
	// 3. �ۺ���޴� [ 1 . ��Ϻ��� 2.���� 3.���� ]
		// 1. ������ : �ۼ��ڿ� ��й�ȣ �Է¹޾� �����ϸ� ����
		// 2. ������ : �ۼ��ڿ� ��й�ȣ �Է¹޾� �����ϸ� ����� ���븸 ����
	
	public static void main(String[] args) { // m s
		
		// �غ�  [ ��� {} �ȿ��� ���Ǵ� ���� ���� ]
		Scanner scanner = new Scanner(System.in);
		Board[] boardlist = new Board[100];
			// Board ��ü�� 100�� �����Ҽ��ִ� 1���� �迭 ����
		
		// ���α׷� ����
		while(true) { // ���α׷����� ���ѷ��� ��������x
			
			System.out.println("----------Ŀ�´�Ƽ-------------");
			///////////////���Խù���ȸ////////////////////////////////////////////////////
			System.out.println("��ȣ\t�ۼ���\t����");
			// �迭�� ��� ��ü(�Խù�) ��� �ݺ���
			int index=0 ; // �ε������� =>�迭����ü��üũ
			for( Board board : boardlist ) {
				if( board != null ) {
					// ���� �ش� board ��ü�� ���빰�� ������ ���
					System.out.printf("%d\t%s\t%s \n",index , board.writer, board.title );
				}
				index++;
			}
			/////////////////////////////////////////////////////////////////////////////
			
			System.out.println("1.�۾��� 2.�ۺ��� ");
			int ch  = scanner.nextInt();
			
			if( ch ==1 ) { // 1 �۾���
				//1 .4�������� �Է¹޴´�
				
				System.out.println("-----------�� ���� ������ -------------------------------");
				System.out.println(" title : "); String title = scanner.next();
				System.out.println(" content : "); String content = scanner.next();
				System.out.println(" writer : "); String writer = scanner.next();
				System.out.println(" password : "); String password = scanner.next();
				// 2. 4�� ������ ��üȭ [��ä�� ���� 4�������� ��ü�� �ʵ忡 ����] 
				Board board = new Board( title, content, writer, password );
							// 4�� �ʵ带 ���� ������ ���
				// 3. �迭�� ������� ã�Ƽ� ������� ��ü ����
				int i = 0;
				for( Board temp : boardlist ) {
					if( temp == null ) {  // ����� ã������
						boardlist[i] = board; // �ش� �ε����� ���Τÿü ����
						break; // �ѹ� ���������� �ݺ�������
					}
					i++;
				}
			///////////////////////////////////////////////////////////////////////////				
			} //�۾��� end
			////////////////////////////////////////////////////////////////////////////////
			else if( ch ==2 ) {
				
				System.out.println("�� ��ȣ���Է��ϼ��� : "); int bno = scanner.nextInt();
				System.out.println("------------�Խù� ��������------------------------------------");
				System.out.printf("�ۼ��� : %s ���� : %s \n",boardlist[bno].writer,boardlist[bno].title);
				System.out.printf("���� :  %s \n", boardlist[bno].content);
				System.out.println("-------------------------------------------");
				System.out.print("1. ��Ϻ���(�ڷΰ���) 2.�ۻ��� 3.�ۼ��� ���� :");
				int ch2 = scanner.nextInt();
				if ( ch2 == 1 ) {}
				else if ( ch2 == 2 ) {
////////////////////////////////////////////�ۻ���//////////////////////////////////////////////////
					System.out.println(" �˸�)) �� �Խù� ��й�ȣ : "); 
					String password = scanner.next();
					// �ݺ��� x   ������ �ε��� ��ġ�� �Է¹޾ұ� ������
					if ( boardlist[bno].password.equals(password)) { // �Խù���ä�� ��й�ȣ == �Է��� ��й�ȣ
						System.out.println(" �˸�)) �������� ");
						boardlist[bno] = null;
						
						for( int i = bno ; i< boardlist.length ; i++ ) {
							// * �˻��� �Խù��� �ε������� �������ε������� 1������ 
							
							if( i == boardlist.length-1) boardlist[ boardlist.length-1 ] = null;
							// i�� �������ε��� �� ������ �������ε������� null ����
							else boardlist[i] = boardlist[i+1];// ������ �Խù� ���� �Խù�
							// ������ �ε����� �ƴϸ� �ε��� ���� 
							
								// *  	���࿡ 2�� �ε��� ������ 
								// 		2�ε��� = 3�ε��� 
								//	  	3�ε��� = 4�ε��� 
								//		4�ε��� = 5�ε��� 
								//      ~~~~~~~~~~~
								//		98�ε��� = 99�ε��� [ 0��~99�� -> 100�� �ε��� ]
								//		99�ε��� = null [ 99�� �ε��� : �������ε��� ] 
						
						}
						
					}else {
						System.out.println(" �˸�)) ��й�ȣ�� �ٸ��ϴ� [ �������� ]");
					}
					// �����Ŀ� ������ �ε��� �ڷ� ��ĭ�� ������ �̵�
						// ��?? ���࿡ �ش��ڵ尡 ������� �迭�� ���̻��� ����߻�
					
				
				}//�ۻ���
///////////////////////////////////////////////////////////////////////////////////////////////////
				else if ( ch2 == 3 ) {
					// ������ : �ۼ��ڿ� ��й�ȣ �Է¹޾� �����ϸ� ����� ���븸 ���� 
///////////////////////////////////////////////////�ۼ���//////////////////////////////////////////	
					// 1.��й�ȣ�Է¹ޱ�
					System.out.println(" �˸�)) �� �Խù� ��й�ȣ : ");  String password = scanner.next();
					// ���Խù��� �ε��� ��ü�� ��й�ȣ�� �Է¹��� ��й�ȣ�� �����ϸ�
					if (boardlist[bno].password.equals(password)) {
						// �ش� �Խù��� ����� ������ ���� �Է¹޾� �� �Խù���ü�� ����� ���뿡 ����
						System.out.println(" ������ ���� : "); boardlist[bno].title = scanner.next();
						System.out.println(" ������ ���� : "); boardlist[bno].content = scanner.next();
						System.out.println("���� ���� �Ϸ�");
					}
					else {
						System.out.println("��й�ȣ�� �ٸ��ϴ� !! ���� ����");
					}
					
				}
				else {System.out.println("�˼����� ��ȣ�Դϴ�.");}
				
			}
			else {System.out.println(" �˼����� ��ȣ�Դϴ�.");}
			
			
		} // ���α׷� while
		
		

	} // m e

} // c e
