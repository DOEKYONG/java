package Day05;

import java.util.Scanner;

public class Day05_2 {
	
	// ȸ���� �湮�� ���α׷�
		// 1. �ʱ�޴� [ 1.ȸ������ 2.�α��� ]
			// 1.ȸ������ [���̵�, ��й�ȣ , �̸�]
			// 2.�α��� [ ���̵�, ��й�ȣ �����ϸ� �α���ó�� ]
		// 2. �α��ν� �޴� [ 1.�湮�Ͼ��� 2.�α׾ƿ� ]
			// 1. �湮�Ͼ��� [ ����, ����, �ۼ���(�α��εȾ��̵�) ]
			// 2. �α׾ƿ� [ �ʱ�޴��� ���ư��� ]
	public static void main(String[] args) {
		
		// �غ�
		Scanner scanner = new Scanner(System.in); // �Է°�ü
		// ȸ�� 100��[id,pw,name] �����ϴ� �迭
		String[][] memberlist = new String[100][3]; // 100�� 3�� = > ȸ���� 1�� [1��=id][2��=pw][3��=name]
		// �湮�� 100�� [ title, contents, writer ] �����ϴ� �迭
		String[][] boardlist = new String[100][3]; // �Խù��� 1��

		while(true) { // ���ѷ��� �������� ����
			
			System.out.println("-------------------------------");
			System.out.println("----------ȸ���� �湮��-----------");
			System.out.println("-------------------------------");
			System.out.println("1.ȸ������ 2.�α��� ���� : "); int ch = scanner.nextInt();
			if(ch == 1) {
				System.out.println("-------ȸ������ ������ --------");
				System.out.println(" MEMBER ID : "); String id = scanner.next();
				System.out.println(" MEMBER PASSWORD : "); String password =scanner.next();
				System.out.println(" MEMBER NAME : "); String name = scanner.next();
				// String 3�� ������ �Է¹޾� memberlist 2���� �迭�� ����
					// 1. �� ���� [ ���� =0, ��ü(���ڿ�) = null  ]�� ã�Ƽ� ���� [ ���࿡ ������� ������ ȸ�� 100�� �ʰ� ]
					// 2. ���̵� �ߺ�üũ
				
				boolean idcheck = true;
				// ���̵� �ߺ�üũ [ ���� ȸ���� ���̵�� �����ϸ� ȸ�����ԺҰ� ]
				for (int i =0; i<memberlist.length ; i ++) {
					
					if(memberlist[i][0] != null && memberlist[i][0].equals(id) ) {
						// ==null  : ȸ�� ����  !=null ȸ���ִ�
						System.out.println(" �˸�]] �����Ѿ��̵� �����մϴ�");
						idcheck = false;
						break;
					}	
				}
				// ����κ�
				if (idcheck) {
				for( int i = 0; i < memberlist.length ; i++) {
					if(memberlist[i][0] == null) { // i��°�࿡ id�������� = �����
						memberlist[i][0] = id;
						memberlist[i][1] = password;
						memberlist[i][2] = name;
						// i��° �� ���� ����������
						System.out.println(" �˸� ]] ȸ�������� �Ǿ����ϴ�.");
						break; // ���������� �� [ 1���� ���� ]
					}
				}		
			}
			}// if end
			else if (ch == 2)  {
				
				System.out.println("-------�α��� ������ --------");
				System.out.println(" MEMBER ID : "); String id = scanner.next();
				System.out.println(" MEMBER PASSWORD : "); String password =scanner.next();
				
				boolean logincheck = false;
				// �迭�� �����Ͱ� �Է¹��� id�� password�� �����ϸ� �α���ó��
				for ( int i= 0; i<memberlist.length; i++) {
					
					if( memberlist[i][0] !=null && memberlist[i][0].equals( id ) &&
							memberlist[i][1].equals(password) ) {
						// i��° �࿡ ���̵�� �н����尡 �Է¹������� equals ������
							// null �� ��ü�� �ƴϱ� ������ equals �� �Ұ��� => == ����
						System.out.println(" �˸�]] �α��� ����");
						
						logincheck = true ; // �α��μ��� ��
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
						while(true) {
							System.out.println("-------------------------");
							System.out.println("----------�湮��-----------");
							System.out.println("��ȣ\t�ۼ���\t����\t����");
								//��� �湮�� ���
								for( int j =0; j<boardlist.length ; j++) {
									if( boardlist[j][0] != null) { // �Խù��� ���� �ε����� ����
									System.out.printf("%d\t%s\t%s\t%s \n",j,boardlist[j][0],boardlist[j][0],boardlist[j][1]);
									}
								}
							
							System.out.println(" 1.�湮�ϳ���� 2.�α׾ƿ� ���� : "); int ch2 =scanner.nextInt();
							
							if( ch2 == 1) {
								System.out.println("------------�۾���-------------");
								System.out.println(" title : ");  String title = scanner.next(); // ����
								System.out.println(" content : ");  String content = scanner.next(); // ����
								// �迭�� ����ã�Ƽ� ����
								for(int j = 0; j<boardlist.length ; j++) {
									if (boardlist[j][0] == null) { // �迭�� j��° �ε��� �Խù��� �����̸�����
										boardlist[j][0] = title;
										boardlist[j][1] = content;
										boardlist[j][2] = id; // �α��ν� ���� id�� ����
										System.out.println(" �˸�}} �湮���� �ۼ��Ǿ����ϴ�.");
										break;
									}
								}
								
								
							} 	// if ch2 ==1 end
							else if( ch2 == 2) {
								System.out.println(" �˸�]] �α׾ƿ�"); 
								break;
								} // if ch2 ==2 end
							else {System.err.println("�˸� ]] �˼����� ��ȣ�Դϴ�.!!"); }
						} // while2 end
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////							
					} // if end = login end
				} //for end
				
				if(logincheck == false) {
					System.out.println(" �˸�}} ȸ�������� ���ų� �ٸ��ϴ�.");
				}
				
				
				
			} //ch ==2 if end
			else {System.err.println("�˸� ]] �˼����� ��ȣ�Դϴ�.!!"); }
			
			
		} // while end = �ʱ�޴� end
		

	} //  m e

} // c  e
