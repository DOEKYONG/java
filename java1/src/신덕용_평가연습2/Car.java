package Team_신덕용;

public class Car   {
	// 필드 
	private int carNum;
	private int payMoney;
	private String carTimeday;
	private int parking;
	private int carTimehour;
	private int carTimemin;
	
	
	// 생성자
	
	// 빈생성자
	public Car() {
		// TODO Auto-generated constructor stub
	}

	
	public Car(int carNum, String carTimeday, int parking) {
		super();
		this.carNum = carNum;
		this.carTimeday = carTimeday;
		this.parking = parking;
	}
	
	// 풀생성자
	public Car(int carNum, int payMoney, String carTimeday, int parking, int carTimehour, int carTimemin) {
		super();
		this.carNum = carNum;
		this.payMoney = payMoney;
		this.carTimeday = carTimeday;
		this.parking = parking;
		this.carTimehour = carTimehour;
		this.carTimemin = carTimemin;
	}
	
	

	// 입력 생성자
	public Car(int carNum,  int parking) {
		
		this.carNum = carNum;
		
		this.parking = parking;
	}
	
	

	// 출력 생성자
	public Car(int carNum) {
		
		this.carNum = carNum;
	}
	
	

	public int getcarNum() {
		return carNum;
		
	}

	

	public  void setcarNum(int carNum) {
		this.carNum = carNum;
	}

	public int getpayMoney() {
		return payMoney;
	}

	public void setpayMoney(int payMoney) {
		this.payMoney = payMoney;
	}

	public String getcarTimeday() {
		return carTimeday;
	}

	public void setcarTimeday(String carTimeday) {
		this.carTimeday = carTimeday;
	}

	public int getparking() {
		return parking;
	}

	public void setparking(int parking) {
		this.parking = parking;
	}

	public int getcarTimehour() {
		return carTimehour;
	}

	public void setcarTimehour(int carTimehour) {
		this.carTimehour = carTimehour;
	}

	public int getcarTimemin() {
		return carTimemin;
	}

	public void setcarTimemin(int carTimemin) {
		this.carTimemin = carTimemin;
	}
}

//