package Team_�Ŵ���;

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
			 System.out.println("���� �޴�))");
			 //���������� ����
			
			 for(Car temp : Controller.carlist) {
				 if(temp != null) {
					 tower[temp.getparking()] = "[" + temp.getcarNum() + "]" ;
					 
				 }
				
			 }
			 
			 for(int i = 0; i < tower.length; i++) {
				 System.out.print(tower[i]);
				 if(i%4==3){
						if(i==3) {System.out.println("1��");}
						if(i==7){System.out.println("2��");}
						if(i==11) {System.out.println("3��");}
					}
			 }
			 //�޴�
			 System.out.println();
			 System.out.println("1)���� 2)���� 3)����Ȯ�� 4)����Ȯ��");
			 String ch = scanner.next();
			
			
			 
			 if(ch.equals("1") || ch.equals("����")) {
				 int carNum = scanner.nextInt();
				 int parking = scanner.nextInt();
					
					 //��Ʈ�ѷ�.CarIn(carNum, parking);
					 if(tower[parking].equals("[    ]")) {
						 
						 Date date = new Date();
						 SimpleDateFormat sdf 
							= new SimpleDateFormat("yyyy/M/d/h/m");
						 System.out.println("CarIn�ð� : " + sdf.format(date) );
						 String sst = sdf.format(date);
						// Car sss = new Car();
						 Controller.CarIn(carNum, sst, parking);
						 tower[parking] = "["+carNum+"]";
						 
						
						 //
						 //System.out.println(��Ʈ�ѷ�.carlist.get(parking).getcarNum());
						 
						 
						// break;
					 }
					 
					 
				 
				 //CarIn�޴�
				// car.CarIn(carNum,parking);
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