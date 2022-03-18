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
			 System.out.println("메인 메뉴))");
			 //주차공간이 보임
			 for(int i = 0; i < tower.length; i++) {
				 System.out.print(tower[i]);
				 if(i%4==2) {
					 System.out.println();
				 }
			 }
			 //메뉴
			 System.out.println();
			 System.out.println("1)입차 2)출차 3)매출확인 4)차량확인");
			 String ch = scanner.next();
			
			
			 
			 if(ch.equals("1") || ch.equals("입차")) {
				 int 차량번호 = scanner.nextInt();
				 int 주차자리 = 0;
				
				 
				 for(int i = 0 ; i < tower.length; i++) {
					 
					 컨트롤러.입차(차량번호, 주차자리);
					 if(tower[i].equals("[    ]")) {
						 
						 tower[i] = "["+컨트롤러.차리스트.get(i)+"]";
						 주차자리 = i;
						 break;
					 }
					
				 }
				 //입차메뉴
				// car.입차(차량번호,주차자리);
			 }
			 else if(ch.equals("2") || ch.equals("출차")) {
				 //출차메뉴
				// car.출차();
			 }
			 else if(ch.equals("3") || ch.equals("매출확인")) {
				 //출차메뉴
				// car.금액();
			 }
			 else if(ch.equals("4") || ch.equals("차량 확인")) {
				 //출차메뉴
				// car.목록();
			 }
			 else {
				 
			 }
		 }
	}
}