package ex;

import java.util.ArrayList;

public class 컨트롤러   {
	static ArrayList<Car> 차리스트 = new ArrayList<>();
	 
	// 입차 메소드
	public static void 입차(int 차량번호,  int 주차자리) {
		// 리스트에 저장
		 Car car = new Car(차량번호,주차자리);
		차리스트.add(car);
		
	
	}
	
	
	// 출차 메소드
	
	// 

}
