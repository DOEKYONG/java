package ��2;

import java.util.ArrayList;

public class Controller {
	
	 static ArrayList<Parking> carlist = new ArrayList<>();
	
	// �����޼ҵ�
static	void incar(String Date, String carNum, String carIntime, String carOuttime,String payMoney) {
	Parking savecar = new Parking(Date,carNum,carIntime,carOuttime,payMoney);
	carlist.add(savecar);
}
	
	// �����޼ҵ�
static void outcar() {}

	// ��ϸ޼ҵ�
static void list() {}
	
	// �ݾ׸޼ҵ� 
static void paymoney() {}

}
