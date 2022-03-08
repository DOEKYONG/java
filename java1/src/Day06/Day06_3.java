package Day06;

import java.util.Scanner;

public class Day06_3 { // c s

	public static void main(String[] args) { //  m s
		Scanner scanner = new Scanner(System.in);
		Member[] memberlist = new Member[100]; 
		// Member 클래스로 만들어진 객체(id,pw,name,phone) 100개 저장할수있는배열선언
		
		// 만약에 클래스가 없었을경우에는 => 2차원배열
		// String[][] memberlist = new Member[100][4]; 
		
		while(true) { // 프로그램실행 무한루프
			
			System.out.println("------------회원제[클래스버전]---------------");
			System.out.println("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기");
			System.out.println(" 선택 : "); int ch = scanner.nextInt();
			
			if( ch == 1) { // 회원가입
				// 1. id, password, name , phone 입력받기 ->변수4개
				System.out.println("----------회원가입페이지--------------");
				System.out.println( " 아이디 : "); String id = scanner.next();
				System.out.println( " 비밀번호 : "); String password = scanner.next();
				System.out.println( " 이름 : "); String name  = scanner.next();
				System.out.println( " 연락처 : "); String phone  = scanner.next();
				// 2. 객체 생성
				Member member = new Member();
				// 3. 입력받은 변수4개를 객체내 필드에 저장하기
				member.id = id;
				// 객체내 필드 =입력받은값
				member.password = password;
				member.name= name;
				member.phone = phone;
				
				// * 아이디 중복체크
				boolean idcheck= false;
				for( Member temp : memberlist ) {
					// * meberlist 배열내 객체들을 하나씩 temp에 대입반복
					if( temp != null && temp.id.equals(id)) {
						System.out.println(" 알림)) 사용중인아이디입니다.");
						idcheck = true;
						break;
					}
					
				}
				
				
				// 아이디가 중복이 없을경우 저장
				if (idcheck == false) {
					// 4. 여러개 객체를 저장하는 배열에 저장
					// 1. 공백 인덱스 찾기 [ 공백이 아니면 기존회원이 존재 ] 
				int i = 0; // 인덱스위치변수
				for(Member temp : memberlist) {
					// *meberlist 배열내 member 객체 하나씩 꺼내와서 temp저장 반복
					// 2. 공백에 인덱스에 객체 저장
					if(temp == null) {
						memberlist[i] = member; // 해당 인덱스에 새로 만들어진 객체 저장
						System.err.println(" 알림)) 회원가입성공!!");
						break; // for 나가기 [ 안나가면 모든 공백에 동일한 객체 저장되기때문에 ]
 					}
					i++; // 인덱스증가
				} //  for문 end
				} // if end
			} // 회원가입 if( ch == 1) end
			else if (ch ==2 ) { // 로그인
				System.out.println("-------------로그인 페이지------------");
				System.out.println(" 아이디 : "); String loginid = scanner.next();
				System.out.println(" 비밀번호 : ");	String loginpassword = scanner.next();
				
				// 2. 기존 배열 [ 회원리스트 ]  내 입력받은 값과 비교
				boolean logincheck = false;  // true : 로그인성공  false 로그인실패로 사용
				for( Member temp : memberlist) {
					// *memberlist내 0번 인덱스부터 끝 인덱까지 하나씩 temp에 대입
					if ( temp != null && temp.id.equals(loginid) && temp.password.equals(loginpassword)) {
						System.out.println(" 알림)) 로그인성공 ");
						logincheck = true;  // 로그인성공
						
					}
				} // for end
				
				// 3. 로그인 성공 유무 
				if (logincheck == false ) {
					System.out.println(" 알림)) 동일한 회원정보가 없습니다.");
				}
				
				
			} // 로그인 end
			else if (ch ==3 ) {
				System.out.println("--------------아이디찾기 페이지 ------------------------");
				System.out.println(" 이름 : "); String name =scanner.next();
				System.out.println(" 연락처 : "); String phone =scanner.next();
				boolean findcheck = false;
				// 2.배열내 동일한 이름과 연락처가 있는지 확인
				for (Member temp : memberlist) {
					
					if( temp != null && temp.name.equals(name)&& temp.phone.equals(phone) ) {
						System.out.println(" 알림)) 아이디 찾기 성공");
						System.out.println(" 회원 ID : " +temp.id);
						findcheck = true;
						break;
					}
				}
				// 4. 없으면 없다고 출력
				if (findcheck==false) {
					System.out.println("동일한 회원정보가 없습니다.");
				}
				
				
				
				
			} // 아이디찾기 else if (ch ==3 ) end
			else if (ch ==4 ) {
				System.out.println(" 아이디 : "); String id =scanner.next();
				System.out.println(" 전화번호 : "); String phone =scanner.next();
				boolean findcheck = false;
					for (Member temp : memberlist) {
					
					if( temp != null && temp.id.equals(id)&& temp.phone.equals(phone) ) {
						System.out.println(" 알림)) 비밀번호 찾기 성공");
						System.out.println(" 회원 비밀번호 : " +temp.password);
						findcheck = true;
						break;
					}
				}
				
					if (findcheck==false) {
						System.out.println("동일한 회원정보가 없습니다.");
					}
				
				
			} // 비밀번호찾기
			else {System.out.println(" 알림)) 알수없는 번호입니다.");} // 그외
		} // while end
		
		
		
		
		

	} // m e

} // c e
