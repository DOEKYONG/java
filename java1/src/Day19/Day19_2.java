package Day19;

import java.util.HashSet;
import java.util.Scanner;

public class Day19_2 {
	
	// set �ߺ��Ұ���
		// ��ü�� ��� �ʵ尡 �����ϸ� �ߺ��Ұ���
		

	public static void main(String[] args) {
		
		// �ζ� ���α׷�
			// set �÷���
		Scanner scanner = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<>();
		
		int count = 0 ; 
		while (true) {
			System.out.println(" 1~45 ���� ����(�ߺ��Ұ�) : ");
			int num = scanner.nextInt();
			if( num < 1 || num > 45 ) {
				System.out.println(" �����Ҽ� ���� ��ȣ !! ");
			} else {
				set.add(num);
				System.out.println(" Ȯ�� : " + set );
				
			}
			if ( set.size() == 6) break;
			
			
		}
		
		
		
		
		
	}
	
	
}
