package Team_신덕용;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;



public class Main {
	
	 
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 
		 Car car = new Car();
		 
		 
		  
		 String[] tower = { "[    ]","[    ]","[    ]","[    ]",
				 			"[    ]","[    ]","[    ]","[    ]",
				 			"[    ]","[    ]","[    ]","[    ]",};
		 Controller.inCarLoad();
		
		 
		 while(true) {
			 System.out.println("메인 메뉴))");
			 //주차공간이 보임
			
			 for(Car temp : Controller.carlist) {
				 if(temp != null) {
					 tower[temp.getparking()] = "[" + temp.getcarNum() + "]" ;
					 
				 }
				
			 }
			 
			 for(int i = 0; i < tower.length; i++) {
				 System.out.print(tower[i]);
				 if(i%4==3){
						if(i==3) {System.out.println("1층");}
						if(i==7){System.out.println("2층");}
						if(i==11) {System.out.println("3층");}
					}
			 }
			 //메뉴
			 System.out.println();
			 System.out.println("1)입차 2)출차 3)매출확인 4)차량확인");
			 String ch = scanner.next();
			
			
			 
			 if(ch.equals("1") || ch.equals("입차")) {
				 int carNum = scanner.nextInt();
				 int parking = scanner.nextInt();
					
					 //컨트롤러.CarIn(carNum, parking);
					 if(tower[parking].equals("[    ]")) {
						 
						 Date date = new Date();
						 SimpleDateFormat sdf 
							= new SimpleDateFormat("yyyy/M/d/h/m");
						 System.out.println("CarIn시간 : " + sdf.format(date) );
						 String sst = sdf.format(date);
						// Car sss = new Car();
						 Controller.CarIn(carNum, sst, parking);
						 tower[parking] = "["+carNum+"]";
						 
						
						 //
						 //System.out.println(컨트롤러.carlist.get(parking).getcarNum());
						 
						 
						// break;
					 }
					 
					 
				 
				 //CarIn메뉴
				// car.CarIn(carNum,parking);
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