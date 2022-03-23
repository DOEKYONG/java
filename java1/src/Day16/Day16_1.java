package Day16;

public class Day16_1 {

	public static void main(String[] args) {
		
		// 제네릭
		
		// p.656 비제네릭 예1)
		
		// 1. Box 객체 생성
		Box box = new Box();
		// 2. 객체내 메소드 호출 [ 인수 : String ] : Object 가능
		box.set("홍길동");
		// 3. 객체내 메소드 호출
		String name = (String)box.get();
		
		// 4. 
		box.set(new Apple() );
		Apple apple = (Apple)box.get();

	}

}
