package ��2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Controller {
	
	 static ArrayList<Parking> carlist = new ArrayList<>();
	
//public static	 Date carIntime = new Date();
//	 SimpleDateFormat sdf0 =  
//			 new SimpleDateFormat("hh:mm");
	 
public static	 Date carIntime = new Date();	 
	static SimpleDateFormat sdf0 =  
			 new SimpleDateFormat("hh:mm");
static	String carIntimes = sdf0.format(carIntime);
	 
	 
public static	 Date carOuttime = new Date();
	 static SimpleDateFormat sdf1 =  
			 new SimpleDateFormat("hh:mm");
	 static String carOuttimes = sdf1.format(carOuttime);
	 
static	 String payMoney ;
	// public static String payMoney =null; 
	 
	
	// �����޼ҵ�
public static void  incar(String carNum) {
	
	Date date = new Date();
	 SimpleDateFormat sdf 
		= new SimpleDateFormat("yyyy-MM-dd");
	 String dates = sdf.format(date);
	 
//	 Date carIntime = new Date();	 
//	 SimpleDateFormat sdf0 =  
//			 new SimpleDateFormat("hh:mm");
//	String carIntimes = sdf0.format(carIntime);
	
	Parking savecar = new Parking(dates,carNum,carIntimes,"������","������");
	carlist.add(savecar);
	
	

}
	
	// �����޼ҵ�
public static void outcar(String carNum) {
	// 4. ��� [ �����ð� - �����ð� => (��-30)/10 *1000  ]
				// 5. (����)ã�� ��ü�� ��ð��� �ݾ��� �����Ѵ�.
	for (int i = 0; i<carlist.size(); i++) {
		if(carlist.get(i).getCarNum().equals(carNum)) {
			carlist.get(i).setCarOuttime(carOuttimes);
			String[] intime = carIntimes.split(":");
			String[] outtime = carOuttimes.split(":");
			
			int intime_h = Integer.parseInt(intime[0]);
			int intime_m = Integer.parseInt(intime[1]);
			int intime_all = (intime_h*60)+(intime_h);
			
			
			int outtime_h = Integer.parseInt(outtime[0]);
			int outtime_m = Integer.parseInt(outtime[1]);
			int outtime_all = (outtime_h*60)+(outtime_h);
			int total_time = outtime_all - intime_all;
			
			int intvalue = (total_time -30)/10*1000;
			payMoney=  Integer.toString(intvalue);
			
			if(total_time >= 30 ) {
				carlist.get(i).setPayMoney(payMoney);
			}
			else {
				carlist.get(i).setPayMoney(payMoney);
			}
			
			
			
			
			
			
//			public class IntToString {
//				public static void main(String[] args) {
//				int intValue1 = 123;
//				int intValue2 = -123;
//				String str1 = Integer.toString(intValue1);
//				String str2 = Integer.toString(intValue2);
//				System.out.println(str1);
//				System.out.println(str2);
//				}
//				}
//
//				��ó: https://hianna.tistory.com/524 [���� ���� ����]
			
			
		}
		else {System.out.println("������ ������ �ƴմϴ�.");}
	}
	
	
	
	
}


	


}
