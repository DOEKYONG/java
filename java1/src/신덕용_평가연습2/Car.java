package Team_�Ŵ���;

public class Car   {
	// �ʵ� 
	private int carNum;
	private int payMoney;
	private String carTimeday;
	private int parking;
	private int carTimehour;
	private int carTimemin;
	
	
	// ������
	
	// �������
	public Car() {
		// TODO Auto-generated constructor stub
	}

	
	public Car(int carNum, String carTimeday, int parking) {
		super();
		this.carNum = carNum;
		this.carTimeday = carTimeday;
		this.parking = parking;
	}
	
	// Ǯ������
	public Car(int carNum, int payMoney, String carTimeday, int parking, int carTimehour, int carTimemin) {
		super();
		this.carNum = carNum;
		this.payMoney = payMoney;
		this.carTimeday = carTimeday;
		this.parking = parking;
		this.carTimehour = carTimehour;
		this.carTimemin = carTimemin;
	}
	
	

	// �Է� ������
	public Car(int carNum,  int parking) {
		
		this.carNum = carNum;
		
		this.parking = parking;
	}
	
	

	// ��� ������
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