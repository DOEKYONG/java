package 평가2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Controller {
	
	 static ArrayList<Parking> carlist = new ArrayList<>();
	 
static	 String payMoney ;

	 
	
	// 입차메소드
public static void  incar(String carNum) {
	
	Date date = new Date();
	 SimpleDateFormat sdf 
		= new SimpleDateFormat("yyyy-MM-dd");
	 String dates = sdf.format(date);
	 
	 	 Date carIntime = new Date();	 
		 SimpleDateFormat sdf0 =  
				 new SimpleDateFormat("HH:mm");
		 String carIntimes = sdf0.format(carIntime);	
	Parking savecar = new Parking(dates,carNum,carIntimes,"주차중","정산전");
	carlist.add(savecar);
}
	
	// 출차메소드
public static void outcar(String carNum) {
	// 4. 계산 [ 출차시간 - 입차시간 => (분-30)/10 *1000  ]
				// 5. (수정)찾은 객체내 출시간과 금액을 대입한다.
	
	for (int i = 0; i<carlist.size(); i++) {
		
			 Date carOuttime = new Date();
		  SimpleDateFormat sdf1 =  
				 new SimpleDateFormat("HH:mm");
		 String carOuttimes = sdf1.format(carOuttime);
		 
		 Date carIntime = new Date();	 
		 SimpleDateFormat sdf0 =  
				 new SimpleDateFormat("HH:mm");
		 String carIntimes = sdf0.format(carIntime);
		 
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
			
			// string->int 형변환 예제
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
//				출처: https://hianna.tistory.com/524 [어제 오늘 내일]
		
		
		if(carlist.get(i).getCarNum().equals(carNum)) {
			
			carlist.get(i).setCarOuttime(carOuttimes);
			System.out.println("출차성공!!");
			
			
			if(total_time < 30 ) {
				carlist.get(i).setPayMoney("0");
			}
			else {
				carlist.get(i).setPayMoney(payMoney);
			}	
			

			
			
		}
		else {System.out.println("없는번호"); }
		
		
		
	}	
	
}
}
