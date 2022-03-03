package Day03;

import java.util.Scanner;

public class Day03_8 { // c s

	public static void main(String[] args) { // m s
		boolean run = true;
		int balance = 0 ;
		Scanner scanner = new Scanner(System.in);
		while(run) {
			
			System.out.println("------------------------");
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.println("------------------------");
			System.out.print("선택>"); 
			int 선택 = scanner.nextInt();
			
			if( 선택 == 1) {
				
				System.out.println("예금액>"); int 예금액 = scanner.nextInt();
				balance  += 예금액;
			} else if(선택 == 2) {
				System.out.println("출금액>"); int 출금액 = scanner.nextInt();
				if (출금액 > balance ) {
					System.out.println("잔액부족");
				}else {
					balance -= 출금액;
				}
			} else if (선택 == 3) {
				System.out.println("잔고>"); 
				System.out.println(" 잔고 : "+ balance );
			} else if (선택 == 4 ) {
				break;
			} else {
				System.out.println("알수없는번호");
			}
			
			
		}
		System.out.println("프로그램 종료 ");
		

	} // m e

} // c e
