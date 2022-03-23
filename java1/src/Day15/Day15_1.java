package Day15;

public class Day15_1 {
	
	// 클래스 : 객체 설계도
		// 객체 : 클래스기반으로 메모리 할당
			// 기본자료형/클래스 변수명;					[ String 이름; ] => 변수
			// 기본자료형/클래스 변수명 = new 클래스생성자();	[ String 이름 = new String("") ]  => 객체 
	// 상속 : 설계도 연장[extends] ( 모범 설계도를 이어서 새로운 설계 )
		// * 선언방식 : public class 자식클래스 extends 부모클래스 { } 
		// 부모클래스(슈퍼클래스) : 부모클래스내 멤버(필드,생성자,메소드) 를 자식클래스에게 상속(물려주기)
		// 자식클래스(서브클래스) : 부모클래스내 멤버를 사용가능
			// super vs this 
		// 자식클래스로 객체 생성시 : 부모클래스내 생성자 호출
		// Object 클래스 : 모든 클래스는 object 생성자 호출 [ 100% 객체지향 ]
		
		// ** 다형성 
			// 하나의 객체가 여러가지 타입으로 변환
			// 조건1 : 자식객체 -> 부모객체
	public static void main(String[] args) {
	
		// 1. 부모클래스로 객체 생성
		사람 p1 = new 사람("유재석");
			p1.이름 = "신동엽";
			p1.이름호출();
			
		// 2. 자식클래스로 객체 생성
		학생 p2 = new 학생("유재석");
			p2.이름 ="강호동";
			p2.이름호출();
		
			// 부모클래스내 부부모클래스에 접근
			p2.직업 = "학생";
			
		// * 다형성 객체
		직업 j1 = new 학생("유재석");
	// 부모클래스 객체 = 자식 객체 
		// 학생 p3 = new 직업(); // 불가
	// 자식클래스 객체 = 부모클래스 
		
	}
}