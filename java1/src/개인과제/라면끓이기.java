package ���ΰ���;

import java.util.Scanner;

public class �����̱� {

	public static void main(String[] args) {
		
	
		Scanner scanner = new Scanner(System.in); // �Է¹ޱ����� ��ĳ��
		
		
	while(true) { //���α׷� ����
		
	System.out.println("-----�����̱�------");
	System.out.println("���� ���̱����� ��⸦ �����ϼ��� : 1.���� 2.������� 3.�� "); int ch = scanner.nextInt(); //������ �Է¹ޱ� 
	
	if(ch == 1) {
		
		System.out.println(" 500ml ���� �־��ּ���  : ");int water = scanner.nextInt(); // ���� �� �Է�  
		if(water == 500) {  // ���� 500�̸� 
			outer:  // �ݺ������̸��� �޾Ƽ� break + �̸��� �Է��ϸ� �� �ݺ����� Ż���Ҽ�����
			while(true) { //while2 ������ �ݺ��� ����
			System.out.println("1. ������ ON  2. ������ OFF "); int gas = scanner.nextInt(); // ������ on off 
			if(gas == 1) { // 1�������ϸ� ������ on
				System.out.println("�������� �մϴ�.");
				for(  int i  = 1; i<6; i++) { // i 1���� 1��  
					System.out.println("���� ���̴��� " +i + "��" );
				}
				System.out.println("�� ���̱� �Ϸ� "); 
				
				while(true) { // while3 ��Ḧ�ְ� ���̴� �ݺ���
				System.out.println("���� ��Ḧ �����ϼ��� : 1. ������ �� 2.��"); int ch2 = scanner.nextInt(); // ��ἱ�� 
				if ( ch2 == 1) { // ��ἱ���� 1���� �ߴٸ� 
					for(int  i = 1; i<6; i++) {  // i 1���� 1�� 
						System.out.println("���� ���̴���  " +i + "��" );
					}
					System.out.println("�ϼ�!");
					while (true){ // while 4 ������ �������� �ݺ��� ���� 
					System.out.println("1. ������OFF 2. ������ON "); int ch3 = scanner.nextInt();
					
					if(ch3 == 1 ) {
						System.out.println("�����̱⸦ �����մϴ� ");
						break outer; // �ݺ������̸��� �޾Ƽ� break + �̸��� �Է��ϸ� �� �ݺ����� Ż���Ҽ�����
					}
					else {System.out.println("�������� ������ "); }
					} // while4 end
				}
				else {System.out.println("��Ḧ �ٽü����ϼ���");} //1���� �ٸ����� ����������
				} // while3 end
			}
			else {System.out.println("�������� ���ϴ�."); break;} // �������� ���� �ʱ�޴��� ���Ʊ����� break (while 2 	Ż��)
			} // while2 end
		}
		else if ( water != 500) { // ���� 500�� �ƴϸ� 
			if(water>500) { // ���� 500���� Ŭ��� 
			System.out.println("������ �ʹ� �����ϴ�.");
			
			
			}
			else{System.out.println("������ �ʹ� �����ϴ�.");  }  // ���� 500���� �������
		}
		
	}
	else {System.out.println("�߸��� �����Դϴ�.");} // �����ѹ�ȣ �� �ٸ�Ű �Է½� 
		
	} // while end
	
	} // me

} // ce
