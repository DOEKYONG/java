package 연습;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Controller {

	static ArrayList<Parking> carlist = new ArrayList<>();
	static String payMoney;
	
	//입차메소드
public static void incar(String carNum) {
	Date date = new Date();
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
	String dates = sdf1.format(date);
	
	
	Date carIntime = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
	String carIntimes = sdf.format(carIntime);
	
	Parking savecar = new Parking(dates,carNum,carIntimes,"주차중","정산중");
	carlist.add(savecar);
	
}
	
	//출차메소드
public static void outcar(String carNum) {
	
	for(int i=0; i<carlist.size(); i++) {
		
		Date carIntime = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		String carIntimes = sdf.format(carIntime);
		
		Date carOuttime = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm");
		String carOuttimes = sdf1.format(carOuttime);
		
		String[] intime = carIntimes.split(":");
		String[] outtime = carOuttimes.split(":");
		
		int intime_h = Integer.parseInt(intime[0]);
		int intime_m = Integer.parseInt(intime[1]);
		int intime_all = (intime_h*60)+intime_m;
		
		int outtime_h = Integer.parseInt(outtime[0]);
		int outtime_m = Integer.parseInt(outtime[1]);
		int outtime_all = (outtime_h*60)+outtime_m;
		
		int total_time = outtime_all-intime_all;
		
		int invalue = (total_time -30 ) / 20 *1000;
		 payMoney = Integer.toString(invalue);
		 
		 if(total_time<30) {
				carlist.get(i).setPayMoney("0");
			}
			else {
				carlist.get(i).setPayMoney(payMoney);
			}
		
		
		
		
		if(carlist.get(i).getCarNum().equals(carNum)) {
		carlist.get(i).setCarOuttime(carOuttimes);
		System.out.println("출차성공!!!");
		
		
		
//		if(total_time<30) {
//			carlist.get(i).setPayMoney("0");
//		}
//		else {
//			carlist.get(i).setPayMoney(payMoney);
//		}
		
	
		
		
		}
		//else {System.out.println("없는번");}
		
		
	} }
	

	
}


