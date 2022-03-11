package Day08;



public class Member {

	// 1.필드
	String id;		// 아이디 
	String password;// 비밀번호
	String name;	// 이름
	// 2. 생성자
		// 1. 빈생성자[기본생성자]
			public Member () {}
		// 2. 모든생성자
			public Member(String id, String password, String name) {
				this.id = id;
				this.password = password;
				this.name = name;
			}
	// 3. 메소드
			// 1. 회원가입 메소드 [ 인수x 반환o : 가입성공TRUE / 가입실패FALSE]
			public boolean 회원가입() {
				System.out.println(" ----- 회원가입 페이지 ------");
				// 1. 입력받는다 [ id pw name phone]
				System.out.println("아이디 : "); String id = Day08_5.scanner.next();
				// * 아이디 중복체크 ***********
				for (Day08.Member temp : Day08_5.members) {
					if ( temp != null && temp.id.equals(id)) {
						// 만약에 공백이 아니면서 배열내 id와 입력받은 id와 동일하면
						System.out.println("현재 사용중인 아이디입니다.");
						return false; // 함수종료 --> 아이디가 중복되었기때문에 false[가입실패]
					}
				}
				
				System.out.println("비밀번호 : "); String password = Day08_5.scanner.next();
				System.out.println("이름 : "); String name = Day08_5.scanner.next();
				
						// * scanner 객체가 다른 클래스내 static 선언되어있음.
						// * 클래스명.필드명.함수명();
						// * static 필드 메소드는 객체없이 호출가능 [ 클래스명.필드명/메소드명 ]
				// 2. 4개변수 - > 객체화 -> 1개
				Member member = new Member(id,password,name); // 모든 필드 받는 생성자로 객체생성
				// 3. 배열내 빈 공간을 찾아서 새로운 회원[객체] 넣기
				int i = 0 ; // 반복횟수 [ 인덱스체크 ]
				for( Member temp : Day08_5.members ) {
					if( temp == null ) { // 빈공간이면
						Day08_5.members[i] = member; // 빈 인덱스에 새로운 회원 대입
						return true; // 회원가입 메소드 종료 ~~~~~~~ [ 반환 : true ]
					}
					i++; // i증가
				}
				
				return false; // 회원가입 메소드 종료~~~~ [반환 false]
				// 4. 가입 성공시 true 반환 실패시 false 반환
			}
			
			// 2. 로그인 메소드 [ 인수x반환o : ]
						// 로그인성공시 성공한 아이디반환 / 실패시 NULL 반환
				String 로그인() {
					System.out.println(" ----- 로그인 페이지 ------");
					System.out.println("아이디 : "); String id = Day08_5.scanner.next();
					System.out.println("비밀번호 : "); String password = Day08_5.scanner.next();
					// 2. 배열내 객체 id와 password가 입력한 값과 동일하면
					for (Day08.Member temp : Day08_5.members) {
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
					System.out.println("이름 입력 : ");String name = Day08_5.scanner.next();
					System.out.println("비밀번호 입력 : ");String password = Day08_5.scanner.next();
					
					for (Day08.Member temp : Day08_5.members ) {
						if(temp != null && temp.name.equals(name) && temp.password.equals(password) ) {
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
					System.out.println("아이디 입력 : ");String id = Day08_5.scanner.next();
					System.out.println("이름 입력 : ");String name = Day08_5.scanner.next();
					
					for (Day08.Member temp : Day08_5.members) {
						
						if( temp != null && temp.id.equals(id)&& temp.name.equals(name) ) {
							System.out.println(" 알림)) 비밀번호 찾기 성공");
							System.out.println(" 회원 비밀번호 : " +temp.password);
							return;
						}
						
					}
					System.out.println("찾기실패 ㅜㅜ");
				}
				
			
			
			
			
			
			
	
}
