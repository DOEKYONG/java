package ���α׷��־��Ȱ��_�Ŵ���_2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Controller {
	static ArrayList<Parking> carlist = new ArrayList<>();
	static String payMoney;

	// �����޼ҵ�
	public static void incar(String carNum) {
		
		Date date = new Date();
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
		String dates = sdf.format(date);
		
		Date carintime = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm");
		String carintimes = sdf1.format(carintime);
		Parking savecar = new Parking(dates,carNum,carintimes,"������","������");
		carlist.add(savecar);
	}
	
	
	
	
	// �����޼ҵ�
	public static void carout(String carNum) {
		
		for(int i =0 ; i<carlist.size();i++) {
			// �����ð�
			Date carintime = new Date();
			SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm");
			String carintimes = sdf1.format(carintime);
			
			//�����ð�
			Date carouttime = new Date();
			SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm");
			String carouttimes = sdf1.format(carouttime);
			
			String[] intime = carintimes.split(":");
			String[] outtime = carintimes.split(":");
			
			int intime_h = Integer.parseInt(intime[0]);
			int intime_m = Integer.parseInt(intime[1]);
			
			int intime_all = (intime_h*60)+intime_m;
			
			
			int outtime_h = Integer.parseInt(outtime[0]);
			int outtime_m = Integer.parseInt(outtime[1]);
			int outtime_all = (outtime_h*60)+outtime_m;
			
			int total_time = outtime_all-intime_all;
			
			int invalue = (total_time -30) / 20 *1000;
			payMoney = Integer.toString(invalue);
			
			
			
			
			if(carlist.get(i).getCarNum().equals(carNum)) {
				carlist.get(i).setCarOuttime(carouttimes);
				System.out.println("��������");
				if(total_time<30) {
					carlist.get(i).setPayMoney("0");
				}
				else {
					carlist.get(i).setPayMoney(payMoney);
				}
				
			}
			
			
			
		}
		
		
		
		
		
		
	}
}
