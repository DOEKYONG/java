package 개인과제;

import java.util.Scanner;

public class 키오스크2 {
	// 참고 1 19분 51초

	// Day01 : 입출력
			// Day02 : 변수[저장] 연산[계산]
			// Day03 : if[제어문] for[반복문]
			
			// 자판기 프로그램
				// 1. 메뉴판 [ 1.콜라(300) 2.환타(200) 3.사이다(100) 4.결제 ] 
				// 		// 1.메뉴판에서 제품선택하면 장바구니에 넣기 
				//		// 2.재고가 부족하면 알림( 재고부족 )
				// 2. 초기 재고 [ 제품 당 10개씩 ]
				// 3. 결제시 금액입력받아 결제액 만큼 차감후 잔돈 출력 
						// 1. 투입한 금액보다 구매액 이 더 크면 결제 취소 [ 금액부족 ]
	
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in); // 입력객체선언 
		
		// 공통 변수
		int 콜라재고 = 10; int 환타재고 = 10; int 사이다재고 = 10;
		int 콜라구매수 = 0;  int 환타구매수 = 0; int 사이다구매수 = 0;
		
		while(true) { // 프로그램시작무한루프 종료조건 없음 
			System.out.println("----------메뉴------------");
			System.out.println("1.콜라300 2.환타200 3.사이다100 4. 결제"); int ch = scanner.nextInt(); // 선택입력
			if(ch==1) { // 1번을 입력했을경우 
				if(콜라재고 == 0) { //콜라 재고가 0 인경우 
					System.out.println("콜라 재고가 없습니다. ");
				}
				else { // 콜라재고가 0이아닌 모든 경우 
					System.out.println("콜라를 담았습니다.");
					콜라구매수 ++; // 장바구니의 콜라 구매수를 1증가 
					콜라재고 --; // 콜라재고를 1씩 감소 
				}
				
			} 
			else if(ch==2 ) { // 2번을 입력했을경우 
				if(환타재고 == 0) { // 환타재고가 0인경우 
					System.out.println("환타 재고가 없습니다. ");
				}
				else { // 환타재고가 0이 아닌 모든 경우 
					System.out.println("환타를 담았습니다.");
					환타구매수 ++; // 환타구매수 1증가 
					환타재고 --; // 환타재고 1감소 
				}
				
			}
			else if(ch==3) { // 3번을 입력했을경우 
				if(사이다재고 == 0) { // 사이다 재고가 0인경우 
					System.out.println("사이다 재고가 없습니다. ");
				}
				else { // 사이다재고가 0이아닌 모든경우 
					System.out.println("사이다를 담았습니다.");
					사이다구매수 ++; // 사이다 구매수 1씩증가 
					사이다재고 --; // 사이다 재고 1씩 감소 
				}
			}
			else if(ch==4) { //4번을 입력했을경우 
				System.out.println("----------결제페이지--------");
				System.out.println("제품명\t구매수\t금액");
				if(콜라구매수 != 0) {System.out.println("콜라\t"+콜라구매수+"\t"+(콜라구매수*300) );}
				if(환타구매수 != 0) {System.out.println("환타\t"+환타구매수+"\t"+(환타구매수*200) );}
				if(사이다구매수 != 0) {System.out.println("사이다\t"+사이다구매수+"\t"+(사이다구매수*100) );}
				int 총결제액 = (콜라구매수*300) + (환타구매수*200) + (사이다구매수*100); // 총 결제액 계산 
				System.out.println("총결제액 : " + 총결제액 );
				System.out.println("1. 결제 2. 취소 "); int ch2 = scanner.nextInt(); 
				if(ch2== 1) { // 1번을 선택했을때 
					while(true) { //무한루프 종료조건 결제완료 
						System.out.println("금액을 입력하세요 : "); int 금액  = scanner.nextInt();
						
						if(금액 < 총결제액 ) { // 금액이 총결제액보다작을때
							System.out.println("금액이 부족합니다 다시금액투여: ");
						} 
						else { // 금액이 총 결제액보다 클때 
							System.out.println("구매완료!!");
							System.out.println("잔돈출력 : " + (금액-총결제액 ) + "원"); // 잔돈계산 
							콜라구매수 = 0; 환타구매수 = 0 ; 사이다구매수 =0; // 장바구니 초기화 
							break; // 반복문 탈출 
						}
					} // while2 end 
					
					
				}
				else if(ch ==2 ) { // 취소
					System.out.println("구매목록 지우기 "); 
					콜라재고 += 콜라구매수 ; 환타재고 += 환타구매수; 사이다재고 += 사이다구매수; // 장바구니에 담았던음료들 초기화 
					콜라구매수 = 0; 환타구매수 = 0 ; 사이다구매수 = 0; // 장바구니 초기
					
				}
				else {System.out.println("잘못된입력...");}
				
			}
			else {System.out.println("잘못된입력");} 
			
		} // while end 
	
		
		

	} // me 

} // ce
