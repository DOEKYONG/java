package 프로그래밍언어활용_신덕용_2;

public class Parking {

	// 필드
	private String Date;
	private String carNum;
	private String carIntime;
	private String carOuttime;
	private String payMoney;
	
	public Parking() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	

	public Parking(String date, String carNum, String carIntime, String carOuttime, String payMoney) {
		super();
		Date = date;
		this.carNum = carNum;
		this.carIntime = carIntime;
		this.carOuttime = carOuttime;
		this.payMoney = payMoney;
	}





	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getCarNum() {
		return carNum;
	}

	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}

	public String getCarIntime() {
		return carIntime;
	}

	public void setCarIntime(String carIntime) {
		this.carIntime = carIntime;
	}

	public String getCarOuttime() {
		return carOuttime;
	}

	public void setCarOuttime(String carOuttime) {
		this.carOuttime = carOuttime;
	}

	public String getPayMoney() {
		return payMoney;
	}

	public void setPayMoney(String payMoney) {
		this.payMoney = payMoney;
	}
	
	
	
}
