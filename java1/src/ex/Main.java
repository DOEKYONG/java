package ex;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 
		 Car car = new Car();
		 
		 
		  
		 String[] tower = { "[    ]","[    ]","[    ]","[    ]",
				 			"[    ]","[    ]","[    ]","[    ]",
				 			"[    ]","[    ]","[    ]","[    ]",};
		 
		 
		 while(true) {
			 System.out.println("���� �޴�))");
			 //���������� ����
			 for(int i = 0; i < tower.length; i++) {
				 System.out.print(tower[i]);
				 if(i%4==2) {
					 System.out.println();
				 }
			 }
			 //�޴�
			 System.out.println();
			 System.out.println("1)���� 2)���� 3)����Ȯ�� 4)����Ȯ��");
			 String ch = scanner.next();
			
			
			 
			 if(ch.equals("1") || ch.equals("����")) {
				 int ������ȣ = scanner.nextInt();
				 int �����ڸ� = 0;
				
				 
				 for(int i = 0 ; i < tower.length; i++) {
					 
					 ��Ʈ�ѷ�.����(������ȣ, �����ڸ�);
					 if(tower[i].equals("[    ]")) {
						 
						 tower[i] = "["+��Ʈ�ѷ�.������Ʈ.get(i)+"]";
						 �����ڸ� = i;
						 break;
					 }
					
				 }
				 //�����޴�
				// car.����(������ȣ,�����ڸ�);
			 }
			 else if(ch.equals("2") || ch.equals("����")) {
				 //�����޴�
				// car.����();
			 }
			 else if(ch.equals("3") || ch.equals("����Ȯ��")) {
				 //�����޴�
				// car.�ݾ�();
			 }
			 else if(ch.equals("4") || ch.equals("���� Ȯ��")) {
				 //�����޴�
				// car.���();
			 }
			 else {
				 
			 }
		 }
	}
}