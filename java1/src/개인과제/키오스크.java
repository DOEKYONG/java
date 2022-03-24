package 개인과제;

import java.util.Scanner;

public class 키오스크 {

	public static void main(String[] args) {
		
		// 참고횟수 5번 걸린시간  30분 4초

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
		
		Scanner scanner = new Scanner(System.in); // 입력받기위한 스캐너 선
		
		// 공통변수 입력
	int 콜라재고 = 10; int 환타재고 = 10; int 사이다재고 = 10;
	int 콜라구매수 = 0; int 환타구매수 =0; ;int 사이다구매수 =0;
	
	while(true) { // 프로그램 시작 무한루프
		System.out.println("-------메뉴----------");
		System.out.println("1.콜라[300] 2.환타[200] 3.사이다[100] 4.결제 ");int ch = scanner.nextInt(); //선택지 입력받기 
		
		if(ch == 1) { // 1번을 선택했을경우 
			if(콜라재고 == 0) { // 콜라재고가 0일경우 
				System.out.println("콜라 재고가 없습니다.");
			}
			else { // 콜라재고가 0이 아닐 모든 경우 
				System.out.println("콜라를 담았습니다.");
				콜라구매수 ++; // 콜라구매수를 1씩증가 
				콜라재고 --; // 콜라재고를 1씩감소 
			}
			
		}
		else if(ch==2) { // 2번을 선택했을경우
			if(환타재고 == 0) { // 환타재고가 0일경우 
				System.out.println("환타 재고가 없습니다.");
			}
			else { // 환타재고가 0이 아닐 모든경우 
				System.out.println("환타를 담았습니다.");
				환타구매수 ++; // 환타구매수를 1씩증가 
				환타재고 --; // 환타재고를 1씩 감소 
			}
			
			
		}
		else if(ch==3) { // 3번을 선택했을경우 
			if(사이다재고 == 0) { // 사이다 재고가 0일경우 
				System.out.println("사이다 재고가 없습니다.");
			}
			else { // 사이다재고가  0이 아닐 모든경우 
				System.out.println("사이다를 담았습니다.");
				사이다구매수 ++; // 사이다 구매수를 1씩증가 
				사이다재고 --; // 사이다 재고를 1씩감소 
			}
			
		}
		else if(ch==4) { // 4번을 선택했을경우 
			System.out.println("--------결제페이지---------");
			System.out.println("제품명\t수량\t금액");
			if(콜라구매수 != 0 ) { // 콜라를 하나라도 선택했을경우 
				System.out.println("콜라\t" + 콜라구매수 + "\t"+(콜라구매수*300)); // 콜라는 개당 300원 이기때문에 
			}
			if(환타구매수 != 0 ) { // 환타를 하나라도 선택했을경우 
				System.out.println("환타\t" + 환타구매수 + "\t"+(환타구매수*200)); // 환타는 개당 200원 
			}
			if(사이다구매수 != 0 ) { // 사이다를 하나라도 선택했을경우 
				System.out.println("사이다\t" + 사이다구매수 + "\t"+(사이다구매수*100)); // 사이다는 개당 100원 
			}
			int 총결제액 = (콜라구매수*300) + (환타구매수*200) +(사이다구매수*100); // 총결제액 계산 
			System.out.println("총 결제액 : " + 총결제액);
			System.out.println("-----------------------");
			System.out.println("1. 결제 2. 취소 "); int ch2 = scanner.nextInt(); // ch2 선택 
			if(ch2==1 ) { //1번을 선택했을경우 
				while(true) { // 결제창 무한루프 실행 종료조건 => 계산완료하면 break 
					System.out.println("금액을 입력하세요 : ");int 금액  = scanner.nextInt(); // 금액입력 
					if(금액 < 총결제액) { // 금액이 총결제액보다 작을경우 
						System.out.println("금액이 부족합니다. 다시 금액 투여 ");
					}
					else { // 금액이 총결제액보다 크거나같을경우 
						System.out.println("구매완료!!");
						System.out.println("잔돈 출력 : " + (금액-총결제액) + "원"); // 잔돈계산 
						콜라구매수 =0; 환타구매수=0; 사이다구매수=0; // 장바구니 초기화 
						break; // 반복문 탈출
					}
				}// while2 end
				
				
			}
			else if (ch2== 2) { //2를 선택시 
				System.out.println("구매목록 모두 지우기 ");
				콜라재고 += 콜라구매수; 환타재고 += 환타구매수; 사이다재고+= 사이다구매수; //장바구니에 담았다가 취소한거기때문에 장바구니에 있던 수량을 재고에 다시 추가 
				콜라구매수 = 0; 환타구매수 =0; 사이다구매수 =0; // 장바구니 초기화 
				
				
			}
			else {System.out.println("알수없는 행동입니다.1");} // ch2  에서 지정되지 않은  숫자를 입력시 출력 
			
			
			
			
		}
		else {
			System.out.println("알수없는 행동입니다."); // ch1  에서 지정되지 않은 숫자를 입력시 출
		}
		
		
		
	} // w e
	
		

	} // m e

} // c e
