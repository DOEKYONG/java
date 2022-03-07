package Day05;

import java.util.Scanner;

public class Day05_2 {
	
	// 회원제 방문록 프로그램
		// 1. 초기메뉴 [ 1.회원가입 2.로그인 ]
			// 1.회원가입 [아이디, 비밀번호 , 이름]
			// 2.로그인 [ 아이디, 비밀번호 동일하면 로그인처리 ]
		// 2. 로그인시 메뉴 [ 1.방문록쓰기 2.로그아웃 ]
			// 1. 방문록쓰기 [ 제목, 내용, 작성자(로그인된아이디) ]
			// 2. 로그아웃 [ 초기메뉴로 돌아가기 ]
	public static void main(String[] args) {
		
		// 준비
		Scanner scanner = new Scanner(System.in); // 입력객체
		// 회원 100명[id,pw,name] 저장하는 배열
		String[][] memberlist = new String[100][3]; // 100행 3열 = > 회원당 1행 [1열=id][2열=pw][3열=name]
		// 방문록 100개 [ title, contents, writer ] 저장하는 배열
		String[][] boardlist = new String[100][3]; // 게시물당 1행

		while(true) { // 무한루프 종료조건 없음
			
			System.out.println("-------------------------------");
			System.out.println("----------회원제 방문록-----------");
			System.out.println("-------------------------------");
			System.out.println("1.회원가입 2.로그인 선택 : "); int ch = scanner.nextInt();
			if(ch == 1) {
				System.out.println("-------회원가입 페이지 --------");
				System.out.println(" MEMBER ID : "); String id = scanner.next();
				System.out.println(" MEMBER PASSWORD : "); String password =scanner.next();
				System.out.println(" MEMBER NAME : "); String name = scanner.next();
				// String 3개 변수를 입력받아 memberlist 2차원 배열에 저장
					// 1. 빈 공간 [ 숫자 =0, 객체(문자열) = null  ]을 찾아서 저장 [ 만약에 빈공간이 없으면 회원 100명 초과 ]
					// 2. 아이디 중복체크
				
				boolean idcheck = true;
				// 아이디 중복체크 [ 기존 회원의 아이디와 동일하면 회원가입불가 ]
				for (int i =0; i<memberlist.length ; i ++) {
					
					if(memberlist[i][0] != null && memberlist[i][0].equals(id) ) {
						// ==null  : 회원 없다  !=null 회원있다
						System.out.println(" 알림]] 동일한아이디가 존재합니다");
						idcheck = false;
						break;
					}	
				}
				// 저장부분
				if (idcheck) {
				for( int i = 0; i < memberlist.length ; i++) {
					if(memberlist[i][0] == null) { // i번째행에 id가없으면 = 빈공간
						memberlist[i][0] = id;
						memberlist[i][1] = password;
						memberlist[i][2] = name;
						// i번째 각 열에 데이터저장
						System.out.println(" 알림 ]] 회원가입이 되었습니다.");
						break; // 저장했으면 끝 [ 1번만 저장 ]
					}
				}		
			}
			}// if end
			else if (ch == 2)  {
				
				System.out.println("-------로그인 페이지 --------");
				System.out.println(" MEMBER ID : "); String id = scanner.next();
				System.out.println(" MEMBER PASSWORD : "); String password =scanner.next();
				
				boolean logincheck = false;
				// 배열내 데이터가 입력받은 id와 password가 동일하면 로그인처리
				for ( int i= 0; i<memberlist.length; i++) {
					
					if( memberlist[i][0] !=null && memberlist[i][0].equals( id ) &&
							memberlist[i][1].equals(password) ) {
						// i번째 행에 아이디와 패스워드가 입력받은값과 equals 같으면
							// null 은 객체가 아니기 때문에 equals 가 불가능 => == 가능
						System.out.println(" 알림]] 로그인 성공");
						
						logincheck = true ; // 로그인성공 값
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
						while(true) {
							System.out.println("-------------------------");
							System.out.println("----------방문록-----------");
							System.out.println("번호\t작성자\t제목\t내용");
								//모든 방문록 출력
								for( int j =0; j<boardlist.length ; j++) {
									if( boardlist[j][0] != null) { // 게시물이 없는 인덱스는 제외
									System.out.printf("%d\t%s\t%s\t%s \n",j,boardlist[j][0],boardlist[j][0],boardlist[j][1]);
									}
								}
							
							System.out.println(" 1.방문록남기기 2.로그아웃 선택 : "); int ch2 =scanner.nextInt();
							
							if( ch2 == 1) {
								System.out.println("------------글쓰기-------------");
								System.out.println(" title : ");  String title = scanner.next(); // 제목
								System.out.println(" content : ");  String content = scanner.next(); // 내용
								// 배열내 공백찾아서 저장
								for(int j = 0; j<boardlist.length ; j++) {
									if (boardlist[j][0] == null) { // 배열내 j번째 인덱스 게시물이 공백이면저장
										boardlist[j][0] = title;
										boardlist[j][1] = content;
										boardlist[j][2] = id; // 로그인시 사용된 id를 대입
										System.out.println(" 알림}} 방문록이 작성되었습니다.");
										break;
									}
								}
								
								
							} 	// if ch2 ==1 end
							else if( ch2 == 2) {
								System.out.println(" 알림]] 로그아웃"); 
								break;
								} // if ch2 ==2 end
							else {System.err.println("알림 ]] 알수없는 번호입니다.!!"); }
						} // while2 end
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////							
					} // if end = login end
				} //for end
				
				if(logincheck == false) {
					System.out.println(" 알림}} 회원정보가 없거나 다릅니다.");
				}
				
				
				
			} //ch ==2 if end
			else {System.err.println("알림 ]] 알수없는 번호입니다.!!"); }
			
			
		} // while end = 초기메뉴 end
		

	} //  m e

} // c  e
