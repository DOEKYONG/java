package Day07;

public class Day07_2 {

	public static void main(String[] args) {
		
		// p.223~224 : 리턴값이 없는 메소드 (void)
		
		// 1. 객체 선언 [ 빈생성자 = 기본생성자]
		Car mycar = new Car();
		// 2. 메소드 호출
		mycar.setGas(5);
		
		// 3. 메소드 호출
		if(mycar.isLeftGas() ) { // 인수 x 반환=true혹은 false
			System.out.println("출발합니다.");
			// 4. 메소드 호출 
			mycar.run();
		}
		
		// 5. 메소드 호출 
		if(mycar.isLeftGas() ) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		}
		else {
			System.out.println("gas를 주입하세요");
		}
	
		

	}

}
