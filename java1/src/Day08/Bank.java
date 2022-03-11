package Day08;




public class Bank {

	// 필드
	String 계좌;	//계좌번호
	String 비밀번호; //비밀번호
	String 입금;	//금액
	String 출금;	//출금
	int 이체;// 이체
	boolean 대출; // 대출
	String 목록; // 목록
	int 잔액 ;
	
	// 생성자
	public Bank() {}
	
	public Bank(int 잔액) {}
	
	
	public Bank(String 계좌, String 비밀번호, String 입금, String 출금, int 이체, boolean 대출, String 목록 ,int 잔액) {
		this.계좌 = 계좌;
		this.비밀번호 = 비밀번호;
		this.입금 = 입금;
		this.출금 = 출금;
		this.이체 = 이체;
		this.대출 = 대출;
		this.목록 = 목록;
		this.잔액 = 잔액;
	}



	// 메소드
	
	void 계좌() {
		System.out.println(" ------- 계좌등록 페이지 -------");
		// 1. 입력받아 
		System.out.print(" 계좌번호 : ");	String 계좌 = Day08_5.scanner.next();
		System.out.print(" 비밀번호 : ");	String 비밀번호 = Day08_5.scanner.next();
		
		//*중복체크
		for( Bank temp : Day08_5.banks ) {
			if(  temp !=null && temp.계좌.equals(계좌) ) {
				System.out.println(" 알림]] 현재 사용중인 계좌 입니다. [ 등록실패 ]");
				return; // 도서등록 메소드 종료 ( 등록실패 )
			}
		}
		// 2. 객체화 [ 도서대여여부 = true , 대여회원id = null ]
		Bank bank = new Bank(계좌,비밀번호,입금,출금,이체,대출,목록,잔액);
		// 3. 배열 대입[넣기]
		int i = 0; // 반복횟수 [ 인덱스 ]
		for( Bank temp : Day08_5.banks ) {
			if(temp == null ) {
				Day08_5.banks[i]=bank;
				System.out.println(" 알림]] 계좌등록이 되었습니다. ");
				return; // 계좌등록 메소드 종료 ( 등록성공 )
			}
			i++; // 인덱스증가
		}
	}
		
	
	
	void 입금() {
		
		System.out.println("----------입금페이지------------");
		System.out.println("계좌번호를 입력하세요 : "); String 계좌 = Day08_5.scanner.next();
		System.out.println("비밀번호를 입력하세요 :");  String 비밀번호 = Day08_5.scanner.next();
		int i = 0;
		for (Day08.Bank temp : Day08_5.banks) {
			if(temp!= null && temp.계좌.equals(계좌) && temp.비밀번호.equals(비밀번호)) {
				System.out.println("입금할 금액을 입력하세요"); int 금액 = Day08_5.scanner.nextInt();
				Day08_5.banks[i].잔액 += 금액;
				System.out.println("현재 잔액은 : " + Day08_5.banks[i].잔액);
				
			}
			i++;
		}

		
	}
	
	void 출금 () {
		//Bank remain = new Bank(잔액);
		System.out.println("----------출금페이지------------");
		System.out.println("계좌번호를 입력하세요 : "); String 계좌 = Day08_5.scanner.next();
		System.out.println("비밀번호를 입력하세요 :");  String 비밀번호 = Day08_5.scanner.next();
		
		int i = 0;
		for (Day08.Bank temp : Day08_5.banks) {
			if(temp!= null && temp.계좌.equals(계좌) && temp.비밀번호.equals(비밀번호)) {
				
				System.out.println("출금할 금액을 입력하세요"); int 금액 = Day08_5.scanner.nextInt();
				if(금액<Day08_5.banks[i].잔액) {
					Day08_5.banks[i].잔액 -= 금액;
					System.out.println("현재 잔액은 : " + Day08_5.banks[i].잔액);
				}
				else System.out.println("출금액이 잔액보다 큽니다.");
				return;
				
			}
			i++;
		}

		
	}
	void 이체 () {
		
	}
	void 대출( ) {
		System.out.println(" ------- 도서대여 페이지 -------");
		System.out.println(" 계좌번호입력 : ");	String 계좌 = Day08_5.scanner.next();
		
		for( Bank temp : Day08_5.banks ) {
			if( temp != null && temp.계좌.equals(계좌) ) {
				if( temp.대출 ) {
					System.out.println(" 알림]] 대출신청 합니다.");
					temp.대출 = false; // 대출중으로 변경 
					return;
				}else {
					System.out.println(" 알림]] 해당 계좌에 대출이 존재합니다. . [ 대출불가 ] ");
					return;
				}
			}
		}
		System.out.println(" 알림]] 동일한 계좌가 없습니다. ");
	}
	void 목록 () {
		System.out.println(" ------- 계저목록 페이지 -------");
		System.out.println("계좌번호\t잔액");
		for( Bank temp : Day08_5.banks) {
			if( temp != null ) { 		
				if(  temp.대출 == true ) 
					System.out.println( temp.계좌 +"\t"+" " );
				else // 해당도서의 도서대여여부가 false 
					System.out.println(  temp.계좌 +"\t"+" " );
			}
		}
	}
	
}
