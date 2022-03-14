package Day09;

public class KumhoTire extends Tire {

	// 1. 필드
	// 2. 생성자
public KumhoTire(String location, int maxRotation) {
	super(location,maxRotation);
	// 슈퍼클래스내 생성자 [ 코드 줄이기 ]
}

	// 3. 메소드
@Override // 슈퍼 클래스내 메소드를 재정의[수정]
public boolean roll() {
accumulatedRotation++;
if (accumulatedRotation<maxRotation) {
	System.out.println(location+ " 금호타이어 수명 : " +(maxRotation-accumulatedRotation)+"회");
	return true;
}
else {
	System.out.println("*** "+location+" 금호타이어 펑크 ***");
	return false;
	}
}

}
