package Day07;



public class Member {
	// 1.필드
	int mno;		// 회원번호
	String id;		// 아이디 
	String password;// 비밀번호
	String name;	// 이름
	String phone;	// 연락처
	// 2.생성자 [ 생성자명 == 클래스명 ]
		// 1. 빈생성자[기본생성자]
		public Member () {}
		// 2. 모든필드를 받는생성자
		public Member(int mno, String id, String password, String name, String phone) {
			this.mno = mno; // 회원번호 [ 자동번호 , 중복x ]
			this.id = id; 	// 아이디 [중복x]
			this.password = password; // 비밀번호
			this.name = name;	//이름
			this.phone = phone;	//연락처
		}
		
		// 임의 
	// 3.메소드
		// 1. 회원가입 메소드 [ 인수x 반환o : 가입성공TRUE / 가입실패FALSE]
	boolean 회원가입() {
		System.out.println(" ----- 회원가입 페이지 ------");
		// 1. 입력받는다 [ id pw name phone]
		System.out.println("아이디 : "); String id = Day07_5_BookApplication.scanner.next();
		// * 아이디 중복체크 ***********
		for (Member temp : Day07_5_BookApplication.members) {
			if ( temp != null && temp.id.equals(id)) {
				// 만약에 공백이 아니면서 배열내 id와 입력받은 id와 동일하면
				System.out.println("현재 사용중인 아이디입니다.");
				return false; // 함수종료 --> 아이디가 중복되었기때문에 false[가입실패]
			}
		}
		
		System.out.println("비밀번호 : "); String password = Day07_5_BookApplication.scanner.next();
		System.out.println("이름 : "); String name = Day07_5_BookApplication.scanner.next();
		System.out.println("연락처 : "); String phone = Day07_5_BookApplication.scanner.next();
				// * scanner 객체가 다른 클래스내 static 선언되어있음.
				// * 클래스명.필드명.함수명();
				// * static 필드 메소드는 객체없이 호출가능 [ 클래스명.필드명/메소드명 ]
		
		
		// * 회원번호 자동부여 [ 가장 최근에 가입한 회원[마지막회원]의 번호 + 1 ]
					int bno = 0; // 회원번호 저장하는 변수 
					int j = 0; // 반복횟수 [ 인덱스 ]
					for( Member temp : Day07_5_BookApplication.members ) {
						if( temp == null ) { // null 찾기 [ null 찾았을때 null-1 하면 마지막회원 ]
							if( j == 0 ) {   // 첫번째 인덱스[0번인덱스]가 null => 첫회원 => 첫회원번호 = 1 부여
								bno = 1; break; // 끝내기 
							}
							else { // 첫번째 회원이 아니면 
								bno = Day07_5_BookApplication.members[ j-1 ].mno + 1 ; // null 앞 [ 마지막회원 ]번호에 +1
								break; // 끝내기 
							}
						}
						j++; // 인덱스 증가
					}
		
		
		// 2. 4개변수 - > 객체화 -> 1개
		Member member = new Member(bno,id,password,name,phone); // 모든 필드 받는 생성자로 객체생성
		// 3. 배열내 빈 공간을 찾아서 새로운 회원[객체] 넣기
		int i = 0;
		for ( Member temp : Day07_5_BookApplication.members) {
			if(temp == null) {
				Day07_5_BookApplication.members[i] =member; // 빈인덱스에 새로운 회원대입
				System.out.println("회원번호 : " + bno);
				return true; // 회원가입 메소드 종료 ~~~~~ [반환 : true]
			}
			i++;
		}
		return false; // 회원가입 메소드 종료~~~~ [반환 false]
		// 4. 가입 성공시 true 반환 실패시 false 반환
	}
		

	// 2. 로그인 메소드 [ 인수x반환o : ]
			// 로그인성공시 성공한 아이디반환 / 실패시 NULL 반환
	String 로그인() {
		System.out.println(" ----- 로그인 페이지 ------");
		System.out.println("아이디 : "); String id = Day07_5_BookApplication.scanner.next();
		System.out.println("비밀번호 : "); String password = Day07_5_BookApplication.scanner.next();
		// 2. 배열내 객체 id와 password가 입력한 값과 동일하면
		for (Member temp : Day07_5_BookApplication.members) {
			if(temp!= null && temp.id.equals(id) && temp.password.equals(password)) {
				return temp.id; // 성공한 id 반환
			}
		}
		// 3. 로그인 성공시 입력한 id반환 // 실패시 null
		return null;
		
	}
		// 3. 아이디찾기 메소드 [ 인수x반환x]
	void 아이디찾기() {
		System.out.println(" ----- 아이디찾기 페이지 ------");
		System.out.println("이름 입력 : ");String name = Day07_5_BookApplication.scanner.next();
		System.out.println("전화번호 입력 : ");String phone = Day07_5_BookApplication.scanner.next();
		
		for (Member temp : Day07_5_BookApplication.members ) {
			if(temp != null && temp.name.equals(name) && temp.phone.equals(phone) ) {
				System.out.println(" 알림)) 아이디 찾기 성공");
				System.out.println(" 회원 ID : " +temp.id);
				return;
			} 
				
				
		}
		System.out.println("찾기실패 ㅜㅜ");
	}
		// 4. 비밀번찾기 메소드 [ 인수x반환x ]
	void 비밀번호찾기() {
		System.out.println(" ----- 비밀번호찾기 페이지 ------");
		System.out.println("아이디 입력 : ");String id = Day07_5_BookApplication.scanner.next();
		System.out.println("전화번호 입력 : ");String phone = Day07_5_BookApplication.scanner.next();
		
		for (Member temp : Day07_5_BookApplication.members) {
			
			if( temp != null && temp.id.equals(id)&& temp.phone.equals(phone) ) {
				System.out.println(" 알림)) 비밀번호 찾기 성공");
				System.out.println(" 회원 비밀번호 : " +temp.password);
				return;
			}
			
		}
		System.out.println("찾기실패 ㅜㅜ");
	}
	
	
		// 5. 회원탈퇴 메소드 
		// 6. 회원수정 메소드 
	
}