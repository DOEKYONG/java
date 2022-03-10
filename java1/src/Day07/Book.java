package Day07;

public class Book {
	
	// 1. 필드
		String ISBN; // ISBN [ 도서번호 = 식별용 ]
		String bname; // 도서명
		String bwriter; // 작가
		boolean brental; // 도서대여여부
		String mid; // 대여인ID
	
	
	
	// 2. 생성자
		// 1. 빈생성자[기본생성자] : 메소드호출용
		
		public Book() {}
		// 2. 풀생성자[모든필드받는생성자] : 도서등록
		
		public Book(String ISBN, String bname, String bWriter, boolean brental, String mid) {
			this.ISBN = ISBN;
			this.bname = bname;
			this.bwriter = bWriter;
			this.brental = brental;
			this.mid = mid;
		}
		
		
		
		
	
	// 3. 메소드
		// 1. 도서검색
		void 도서검색() {
			
		}
		// 2. 도서목록
		void 도서목록() {
			System.out.println("------------도서목록페이지------------------");
			System.out.println("ISBN\t도서명\t작가\t대여가능여부");
			for( Book temp : Day07_5_BookApplication.books) {
				if( temp != null ) { // 도서가 존재하면 
					if(  temp.brental ) // 해당도서의 도서대여여부가 true 이면 
						System.out.println( temp.ISBN +"\t"+ temp.bname +"\t" + temp.bwriter +"\t" + "대여가능");
					else // 해당도서의 도서대여여부가 false 
						System.out.println( temp.ISBN +"\t"+ temp.bname +"\t" + temp.bwriter +"\t" + "대여중");
				}
			}
		}
//		// 3. 도서대여
//		void 도서대여(String loginid) {
//			System.out.println("------------도서대여페이지------------------");
//			System.out.println(" 도서 ISBN : "); String isbn = Day07_5_BookApplication.scanner.next();
//			for ( Book temp : Day07_5_BookApplication.books) {
//				
//				if ( temp.ISBN.equals(isbn) && temp.brental) {
//				
//					if(temp.brental) {
//						System.out.println("해당 도서 대여 합니다..");
//						temp.brental = false; // 대여중으로변경
//						temp.mid = loginid;
//						return;
//					}else {
//						System.out.println("해당도서 대여중 상태입니다.");
//						
//						return;
//					}
//				}
//			}
//			System.out.println("동일한 도서 ISBN이 없습니다. 대여불가");
//			
//		}
//		// 4. 도서반납
//		void 도서반납 (String loginid) {
//			System.out.println("---------도서반납페이지-------------");
//			도서대여목록(loginid);
//			
//		}
		// 5. 도서등록
		void 도서등록 () {
			System.out.println("------------도서등록페이지------------------");
			System.out.println("도서 ISBN : "); String ISBN = Day07_5_BookApplication.scanner.next();
			// 도서 고유번호 중복체크
			for ( Book temp : Day07_5_BookApplication.books) {
				if(temp != null) {
				if(  temp.ISBN.equals(ISBN)) {
				System.out.println("이미 등록된 고유식별번호입니다.");
				return;
				}
				}
			}
			System.out.println("도서 제목 : "); String bname = Day07_5_BookApplication.scanner.next();
			System.out.println("도서 작가 : "); String bwriter = Day07_5_BookApplication.scanner.next();
			
			Book book = new Book(ISBN,bname,bwriter,true,null);
			
			int i = 0 ;
			for ( Book temp : Day07_5_BookApplication.books) {
				if(temp == null) {
					Day07_5_BookApplication.books[i] = book;
					System.out.println("도서등록완료!!!");
					return;
				}
				i++;
			}
			
			
		}
		// 6. 도서삭제
		void 도서삭제() {
			
		}
}
