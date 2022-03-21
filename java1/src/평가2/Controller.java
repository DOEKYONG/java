package 평가2;

import java.util.ArrayList;

public class Controller {
	
	 static ArrayList<Parking> carlist = new ArrayList<>();
	
	// 입차메소드
static	void incar(String Date, String carNum, String carIntime, String carOuttime,String payMoney) {
	Parking savecar = new Parking(Date,carNum,carIntime,carOuttime,payMoney);
	carlist.add(savecar);
}
	
	// 출차메소드
static void outcar() {}

	// 목록메소드
static void list() {}
	
	// 금액메소드 
static void paymoney() {}

}
