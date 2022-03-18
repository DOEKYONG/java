package ex;

import java.util.ArrayList;

public class Car   {
	
	 
	
	// 필드 
	private int 차량번호;
	private int 금액;
	private String 날짜;
	private int 주차자리;
	
	// 생성자
	
	// 빈생성자
	public Car() {
		// TODO Auto-generated constructor stub
	}

	// 풀생성자
	public Car(int 차량번호, int 금액, String 날짜, int 주차자리) {
		this.차량번호 = 차량번호;
		this.금액 = 금액;
		this.날짜 = 날짜;
		this.주차자리 = 주차자리;
	}
	// 입력 생성자
	public Car(int 차량번호,  int 주차자리) {
		
		this.차량번호 = 차량번호;
		
		this.주차자리 = 주차자리;
	}
	
	// 출력 생성자
	public Car(int 차량번호) {
		
		this.차량번호 = 차량번호;
	}
	
	

	public int get차량번호() {
		return 차량번호;
	}

	

	public void set차량번호(int 차량번호) {
		this.차량번호 = 차량번호;
	}

	public int get금액() {
		return 금액;
	}

	public void set금액(int 금액) {
		this.금액 = 금액;
	}

	public String get날짜() {
		return 날짜;
	}

	public void set날짜(String 날짜) {
		this.날짜 = 날짜;
	}

	public int get주차자리() {
		return 주차자리;
	}

	public void set주차자리(int 주차자리) {
		this.주차자리 = 주차자리;
	}
	
	
	

	
	
	
	
	
	

}
